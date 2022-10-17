import java.util.Scanner;

public class Source {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int  num=sc.nextInt();
		int count=0;
		if(num>0) {
			String[] designation=new String[num];
			String[] input=new String[num];
			for(int i=0;i<num;i++) {
				input[i]=sc.next();
				}
			for(int i=0;i<num;i++) {
				if(input[i].contains("HR")) {
					designation[count]=input[i];
					count++;
					
				}
			}
		
		if(count>0) {
			System.out.println("total"+count+"designations in HR department");
			for(int j=0;j<count;j++) {
				System.out.println(designation[j].toUpperCase());
			}
		}
		else
		{
			System.out.println("no designation of HR department is found");
		}
		}
		else
		{
			System.out.println("INVALID OUTPUT");
		}
	}



		}
		