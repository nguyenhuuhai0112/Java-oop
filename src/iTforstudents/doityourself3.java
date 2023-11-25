package iTforstudents;
import java.util.*;
public class doityourself3 {
    public static void main(String[] args) {
    	int length,width,acreage,perimeter; 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("input length: ");
    	length=sc.nextInt();
        System.out.println("input width: ");
    	width=sc.nextInt();
    	acreage=length*width;
    	System.out.println("acreage :" + acreage);
    	perimeter=(length+width)*2 ;
    	System.out.println("perimeter :" + perimeter);
    	
    }
     
}
