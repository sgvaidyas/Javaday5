import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,m;
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter val of n");
		n = ob.nextInt();
		
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<2*n;j++)
			{
				if(i==n|| j==n-i+1|| j-i==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


}
