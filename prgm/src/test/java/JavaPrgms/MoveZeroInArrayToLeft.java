package JavaPrgms;

public class MoveZeroInArrayToLeft {

	public static void main(String[] args) {
		int a[]= {0,1,4,0,23,0,1,67,0,5,0,0,26,87};
		int k=a.length-1;
//		int m=a.length-1;
		int count=0;
//		while(m>=0) {
		for(int i=a.length-1;i>=0;i--) {
			
			if(a[i]!=0) {
				a[k]=a[i];
				k--;
			}
			else{
				count++;
			}
		}
		for(int j=0;j<count-1;j++) {
			a[j]=0;
		}
		for(int j=0;j<a.length-1;j++) {
			System.out.println(a[j]);
		}

	}
}