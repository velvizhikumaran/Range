# Range
import java.util.Scanner;


public class IndexSameNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int a[]=new int[len];
		for(int i=0;i<len;i++){
			a[i]=sc.nextInt();
		}for(int i=0;i<len;i++){
			if(a[i]==i){
				System.out.println(i);
			}
		}

	}

}
