import java.util.HashSet;

public class Task3 {
    public static void main(String [] args){
        Student dima = new Student("Dmitriy Stoykov");
        Student kathy = new Student("Kathy Morozova");
        HashSet <Student> studentList= new HashSet<>();
        studentList.add(dima);
        studentList.add(kathy);
        studentList.add(kathy);
        System.out.println(studentList);
    }
}
class Student{
    private String name;
    private int id;
    private static int nextId=1;
    public Student(String n){
        this.name= n ;
        this.id = nextId++;
    }


}
