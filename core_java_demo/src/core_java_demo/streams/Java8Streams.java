package core_java_demo.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Streams {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("D");
		list.add("K");
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("S");
		list.add("A");
		list.add("L");
		list.add("C");
		list.add("D");
		list.add("Z");
		
		
		
		list.forEach(val -> System.out.println(val));
		
		
		list.stream().forEach(val -> System.out.println(val));
		list.stream().parallel().forEach(val -> System.out.println(val));
		filter(list);
//		removeDuplicate(list);
		sortUsingJava8(stuList);
		
	}
	
	
	private List<Student> generateStudentList(){
		List<Student> stuList = new ArrayList();
		stuList.add(new Student("shivani", 1, "GPCET", "HYDERABAD","EEE"));
		
		stuList.add(new Student("seema", 2, "BITS", "KURNOOL","ECE"));
		stuList.add(new Student("shivani", 3, "KVSE", "HYDERABAD","EEE"));
		
		stuList.add(new Student("sanku", 4, "GPCET", "KURNOOL","EEE"));
		

		stuList.add(new Student("sindhu", 5, "PP", "HYDERABAD","EEE"));
		
		return stuList;
	}
	
	
	
	public static void sort(List<String> list) {
		Collections.sort(list);
	}
	
	public static void filter(List<String> list) {
		
		List<String> filteredList = list.stream().filter(val -> val.equalsIgnoreCase("A")).collect(Collectors.toList());
		
		System.out.println(filteredList);
		
		System.out.println(list.stream().filter(val -> val.equalsIgnoreCase("A")).count());
		
		Predicate<String> pre = val -> val.equalsIgnoreCase("K") || val.equalsIgnoreCase("C");
		
		Optional<String> ele = list.parallelStream().filter(pre).findAny();
		
		System.out.println("findFirst: "+(ele.isPresent() ? ele.get() : null));
		
		
		
		System.out.println();
	}
	
	public static void removeDuplicate(List<String> list) {
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
	}
	//sort using java 8
	   private void sortUsingJava8(List<String> stuList) {
	      Collections.sort(stuList, (s1, s2) -> s1.compareTo(s2));
	   }

}
