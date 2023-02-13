package ArrayList_List_LinkedList.TrienKhaiArrayList;

public class LinkedList<E> {
    class Node {
       private  Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    private Node head;
    private int numNodes;

    public LinkedList() {
    }
    public LinkedList( E e) {
        this.head = new Node(e);
    }
    public void add(int index,E element){
        if(numNodes == 0){
            addFirst(element);
        } else if(index >=numNodes){
            addLast(element);
        }else {
            Node temp = head;
            Node holder;
            for (int i = 1; i <index ; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        }
    }
    public void addFirst(E e ){
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }
    public void addLast(E e){
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }
   public E remove(int index){
        if(index < 0 || index > numNodes){
            return null;
        }else{
            Node del = head;
            Node holder;
            for (int i = 0; i <index-2 ; i++) {
                del = del.next;
            }
            holder = del.next;
            del.next  = holder.next;
            numNodes--;
            return (E) holder.getData();
        }
   }
   public boolean remove(Object e ){
        if(head.getData().equals(e)){
            remove(0);
            return true;
        } else {
            Node temp = head;
            Node previos = null;
            for (int i = 1; i <numNodes ; i++) {
                temp = temp.next;
                if(temp.getData().equals(e)){
                     previos.next = temp;
                     previos.next = temp.next;
                     numNodes--;
                    return true;
                }
            }
        }
       return false;
   }
    public int Size(){
        if(numNodes == 0){
            return 0;
        }else{
            return numNodes;
        }
    }
//    public E clone(){
//    }
        public boolean contains(E o){
        Node temp = head;
        while(temp.next != null){
            if(temp.getData().equals(o)){
                break;
            }else{
                temp = temp.next;
            }
            return false;
        }
        return true;
    }
    public int indexOf(E o){
        Node temp = head;
        int index;
        for ( index = 0; index <numNodes ; index++) {
            if(temp.getData().equals(o)){
               break;
            }else{
                temp = temp.next;
            }
        }
        return index;
    }
    public boolean add(E o){
        Node temp = head;
        while(temp.next != null){
            if(temp.getData().equals(o)){
                break;
            }else{
                temp = temp.next;
            }
            addLast(o);
        }
        return true;
    }
//    public void enSureCapacity(int minCapacity){
//    }
    public E get (int index) {
        if (index < 0 || index > numNodes) {
            return null;
        } else {
            Node temp = head;
            for (int j = 0; j < index; j++) {
                temp = temp.next;
            }
            return (E) temp.getData();
        }
    }
    public E getFirst(){
        return (E) head.getData();
    }
    public E getLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return (E) temp.getData();
    }
    public void clear(){
       head = null;
       numNodes = 0;
    }
}
