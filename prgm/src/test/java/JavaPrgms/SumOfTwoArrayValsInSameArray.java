package JavaPrgms;

public class SumOfTwoArrayValsInSameArray {

	public static void main(String[] args) {
		//Find pair with given sum in an array
		
		int a[]= {12,56,4,60,1,9,10,19};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]==a[j]+a[k]) {
						System.out.println(a[j]+"+"+a[k]+"="+a[i]);
					}
				}
			}
		}

	}

}
