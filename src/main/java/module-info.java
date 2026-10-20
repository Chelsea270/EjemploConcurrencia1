module org.test.ejemploconcurrencia1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.test.ejemploconcurrencia1 to javafx.fxml;
    exports org.test.ejemploconcurrencia1;
}