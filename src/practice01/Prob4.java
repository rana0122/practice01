package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner( System.in );
		System.out.println("문자열을 입력하세요 : ");
		
		word=scanner.nextLine();
	
	
		for(int i=0;i<word.length();i++)
		System.out.println(word.substring(0,i+1));
		

	
	}
}