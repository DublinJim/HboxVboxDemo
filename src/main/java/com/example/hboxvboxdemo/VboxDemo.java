package com.example.hboxvboxdemo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class VboxDemo implements Initializable {
    private final ArrayList<Button> buttonArrayList = new ArrayList<>(10);
    public VBox root;
    public Button btn1;


    public int btnCount;
    public double ButtonWidth;
    public double widthRoot;
    public double heightRoot;
    public Stage primaryStage;

    @FXML
    void insertButton() {
        btnCount++;
        ButtonWidth = btn1.getWidth();
        root.setPrefWidth(ButtonWidth);
        heightRoot = root.getHeight();
        widthRoot = root.getWidth();
        root.setMaxHeight(300);
        String buttonName = "Radio " + btnCount;

        Button buttoName = new Button();

        buttoName.setPrefWidth(btn1.getWidth());

        buttoName.setText(buttonName);

        root.getChildren().add(buttoName);

        buttonArrayList.add(buttoName);


        if (btnCount >= 10) {
            primaryStage = HelloApplication.myStage;
            primaryStage.setTitle("New");
            primaryStage.setMinWidth(primaryStage.getWidth() + btn1.getWidth());
            System.out.println("In function");
            btnCount = 0;
        }

        // TODO: 9/29/2022 stop new buttons being added to the arraylist

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
