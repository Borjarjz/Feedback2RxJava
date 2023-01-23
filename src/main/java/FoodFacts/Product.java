package FoodFacts;
import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("code")
    private String barcode;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("image_url")
    private String imageUrl;
/*
    @SerializedName("ingredients_text")
    private String ingredients;

    @SerializedName("nutrition_grades_tags")
    private String nutritionGrade;

    @SerializedName("missing energy")
    private String energyValue;

    @SerializedName("packaging")
    private String packaging;

    @SerializedName("origins")
    private String origin;

    @SerializedName("brands")
    private String brand;

    @SerializedName("stores")
    private String stores;
*/


    public Product(){
// constructor vacío
    }

    public Product(String barcode, String productName, String imageUrl){
        this.barcode = barcode;
        this.productName = productName;
        this.imageUrl = imageUrl;
    }

    /*public Product(String barcode, String productName, String imageUrl, String ingredients, String nutritionGrade, String energyValue, String packaging, String origin, String brand, String stores) {
        this.barcode = barcode;
        this.productName = productName;
        this.imageUrl = imageUrl;
        this.ingredients = ingredients;
        this.nutritionGrade = nutritionGrade;
        this.energyValue = energyValue;
        this.packaging = packaging;
        this.origin = origin;
        this.brand = brand;
        this.stores = stores;

    }*/

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
/*
    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getNutritionGrade() {
        return nutritionGrade;
    }

    public void setNutritionGrade(String nutritionGrade) {
        this.nutritionGrade = nutritionGrade;
    }

    public String getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(String energyValue) {
        this.energyValue = energyValue;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }*/
}