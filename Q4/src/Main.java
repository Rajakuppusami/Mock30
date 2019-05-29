import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("Enter the number of courses:");
		List<Course> courseList =new ArrayList<Course>();
		Integer n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String userDetails=br.readLine();
			String[] userArr = userDetails.split(",");
			Course course = new Course(userArr[0], userArr[1], Double.parseDouble(userArr[2]));
			courseList.add(course);
		}
		//write your code here
		Map<String,Integer> tr =Course.coursePerCategory(courseList);
		System.out.format("%-20s %s\n","Category","Count");
		for (Map.Entry<String, Integer> entry : tr.entrySet()) {
			System.out.format("%-20s %s\n",entry.getKey(),entry.getValue());
		}
	}
}
