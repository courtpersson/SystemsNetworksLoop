import java.util.ArrayList;
import java.util.Arrays;

public class networks{ 
	 public static void main(String[] args) {
	        int test1[]={505, -100000, 176, -505};
	            int negsum=0, possum=0;
	            int negCount = 0;
	            int oddCount = 0; 
	            for(int i=0;i<test1.length;i++){
	                if(test1[i]>=0){
	                    possum+=test1[i];
	                    if(test1[i]%2 != 0) {
	                    oddCount++;
	                    }
	                 
	                }
	                else{
	                    negsum+=test1[i];
	                    negCount++;
	                }
	            }
	            System.out.println("Sum of positive numbers: "+possum);
	            System.out.println(oddCount); 
	            System.out.println("Sum of negative numbers: "+negsum);
	            System.out.println(negCount);
	        }
	    }
