import java.util.*;
import java.io.*;

public class mainpj {

	public static void main(String[] args) {
		String ans;
		String passCode;

		HashEntry username = new HashEntry();

		studentInfo student = new studentInfo();
		Scanner kb = new Scanner(System.in);

		System.out.println("Returing Student?");
		ans = kb.nextLine();


		//if statements have to be replaced with button clicks within
		//the UI to allow the student to log in


		//Inorder to save the information from the user input we have to use a
		//a hashtable

		if(ans.equals("yes")){

			System.out.println("Log in: " + "\nUsername( 8 Digit Student ID ): ");
			username.setUser(kb.nextLine());  // UI for 8 digit student ID

			while(!username.validLength(username.getUser()) && !username.checkDigit(username.getUser())) {
				System.out.println("Username not valid, enter " +
						"a valid username \nof length 8 consisting only of digits.");

				username.setUser(kb.nextLine());
			}// Checks out makes sure that the user-name length is of 8 characters

			/*while(!username.checkDigit(username.getUser())) {
				System.out.println("Username length not valid, reEnter " +
						"a valid username using only digits");
				username.setUser(kb.nextLine());
			}*/


			System.out.println("\nUsername: " + username.getUser());
			passCode = username.oneTime();
			System.out.println("Enter the one time passcode to authenticate.");
			System.out.println("One Time PassCode: " + passCode + "\n");


			ans = kb.nextLine();

			while(!ans.equals(passCode)) {
				System.out.println("\nError, a new code will be generated: ");
				passCode = username.oneTime();
				System.out.println("New One Time PassCode: " + passCode);
				System.out.println("Enter new PassCode:");
				ans = kb.nextLine();
			}

			System.out.println("\nVerified!  \nWelcome:" + username.getUser());

		}else {

			System.out.println("New Student " +"\nFirst & Last Name " );
			student.setName(kb.nextLine());

			System.out.println("Major: " );
			student.setMajor(kb.nextLine());

			System.out.println("Student ID: " );
			student.setId(kb.nextInt());
			// side note: for some reason if an integer input comes before
			// a string input it wont execute the nextLine() command
			// it will automatically skip over the command and
			// and print out the results without asking for the
			// last user string input value
			// So in order to fix it I had to put the String inputs before
			// the integer one to get the all the inputs needed

			System.out.println("\nName: " + student.getName());
			System.out.println("Student ID: " + student.getId());
			System.out.println("Major: " + student.getMajor());
		}

	}


	// As far as the course information it will be pulled from the CUNY
	// web server or the QC web server, He had mentioned that the user
	// should not be responsible for implementing the classes into the database
	// it should  either auto populate the information or the user will
	// click the courses to build their schedule as far as generic information
	// this is what is needed.
}





public class HashEntry {

	String username;
	String password;
	int passcode;

	HashEntry(){

	}

	public HashEntry(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void setUser(String newUser) {
		username = newUser;
	}

	public void setPass(String newPass) {
		password = newPass;
	}

	public String getUser() {
		return username;
	}

	public String getPass() {
		return password;
	}

	//Requirements for the user name
	//1.The UserName should be their student ID which is 8 digits in length
	//2.No char values

	public boolean validLength(String input) {
		int length = 8;

		/*while ((getUser().length() < length) || (getUser().length() != length)) {
			System.out.println("ReEnter 8 digit Student ID");
		}*/

		if(input.length() != length)
			return false;
		else return true;
	}
	//This method should validate the the length of the user
	//which should be 8 digits in length

	//******************************************************************
	//IGNORE FOR NOW
	public boolean upperCase() { /// CAN USE THIS FOR PASSWORD AUTHENTICATION
		int count = 0;
		char temp;
		int ascii;
		for(int i = 0; i < getUser().length(); i++) {

			for(int j = 65; j <= 90; j++) {
				temp = getUser().charAt(i);
				ascii = (int)temp;

					if(ascii == j)count++;

			}

		}
		if(count <= 1)
		return true;
		else
		return false;
	}
	//So this should verify if the user name contains at least one
	//upper case letter in it, although there is no loop in the
	//event that it needs to be re-entered( not sure to include
	//the loop within this method or in the main
	//IGNORE FOR NOW
	///******************************************************************





	public boolean checkDigit(String input) {
		int count = 0;

		for(int i = 0; i < input.length(); i++) {

			if(Character.isDigit(input.charAt(i)))
				count++;
		}
		if(count != 8 )
		return false;
			else
				return true;
	}
	//This code should VERIFY that every value in the user is a digit not a char


	public String oneTime() {
		int max = 9;
		int min = 0;
		int range = max - min + 1;
		String result = "";

		for(int i = 0; i < 3; i++) {
			int rand = (int) (Math.random() *range) + min;

			result += Integer.toString(rand);
		}
		return result;
	}
	//Generated a three digit pass-code to verify the user


















}






public class studentInfo {

	String name;
	int studentId;
	String major;

	public studentInfo() {

	}

	public studentInfo(String name, int id, String major ) {
		this.name = name;
		studentId = id;
		this.major = major;
	}

	public void setName(String newName) {
		name = newName;

	}

	public void setId(int newId) {
		studentId = newId;
	}

	public void setMajor(String newMajor) {
		major = newMajor;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return studentId;
	}

	public String getMajor() {
		return major;
	}
}
