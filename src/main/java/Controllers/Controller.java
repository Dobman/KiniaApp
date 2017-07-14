package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class Controller {
    @FXML
    private StackPane mainStackPain;
    public void initialize () {
        setPrimaryWindow();
    }

    public void setPrimaryWindow() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/PrimaryWindow.fxml"));
        AnchorPane MainAnchorPane = null ;
        try {
            MainAnchorPane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrimaryWindowController primaryWindowController = loader.getController();
        primaryWindowController.setController(this);
        SetWindow(MainAnchorPane);
    }

    public void SetWindow(AnchorPane mainAnchorPane) {
        mainStackPain.getChildren().clear();
        mainStackPain.getChildren().add(mainAnchorPane);
    }
}