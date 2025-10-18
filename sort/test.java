import java.util.*;

class EightPuzzleDFS {
    static final int N = 3;

    // Goal state
    static int[][] goal = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 0}
    };

    static class Node {
        int[][] state;
        int x, y; // blank tile position
        List<String> path;

        Node(int[][] state, int x, int y, List<String> path) {
            this.state = state;
            this.x = x;
            this.y = y;
            this.path = path;
        }
    }

    // Moves: Up, Down, Left, Right
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static String[] moveNames = {"Up", "Down", "Left", "Right"};

    // Check if a move is valid
    static boolean isValid(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    // Convert state to a string for visited set
    static String stateToString(int[][] state) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : state)
            for (int val : row)
                sb.append(val);
        return sb.toString();
    }

    // Check if current state is goal
    static boolean isGoal(int[][] state) {
        return stateToString(state).equals(stateToString(goal));
    }

    // Deep copy of the 2D array
    static int[][] copyState(int[][] state) {
        int[][] newState = new int[N][N];
        for (int i = 0; i < N; i++)
            newState[i] = state[i].clone();
        return newState;
    }

    static List<String> dfs(int[][] start) {
        Stack<Node> stack = new Stack<>();
        Set<String> visited = new HashSet<>();

        // Find initial blank (0) position
        int x = 0, y = 0;
        outer:
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (start[i][j] == 0) {
                    x = i;
                    y = j;
                    break outer;
                }

        stack.push(new Node(start, x, y, new ArrayList<>()));

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            String stateStr = stateToString(current.state);

            if (visited.contains(stateStr))
                continue;
            visited.add(stateStr);

            if (isGoal(current.state))
                return current.path;

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (isValid(newX, newY)) {
                    int[][] newState = copyState(current.state);
                    // Swap blank and neighbor
                    newState[current.x][current.y] = newState[newX][newY];
                    newState[newX][newY] = 0;

                    List<String> newPath = new ArrayList<>(current.path);
                    newPath.add(moveNames[i]);

                    stack.push(new Node(newState, newX, newY, newPath));
                }
            }
        }

        return null; // no solution
    }

    public static void main(String[] args) {
        int[][] start = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 5, 8}
        };

        List<String> solution = dfs(start);

        if (solution != null) {
            System.out.println("Moves to solve:");
            for (String move : solution)
                System.out.print(move + " ");
            System.out.println("\nTotal moves: " + solution.size());
        } else {
            System.out.println("No solution found.");
        }
    }
}
