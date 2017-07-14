package ClassessAndMetchods;

import Controllers.LoginWindowController;

/**
 * Created by ax on 6/22/2017.
 */
public class LoginWindow  {


    private static boolean access;



    public LoginWindow() {
        this.access= isAccess();
    }

    public boolean isAccess() {
        return true; // tu zmienic na access zeby bylo poprawnie
    }

    public void setAccess(boolean access) {
        this.access = access;
    }


}
