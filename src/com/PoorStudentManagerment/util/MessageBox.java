package com.PoorStudentManagerment.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MessageBox {
    private Stage stage;
    private FXMLLoader loader;
    private MessageBoxControl messageBoxControl;
    public MessageBox() throws IOException {
        loader = new FXMLLoader(
                getClass().getResource(
                        "../ui/MessageBox.fxml"
                )
        );
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(
                new Scene(loader.load())
        );
        messageBoxControl = loader.getController();
    }
    public void setMessage(String s){
//        messageBoxControl.tMessage.setText(s);
    }
    public void showMessage(){
        stage.show();
    }
    public void setMessageAndShow(String s){
//        messageBoxControl.tMessage.setText(s);
        stage.show();
    }
}