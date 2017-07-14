package Dialogs;

import javafx.scene.control.Alert;

import java.io.FileNotFoundException;

/**
 * Created by mariusz on 13.07.17.
 */
public class DialogEndOfQuiz  {


    public DialogEndOfQuiz() throws FileNotFoundException {
    }

    public void endOfQuiz(){
        Alert dialogLoginFalse = new Alert(Alert.AlertType.INFORMATION);

        dialogLoginFalse.setHeaderText(" Gratulacje! Właśnie ukończyłaś quiz! Poniżej wyświętli się wynik jak napiszę nową funkcjonalość ;)");
        dialogLoginFalse.setContentText("");
        dialogLoginFalse.showAndWait();
    }
}
