public class EnumDemo {

    enum Week implements MyInter {

        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;

        //these are enum constants
        //by default it is 'public', 'static' and 'final'
        //since it is 'final' so we can't create child enums
        //Type is Week 

        void display() {
            System.out.println("display method");
        }

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // internally: public static final Week Monday = new Week();

        @Override
        public void hello() {
            System.out.println("hi! how are you?");
        }
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        week.display();
        //System.out.println(week);
        //System.out.println(Week.valueOf("Monday"));

        for (Week day: Week.values()){
            System.out.println(day);
        }
        
        System.out.println(week.ordinal());
        
        //here .values(), .ordinal(), .valueOf() enum buildin methods, ordinal() gives index number starting from 0.
    }
}
