
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args){
        ArrayList<Shape> shapes= new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3,4));

        for (Shape shape : shapes){
            System.out.println(shape.getArea());
        }
    }


}
class Shape{
    public double getArea(){
        return 0;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double a){
        radius=a;
    }
    public double getArea(){
        return radius*radius* Math.PI;
    }
}
class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(double a, double b){
        width=a;
        height=b;
    }
    @Override
    public double getArea() {
        return width*height;
    }
}
