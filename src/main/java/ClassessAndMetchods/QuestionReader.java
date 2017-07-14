package ClassessAndMetchods;

import Controllers.QuizWindowController;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventListener;
import java.util.List;

/**
 * Created by mariusz on 08.07.17.
 */
public class QuestionReader {
    String[] id = new String[10];
    String[] question = new String[10];


    String[] a = new String[10];
    String[] b = new String[10];
    String[] c = new String[10];
    String[] d = new String[10];
    String[] odp = new String[10];


    public QuestionReader() throws FileNotFoundException {




        String fileName = "src/main/resources/TXT/quiz.csv";
        FileReader fileReader = new FileReader(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int linia = bufferedReader.readLine().length();

            for (int j =0; j <10;j++) {
                String[] wholeLine = bufferedReader.readLine().split(";");

                for (int i = 0; i <= 6; i++) {
                    //   System.out.println(wholeLine[i]);
                    id[j] = wholeLine[0];
                    question[j] = wholeLine[1];
                    a[j] = wholeLine[2];
                    b[j] = wholeLine[3];
                    c[j] = wholeLine[4];
                    d[j] = wholeLine[5];
                    odp[j] = wholeLine[6];
                    System.out.println(Arrays.toString(question));
                    //  System.out.println(odp[5]);
                    //  System.out.println(question.length);
                    System.out.println(Arrays.toString(a));
                    System.out.println(Arrays.toString(b));
                    System.out.println(Arrays.toString(c));
                    System.out.println(Arrays.toString(d));
                    System.out.println(Arrays.toString(odp));
                }

            }
            bufferedReader.close();
                  /*  quizArray[][] = quizArray[i][j];

                    String id = wholeLine[0];System.out.println(wholeLine);
                    String question = wholeLine[1];
                    String a = wholeLine[2];
                    String b = wholeLine[3];
                    String c = wholeLine[4];
                    String d = wholeLine[5];
                    String odp = wholeLine[6];
                    System.out.print(id + question + a + b + c + d + odp); */





        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public String[] getId() {
        return id;
    }

    public String[] getQuestion() {
        return question;
    }

    public String[] getA() {
        return a;
    }

    public String[] getB() {
        return b;
    }

    public String[] getC() {
        return c;
    }

    public String[] getD() {
        return d;
    }

    public String[] getOdp() {
        return odp;
    }


    public void setId(String[] id) {
        this.id = id;
    }

    public void setQuestion(String[] question) {
        this.question = question;
    }

    public void setA(String[] a) {
        this.a = a;
    }

    public void setB(String[] b) {
        this.b = b;
    }

    public void setC(String[] c) {
        this.c = c;
    }

    public void setD(String[] d) {
        this.d = d;
    }

    public void setOdp(String[] odp) {
        this.odp = odp;
    }


}