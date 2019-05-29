import java.util.Comparator;

public class PriceComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Course c1 =(Course)o1;
		Course c2 =(Course)o2;		
		return (int) (c1.getPrice()-c2.getPrice());
	}

	
	//Your code goes here...
}
