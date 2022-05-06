package stringExample;

public class StringExample1 {

	public static void main(String[] args) {
	
		String name="RobinGowtham "; //String literal
		int number=10;
		//hashode
		//System.identityHashCode(name);
				
		//Char at index 3
		System.out.println(name.charAt(3));
		
		//length 
		System.out.println(name.length());
		
		//equals
		System.out.println(name.equals("Robin"));
		
		//equals ignorecase
		System.out.println(name.equalsIgnoreCase(" robingowtham")); //even space also included
		
		//isempty
		System.out.println(name.isEmpty());
		
		//contains
		System.out.println(name.contains("Robin"));
		
		System.out.println(name.contains("m "));
		
		//Substring
		System.out.println(name.substring(5));
		
		//Substring with particular portion
		System.out.println(name.substring(0, 5)); //final index is ignored, initial index is included
		//this is method overloading type (arguments are diff)
		
		//concat
		String con=name.concat("K");
		System.out.println(con);
		
		System.out.println(con.concat(" Tirupur"));
		
		//replace
		System.out.println(name.replace("Robin", "Engineer"));
		
		//replace by index
		String rep=name.replace('R', 'r');
		System.out.println(rep);
		
		//indexof position
		int indexof=name.indexOf("G");
		System.out.println(indexof);
		
		System.out.println(name.indexOf("w"));
		
		System.out.println(name.indexOf("o", 4));
		
		System.out.println(name.indexOf('w', 5));
		
		System.out.println(name.indexOf("bin", 1));
		
		//trim                           
 		System.out.println(name.trim());   
 		//removethe whit/blank place on the string values before and after
		
		//lowercase to uppercase letters
 		System.out.println(name.toUpperCase());
		
		//Uppercase to lower case letters
 		System.out.println(name.toLowerCase());
 		
 		//String value
		System.out.println("-----------");  
 		System.out.println(String.valueOf(number)); //returns the int values in string
 		
 		//Split comment to split he two words
 		//System.out.println(name.split("o")); //should create loop to print next line
 		for (String s1 : name.split("o")) {
			System.out.println(s1);
		}
 	
		 String[] spt=name.split("a");
		 
		 for(String s1:spt)
		 System.out.println(s1);

		//Jointhe two words
		 System.out.println(String.join("//","25","March","1991"));
		 //1st string should be the join letter or word
		
		 //startswith		//start letter boolen methods
		 System.out.println(name.startsWith("Ro"));
		 
		 //Ends with
		 System.out.println(name.endsWith("am "));
		 
	
	}
}
