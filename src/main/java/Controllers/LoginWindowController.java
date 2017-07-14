package Controllers;

import ClassessAndMetchods.GetUser;
import ClassessAndMetchods.LoginWindow;
import Dialogs.DialogLogin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.FileNotFoundException;

/**
 * Careated by ax on 6/6/2017.
 */
public class LoginWindowController  {


    @FXML
    public TextField LoginTextField;
    @FXML
    public PasswordField PasswordTextField;
    public Button BackButton;
    private Controller controller;
    private GetUser getUser = new GetUser();
    LoginWindow loginWindow = new LoginWindow();

    public LoginWindowController() throws FileNotFoundException {
    }

   /* public LoginWindowController(boolean loginCheck) {
        this.loginCheck = loginCheck;
        loginCheck = LoginCheck;
    }

    public boolean isLoginCheck() {
        return LoginCheck;

    }

    public void setLoginCheck(boolean loginCheck) {
        LoginCheck = loginCheck;

    }*/

    @FXML
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @FXML
    public void BackToMenu(ActionEvent actionEvent) {

        controller.setPrimaryWindow();

    }


    @FXML
    public void loginConfirm(ActionEvent actionEvent) {

        if (PasswordTextField.getText().equals(getUser.getPassword()) && LoginTextField.getText().equals(getUser.getUser())) {
            loginWindow.setAccess(true);
            System.out.println(loginWindow.isAccess());
            controller.setPrimaryWindow();
        }
        else {
            DialogLogin.dialogLoginFalse();
            loginWindow.setAccess(false);
            System.out.println(loginWindow.isAccess());
        }

    }


}

