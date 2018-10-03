/* Tyler Nathan Smith */

import java.io.*;
import java.util.Scanner;

// Stack Driver Class
public class Driver
{ 
	public static void main(String[] args) 
	{ 	
		boolean contProg = true; //Loop condition
		
		// Create a new instance of a Stack on the Heap.
		Stack<Student> studentStack = new Stack<Student>(11);
		
		while(contProg == true)
		{
			// Display the selection screen
			System.out.println("");
			System.out.println("1. Load Students (from file students.txt)");
			System.out.println("2. Print Stack");
			System.out.println("3. Exit Program");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Your Selection : "); //Get input from the user
			char userInput = input.next().charAt(0);
			System.out.println("");
			
			if (userInput == '1')
			{	
				try
				{
					String line;
					
					// Object needed to stream data in from txt file
					InputStream inputStream = new FileInputStream("students.txt");
					InputStreamReader reader = new InputStreamReader(inputStream);
					BufferedReader buffer = new BufferedReader(reader);
					
					line = buffer.readLine();
					while(line!= null)
					{
						String[] lineArray = line.split(",");  //Split the string where commas are
						Student student = new Student();       
						Address address = new Address();
						for (int x=0; x<lineArray.length; x++)
						{
							switch (x)
							{
								case 0: student.setFirstName(lineArray[x]); //First Name
										break;
								case 1: student.setLastName(lineArray[x]);  //Last Name
										break;	
								case 2: address.setAddLine1(lineArray[x]);  //Address line 1
										break;
								case 3: address.setAddLine2(lineArray[x]);  //Address line 2
										break;
								case 4: address.setCity(lineArray[x]);      //City
										break;
								case 5: address.setState(lineArray[x]);     //State
										break;
								case 6: address.setZipCode(lineArray[x]);   //Zip Code
										student.setAddress(address);
										break;
								case 7: student.setId(lineArray[x]);        //ID
										break;
								case 8: student.setGpa(lineArray[x]);       //GPA
										studentStack.push(student);
										break;
							}
						}
						line = buffer.readLine();
							
					}
					buffer.close();
				}
				catch (IOException excep)
				{
					System.out.println(excep); // Print the exception
				}  			
			}
			else if(userInput == '2')
			{ 
				// Go through stack and print out student data
				for (int x=0; x<11; x++)
				{
					Student studentPrint = new Student();
					studentPrint = studentStack.pop();  //Get next student from the stack
					System.out.format("ID: %-10s Name: %-25s Address: %-55s GPA: %-5s",studentPrint.getId(),studentPrint.getFirstName() + " "
										+ studentPrint.getLastName(),studentPrint.getAddress(),studentPrint.getGpa());
					System.out.println("");
				}
			}
			else if(userInput == '3')
			{ 
				// User wants to leave the program 
				System.out.println("Goodbye!");	
				contProg = false;
			}
			else
			{
				// User entered wrong selection 
				System.out.println("Incorrect Selection, please try again!");	
			}
		}
		
	}
}
