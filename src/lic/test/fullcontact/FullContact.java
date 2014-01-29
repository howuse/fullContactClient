package lic.test.fullcontact;

public class FullContact {

	private String apiKey;
	private PersonHandler personHandler;
	
	public FullContact(String apiKey){
		if (apiKey == null) {
            throw new IllegalArgumentException("apiKey ne peut pas etre null.");
        }

        if (apiKey.trim().length() == 0) {
            throw new IllegalArgumentException("apiKey ne peut pas etre  null.");
        }

        this.apiKey = apiKey;
	}

	public PersonHandler getPersonHandler() {
		 if(personHandler == null){
	            personHandler =  new PersonHandler(apiKey);
	        }
		return personHandler;
	}

	
	
	
}
