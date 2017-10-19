package test2;

import java.util.ArrayList;


public class MyGreatestStack<E> extends ArrayList{

    private ArrayList<E> greatestStackData;

    private int initialCapacity = 10;
    private int capacityModificator = 100;
    private int size = 0;
    private boolean fixedSize;

    private int lastElementIndex = 0;

    public MyGreatestStack() {
        greatestStackData = new ArrayList<E>(initialCapacity);

        size = initialCapacity;
    }

    public MyGreatestStack(int size) {
        this.initialCapacity = size;
        this.size = size;

        fixedSize = true;

        greatestStackData = new ArrayList<E>(initialCapacity);
    }

    public MyGreatestStack(MyGreatestStack greatestStack) {
        this.greatestStackData = greatestStack.copyOf();
        this.initialCapacity = greatestStack.initialCapacity;
        this.size = greatestStack.size;
        this.fixedSize = greatestStack.fixedSize;
        this.lastElementIndex = greatestStack.lastElementIndex;
    }


    public boolean push_top(E item) {
        if(addItem(item)) {
            return true;
        }

        else {
            throw new ArrayStoreException();
        }
    }

    public E get_top() {
        return getTopItem();
    }

    public E delete_top() {
        return deleteTopItem();
    }

    private boolean addItem(E item) {
        lastElementIndex++;

        if(fixedSize && greatestStackData.size() > size) {
            throw new ArrayIndexOutOfBoundsException("Fixed size of test2.MyGreatestStack is " + size);
        }

        return greatestStackData.add(item);
    }

    private E getTopItem() {
        return greatestStackData.get(lastElementIndex - 1);
    }
    private E deleteTopItem() {return greatestStackData.remove(lastElementIndex - 1);}
    private ArrayList<E> copyOf() {return greatestStackData;}

    public int getSize() {
        return greatestStackData.size();
    }
}
