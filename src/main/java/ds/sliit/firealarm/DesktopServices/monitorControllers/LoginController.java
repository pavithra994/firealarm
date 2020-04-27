package ds.sliit.firealarm.DesktopServices.monitorControllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginController {
    public static boolean authenticateUser(String username, String password) throws IOException {
        String credentials;
        String[] logins;
        String uname;
        String pword;
        // Access login credentials from text file available in the same package
        try ( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (LoginController.class.getResourceAsStream("credentials.txt")))) {


            // traverse through each line available in the text file

            while ((credentials = bufferedReader.readLine()) != null) {
                logins = credentials.split("-");
                uname = logins[0];
                pword = logins[1];

                // Check username and password with given parameters
                if(uname.equals(username) && pword.equals(password)){
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Login cannot be done "+e.getMessage());
        }
        return false;
    }

}

