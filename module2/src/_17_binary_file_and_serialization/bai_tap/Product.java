package _17_binary_file_and_serialization.bai_tap;

public class Product {
    private int idProduct;
    private String nameProduct;
    private String maker;
    private int price;
    private String productDescription;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String maker, int price, String productDescription) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.maker = maker;
        this.price = price;
        this.productDescription = productDescription;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id product: " + idProduct +
                ", Maker: " + maker +
                ", Price: " + price +
                ", Product Description: " + productDescription +
                "}";
    }
}
