package _09_dsa_stack_queue.exercies.stack;

import java.util.Stack;

public class ReverseStack {

    public Stack<Integer> stack = new Stack<>();


    void reverse() {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverse();
            insertAtBottom(temp);
        }
    }

    void insertAtBottom(int a) {
        if (stack.isEmpty()) {
            stack.push(a);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(a);
        stack.push(temp);
    }

}
