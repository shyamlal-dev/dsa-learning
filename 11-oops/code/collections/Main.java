class Main {
    public static void main(String[] args) {
       //ArrayList
        List < Integer > list1 = new ArrayList < > ();
        list1.add(11);
        list1.add(22);
        list1.add(33);
        System.out.println("ArrayList: " + list1);
        
        //LinkedList
        List < Integer > list2 = new LinkedList < > ();
        list2.add(21);
        list2.add(32);
        list2.add(76);
        System.out.println("LinkedList: " + list2);

        //Vector
        List < Integer > vector = new Vector < > ();
        vector.add(89);
        vector.add(77);
        vector.add(56);
        System.out.println("Vector: " + vector);
    }
}
