import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("Enter the number of courses:");
		Integer n =Integer.parseInt(br.readLine());
		List<Course> courseList =new ArrayList<Course>();
		for (int i = 0; i < n; i++) {
			String userDetails=br.readLine();
			String[] userArr = userDetails.split(",");
			Course course = new Course(userArr[0], userArr[1], Double.parseDouble(userArr[2]));
			courseList.add(course);
		}
		
		System.out.println("Enter a search type:\n1.By Category\n2.By List of Names");
		Integer choice = Integer.parseInt(br.readLine());
		CourseBO coursebo = new CourseBO();
		if(choice==1){
			System.out.println("Enter the Category:");
			String category = br.readLine();
			List<Course> li=coursebo.findCourse(courseList, category);
			if(li.isEmpty()){
				System.out.println("No such course is present");
			}else{
				System.out.format("%-15s %-15s %s\n","Name","Category","Price");
				for (Course course : li) {
					System.out.format("%-15s %-15s %s\n",course.getName(),course.getCategory(),course.getPrice());
				}
			}
		}else if(choice==2){
			System.out.println("Enter the Names:");
			String names = br.readLine();
			String[] nameListArr = names.split(",");
			List<String> nameList = Arrays.asList(nameListArr);
			List<Course> li = coursebo.findCourse(courseList, nameList);
			if(li.isEmpty()){
				System.out.println("No such course is present");
			}else{
				System.out.format("%-15s %-15s %s\n","Name","Category","Price");
				for (Course course : li) {
					System.out.format("%-15s %-15s %s\n",course.getName(),course.getCategory(),course.getPrice());
				}
			}
		}else{
			System.out.println("Invalid Choice");
		}
		//write your code here
	}
}
