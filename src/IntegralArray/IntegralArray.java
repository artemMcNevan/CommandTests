package IntegralArray;

import java.util.Arrays;

public class IntegralArray implements InterfaceForMyArray {

    private final Integer[] EMPTY_ELEMENTSDATA = {};
    private final int LENGHT_EMPTY_ELEMENTDATA = 0;

    private Integer[] elementsData;
    private int length;

    public IntegralArray(){
        this.elementsData = EMPTY_ELEMENTSDATA;
        this.length = LENGHT_EMPTY_ELEMENTDATA;
    }

    public IntegralArray(int length){
        if(length > 0){
            this.elementsData = new Integer[length];
        } else if( length == 0) {
            this.elementsData = EMPTY_ELEMENTSDATA;
        } else {
            throw new IllegalArgumentException("Размер должен быть не отрицательным!");
        }
        for(int x = 0; x < length; x++){
            this.elementsData[x] = x;
        }
        this.length = length;
    }

    public IntegralArray(IntegralArray ar){
        this.elementsData = ar.elementsData;
        this.length = ar.length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void push(Integer i) {
        Integer[] ed = new Integer[this.length + 1];
        for(int x = 0; x < this.length + 1; x++){
            if(x == this.length){
                ed[x] = i;
            } else {
                ed[x] = this.elementsData[x];
            }
        }
        this.length++;
        this.elementsData = ed;
    }

    @Override
    public Integer get(int i) {
        Integer el;
        if(i >= length || i < 0){
            throw new IndexOutOfBoundsException("Некорректный индекс элемента");
        } else {
            el = elementsData[i];
        }
        return el;
    }

    @Override
    public Integer getMin() {
        Integer[] ar = this.getSortedArray("asc").elementsData;
        return ar[0];
    }

    @Override
    public Integer getMax() {
        Integer[] ar = this.getSortedArray("desc").elementsData;
        return ar[0];
    }

    @Override
    public String toString() {
        return "IntegralArray.IntegralArray{" +
                " Элемены = " + Arrays.toString(elementsData) +
                ", длина = " + length +
                '}';
    }

    public IntegralArray getSortedArray(String param){
        IntegralArray ar = new IntegralArray(this);
        for(int x = ar.length - 1; x > 0; x--) {
            for(int y = 0; y < x; y++){
                if(param == "asc") {
                    if (ar.elementsData[y] > ar.elementsData[y + 1]) {
                        int tmp = ar.elementsData[y];
                        ar.elementsData[y] = ar.elementsData[y + 1];
                        ar.elementsData[y + 1] = tmp;
                    }
                } else if(param == "desc"){
                    if (ar.elementsData[y] < ar.elementsData[y + 1]) {
                        int tmp = ar.elementsData[y];
                        ar.elementsData[y] = ar.elementsData[y + 1];
                        ar.elementsData[y + 1] = tmp;
                    }
                } else {
                    throw new IllegalArgumentException("Не верный параметр сортировки!");
                }
            }
        }

        return ar;
    }
}
