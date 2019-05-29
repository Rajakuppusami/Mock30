import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Your code goes here
		System.out.println("Enter user 1 details:");
		//Your code goes here
		String User1Detail =reader.readLine();
		String user1Arr[] = User1Detail.split(",");
		User user1 = new User(user1Arr[0], user1Arr[1], user1Arr[2]);
		System.out.println("Enter user 2 details:");
		//Your code goes here
		String User2Detail =reader.readLine();
		String user2Arr[] = User2Detail.split(",");
		User user2 = new User(user2Arr[0], user2Arr[1], user2Arr[2]);
		System.out.println();
		System.out.println("User 1");
		System.out.println(user1);
		System.out.println();
		System.out.println("User 2");
		System.out.println(user2);
		System.out.println();
		if(user1.equals(user2)){
			System.out.println("User 1 is same as User 2");
		}else{
			System.out.println("User 1 and User 2 are different");
		}
	} 
}
