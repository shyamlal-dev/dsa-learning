public class CustomGenArrayList<T> {
    
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; //deal with index value
    
    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }
    
    public void add(T val) {
        if(isFull()) {
            resize();
        }
        
        data[size++] = val;
    }
    
    public void resize() {
        Object[] temp = new Object[data.length * 2];
        
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        
        data = temp;
    }
    
    public boolean isFull() {
        return size == data.length;
    }
    
    public T remove() {
        T removed = (T)(data[--size]);
        
        return removed;
    }
    
    public T get(int index) {
        return (T)data[index];
    }
    
    public int size() {
        return size;
    }
    
    public void set(int index, T val) {
        data[index] = val;
    }
    
    @Override
    public String toString(){
        return "CustomGenArrayList{" + " data = " + Arrays.toString(data) + ", size = " + size + "}";
    }
    
    public static void main(String[] args) {
        
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        
        for(int i = 1; i < 14; i++) {
            list.add(i*2);
        }
        
        System.out.println(list);
        
    }
}
