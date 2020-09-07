package collections;
import java.util.Arrays;
import java.util.Collection;

public class CollExample {
	public static void main(String[] args) 
	{
	Collection<Integer> values =  Arrays.asList(3,58,88);
	 for(int i : values) {
		 System.out.println(i);
	 }

}
}