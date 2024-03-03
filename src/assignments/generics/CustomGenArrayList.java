package assignments.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the old array value to the new array
//        System.arraycopy(data, 0, temp, 0, data.length);
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {

        return (T) data[--size];
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public String toString() {
        return "Custom ArrayList {" +
                "data= " + Arrays.toString(data) +
                ", size= " + size + '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();

//        CustomGenArrayList list = new CustomGenArrayList();

//        list.add(3);
//        list.add(5);
//        list.add(9);

        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list.toString());
    }
}

