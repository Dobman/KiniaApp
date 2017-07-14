package Controllers;

import ClassessAndMetchods.GetUser;
import ClassessAndMetchods.LoginWindow;
import ClassessAndMetchods.MusicPlayer;
import ClassessAndMetchods.QuestionReader;
import Dialogs.DialogLogin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ax on 6/1/2017.
 */
public class PrimaryWindowController  {

    private Controller controller;
  private  LoginWindow loginWindow = new LoginWindow();
    @FXML
    private AnchorPane PrimaryAnchorPane;



    public PrimaryWindowController()  {


    }


    @FXML
    public void OnActionButton(ActionEvent actionEvent) {

        MusicPlayer.MusicPlayer();
    }


    @FXML
    public void OnActionGalery(ActionEvent actionEvent) {


        if (loginWindow.isAccess()) {
            AnchorPane anchorPane = null; // inicjalizacja AnchorPane - okna  w ktorym bedzie wyslwietlane okienko
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/GalleryWindow.fxml")); // zaladowanie plilu FXML

            try {

                anchorPane = loader.load();

            } catch (IOException e) {
                e.printStackTrace();
            }

            GalleryWindowController galleryWindowController = loader.getController();

            galleryWindowController.setController(controller);
            controller.SetWindow(anchorPane);
        } else {
            DialogLogin.noexcess();
        }

    }

    @FXML
    public void OnActionLogin(ActionEvent actionEvent) {
        AnchorPane anchorPane = null;
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/LoginWindow.fxml"));

        try {

            anchorPane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        LoginWindowController loginWindowController = loader.getController();
        loginWindowController.setController(controller);
        controller.SetWindow(anchorPane);


    }

    @FXML
    public void OnActionQuiz(ActionEvent actionEvent) {
        // sprawdzanie czy  poprawnie sie zalogowano
        if (loginWindow.isAccess()) {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/QuizWindow.fxml")); // zaladowanie plilu FXML
            AnchorPane anchorPane = null; // inicjalizacja AnchorPane - okna  w ktorym bedzie wyslwietlane okienko
            try {

                anchorPane = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            QuizWindowController quizWindowController = loader.getController();
            quizWindowController.setController(controller);
            controller.SetWindow(anchorPane);
        } else {
            DialogLogin.noexcess();
        }

            }

    public void setController(Controller controller) {
        this.controller = controller;
    }



}
