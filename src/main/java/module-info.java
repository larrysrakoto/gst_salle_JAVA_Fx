module net.larrys.gest_salle {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.larrys.gest_salle to javafx.fxml;
    exports net.larrys.gest_salle;
}