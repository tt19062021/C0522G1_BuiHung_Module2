package SS09_DSA.Exercise.service.impl;

import java.util.Arrays;

public class MyList<E>  {

    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            this.elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity" + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = 0;
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public boolean add(E element) {
        if(elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            this.ensureCapacity(5);
        }else if(elements.length < index){
            throw new IllegalArgumentException("index" +index);
        }

        if(elements[index] == null){
            elements[index] = element;
            size++;
        }else {
            for(int i = size + 1; i >= index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int intdexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (element.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    public boolean contains(E element) {
        return intdexOf(element) >= 0;
    }

    public MyList<E> clone() {
        MyList<E> eMyList = new MyList<>();
        eMyList.elements = Arrays.copyOf(this.elements,this.size);
        eMyList.size = size;
        return eMyList;
    }

    public E remove(int index) {
        if(index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index" + index);
        }
        E element = (E) elements[index];
        for(int i = index ; i< size-1;i++){
            elements[i] = elements[i+1];
        }
        elements[size -1] = null;
        size--;
        return element;
    }


    public void remove() {
    }
}
