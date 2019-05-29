public class User {
	//Your code goes here
	private String name;
	private String emailId;
	private String contactNumber;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public User() {
		super();
	}

	public User(String name, String emailId, String contactNumber) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Name:"+this.name+
				"\nEmail Id:"+this.emailId+
				"\nContact Number:"+this.contactNumber;
	}


	@Override
	public boolean equals(Object obj) {
		
		User other = (User) obj;
		if ((emailId.equals(other.emailId)) && (name.equalsIgnoreCase(other.name)))
			return true;
		
		return false;
	}
	
}
