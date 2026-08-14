module pe.edu.upeu.repasoemcyg1array {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.repasoemcyg1array to javafx.fxml;
    exports pe.edu.upeu.repasoemcyg1array;
}