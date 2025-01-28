package gr.aueb.cf.ch10;
//
//public class StackApp {
//    static int[] myStack = new int[50];
//    static int top = -1;
////
////
//    public static void main(String[] args) {
//int num;
//
//try {
//    push(1);
//    push(2);
//    push(3);
////    num = pop();
//    System.out.println("popped num: " + num);
//}catch (Exception e) {
//    System.out.println(e.getMessage());
//}
//
//    }


////    public static int pop() throws Exception {
////        try {
////            if (isEmpty()) throw new Exception("Error. Stack is empty");
////
////        } catch (Exception e) {
////            e.printStackTrace();
////            throw e;
////        }
////    }
//
//    public static void push(int num) throws Exception {
//        try {
//            if (isFull()) throw new Exception("Error. Stack is full");
////            top++;
//            myStack[++top] = num;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw e;
//        }
//    }
//
//    public static boolean isEmpty() {
//        return top == -1;
//    }
//
//    public static boolean isFull() {
//        return top == myStack.length - 1;
//    }
//
//    public static void printStack()  throws Exception{
//        try {
//            if (isEmpty()){
//                throw new Exception("Stack is empty");
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//            throw e;
//        }
//
//    }
//}
