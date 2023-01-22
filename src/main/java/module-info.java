module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires java.sql;
    opens Countries;

    opens org.example to javafx.fxml;
    exports org.example;
}
