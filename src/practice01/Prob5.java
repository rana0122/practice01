package practice01;

public class Prob5 {
	public static void main(String[] args) {
		int i=0;
		int count=0;
		String convertNum;
		while(i<100){
			convertNum=Integer.toString(i);
			char[] seperateNum =new char[2];
			
			for(int j=0; j<convertNum.length();j++){
				seperateNum[j]=convertNum.charAt(j);
				
				if(seperateNum[j]=='3'||seperateNum[j]=='6'||seperateNum[j]=='9')
					count++;
			}
			
			if(count!=0){
				System.out.print(convertNum+" ");
			 		for(int k=0;k<count;k++)
			 			System.out.print("짝");
			 	System.out.println();
			}
			
			count =0;
			i++;
		}
	}
}