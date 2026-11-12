class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Human shyam = new Human("Shyama", 29);
        
        Human twin = (Human)shyam.clone();
        System.out.println(twin.name + " " + twin.age);
        System.out.println(Arrays.toString(twin.arr));
        
        twin.arr[0] = 99;
        
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(shyam.arr));
        
    }
}
