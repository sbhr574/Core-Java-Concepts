package all;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class add {

	public static void main(String[] args) {
		int i[]={1,2,3,4,5};
		String names[]={"java",".net","c++","ruby","java"};
		
		for(int j=0;j<names.length;j++){
			for(int k=j+1;k<names.length;k++){
				if(names[j].equals(names[k])){
				System.out.println(names[j]);
				}
			}
		}
		
}
}
