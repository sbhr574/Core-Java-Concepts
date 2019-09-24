package String_Manipulation;

public class SwapName {

	public static void main(String[] args) {
		
		String s = "Subhajit Roy kumar";
    	String str5[] = s.split(" ");
    	for(int i=str5.length-1;i>=0;i--){
			System.out.print(str5[i]+" ");
    	}
	}

}
