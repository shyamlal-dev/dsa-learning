public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Son s = new Son(29);
        s.hello();
        s.normal();
        s.career();
        s.partner();
        System.out.println("age: " + s.age);
        System.out.println("VALUE: " + s.VALUE);
        
        Daughter d = new Daughter(27);
        d.career();
        d.partner();
        System.out.println("age: " + s.age);
        System.out.println("VALUE: " + s.VALUE);
    }
}
