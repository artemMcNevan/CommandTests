package test3;

import java.util.List;

public class InsertOperation {
    private static int LIST_SIZE = 10000;

    private List list;

    public InsertOperation(List list) throws Exception {
        this.list = list;
        insertItems(list);
        deleteItems(list);
    }

    public long insertItems(List<Integer> list) {
        long startTime = System.nanoTime();

        for(int i = 0; i < LIST_SIZE; i++) {
            list.add(i);
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public long deleteItems(List<Integer> list) throws Exception {
        long startTime = System.nanoTime();

        if(list.size() != 0) {
            for(int i = 0; i < LIST_SIZE; i++) {
                list.remove(i);
            }
        }

        else {
            throw new Exception("List is empty, please use insertItems first");
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
