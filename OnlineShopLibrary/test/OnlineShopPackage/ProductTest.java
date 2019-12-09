package OnlineShopPackage;

import OnlineShopPackage.*;

public class ProductTest {

    private String name = "Car";

    private int stock;

    private float price = 4;
    
    boolean reorder = false;

    public void setReorder() {
        if(stock <= 5){
            reorder = true;
        };
  
    }

    public boolean isReorder() {
        setReorder();
        return reorder;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
