package Controllers;

import ClassessAndMetchods.QuestionReader;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.text.Text;

import java.io.*;


/**
 * Created by ax on 6/9/2017.
 */
public class QuizWindowController {
    // Layaut
    public TextField TextFieldA;
    public TextField TextFieldB;
    public TextField TextFieldC;
    public TextField TextFieldD;
    public TextArea QuestionTextArea;
    public Button nextQuestionButton;
    public ProgressIndicator progressI;
    public Text textProgress;
    public RadioButton radioButttonA;
    public RadioButton radioButttonB;
    public RadioButton radioButttonC;
    public RadioButton radioButttonD;
    public Text ScoreText;

    // DialogEndOfQuiz dialogEndOfQuiz = new DialogEndOfQuiz();
    Controller controller;
    @FXML
    private QuestionReader questionReader;
    //
    private int questionNr = 0;

    // int arrayLength = questionReader.getA().length;
    final ToggleGroup group = new ToggleGroup();
    String odpSet ="";

    String[] arrrayOdp = new String[10];

    public String[] getArrrayOdp() {
        return arrrayOdp;
    }

    String[] arrayDataOdp = new String[10];

    public String[] getArrayDataOdp() {
        return arrayDataOdp;
    }


    public void setArrayDataOdp(String[] arrayDataOdp) {
        this.arrayDataOdp = arrayDataOdp;
    }



    public void setArrrayOdp(String[] arrrayOdp) {

            arrrayOdp[questionNr-1] =odpSet;


        this.arrrayOdp = arrrayOdp;
    }




    public QuizWindowController() throws FileNotFoundException {



    }

  /*  public int QuizScore() throws FileNotFoundException {
         int score = 0;
        for (int i = 0; i <= 9; i++) {
            if (getArrrayOdp()[i].equals(questionReader.getOdp())) {
                score++;
            }
        }
        return score;
    }
*/





    public int getQuestionNr() {

        return questionNr;
    }

    public void setQuestionNr(int questionNr) throws FileNotFoundException {
        if(questionNr<=questionReader.getA().length && questionNr>=0 ){
            this.questionNr = questionNr;

        }
        setQuestion(getQuestionNr());
    }


    public void setController(Controller controller) {
        this.controller = controller;
        try {
             questionReader = new QuestionReader();
            setQuestion(0);
           // progressI = new ProgressIndicator(0);
            ToggleG();
            IniToggle();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
       public void ToggleG() {
        radioButttonA.setToggleGroup(group);
        radioButttonA.setSelected(true);
        radioButttonB.setToggleGroup(group);
        radioButttonC.setToggleGroup(group);
        radioButttonD.setToggleGroup(group);
    }

    public void BackMenu(ActionEvent event) {
        controller.setPrimaryWindow();

    }


    public void nextQuestionAction(ActionEvent actionEvent) throws FileNotFoundException  {

        RBCleaner();
        setQuestionNr(getQuestionNr() + 1);
        setArrrayOdp(arrrayOdp);
      //  progressI.setProgress(0.5);
        System.out.println(odpSet) ;

        for(int i =0; i<=9;i++){
            System.out.println(arrrayOdp[i]);
        }
        }

private void setQuestion(int id ) throws FileNotFoundException {
    if (id<questionReader.getA().length) {
        TextFieldA.setText(questionReader.getA()[id]);
        TextFieldB.setText(questionReader.getB()[id]);
        TextFieldC.setText(questionReader.getC()[id]);
        TextFieldD.setText(questionReader.getD()[id]);
        QuestionTextArea.setText(questionReader.getQuestion()[id]);






    }
    else{
        ScoreText.setText("");
      //  dialogEndOfQuiz.endOfQuiz();
    }

    //  System.out.println(pin.getProgress());
    textProgress.setText("Pytanie "+ (id +1) +" z " + questionReader.getA().length);

    }

    public void OnActionBackButton(ActionEvent actionEvent) throws FileNotFoundException {

        //progressI.setProgress(0.25); // questionNr/questionReader.getA().length
        setQuestionNr(getQuestionNr() - 1);

    }

    public void progresTextField(InputMethodEvent inputMethodEvent) {
    }


    
   private void RBCleaner(){

       radioButttonA.setSelected(false);
       radioButttonB.setSelected(false);
       radioButttonC.setSelected(false);
       radioButttonD.setSelected(false);

    }
    private void IniToggle(){
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1) {

                RadioButton chk = (RadioButton)t1.getToggleGroup().getSelectedToggle();
                System.out.println(chk.getText().toLowerCase());
                // Cast object to radio button
                odpSet = chk.getText().toLowerCase();



            }
        });

            }

}