import java.util.Objects;
import java.util.HashSet;

public class Cars {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Toyota", "Corolla");
        Car car3 = new Car("Honda", "Civic");


        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));


        HashSet<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);


        System.out.println(cars);
    }
}

class Car {
    private String mark;
    private String model;
    public Car (String a, String b){
        this.mark=a;
        this.model=b;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || obj.getClass()!=getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(mark,car.mark) && Objects.equals(car.model,model) ;
    }

    @Override
    public int hashCode(){
        return Objects.hash(mark, model);
    }



}
