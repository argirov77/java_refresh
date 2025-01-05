public class Task3 {
    public static void main(String [] args){


    }
}
class Student{
    private String name;
    private int id;
    private static int nextId=1;
    public void Student(String n){
        this.name= n ;
        this.id = nextId++;
    }


}
