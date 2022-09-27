package com.example.hboxvboxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class VboxDemo {
    private final ArrayList<Button> buttonArrayList = new ArrayList<>();
    public VBox mainVbox;
    public Button btn1;
    int btnCount;

    @FXML
    void insertButton(ActionEvent event) {
btnCount++;
mainVbox.setPrefWidth(btn1.getWidth());     //set the size of the container to the button
String buttonName = "button "+ btnCount;    //adds an individual name to the button
Button buttoName = new Button();            //create the button
buttoName.setPrefWidth(btn1.getWidth());    //set the width to the same as the master button
buttoName.setText(buttonName);              //give them the individual names
mainVbox.getChildren().add(buttoName);      //add them to the parent node

    }


}
