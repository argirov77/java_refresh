import java.util.HashSet;
import java.util.Objects;

public class Task2 {
    public static void main(String [] args){

        Product pen = new Product("pen", 12);
        Product book = new Product("book", 14);
        Product booklet = new Product("book", 13);

        System.out.println(pen.equals(book));
        System.out.println(booklet.equals(book));

        HashSet<Product> products= new HashSet<>();
        products.add(pen);
        products.add(book);
        products.add(booklet);

        System.out.println(products);
    }
}
class Product{
    private String name;
    private int price;

    public Product(String n, int p){
        this.name=n;
        this.price=p;
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null ||  obj.getClass()!=getClass()) return false;
        Product product= (Product) obj;
        return Objects.equals(product.name,name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
