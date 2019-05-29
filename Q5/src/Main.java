import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of courses:");
		//Your code goes here...
		List<User> userList =User.prefill();
		List<Course> courseList =new ArrayList<Course>();
		Integer n=Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Enter course "+(i+1)+" detail");
			String userDetailOfCourse = br.readLine();
			String[] userCourse=userDetailOfCourse.split(",");
			Course course =new Course(userCourse[0], userCourse[1], Double.parseDouble(userCourse[2]), new ArrayList<UserScore>());
			User user = null;
			UserScore userscore =null;
			System.out.println("Enter number of user scores:");
			Integer userCount = Integer.parseInt(br.readLine());
			for (int j = 0; j < userCount; j++) {
				String userDetails = br.readLine();
				String[] userArr = userDetails.split(",");
				for (User user1 : userList) {
					if(user1.getName().equalsIgnoreCase(userArr[1])){
						user=user1;
						break;
					}
				}
				userscore = new UserScore(Double.parseDouble(userArr[0]), user, course);
				course.getUserScoreList().add(userscore);
			}
			courseList.add(course);
		}
		System.out.println("Enter a type to sort:\n1.Sort by No.of Users\n2.Sort by Price");
		//Your code goes here...
		Integer choice = Integer.parseInt(br.readLine());
		if(choice==1){
			Collections.sort(courseList);
			System.out.format("%-15s %-15s %-8s %s\n","Name","Category","Price","No.of Users");
			for (Course course : courseList) {
				System.out.format("%-15s %-15s %-8s %s\n",course.getName(),course.getCategory(),course.getPrice(),course.getUserScoreList().size());
			}
		}else if(choice == 2){
			Collections.sort(courseList,new PriceComparator());
			System.out.format("%-15s %-15s %-8s %s\n","Name","Category","Price","No.of Users");
			for (Course course : courseList) {
				System.out.format("%-15s %-15s %-8s %s\n",course.getName(),course.getCategory(),course.getPrice(),course.getUserScoreList().size());
			}
		}
	}
}
