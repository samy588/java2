import java.util.Scanner;

public class gg {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		String s[] = new String [100] ;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of words");
       int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
             s[i]=sc.nextLine();
            
       char ch[]=s[i].toCharArray();
        for( i=0;i<N;i++)
        {
        	for(int j=0;j<N;j++)
        	{
        		while(s[i].compareTo(s[j])<0)
        				{
        			return ;
        				}
        		System.out.println( s[i].compareTo(s[j]));
			System.out.println();
        	}
        }
  
        }
	}
  
}
