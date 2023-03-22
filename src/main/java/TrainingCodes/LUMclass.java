package TrainingCodes;
import java.util.Scanner;
public class LUMclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{                                                     //I
				if ( i==0 && j<n/2 || j==n/4 || i==n-1 && j<n/2  )
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j=0;j<n;j++)
			{                                                   //L
				if ( j==0 || i==n-1 && j<=n/2)
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                     //O
				if (j==0 || j==n/2 || i==0 && j<=n/2 || i==n-1 && j<=n/2 )
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                         //V
				if ( j==0 && i<=n/2 || i-j==n/2 || i+j==(n-1)+(n/2) || j==n-1 && i<=n/2)
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                      //E
				if ( j==0 || i==0 && j<=n/2 || i==n/2 && j<=n/2 || i==n-1 && j<=n/2)
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                      //M
				if ( j==0 || j==n-1 || (i==j && i<=n/2 ) || (i+j==n-1 && j>=n/2))
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                        //Y
				if ( i==j && i<=n/2 || i+j==n-1 && i<=n/2 || j==n/2 && i>=n/2)
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                         //M
				if ( j==0 || j==n-1 || (i==j && i<=n/2 ) || (i+j==n-1 && j>=n/2))
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                //O
				if ( j==0 || j==n/2 || i==0 && j<=n/2 || i==n-1 && j<=n/2 )
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                    //T
				if (i==0 && j<n/2 || j==n/4 )
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                    //H
				if (j==0 || j==n/2 || i==n/2 && j<=n/2)
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                    //E
				if (j==0 || i==0 && j<=n/2 || i==n/2 && j<=n/2 || i==n-1 && j<=n/2 )
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for (int j=0;j<n;j++)
			{                                                    //R
				if (j==0 || i==0 && j<=n/2  || j==n/2 && i<=n/2 || i==n/2 && j<=n/2 || i-j==n/2)
				{
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
        System.out.println();
	}

}
}
