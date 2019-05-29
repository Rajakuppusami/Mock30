import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Course {
	
	//write your code here
	private String name;
	private String category;
	private Double price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Course(String name, String category, Double price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Map<String,Integer> coursePerCategory(List<Course> courseList) {
		
		//write your code here
		Map<String,Integer> tr=new TreeMap<String,Integer>();
		for (Course course : courseList) {
			if(tr.containsKey(course.getCategory())){
				tr.put(course.getCategory(), tr.get(course.getCategory())+1);
			}else{
				tr.put(course.getCategory(), 1);
			}
		}
		return tr;
	}
}
