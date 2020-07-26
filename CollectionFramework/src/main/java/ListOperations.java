import java.util.*;
public class ListOperations {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   while(true)
	   {
	 System.out.println("enter your choice:1.Fetch\n 2.add\n 3.remove\n 4.print");
	   int choice=sc.nextInt();
	 Operations obj = new Operations();
	 switch(choice) {
	 case 1:
		 System.out.println("enter the position to fetch:");
		 int pos=sc.nextInt();
		 int result=obj.fetchElements(pos);
		 System.out.println(result);
		 break;
	 case 2:
		 System.out.println("Enter an element to add into the arraylist: ");
		 int ele=sc.nextInt();
		 obj.AddElement(ele);
		 break;
	 case 3:
		 System.out.println("eneter the element to remove: ");
		 int eleme=sc.nextInt();
		 obj.removeElement(eleme);
		 break;
	 case 4:
		 obj.printElements();
		 break;
	 case 5:
		 System.exit(0);
	 
		 
	 } 
	 }
		
	}

}
