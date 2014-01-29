package lic.test.fullcontact;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class FullContactHttpRequest {

	/**
	 * envoie  la requete http au service web FullContact
	 * @param paramString
	 * @return
	 */
	public static String sendPersonRequest(String paramString)
             {
        return sendRequest(("https://api.fullcontact.com/v2/person.xml?" + paramString));
    }
	
	public static String sendRequest(String apiUrl)
             {
        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL(apiUrl);
            URLConnection connection = url.openConnection();
           
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), "UTF-8"));
            String str;
            while ((str = in.readLine()) != null) {
                buffer.append(str);
            }
            in.close();
        } catch (Exception e) {
           e.printStackTrace();
        } 
        return buffer.toString();
    }
}
