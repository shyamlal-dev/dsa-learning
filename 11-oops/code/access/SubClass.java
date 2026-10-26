public class SubClass extends Access {
    SubClass(int num, String name){
        super(num, name);
    }
    
    public static void main(String[] args){
        SubClass obj = new SubClass(11, "Wanda");
        int n = obj.num;
        System.out.println(n);
        System.out.println(obj instanceof Object);
        System.out.println(Arrays.toString(obj.arr));
        System.out.println(obj.name);
        System.out.println(obj.getNum());
        
    } 
}
