/* Tyler Nathan Smith */
	
// Student Class
public class Student 
{ 
	// Private member attributes
	private String firstName;
	private String lastName;
	private String id;
	private String gpa;
	private Address address = new Address();

	// Default Constructor
	public Student()
	{
		// Default Constructor
	}
	
	// Returns the student's first name
	public String getFirstName() 
	{
		return firstName;
	}
	
	// Sets the student's first name
	public void setFirstName(String name) 
	{
		this.firstName = name;
	}
	
    // Returns the student's last name
	public String getLastName() 
	{
		return lastName;
	}
	
	// Sets the student's last name
	public void setLastName(String name) 
	{
		this.lastName = name;
	}
	
	// Returns the student's ID
	public String getId() 
	{
		return id;
	}
	
	// Sets the student's ID
	public void setId(String ID) 
	{
		this.id = ID;
	}
	
	// Returns the student's GPA
	public String getGpa() 
	{
		return gpa;
	}
	
	// Sets the student's GPA
	public void setGpa(String GPA) 
	{
		this.gpa = GPA;
	}
	
	// Returns the student's address
	public String getAddress() 
	{
		//return address;
		return address.getFullAddress();
	}
	
    // Sets the address object
	public void setAddress(Address add) 
	{
		this.address = add;
	}
}
