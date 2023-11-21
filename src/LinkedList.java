public class LinkedList {
    private Link first;

    public LinkedList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(char data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link getFirst() {
        return first;
    }
}