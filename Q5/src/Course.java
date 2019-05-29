import java.util.List;

public class Course implements Comparable<Course>{
	//Your code goes here...
	private String name;
	private String category;
	private Double price;
	private List<UserScore> userScoreList;
	
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

	public List<UserScore> getUserScoreList() {
		return userScoreList;
	}

	public void setUserScoreList(List<UserScore> userScoreList) {
		this.userScoreList = userScoreList;
	}

	public Course(String name, String category, Double price, List<UserScore> userScoreList) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.userScoreList = userScoreList;
	}

	public Course() {
		super();
	}

	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		int result=0;
		if(this.getUserScoreList().size()==o.getUserScoreList().size()){
			result=0;
		}else if(this.getUserScoreList().size()>o.getUserScoreList().size()){
			result =1;
		}else if(this.getUserScoreList().size()<o.getUserScoreList().size()){
			result=-1;
		}
		return result;
	}

}
