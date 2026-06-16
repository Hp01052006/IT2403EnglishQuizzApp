module com.dhp.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dhp.quizzapp to javafx.fxml;
    exports com.dhp.quizzapp;
}
