package JavaPrgms;

public class SecondLargestNumInArray {

	public static void main(String[] args) {
		int[] a= {23,67,1,9,4,11,98,111,5,12,23};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Max value is "+a[a.length-2]);
	}
}
