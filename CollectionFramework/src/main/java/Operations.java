import java.util.ArrayList;
import java.util.Iterator;
public class Operations {
 static ArrayList a1 = new ArrayList(10);
 int fetchElements(int index)
 {
	 return (Integer) a1.get(index); 
 }
 void AddElement(int ele)
 {
	 a1.add(ele);
	 System.out.println("Element added");
	 Iterator it = a1.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }

 }
 void removeElement(int element)
 {
	 a1.remove(element);
 }
 void printElements()
 {
	 Iterator it = a1.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
 }
}