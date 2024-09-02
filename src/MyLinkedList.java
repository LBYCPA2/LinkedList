public class MyLinkedList<E> implements LinkedListInterface<E> {

    class Node<E>{
        E item;
        Node next;

        public Node(){
            item = null;
            next = null;
        }
    }
    Node head;

    public MyLinkedList(){
        head = null;
    }

    public void add(Object e){
        //TODO: write your implementation
    }

    public void clear(){
        //TODO: write your implementation
    }

    public E get (int index){
        //TODO: write your implementation
        return null;
    }

    public void remove (int index){
        //TODO: write your implementation
    }

    public int size(){
        //TODO: write your implementation
        return 0;
    }

    public boolean isEmpty(){
        //TODO: write your implementation
        return head == null;
    }

}