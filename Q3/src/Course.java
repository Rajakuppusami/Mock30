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
}
