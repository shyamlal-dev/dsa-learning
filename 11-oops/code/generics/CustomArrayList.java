import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    /*
     * The arr array stores the actual data.
     *
     * arr.length = Total capacity
     * size       = Number of elements currently stored
     *
     * Example:
     * arr.length = 10
     * size = 4
     *
     * It means the array has space for 10 elements,
     * but currently only 4 elements are stored.
     */
    private int[] arr;

    // Initial capacity of the CustomArrayList.
    private static final int DEFAULT_SIZE = 10;

    /*
     * The size variable represents two things:
     *
     * 1. The number of elements currently stored in the list.
     * 2. The index at which the next element will be inserted.
     *
     * Initially, the list is empty, so size is 0.
     */
    private int size = 0;

    public CustomArrayList() {
        // Creates an internal array with an initial capacity of 10.
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int value) {

        /*
         * If size and arr.length are equal,
         * the internal array is completely full.
         *
         * Example:
         * size = 10
         * arr.length = 10
         *
         * The array must be resized before adding a new element.
         */
        if (isFull()) {
            resize();
        }

        /*
         * size++ is a post-increment operation.
         *
         * The current value of size is first used as an index.
         * After inserting the element, size is increased by 1.
         *
         * Example:
         * size = 0
         *
         * arr[size++] = value;
         *
         * Internally, it works like:
         * arr[0] = value;
         * size = 1;
         *
         * Therefore, size also represents the next available index.
         */
        arr[size++] = value;
    }

    private void resize() {

        /*
         * Creates a new array with twice the capacity
         * of the current array.
         *
         * Example:
         * Old capacity = 10
         * New capacity = 20
         */
        int[] temp = new int[arr.length * 2];

        // Copies all elements from the old array into the new array.
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        /*
         * The arr reference now points to the new larger array.
         *
         * Resizing changes arr.length, but size remains unchanged
         * because the number of stored elements is still the same.
         */
        arr = temp;
    }

    private boolean isFull() {

        /*
         * arr.length = Total capacity
         * size       = Number of actual elements
         *
         * They are equal only when the internal array is full.
         */
        return arr.length == size;
    }

    public int remove() {

        // An element cannot be removed from an empty list.
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }

        /*
         * --size is a pre-decrement operation.
         *
         * First, size is decreased by 1.
         * Then, the decreased value is used as an index.
         *
         * Example:
         * Elements = [10, 20, 30]
         * size = 3
         *
         * int removed = arr[--size];
         *
         * Internally, it works like:
         * size = 2;
         * removed = arr[2]; // 30
         *
         * The index of the last element is always size - 1.
         */
        int removed = arr[--size];

        /*
         * Resets the removed position.
         *
         * The default value of an int array element is 0.
         * Resetting it is not compulsory for a primitive int array,
         * but it keeps the internal state clean.
         */
        arr[size] = 0;

        return removed;
    }

    public int getSize() {
        // Returns the number of elements currently stored.
        return size;
    }

    public int get(int index) {
        checkIndex(index);
        return arr[index];
    }

    public void set(int index, int value) {
        checkIndex(index);

        /*
         * The set() method updates an existing element.
         * It does not add a new element, so size is not increased.
         */
        arr[index] = value;
    }

    private void checkIndex(int index) {

        /*
         * Valid index range:
         * 0 to size - 1
         *
         * Validation should not be based on arr.length because
         * unused array positions are not part of the list.
         */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + index + ", size: " + size
            );
        }
    }

    @Override
    public String toString() {

        /*
         * When we write:
         *
         * System.out.println(list);
         *
         * println() internally converts the object into a String.
         * During this process, list.toString() is called automatically.
         *
         * Simplified internal flow:
         *
         * println(list)
         * -> String.valueOf(list)
         * -> list.toString()
         *
         * Therefore, we do not need to call list.toString() manually.
         *
         * Arrays.toString(arr) prints the complete internal array,
         * including unused positions whose default value is 0.
         */
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", capacity=" + arr.length +
                '}';
    }

    public static void main(String[] args) {

        // This is an object of our custom CustomArrayList class.
        CustomArrayList list = new CustomArrayList();

        /*
         * This loop adds 13 elements:
         * 2, 4, 6, 8 ... 26
         *
         * Initially:
         * capacity = 10
         *
         * Before adding the 11th element, resize() will be called:
         * capacity = 20
         *
         * Final state:
         * size = 13
         * arr.length = 20
         */
        for (int i = 1; i < 14; i++) {
            list.add(i * 2);
        }

        // list.toString() is called automatically.
        System.out.println(list);

        System.out.println("Removed element: " + list.remove());
        System.out.println("Size after removal: " + list.getSize());
        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, 100);
        System.out.println("After updating index 2: " + list);

        /*
         * This is not our CustomArrayList class.
         *
         * ArrayList is a built-in class provided by the
         * Java Collections Framework:
         *
         * java.util.ArrayList
         *
         * It is imported at the top of the file:
         * import java.util.ArrayList;
         *
         * The <Integer> generic type specifies that
         * this list can store only Integer values.
         */
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(9);

        /*
         * Java's built-in ArrayList also overrides toString().
         *
         * Therefore, println() automatically calls list2.toString()
         * and prints its elements in the [9] format.
         */
        System.out.println(list2);
    }
}
