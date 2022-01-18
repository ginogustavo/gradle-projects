package product.app;

import java.math.BigDecimal;

public class Product {

    public Product(){

    }
    public Product(String name, String description, BigDecimal price){
        this.name = name;
        this.description = description;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    String description;
    BigDecimal price;

}
