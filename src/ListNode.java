package src;

//Implementation of a Node Object used in LinkedList
public class ListNode {

    //Variables
    private ListNode next, prev;
    private String data;

    //Constructor
    public ListNode(String data, ListNode next, ListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    //Add
    public void add (int i, String v) {

        if (i == 0) {
            ListNode node = new ListNode(v, this, prev);
            prev.setNext(node);
        }
        else next.add(i - 1, v);
    }

    //Size
    public int size() {
        if (next == null) return 1;
        return 1 + next.size();
    }

    //Getter and Setter
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public ListNode getPrev() {
        return prev;
    }
    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
    public String getData() {
        return data;
    }
}
