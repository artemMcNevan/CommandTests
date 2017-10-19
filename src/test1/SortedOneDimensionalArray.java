package test1;

import java.util.Scanner;

public class SortedOneDimensionalArray {

    private static final int DEFAULT_CAPACITY = 1;
    private static final int DEFAULT_CAPACITY_MAGNIFIER = 10;
    private static final Integer[] EMPTY_DATA = {};

    private Integer[] data;

    private int size;
    private int lastIndexWithoutNull = 0;
    private int absoluteIndex;
    private int capacityMagnifier;
    private int minValueIndex = -1;
    private int maxValueIndex = -1;

    public SortedOneDimensionalArray() {
        this.data = new Integer[DEFAULT_CAPACITY];
        this.absoluteIndex = DEFAULT_CAPACITY;
        this.capacityMagnifier = DEFAULT_CAPACITY_MAGNIFIER;
    }

    public SortedOneDimensionalArray(int size) {
        this.size = size;
        this.absoluteIndex = size;
        this.capacityMagnifier = DEFAULT_CAPACITY_MAGNIFIER;

        if (size > 0) {
            this.data = new Integer[size];
        } else if (size == 0) {
            this.data = EMPTY_DATA;
        } else {
            throw new IllegalArgumentException("Wrong size of " + this.toString() + ":" +
                    +size);
        }
    }

    public void add(int a) {
        if(lastIndexWithoutNull + 1 == absoluteIndex) {
            Integer[] array = new Integer[data.length + capacityMagnifier];

            System.arraycopy(data, 0, array, 0, data.length);

            absoluteIndex = array.length;
            data = array;
        }

        if(data[lastIndexWithoutNull] == null) {
            data[0] = a;
            minValueIndex = 0;
        }

        else {
            if(a > data[lastIndexWithoutNull]) {
                data[lastIndexWithoutNull + 1] = a;
                lastIndexWithoutNull++;
            }

            else {
                for (int i = 0; i <= lastIndexWithoutNull; i++) {
                    if(a < data[i]) {
                        data = insert(i, a);
                        break;
                    }
                }

                lastIndexWithoutNull++;
                maxValueIndex = lastIndexWithoutNull;
            }
        }
    }

    private Integer[] insert(int index, int a) {
        Integer[] insertArray = new Integer[data.length];

        for (int i = lastIndexWithoutNull; i >= 0 ; i--) {
            if(i < index) {
                insertArray[i] = data[i];
            }

            else if(i > index) {
                insertArray[i + 1] = data[i];
            }

            else {
                if(data[i] != null) {
                    int temp = data[i];
                    insertArray[i] = a;
                    insertArray[i + 1] = temp;
                }

                else {
                    insertArray[i] = a;
                }
            }
        }

        return insertArray;
    }

    public int getLenght() {
        return data.length;
    }

    public Object[] getCopy() {
        return data;
    }

    public Integer get(int i) {
        if(i < 0 || i > lastIndexWithoutNull) {
            throw new IndexOutOfBoundsException("Index: " + i + "Size: " + data.length);
        }

        else {
            return data[i];
        }
    }

    public int getMin() {
        return data[minValueIndex];
    }

    public int getMax() {
        return data[maxValueIndex];
    }

    public Integer[] getData() {
        return data;
    }
}
