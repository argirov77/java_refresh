public class Exception {
    public static void main(String [] args) {
        try {
            validateName("");
            validateName("dima");
        } catch (IllegalArgumentException e) {
            System.out.println("error " + e.getMessage());
        }
    }
    public static void validateName(String n) throws IllegalArgumentException{
        if (n==null || n.equals("")){
            throw new IllegalArgumentException("Name must be filled in");
        }
        System.out.println("Name is correct:"+ n);
    }

}
