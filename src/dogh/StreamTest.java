package dogh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] arr = new String[] {"a", "b", "c", "d"};
		
		Stream<String> stream = Arrays.stream(arr);
		
		Stream<String> streamPart = Arrays.stream(arr, 1, 3);
		//
		List<String> list = Arrays.asList("a", "b", "c");
		
		List<String> lis = new ArrayList<String>();
		lis.add("ÀÌ");
		lis.add("µµ");
		lis.add("Çü");
		
		
		
	}

}
