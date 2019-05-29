import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    			//Your code goes here
    	
    	System.out.println("Enter the contact number to be validated:");
		//Your code goes here
    	String contactNumber = reader.readLine();
    	if(validateContactNumber(contactNumber)){
    		System.out.println("Contact number is valid");
    	}else{
    		System.out.println("Contact number is invalid");
    	}
    }
   
    static Boolean validateContactNumber(String contactNumber){
    			//Your code goes here
    	if(contactNumber.matches("^[+]{1}[9]{1}[1]{1}[1-9]{1}[0-9]{9}$")){
    		return true;
    	}
		return false;
    	
    }

}
