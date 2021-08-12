module fr.damien.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens fr.damien.calculatrice to javafx.fxml;
    exports fr.damien.calculatrice;
    exports fr.damien.calculatrice.controller;
    opens fr.damien.calculatrice.controller to javafx.fxml;
    exports fr.damien.calculatrice.view;
    opens fr.damien.calculatrice.view to javafx.fxml;
}