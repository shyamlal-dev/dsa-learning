public class Son extends Parent {
    
    Son(int age){
        super(age);
    }
    
    @Override
    void normal(){
        super.normal();
    }
    
    @Override
    void career(){
        System.out.println("I want be a Developer.");
    }
    
    @Override
    void partner(){
        System.out.println("I love Wanda.");
    }
}
