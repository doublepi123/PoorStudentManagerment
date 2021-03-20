package com.PoorStudentManagerment.ui;

import com.PoorStudentManagerment.dao.StudentDao;
import com.PoorStudentManagerment.daoimpl.StudentDaoImpl;
import com.PoorStudentManagerment.model.Student;
import com.PoorStudentManagerment.util.MessageBox;
import com.PoorStudentManagerment.util.SQLHelper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BaseControl {
    @FXML
    Button exit;
    protected static SQLHelper sqlHelper;
    protected Stage stage;
    protected static String username;
    protected static StudentDao studentDao;
    protected static MessageBox messageBox;
    protected static Student student;
    public void init(String str) throws IOException {
        messageBox = new MessageBox();
        stage = (Stage) exit.getScene().getWindow();
        sqlHelper = new SQLHelper();
        username = str;
        studentDao = new StudentDaoImpl(username);
        student = new Student();
        return;
    }
    public void switchWindows(String url, String tittle){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
            Stage newStage = new Stage();
            newStage.setScene(new Scene(loader.load()));
            BaseControl baseControl = loader.getController();
            newStage.setTitle(tittle);
            baseControl.init(username);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            messageBox.setMessage("启动功能失败");
            messageBox.showMessage();
            return;
        }
    }
    public void exit(){
        stage.close();
        return;
    }
}