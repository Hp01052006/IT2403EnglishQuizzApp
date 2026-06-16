package com.dhp.quizzapp;

import com.dhp.alert.MyAlert;
import com.dhp.theme.ThemesType;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable {
   @FXML private ComboBox<ThemesType> cbThemes;
@Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemesType.values()));
    }
   public void mangeQuestions(ActionEvent e){
      MyAlert.getIntance().showAlert("Comming Soon...");
   }
   
   public void practice(ActionEvent e){
        MyAlert.getIntance().showAlert("Comming Soon...");
   }
   public void Exam(ActionEvent e){
        MyAlert.getIntance().showAlert("Comming Soon...");
   }

   public void changeTheme(ActionEvent e){
       switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
           case DARK:
               this.cbThemes.getScene().getRoot().getStylesheets().clear();
               this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("Dark.css").toExternalForm());
               break;
           case LIGHT:
               this.cbThemes.getScene().getRoot().getStylesheets().clear();
               this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("Light.css").toExternalForm());
               break;
           default:
               this.cbThemes.getScene().getRoot().getStylesheets().clear();
               this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style1s.css").toExternalForm());
       }
   }
}
