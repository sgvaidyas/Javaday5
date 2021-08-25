import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,m;
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter val of n");
		n = ob.nextInt();
		
		for(i=1;i<=n;i++)
		{
			System.out.print(" ".repeat(n-i));
			for(j=1;j<2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
*			
*	*	*		
*	*	*	*	*	
*	*	*	*	*	*	*
	
n=	4
		n-i		stars		
		space	2*i-1		
1	1	3		1		
2	3	2		3		
3	5	1		5		
4	7	0		7		
			
*/