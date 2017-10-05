package MyQueue;

import java.util.ArrayList;

/**
 * Created by fylhtqww on 10/2/2017.
 */
public class MyQueue {
    private CellData firstElement;
    private CellData lastElement;
    private int size;

    ArrayList<CellData> data = new ArrayList<CellData>();

    public MyQueue() {
        this.firstElement = null;
        this.lastElement = null;
        this.size = 0;

    }

    public MyQueue(MyQueue o){
        MyQueue cloneQueue = new MyQueue();

        this.firstElement = o.firstElement;
        this.lastElement = o.lastElement;
        this.size = o.size;
        this.data = o.data;


    }

    public void push_back(Object obj){
        CellData o = new CellData();
        o.setData(obj);

        if(firstElement == null){
            firstElement = o;
        } else {
            lastElement.setNextElement(o);
        }

        lastElement = o;
        this.data.add(o);
        size++;

    }

    public Object get(){
       if(size==0) {
           return null;
       }

       Object o = firstElement.getData();
       firstElement = firstElement.getNextElement();

       if(firstElement==null){
           lastElement=null;
       }

       for(int j = 0; j < this.data.size(); j++){
           if(this.data.get(j)!=null){
               this.data.set(j, null);
           }
       }

       size--;
       return o;

    }

    public int size(){
        return size;
    }

    public Object getElement(int i){
        if(i < 0 || i >= size){
            return null;
        }
        CellData currentElement = firstElement;
        int curretPosition = 0;

        while(curretPosition < i){
            currentElement = currentElement.getNextElement();
            curretPosition++;
        }

        Object element = currentElement.getData();
        return element;
    }

}
