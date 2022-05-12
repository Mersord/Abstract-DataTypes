package src;

//Doubly Linked List
public class LinkedList {

    //Variables
    private ListNode head, tail; //Head/Tail = First/Last Node

    //AddFirst
    public void addFirst(String v) {

        if (head == null) head = tail = new ListNode(v, null, null);

        if (head == tail) {
            head = new ListNode(v, tail, null);
            tail.setPrev(head);
        }

        else {
            head = new ListNode(v, head, null);
            head.getNext().setPrev(head);
        }
    }

    //AddLast
    public void addLast(String v) {

        if (head == null) head = tail = new ListNode(v, null, null);

        if (head == tail) {
            tail = new ListNode(v, null, head);
            head.setNext(tail);
        }

        else {
            tail = new ListNode(v, null, tail);
            tail.getPrev().setNext(tail);
        }
    }

    //GetFirst
    public String getFirst() {
        if (head == null) return null;
        return head.getData();
    }

    //GetLast
    public String getLast() {
        if (head == null) return null;
        return tail.getData();
    }

    //PollFirst
    public String pollFirst() {

        if (head == null) return null;

        String output = head.getData();
        head = head.getNext();

        if (head == null) tail = null;

        else {
            head.setPrev(null);
        }

        return output;
    }

    //PollLast
    public String pollLast() {

        if (head == null) return null;

        String output = tail.getData();
        tail = tail.getPrev();

        if (tail == null) head = null;

        else {
            tail.setNext(null);
        }

        return output;
    }

    //Add (specific Index)
    //Implementation of add() in ListNode
    public void add (int i, String v) {
        if (i == 0) addFirst(v);

        if (i == size()) addLast(v);

        else head.add(i, v);
    }

    //Size
    public int size() {
        if (head == null) {
            return 0;
        }
        return head.size();
    }
}
