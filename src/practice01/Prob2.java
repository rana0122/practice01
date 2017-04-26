package practice01;

public class Prob2 {
	public static void main(String[] args) {
		int num;
		for(int i=1; i<10;i++)
		{
			num=i;
			for(int j=1; j<11;j++)
			{
				System.out.print(num++ +" ");
			}
			System.out.println();;
		}


	}
}