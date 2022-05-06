package collectionExample;

import java.util.ArrayList;

public class ArrayListExample {
	
public static void main(String[] args) {
	
	//Arraylist is resizable
	//Heterogenous objects are allowed
	//Data Structure : Growable array
	//class-package, constructor, methods, variables
	
	ArrayList<Object> al=new ArrayList<Object>();
	
	al.add(20);
	al.add(59);
	al.add(99);
	al.add(84);
	al.add("Robin");
	al.add(true);
	al.add('G');
	
	//size of the arraylist
	System.out.println(al.size());
	
	System.out.println(al.add(105));
	System.out.println(al);
	
	//add this by using index value
	al.add(3, "Gowtham");
	System.out.println(al);
	
	//contains use to check -boolean function
	System.out.println(al.contains("Robin"));
	
	//get to use to print the index value
	System.out.println(al.get(0));
	System.out.println(al.get(3));
	
	//remove from arraylist but shows value
	System.out.println(al.remove(2));
	
	System.out.println(al);
	
	//set to add the data in the particular position
	al.set(0, "200");
	System.out.println(al);
	
	//index value of particular value
	System.out.println(al.indexOf("Robin"));
	
	ArrayList al2=new ArrayList();
	
	//addall to add the values to the collection or index position
	al2.addAll(al);
	
	System.out.println(al2);
	
	//isempty to check arraylist 
	System.out.println(al2.isEmpty());
	
	//lastindexof display multiple entry can be visible 
	System.out.println(al.lastIndexOf(al));
	
	//Addall methos is use to add the two 
	al2.addAll(al);
	System.out.println(al2);

	//indexof method is to display twice in the list of first appearance
	System.out.println(al2.indexOf(al2));

	//remove from list index
	System.out.println(al.remove(1));
	System.out.println(al);
	
	//remove from list
	al.removeAll(al);
	System.out.println(al);
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
