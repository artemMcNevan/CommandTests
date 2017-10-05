package MyQueue;

/**
 * Created by fylhtqww on 10/2/2017.
 */
public class CellData {
    private Object data;
    private CellData nextElement;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public CellData getNextElement() {
        return nextElement;
    }

    public void setNextElement(CellData nextElement) {
        this.nextElement = nextElement;
    }
}
