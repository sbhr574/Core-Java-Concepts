package all;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class live {

	public static void main(String[] args) {
		int i,j,k;
//how to reverse perticular string without using exsting function
		//1.using for loop
		String s="Reverse";
		int len=s.length();
		System.out.println(len);//7
		String rev="";
		for(i=len-1;i>=0;i--){
			rev = rev + s.charAt(i);
		}System.out.println(rev);System.out.println("*********************");
		//2. using Stringbuffer string buffer having this reverse mothod cause it is mutable class
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());System.out.println("*********************");
		
//How to reverse a number
	   //	1.using while loop
		long n=578936;
		long r=0;
		while(n != 0){
			r = r * 10 + n % 10;
			n= n/10;
         //System.out.println(n);	
		}System.out.println(r);
		//2.using StringBuffer
		long l1=748236;
		System.out.println(new StringBuffer(String.valueOf(l1)).reverse());
		StringBuffer sbf=new StringBuffer(String.valueOf(l1));
		System.out.println(sbf.reverse());System.out.println("*********************");
		 
//how to find missing value from an array
		int a[]={-1,0,1,2,3,4,5};
		int sum=0;
		int sum1=0;
		for(i=0;i<a.length;i++){
			sum=sum+a[i];
		}System.out.println(sum);
		for( j=-1;j<=6;j++){ //For checking missing boundary value j<=6 here we have to change
			sum1=sum1+j;
		}System.out.println(sum1);
		System.out.println("missing number:- "+ (sum1-sum));
		System.out.println("*********************");
		
//How to find duplicate element in array 
		   		//1. O(nxn)[O n square ] solutions complexity is more because 2time for loop used
		String ar[]={"JEE","Phython","Java","Ruby","javascript","Java","Linux","JEE"};
		for(i=0;i<ar.length;i++){
			for(j=i+1;j<ar.length;j++){
				if(ar[i].equals(ar[j])){
					System.out.println("Duplicate value is:1. "+ar[i]);
			}
				}
			}System.out.println("*********************");
		  		//2. O(n) solution complexity is less
			Set<String> store=new HashSet<String>();	
				for(String ar1:ar){
					if(store.add(ar1)==false){
						System.out.println("Duplicate value is:2. "+ar1);
					}
					
				}System.out.println("*********************");
				//3.using HashMap O(2n)
				Map<String, Integer> data=new HashMap<String, Integer>();
				for(String ar2:ar){ //In this line data1 carrying all the value
					Integer count= data.get(ar2); // data object is blank thats why transferring all the value to data one by one.
				//Above line count is checking value is already saved or not.
//					System.out.println(count);//here can check for which value what is saving
					if(count==null){
						data.put(ar2, 1);//Here 1 is not index its counting how many times that value is saving.**data.put(key,value)**
//						System.out.println(count);// Its setting null for single value because Hashmap duplicate key not allowing
//						System.out.println(data);
					}else{
						data.put(ar2, ++count);
//						System.out.println(count);
					}
//					System.out.println(data);	
				}
				//Now will print the duplicate value from this HashMap
				Set<Entry<String, Integer>> en=data.entrySet();
				for(Entry<String, Integer> en1:en){
					if(en1.getValue()>1){
						System.out.println(en1.getKey());
					}
				}System.out.println("*********************");
				
//How to find smallest and largest number in array.
				int numbers[]={12,3456,-12,12,234545,3445566,-12,9,0};
				int largest=numbers[0];
				int samllest=numbers[0];
				System.out.println(Arrays.toString(numbers));
				//Time complexity = O(n)
				for(i=1;i<numbers.length;i++){
					if(numbers[i]>largest){
						largest=numbers[i];
					}else if(numbers[i]<samllest){
						samllest=numbers[i];
					}
				}
				System.out.println("Largest Number: "+largest);
				System.out.println("Smallest Number: "+samllest);
				System.out.println("*********************");
//String Manipulation with different methods
				String str="Avin Networks Private Limited";
				String str1="avin Networks Private Limited";
				System.out.println(str.length());
				System.out.println(str.charAt(14));
				System.out.println(str.indexOf("e"));//1st occurrence of e
				//If duplicate value present in the string like i,e,t
				System.out.println(str.indexOf("e", str.indexOf("e")+1));//2nd occurrence of e
				
				System.out.println(str.indexOf("Networks"));
				System.out.println(str.indexOf("Hello")); //-1
				//String comparison
				System.out.println(str1.equals(str)); //false because case sensitive
				System.out.println(str1.equalsIgnoreCase(str)); //true
				//subString
				System.out.println(str.substring(0, 13));
				//trim
				String str2="      Hello World       ";
				System.out.println(str2.trim());
				//replace
				System.out.println(str2.replace(" ", ""));
				String date="2018/08/16";
				System.out.println(date.replace("/", "-"));
				//split
				String str3="My_name_is_Roy";
				String str4[]=str3.split("_");
				for(i=0;i<str4.length;i++){
					System.out.println(str4[i]);
				}System.out.println("*********************");
				String s1="Roy";
				System.out.println(s1.concat("Ray"));
				System.out.println("*********************");
				//Concatenation
				String x="Hello";
				String y="World";
				int t=100;
				int e=200;
				System.out.println(x+y); //HelloWorld
				System.out.println(t+e); //300
				System.out.println(x+y+t+e); //HelloWorld100200
				System.out.println(t+e+x+y); //300HelloWorld
				System.out.println(x+y+(t+e)); //HelloWorld300
				
				
				
				
		}
	}

