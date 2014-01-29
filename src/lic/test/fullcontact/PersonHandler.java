package lic.test.fullcontact;

import java.text.MessageFormat;

public class PersonHandler {
	
	 String apiKey ;
	 public PersonHandler(String apiKey) {
		
		     this.apiKey = apiKey;
	    }


	 /**
	  * recuperer les informations de la personne en utilisant le paramètre lookup By Facebook
	  * @param facebookUsername
	  * @return
	  */
	 public String getPersonInfoByFacebookUsername(String facebookUsername)
	            {
	        return getPersonInfoByParameterString(MessageFormat.format("facebookUsername={0}", facebookUsername));
	    }
	 
	
	 private String getPersonInfoByParameterString(String paramString)
	             {
	        paramString = paramString + "&" + MessageFormat.format("apiKey={0}", apiKey);
	       
	        return FullContactHttpRequest.sendPersonRequest(paramString);
	    }
}
