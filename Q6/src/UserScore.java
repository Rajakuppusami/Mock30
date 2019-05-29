import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserScore implements Comparable<UserScore>{
	//Your code here
	private Double completionPercentage;
	private User user;
	private Course course;
	
	public Double getCompletionPercentage() {
		return completionPercentage;
	}

	public void setCompletionPercentage(Double completionPercentage) {
		this.completionPercentage = completionPercentage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public UserScore(Double completionPercentage, User user, Course course) {
		super();
		this.completionPercentage = completionPercentage;
		this.user = user;
		this.course = course;
	}

	public UserScore() {
		super();
	}

	public static Map<String,UserScore> getTopPerformer(List<UserScore> scoreList){
		//Your code here
		Map<String,UserScore> tr=new TreeMap<String,UserScore>();
		for (UserScore userScore : scoreList) {
			Course course = userScore.getCourse();
			List<UserScore> li=course.getUserScoreList();
			if(!li.isEmpty()){
				Collections.sort(li);
				UserScore userscore = li.get(li.size()-1);
				tr.put(course.getName(), userscore);
			}
		}
		return tr;
	}

	@Override
	public int compareTo(UserScore o) {
		// TODO Auto-generated method stub
		int result=0;
		if(o.getCompletionPercentage()==this.getCompletionPercentage()){
			
		}else if(o.getCompletionPercentage()>this.getCompletionPercentage()){
			result=-1;
		}else if(o.getCompletionPercentage()<this.getCompletionPercentage()){
			result=1;
		}
		return result;
	}
}
