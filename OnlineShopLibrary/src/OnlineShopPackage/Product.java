package OnlineShopPackage;

public class Product {

    private String name;

    private int stock;

    private float price;
    
    private boolean reorder;
    
        public void setReorder() {
        if(stock <= 5){
            reorder = true;
        };
  
    }

    public boolean isReorder() {
        return reorder;
    }
    
    
    
}
