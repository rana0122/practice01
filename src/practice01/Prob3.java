package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		int num=0;
		int sum=0;
		
		Scanner scanner = new Scanner( System.in  );
		System.out.println("숫자를 입력하세요 :");
		num=scanner.nextInt();
		
		if(num%2!=0)
		{
			for(int i=1; i<=num;i++)
			{
				if(i%2!=0)
				sum+=i;
				
			}
			System.out.println("결과 값 :"+sum);
		}else{

			for(int i=1; i<=num;i++)
			{
				if(i%2==0)
				sum+=i;
			}
			System.out.println("결과 값 :"+sum);
		}

	}
}