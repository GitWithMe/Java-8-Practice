import java.util.*;

public class StreamParctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> someBingoNumber = Arrays.asList(
			"N40" , "N39",
			"B12" , "B6" ,
			"G53" , "G49" , "G60", "G50", "g64" ,
			"I28" , "I17" , "I29"	
			);
//		List<String> gNumber = new ArrayList<>();                           /*Normal Lambda Implementation*/                 
		
//		someBingoNumber.forEach(number ->{
//			if(number.toUpperCase().startsWith("G")) { //To print the lowerCase G also
//				gNumber.add(number);//Appending inside ArrayList
//			}
//			
//	});		
//		gNumber.sort((String s1, String s2) -> s1.compareTo(s2)); //Sorts the String in Ascending Order
//		gNumber.forEach((String s) -> System.out.println(s));
		
       someBingoNumber //Source Collection
                       .stream() //Displaying the elements in the same order as they occur in the list
                       .map(String::toUpperCase) //(::) means method refrence and the MAP method accepts a function where string is an object which invokes .toUpperCase method to a function
                       .filter(s->s.startsWith("G"))//It's a predicate, not a function
                       .sorted()
                       .forEach(System.out::println); //Accepts the consumer as a parameter and evaluates the con
	}

}
