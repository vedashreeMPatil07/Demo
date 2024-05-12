package conditional;
import java.util.Scanner;
public class Findoddno {

	public static void main(String[] args) {
		int n;
		System.out.println("enter no");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<=n;i=i+2)
		{
			System.out.println(i);
		}
		

	}

}
