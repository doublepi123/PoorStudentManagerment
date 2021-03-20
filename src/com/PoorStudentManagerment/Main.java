package com.PoorStudentManagerment;

import com.PoorStudentManagerment.ui.BaseControl;
import com.PoorStudentManagerment.ui.LoginControl;
import com.PoorStudentManagerment.util.SQLHelper;
import com.sun.xml.internal.rngom.parse.host.Base;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    private static SQLHelper sqlHelper;
    public void start(Stage stage) throws IOException {
        sqlHelper = new SQLHelper();
        String databasePath = "database.db";
        File file = new File(databasePath);
        if(!file.exists()){
            sqlHelper.executeUpdate(" CREATE TABLE STUDENT(NAME VARCHAR(10),ID STRING,AGE INT,HOMEPEOPLE INT,HOMEINCOME DOUBLE,NUMBEROFSIBLINGS INT,NUMBEROFELFERLY INT,COSTFORFOOD DOUBLE,COSTFOROTHER DOUBLE)");
        }
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/Login.fxml"));
        Stage newStage = new Stage();
        newStage.setScene(new Scene(loader.load()));
        loader.getController();
        newStage.setTitle("登入");
        newStage.show();
    }
}
