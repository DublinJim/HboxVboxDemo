package com.example.hboxvboxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class VboxDemo implements Initializable {
    private final ArrayList<Button> buttonArrayList = new ArrayList<>();
    public VBox mainVbox;
    public Button btn1;


    public int btnCount;
    public double ButtonWidth;
    public double widthRoot;
    public double heightRoot;
public Stage primaryStage;

    @FXML
    void insertButton(ActionEvent event) {
        btnCount++;
        ButtonWidth = btn1.getWidth();
        mainVbox.setPrefWidth(ButtonWidth);
        heightRoot = mainVbox.getHeight();
        widthRoot = mainVbox.getWidth();
        String buttonName = "button " + btnCount;

        Button buttoName = new Button();

        buttoName.setPrefWidth(btn1.getWidth());

        buttoName.setText(buttonName);

        mainVbox.getChildren().add(buttoName);

        buttonArrayList.add(buttoName);

        int amtBtns = buttonArrayList.size();

        if (amtBtns >= 10) {
            System.out.println(widthRoot);
            this.widthRoot = widthRoot + 50;

            primaryStage = HelloApplication.myStage;
            primaryStage.setTitle("New");

            System.out.println("not working");

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
