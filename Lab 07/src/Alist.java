import java.util.*;
public class Alist {

	public static void doubleList(ArrayList<String> string) {
		int x = string.size();
		for(int i = 0; i< x; i++) {
			String e = string.get(2*i);
			string.add(2 * i + 1, e);
			
		}
		System.out.println(string.toString());
	}
	
	 public static void removeOddLength(ArrayList<String> a) {
	        ArrayList<String> x = new ArrayList<>();
	        for (String string:a) {
	            if (string.length() % 2 != 0) {
	                x.add(string);
	            }
	        }
	        for (String string:x) {
	            a.remove(string);
	        }
	    }
	
	/*public static void removeOddLength(ArrayList<String> s) {
		for (int i = s.size() - 1; i >=0; i--) {
		    if (i % 2 == 1) {
		        s.remove(i);
		}
	}
	}*/
	
 public static void intersect(ArrayList <Integer> List1, ArrayList<Integer> List2) {
		ArrayList<Integer> List3 = new ArrayList<Integer>();
	
        	for(Integer x: List1) {		
           if(List2.contains(x)) {
               List3.add(x);
            }
        }

        System.out.println(List3);
    }
	
	public static void main (String [] args) {
		
        ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("how");
		stringList.add("are");
		stringList.add("you?");
        System.out.println("Original String: ");
        System.out.println(stringList);
        
        System.out.print("\n");

        System.out.println("Double String: ");
        doubleList(stringList);

        ArrayList<Integer> List1 = new ArrayList<Integer>();
        List1.add(1);
        List1.add(4);
        List1.add(8);
        List1.add(9);
        List1.add(10);
        List1.add(11);
        List1.add(15);

        ArrayList<Integer> List2 = new ArrayList<Integer>();
        List2.add(4);
        List2.add(8);
        List2.add(15);
        List2.add(11);
        List2.add(17);
        List2.add(11);
        List2.add(20);
        List2.add(28);
        
        System.out.print("\n");
        System.out.println("List 1: ");
        System.out.println(List1);
        System.out.println("List 2: ");
        System.out.println(List2);
        System.out.print("\n");
        System.out.println("Intersect Integers in the Array:");
        intersect(List1,List2); 

        ArrayList<String> a = new ArrayList<String>();
        a.add("dumb");
        a.add("smart");
        a.add("hello");
        a.add("intellegent");
        a.add("lol");
        a.add("boom");
        a.add("hi");
        a.add("bye");        
        System.out.print("\n");
        System.out.print(a);
        System.out.print("\n");
        removeOddLength(a);
        System.out.print("\n");
        System.out.println(a);

	}

	
}
