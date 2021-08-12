module fr.damien.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens fr.damien.calculator to javafx.fxml;
    exports fr.damien.calculator;
    exports fr.damien.calculator.controller;
    opens fr.damien.calculator.controller to javafx.fxml;
    exports fr.damien.calculator.view;
    opens fr.damien.calculator.view to javafx.fxml;
}