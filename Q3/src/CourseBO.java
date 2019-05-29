import java.util.ArrayList;
import java.util.List;

public class CourseBO {
	public List<Course> findCourse(List<Course> courseList, String category) {
		
		//write your code here
		List<Course> li= new ArrayList<Course>();
		for (Course course : courseList) {
			if(course.getCategory().equalsIgnoreCase(category)){
				li.add(course);
			}
		}
		return li;
	}
	
	public List<Course> findCourse(List<Course> courseList, List<String> nameList) {
		
		//write your code here
		List<Course> li= new ArrayList<Course>();
		for (String string : nameList) {
			for (Course course : courseList) {
				if(course.getName().equalsIgnoreCase(string)){
					li.add(course);
				}
			}
		}
		return li;
	}
}
