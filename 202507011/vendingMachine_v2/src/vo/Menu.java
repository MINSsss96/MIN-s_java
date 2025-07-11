package vo;

public class Menu {
    private String product;
    private int price;
    private int stock;
    private int sales;

    public int getSales(){
        return this.sales;
    }

    public void setSales() {
        this.sales = sales;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void sumPrice(){
        this.sales = this.sales + this.price;
    }

    @Override
    public String toString() {
        return
                "제품명 : " + product + '\'' +
                        "/ 가격 : " + price +
                        "/ 재고 개수 : " + stock
                ;
    }
}
