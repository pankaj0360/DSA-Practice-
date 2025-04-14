import java.util.Stack;

public class SortTheStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        System.out.println("Original Stack: " + stack);
        new SortStack().sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

class SortStack {
    public void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            Integer top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    private void insertInSortedOrder(Stack<Integer> stack, int top) {
        if (stack.isEmpty() || top > stack.peek()) {
            stack.push(top);
            return;
        }
        int temp = stack.pop();

        insertInSortedOrder(stack, top);

        stack.push(temp);
    }
}