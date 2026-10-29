public class Main {
    public static void main(String[] args) {
        Student shyam = new Student(11, 69.99f);
        Student roushan = new Student(18, 89.99f);
        Student vaibhav = new Student(23, 79.99f);
        Student shashi = new Student(25, 89.78f);
        
        Student[] list = {shyam, roushan, vaibhav, shashi};
        
        System.out.println(Arrays.toString(list));
        
        /*Arrays.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return -(int)(s1.marks - s2.marks);
            }
        });*/
        
        Arrays.sort(list, (s1, s2) -> (int)(s1.marks - s2.marks));
        
        System.out.println(Arrays.toString(list));
        
        if(shyam.compareTo(shashi) > 0) {
            System.out.println(shyam.compareTo(shashi));
            System.out.println("Shyam has more marks than Shashi");
        }
    }
}
