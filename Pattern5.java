import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i;
		int n,j,m;
		Scanner ob = new Scanner(System.in);
		StringBuilder sb ;
		System.out.println("Enter val of n");
		n = ob.nextInt();
		
		String s="";
		for(i=1;i<=n;i++)
		{
			s+=i.toString();
			sb = new StringBuilder(s);
			System.out.println(s+" ".repeat(2*(n-i))+ sb.reverse());
		}
	}
}
/*
1							1
1	2					2	1
1	2	3			3	2	1
1	2	3	4	4	3	2	1
							
	i	space					
n=4	1	6					
r=4	2	4					
c=8	3	2					
	4	0					
*/