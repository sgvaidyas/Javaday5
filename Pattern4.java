import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,m;
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter val of n");
		n = ob.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1||i==n||i==j || j==n-i+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
/*
*	*	*	*	*	1,5
*		*		2,4
	*			3,3
*		*		4,2
*	*	*	*	*	5,1
				
dim=	n*n		row	1,n	
*/