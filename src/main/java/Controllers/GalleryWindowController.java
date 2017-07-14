package Controllers;


import Dialogs.DialogLogin;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;


/**
 * Created by ax on 6/6/2017.
 */


public class GalleryWindowController {
    @FXML
    public ImageView iV;
    @FXML
    public AnchorPane anchorGallery;
    Controller controller;
    private String urlPrefix ="src/main/resources/";

    private  int currentImage = 0;

    String[] urlStrings = {"Kinia1.jpg","Kinia2.jpg","Kinia3.jpg","Kinia4.jpg","Kinia5.jpg","Kinia6.jpg","Kinia7.jpg","Kinia8.jpg"
    };
    BufferedImage imgCurrent = null;

    @FXML
    void initialize () {
        setImage();

    }
    public void BackToMenu(ActionEvent actionEvent) {
        controller.setPrimaryWindow();
    }

    private  void setImage()
    {

        String url = urlPrefix +  urlStrings[currentImage]; //
        try {


            File file = new File(url);
            System.out.println(file.exists());
            Image img = new Image("file:"+ url);
            System.out.println( img.isError());
            iV.setImage(img);

        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void backImg(ActionEvent actionEvent) {
        if(currentImage>0) {
            currentImage -= 1;
            setImage();
            System.out.println(urlPrefix + urlStrings[currentImage]);
        }
        else{
            currentImage = urlStrings.length -1;
            setImage();
        }
    }

    public void nextImg(ActionEvent actionEvent) {
        if(currentImage< urlStrings.length -1) {
            currentImage += 1;
            setImage();
            System.out.println(urlPrefix + urlStrings[currentImage]);
        }
        else{
            currentImage = 0;
            setImage();
        }
    }

}
