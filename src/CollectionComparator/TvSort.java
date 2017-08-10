package CollectionComparator;

/**
 * Creating Another class having an ArrayList and add 3 objects of HDTV into it.
 */
import java.util.ArrayList;
import java.util.Collections;

public class TvSort { // Creating another class TvSort

	public static void main(String[] args) { // Creating main method

		// Creating objects of HDTV class
		HDTV hdtv1 = new HDTV(55, "Hitachi");
		HDTV hdtv2 = new HDTV(32, "BPL");
		HDTV hdtv3 = new HDTV(52, "Samsung");
	

		ArrayList<HDTV> brandName = new ArrayList<HDTV>(); //Creating an ArrayList
		// Adding objects in the array list 
		brandName.add(hdtv1);
		brandName.add(hdtv2);
		brandName.add(hdtv3);
		

		System.out.println("HDTV sorted list according to size:");
		
		//Sorting the array according to size in ascending order.
		Collections.sort(brandName, new HDTVSize());
		for (HDTV s : brandName) { //Using for loop to initialize the ArrayList
			System.out.println(s.getBrandName());
		}
		/**
		 * Note: Comparator will be used in mainly two situations: 
		 1. It can be passed to a sort method, such as Collections.sort() 
		    or Arrays.sort(), to allow precise control over the sort order 
		 2. and can be used to control the order of certain data structures .
		 **/
	}

}
