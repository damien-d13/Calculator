package fr.damien.calculator.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Display{


    private final VBox root ;

    public static final String TEXTRESULT = "text-result";

    public static final String BUTTON = "button-number";
    public static final String BUTTONSIGN = "button-sign";
    public static final String BUTTON0 = "button-number-0";

    public Display(){

        root = new VBox(10);
        root.setBackground(new Background(new BackgroundFill(Color.web("#F0F4F8"), null, null)));
        root.setPadding(new Insets(25));
        root.setAlignment(Pos.CENTER);

        //Boxing Layout
        HBox textBox = new HBox();

        HBox buttonBox = new HBox();

        VBox leftBox = new VBox();

        HBox colButton1 = new HBox();
        HBox colButton2 = new HBox();
        HBox colButton3 = new HBox();
        HBox colButton4 = new HBox();

        VBox rightBox = new VBox();

        //Create Element

        TextField textField = new TextField();
        textField.setId(TEXTRESULT);

        Button button0 = new Button("0");
        button0.setId(BUTTON0);
//        button0.setStyle("-fx-background-color: #2969c0; ");

        Button button1 = new Button("1");
        button1.getStyleClass().add(BUTTON);

        Button button2 = new Button("2");
        button2.getStyleClass().add(BUTTON);

        Button button3 = new Button("3");
        button3.getStyleClass().add(BUTTON);

        Button button4 = new Button("4");
        button4.getStyleClass().add(BUTTON);

        Button button5 = new Button("5");
        button5.getStyleClass().add(BUTTON);

        Button button6 = new Button("6");
        button6.getStyleClass().add(BUTTON);

        Button button7 = new Button("7");
        button7.getStyleClass().add(BUTTON);

        Button button8 = new Button("8");
        button8.getStyleClass().add(BUTTON);

        Button button9 = new Button("9");
        button9.getStyleClass().add(BUTTON);

        Button buttonLess = new Button("-");
        buttonLess.getStyleClass().add(BUTTONSIGN);

        Button buttonMore = new Button("+");
        buttonMore.getStyleClass().add(BUTTONSIGN);

        Button buttonMulti = new Button("*");
        buttonMulti.getStyleClass().add(BUTTONSIGN);

        Button buttonDiv = new Button("/");
        buttonDiv.getStyleClass().add(BUTTONSIGN);

        //Bind Element to box
        textBox.getChildren().addAll(textField);
        buttonBox.getChildren().addAll(leftBox, rightBox);
        leftBox.getChildren().addAll(colButton1, colButton2, colButton3, colButton4);

        colButton1.getChildren().addAll(button7, button8, button9);
        colButton2.getChildren().addAll(button4, button5, button6);
        colButton3.getChildren().addAll(button1, button2, button3);
        colButton4.getChildren().add(button0);

        rightBox.getChildren().addAll(buttonLess, buttonMore, buttonMulti, buttonDiv);

        root.getChildren().addAll(textBox, buttonBox);

    }

    public VBox getRoot() {
        return root;
    }

}
