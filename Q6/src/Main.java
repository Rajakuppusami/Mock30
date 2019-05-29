
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of user scores:");
		
		List<User> UserList = User.prefill();
		List<Course> courseUserScore = Course.prefill();
		List<UserScore> scoreList=new ArrayList<UserScore>();
		Integer n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String userdetails = br.readLine();
			String[] userArr = userdetails.split(",");
			User userObj = null;
			Course courseObj =null;
			for (User user : UserList) {
				if(user.getName().equalsIgnoreCase(userArr[1])){
					userObj=user;
					
					break;
				}
			}
			for (Course course : courseUserScore) {
				if(course.getName().equalsIgnoreCase(userArr[2])){
					courseObj=course;
					break;
				}
			}
			UserScore userScore =new UserScore(Double.parseDouble(userArr[0]), userObj, courseObj);
			courseObj.getUserScoreList().add(userScore);
			userObj.getUserScoreList().add(userScore);
			scoreList.add(userScore);
		}
		
		Map<String,UserScore> tr=UserScore.getTopPerformer(scoreList);
		System.out.format("%-15s %s\n","Course","Top performer");
		for (Map.Entry<String, UserScore> entry:tr.entrySet()) {
			System.out.format("%-15s %s\n",entry.getKey(),entry.getValue().getUser().getName()) ;
		}
		
		
		//Your code here
	}
}
