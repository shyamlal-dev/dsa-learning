public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;

        try {
            //divide(a,b);
            String name = "Shyam";
            if(name.equals("Shyam")){
                throw new MyException("Name is Shyam");
            }
            
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Normal Exception");
        }
        finally {
            System.out.println("this is finally block, always executes!!!");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("don't divide by zero");
        }
        return a / b;
    }
}
