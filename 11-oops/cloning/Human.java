public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;
    
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.arr = new int[] {1, 2, 3, 4, 5};
    }
    
    /*@Override
    public Object clone() throws CloneNotSupportedException {
        //shallow copying
        return super.clone();
    }*/
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        Human twin = (Human)super.clone(); //this is actually shallow
        
        //to make it deep copy
        twin.arr = new int[twin.arr.length];
        for(int i = 0; i < twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
