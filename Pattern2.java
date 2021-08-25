import java.util.Scanner;

/*
 * 
 * 
4	3	2	1
4	3	2	
4	3		
4			

 */
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter val of n");
		n = ob.nextInt();
				
		for(i=1;i<=n;i++)
		{
			for(j=n; j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
