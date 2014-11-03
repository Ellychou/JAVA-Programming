import java.util.*;
import org.junit.Test;

public class ComparebleTest{
	@Test

	public void test(){
		Employer e1 = new Employer("c", 1, 22);
		Employer e2 = new Employer("b", 2, 34);
		Employer e3 = new Employer("a", 3, 18);

		List<Employer> eList = new ArrayList();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);

		Collector.sort(eList);
		assertEquals(e1,eList.get(0));

		Collector.sort(eList,Employer.ByName);
		assertEquals(e3, eList.get(0));

		Collector.sort(eList, Employer.ByAge);
		assertEquals(e3, eList.get(0));
	}

}


import java.util.*;
class Employer implements Compareble<Employer>{
	private String name;
	private int id;
	private int age;

	public static final Comparetor<Employer> ByName = new Comparator<Employer>(){
		@override

		public int compare(Employer e1, Employer e2){
			return e1.name.compareTo(e2.name);
		}

	};
	public static final Comparator<Employer> ByAge = new Comparator<Employer>(){
		@override
		public static int compareTo(Employer e1, Employer e2){
			return e1.age - e2.age;
		}
	};

	public Employer(int id, String name, int age){
		this.name = name;
		this.departments = departments;
		this.age = age;
	}

	@override
	public int compareTo(Employer e){
		return this.id - e.id;
	}

}