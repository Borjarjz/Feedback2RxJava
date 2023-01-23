package FoodFacts;
import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("code")
    private String barcode;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("image_url")
    private String imageUrl;



    public Product(){
// constructor vacío
    }

    public Product(String barcode, String productName, String imageUrl){
        this.barcode = barcode;
        this.productName = productName;
        this.imageUrl = imageUrl;
    }


    public String getCode() {
        return barcode;
    }

    public void setCode(String code) {
        this.barcode = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}