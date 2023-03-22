package TrainingCodes;
import java.util.Scanner;
public class Code1 {

	
	 public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println("You are still minor, please grow up");
		}
		else if (age>65)
		{
			System.out.println("You are a senior citizen. Stop over expectation");
		}
		else {
			System.out.println("Congratulations. You are in the list of most eligible grooms");
		}
	 }
	}



