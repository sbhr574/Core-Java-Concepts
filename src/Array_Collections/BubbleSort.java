package Array_Collections;

public class BubbleSort {

	public static void main(String[] args)
	{
		int temp;
		int a[]={10,28,2,4,15,18,25};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++)
			{
				// code for Ascending(a[j] > a[j+1])
				if(a[j]<a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}

	}

}
