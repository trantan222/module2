package ArrayList_List_LinkedList.TrienKhaiArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
 private int size = 0;
 private static final int DEFAULT_CAPACITY = 10;
private Object [] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }
    private void enSureCapacity(){
        if(size >= elements.length){
            int newSize = (elements.length * 2 + 1);
            Object [] newElements = new Object[newSize];
            System.arraycopy(elements,0,newElements,0,size);
        }
    }
    public void add (int index, E element){
        enSureCapacity();
        for (int i = size -1 ; i >= index ; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }
    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException( "index" +index +"is out of bounds");
        }
    }
    public E remove(int index){
        checkIndex(index);
        Object OLDobject = new Object[index];
        for (int i = size -1 ; i >= index ; i++) {
            elements[i -1] =elements[i];
        }
        elements[size -1] = null;
        size--;
        return (E) OLDobject;
    }
    public int size(){
        return size;
    }
    public E clone(){
        Object [] newELements = elements;
        return (E) newELements;
    }
    public boolean contains(E o){
        for (int i = 0; i <size ; i++) {
            if(o.equals(elements[i])){
                return true;
            }
        }
        return false;
    }
    public int inDexOf(E o ){
        for (int i = 0; i <size ; i++) {
            if(o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E o){
        for (int i = 0; i <size ; i++) {
            if(o.equals(elements[i])){
                return true;
            }
        }
        add(size-1,o);
        return false;
    }
    public void enSureCapacity(int minCapacity){
        if(size >=elements.length){
            int newSize = size * 2 + minCapacity;
            Object [] newElements = new Object[newSize];
            System.arraycopy(elements,0,newElements,0,size);
        }
    }
    public E get(int i){
       checkIndex(i);
       return (E) elements[i];
    }
    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
