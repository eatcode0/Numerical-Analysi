module com.numerical.martinjil {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.numerical.martinjil to javafx.fxml;
    exports com.numerical.martinjil;
}
