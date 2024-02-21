package oop6.generics;

import java.security.PublicKey;
import java.util.Arrays;
public class customeArrayList {

    private int[] data;
    private static int DEAFULT_SIZE = 10;
    private int size = 0;//alos work as a pointer

    public customeArrayList(){
        this.data = new int[DEAFULT_SIZE];
    }

    public void add(int num){
        if(isFull())
        {
            resize();
        }
        data[size++] = num;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        //copy the current data element
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int get(int index){
        return data[index];
    }

    public int remove(){
        int removed = data[size--]; //move the pointer back and then we will overide it giveing impresssion of remove;
        return removed;
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
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
        customeArrayList list = new customeArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
    }
    }
