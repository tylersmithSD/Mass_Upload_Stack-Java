/* Tyler Nathan Smith */
	
// Address Class
public class Address
{ 
	// Private member attributes
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;
	private String fullAddress;

	// Default Constructor
	public Address()
	{
		// Default Constructor
	}
	
	// Returns the first address
	public String getAddLine1() 
	{
		return addressLine1;
	}
	
	// Sets the first address
	public void setAddLine1(String address) 
	{
		this.addressLine1 = address;
	}
	
    // Returns the second address
	public String getAddLine2() 
	{
		return addressLine2;
	}
	
	// Sets the second address
	public void setAddLine2(String address) 
	{
		this.addressLine2 = address;
	}
	
    // Returns the city
	public String getCity() 
	{
		return city;
	}
	
	// Sets the city
	public void setCity(String City) 
	{
		this.city = City;
	}
	
	// Returns the state
	public String getState() 
	{
		return state;
	}
	
	// Sets the state
	public void setState(String State) 
	{
		this.state = State;
	}
	
	// Returns the zip code
	public String getZipCode() 
	{
		return zipCode;
	}
	
	// Sets the zipcode
	public void setZipCode(String zip) 
	{
		this.zipCode = zip;
	}
	
    // Computes full address and returns it
	public String getFullAddress() 
	{
		if(addressLine2 != null && !addressLine2.equals(""))
		{
			this.fullAddress = addressLine1 + " " + addressLine2 + " " +
						       city + ", " + state + " " + zipCode;
		}
		else
		{
			this.fullAddress = addressLine1 + " " + city + ", " + state + " " + zipCode;
		}
		return fullAddress;
	}
	
	
}
