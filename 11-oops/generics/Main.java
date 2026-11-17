public class Main implements GenericInterface<Integer> {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display(18765);
    }
    
    @Override
    public void display(Integer value) {
        System.out.println(value);
    }
}
