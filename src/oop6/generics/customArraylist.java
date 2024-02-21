package oop6.generics;

import java.util.Arrays;

//here T should be number or subclass of number ie : int float doublt long.
//wildcard
public class customArraylist<T extends Number> {
    private Object[] data;
    private static int DEAFULT_SIZE = 10;
    private int size = 0;//alos work as a pointer

    public customArraylist(){
        this.data = new Object[DEAFULT_SIZE];
    }

    public void add(T num){
        if(isFull())
        {
            resize();
        }
        data[size++] = num;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        //copy the current data element
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public T remove(){
         T removed = (T)(data[size--]); //move the pointer back and then we will overide it giveing impresssion of remove;
        return removed;
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        customArraylist<Integer> list = new customArraylist();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
    }
}

