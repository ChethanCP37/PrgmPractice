package JavaPrgms;

public class MoveZeroToLeftSideOfArray {

	public static void main(String[] args) {
		int[] a= {23,67,0,1,9,0,4,11,0};
		int temp=0;
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+",");
		}
		
	}

}
