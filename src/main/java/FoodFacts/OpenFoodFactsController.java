package FoodFacts;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OpenFoodFactsController {
    @FXML
    private TextField barcodeTextField;
    @FXML
    private Label productNameLabel;
    @FXML
    private Label ingredientsLabel;
    @FXML
    private Label nutritionFactsLabel;

    private OpenFoodFactsApi productApi = OpenFoodFactsService.getApi();

    @FXML
    public void searchProduct() {
        String barcode = barcodeTextField.getText();
        Call<Product> call = productApi.getProduct(barcode);
        call.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                if (response.isSuccessful()) {
                    Product product = response.body();
                    if (product != null) {
                        productNameLabel.setText(product.getProductName());
                        //ingredientsLabel.setText(product.getIngredients());
                       // nutritionFactsLabel.setText(product.getNutritionGrade());
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                }
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                System.out.println("Error en la petición: " + t.getMessage());
                t.printStackTrace();
            }
        });
    }
}
