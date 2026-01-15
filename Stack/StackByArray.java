package Stack;

public class StackByArray {

    

    static class Stack{

        int[] nums;
        int top;
       
        public Stack(){
            nums = new int[100];
            top = -1;
        }

        // push
        public void push(int x){
            if(top == nums.length - 1){
                System.out.println("Stack Overflow");
            }
            nums[++top] = x;
        }


        // pop
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack Underflow.");
                return -1;
            }
            return nums[top--];
        }

        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return nums[top];
        }

        // is Empty
        public boolean isEmpty(){
            return top == -1;
        }




    }


    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);


        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
        
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        
        
    }
}
