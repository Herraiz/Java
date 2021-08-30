package ArrayList;

public class myArrayList {

    private Object[] elementData;
    private int i = 0;

    public myArrayList(int z) {
        elementData = new Object[z];
    }

    public Object get(int i) {
        return elementData[i];
    }

    public void add(Object o) {
        elementData[i] = o;
        i++;
    }

}
