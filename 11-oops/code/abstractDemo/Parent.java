public abstract class Parent {
    
    int age;
    final int VALUE;
    
    Parent(int age){
        this.age = age;
        VALUE = 12345;
    }
    
    static void hello(){
        System.out.println("Hey from Parent");
    }
    
    void normal(){
        System.out.println("I am normal method from Parent");
    }
    
    abstract void career();
    abstract void partner();
}
