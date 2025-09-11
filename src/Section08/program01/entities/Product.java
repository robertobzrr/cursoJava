package Section08.program01.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price*quantity;
    }

    public void addProduct(int add){
        this.quantity += add;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }




}
