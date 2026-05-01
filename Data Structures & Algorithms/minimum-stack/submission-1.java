class MinStack {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> extraStack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        mainStack.push(val);
        if (extraStack.isEmpty()) {
            extraStack.push(val);
        } else {
            int currentMin = extraStack.peek();
            if (val < currentMin) {
                extraStack.push(val);
            } else {
                extraStack.push(currentMin);
            }
        }
    }

    public void pop() {
        mainStack.pop();
        extraStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return extraStack.peek();
    }
}