import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,m;
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter val of n");
		n = ob.nextInt();
		
		m=(n+1)/2;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				if(j==1 || i==j || i+j==n+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

/*
 

*					
*	*				
*		*			
*			*		
*		*		i=5	j=3
*	*			i=6	j=2
*				i=7	j=1
1	2	3	4		

 
 */
