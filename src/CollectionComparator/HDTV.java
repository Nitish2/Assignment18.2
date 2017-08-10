package CollectionComparator;

/**
 *Creating a class HDTV with the properties:
   brandName
   Size
 */
import java.util.Comparator;

public class HDTV { //Creating class HDTV as mention in the assignment 
	// Declaring variables as mention in the assignment 
	String brandName;
	int size;
	
	
	public HDTV(int size, String brandName) { //Creating Method
		this.size = size;
		this.brandName = brandName;
	}
  
	// using getter and setter to get and set the brandName and size .
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrandName() {
		return brandName;
	}
 
	
}
 
//Comparator to sort array list according to size
class HDTVSize implements Comparator<HDTV> {
	@Override
	public int compare(HDTV hdtv1, HDTV hdtv2 ) {
		int hdtv1Size = hdtv1.getSize();
		int hdtv2Size = hdtv2.getSize();
 
		//if else statement to compare the the size of hdtv
		if (hdtv1Size > hdtv2Size) { 
			return 1; 
		} else if (hdtv1Size < hdtv2Size) {
			return -1; 
		} else {
			return 0;
		}
	}
}

