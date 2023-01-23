package FoodFacts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import pl.coderion.model.Ingredient;
import pl.coderion.model.Nutriments;
import pl.coderion.model.Product;
import pl.coderion.model.ProductResponse;
import pl.coderion.model.SelectedImages;
import pl.coderion.service.OpenFoodFactsWrapper;
import pl.coderion.service.impl.OpenFoodFactsWrapperImpl;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class Ventana extends Application {

    private TextField barcodeField;
    private Label nameLabel;
    private Label name;
    private Image imagen;
    private Label packagingLabel;
    private Label ingredientsLabel;
    private GridPane grid = new GridPane();




    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Open Food Facts");


        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label barcodeLabel = new Label("Code:");
        grid.add(barcodeLabel, 0, 0);

        barcodeField = new TextField();
        grid.add(barcodeField, 1, 0);

        Button searchButton = new Button("Search");
        grid.add(searchButton, 2, 0);
        searchButton.setOnAction(e -> searchProduct(barcodeField.getText()));

        nameLabel = new Label("Name:");
        name = new Label();
        grid.add(nameLabel, 0, 1);
        grid.add(name, 1, 1);



        grid.add(new Label("Imagen: "), 0, 2);





        Scene scene = new Scene(grid, 900, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }








    private void searchProduct(String code) {
        OpenFoodFactsWrapper wrapper = new OpenFoodFactsWrapperImpl();
        ProductResponse productResponse = wrapper.fetchProductByCode(code);
        Product product = productResponse.getProduct();
        if (product != null) {
            name.setText(product.getProductName());


            if (grid.getChildren().contains(imagen)) {
                grid.getChildren().remove(imagen);
                grid.requestLayout();
            }
            Image image = new Image(product.getImageUrl());
            ImageView imagen = new ImageView(image);
            grid.add(imagen, 1, 2);



        } else {
            System.out.println("Product not found");
        }
    }


}
