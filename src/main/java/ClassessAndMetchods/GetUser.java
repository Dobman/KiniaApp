package ClassessAndMetchods;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ax on 6/24/2017.
 */
public class GetUser {
    String user;
    String password;



    public GetUser() throws FileNotFoundException {

        String line = null;
        FileReader fileReader = new FileReader("src/main/resources/TXT/users.txt");
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) !=null ){

                user = bufferedReader.readLine();
                password = bufferedReader.readLine();
                System.out.println(user);
                System.out.println(password);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}