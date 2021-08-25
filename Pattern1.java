import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter val of n");
		n = ob.nextInt();
				
		//outer loop --> row
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

/*
 1										
1	2					no of columns-->row				
1	2	3								
1	2	3	4			start=1	end=row num			
1	2	3	4	5						
						no of rows-->n				
										
i=1		j=1	1<=1			1				
		j=2	2<=1	FALSE		1	2			
i=2		j=1	1<=2			1	2	3		
		j=2	2<=2			1	2	3	4	
		j=3	3<=2	FALSE		1	2	3	4	5

 * */
