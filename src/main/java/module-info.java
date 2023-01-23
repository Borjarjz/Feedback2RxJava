module RX {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires java.sql;
    requires gson;
    requires openfoodfacts.java.wrapper;
    opens Countries;

    opens FoodFacts to javafx.fxml;
    exports FoodFacts;
}
