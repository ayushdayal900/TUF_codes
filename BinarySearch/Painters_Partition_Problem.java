public class Painters_Partition_Problem {

    public static int getPainters(int[] board, int size){
        int count = 1;
        int boardPaint = 0;

        for(int i=0; i<board.length; i++){
            if(boardPaint + board[i] <=size){
                boardPaint += board[i];
            }else{
                count++;
                boardPaint = board[i];
            }
        }

        return count;
    }


    public static void main(String[] args) {
        

        // int boards[] = {10,20,30,40};
        // int k = 2;
        int boards[] = {5,5,5,5};
        int k = 2;

        int si = Integer.MIN_VALUE;
        int ei = 0;

        for(int i: boards){
            si = Math.max(si, i);
            ei += i;
        }

        for(int i=si; i<=ei; i++){
            // minimum board length (i) so that the painter can work continuously.
            if(getPainters(boards, i) == k){
                // ans = i
                System.out.println(i);
                break;
            }
        }

        // System.out.println(si);


    }
}
