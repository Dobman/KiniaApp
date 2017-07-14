package Dialogs;

import javafx.scene.control.Alert;

import java.io.FileNotFoundException;

/**
 * Created by ax on 6/14/2017.
 */
public class DialogLogin {




    public DialogLogin() throws FileNotFoundException {

    }
    public static void dialogLoginFalse(){
        Alert dialogLoginFalse = new Alert(Alert.AlertType.INFORMATION);

        dialogLoginFalse.setHeaderText(" Wrong Password");
        dialogLoginFalse.showAndWait();


    }
    public static void noexcess(){
        Alert dialogLoginFalse = new Alert(Alert.AlertType.INFORMATION);

        dialogLoginFalse.setHeaderText(" Brak dostępu. Musisz się najpierw zalogować!");
        dialogLoginFalse.showAndWait();
    }

}
