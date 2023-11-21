public class LinkStack {
    private LinkedList linkedList;
    public LinkStack() { this.linkedList = new LinkedList(); }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
    public void push(char data) {
        linkedList.insertFirst(data);
    }
    public void pop() {
        if (!isEmpty()) {
            linkedList.deleteFirst();
        } else {
            System.out.println("Stack is empty");
        }
    }
    public char peek() {
        if (!isEmpty()) {
            return linkedList.getFirst().data;
        } else {
            System.out.println("Stack is empty");
            return '\0';
        }
    }
    public void displayStack() {
        Link current = linkedList.getFirst();
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}