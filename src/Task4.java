public class Task4 {
    public static void main(String [] args){
        try{
            System.out.println("reulst=" +safeDivide (22, 2));
            System.out.println("reulst=" +safeDivide (22, 0));
        }catch (ArithmeticException e){
            System.out.println("error is " +e.getMessage());
        }

    }




    public static int safeDivide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("DIVISOR IS NULL");
        }
        return a/b;

    }
}
