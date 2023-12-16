package str;
public class DynamicListExample {
    private int[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public DynamicListExample() {
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            expandCapacity();
        }
        data[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return data[index];
    }

    public int findMax() {
        if (size == 0) {
            throw new IllegalStateException("Dynamic list is empty");
        }
        int max = data[0];
        for (int i = 1; i < size; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    private void expandCapacity() {
        int newCapacity = data.length * 2;
        int[] newData = new int[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public static void main(String[] args) {
        DynamicListExample dynamicList = new DynamicListExample();
        dynamicList.add(10);
        dynamicList.add(5);
        dynamicList.add(8);
        dynamicList.add(12);
        dynamicList.add(3);

        int max = dynamicList.findMax();
        System.out.println("Maximum value: " + max);
    }
}

