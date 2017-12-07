package vocabMapCar;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Mapcar {
	public static void main(String args[]) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(4);
		integers.add(5);
		//this would make every elements in the array integers to divide by 2
		integers = mapcar(integers, inte -> inte / 2);
		
	}
	
	
	
	//this implements mapcar and this allows us to use it 
	static <LIST_TYPE, ELEM_TYPE> List<LIST_TYPE> mapcar(Collection<ELEM_TYPE> list, Function<ELEM_TYPE, LIST_TYPE> function)
	{
	    return list.stream().map(function).collect(Collectors.toList());
	}
}