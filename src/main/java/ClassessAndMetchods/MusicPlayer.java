package ClassessAndMetchods;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

/**
 * Created by mariusz on 11.07.17.
 */
public class MusicPlayer {




    public static void  MusicPlayer() {
    String urlmusic = "src/main/resources/Intro.mp3";
    File introMusic = new File(urlmusic);
       Media theXX = new Media(introMusic.toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(theXX);
       mediaPlayer.play();
       mediaPlayer.setAutoPlay(true);
       mediaPlayer.setCycleCount(10);
    }
}
