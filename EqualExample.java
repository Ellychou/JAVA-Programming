import java.util.*;

public class EqualExample{

	public static void main(String[] args){

		Person P1 = new Person(1,"peter");
		Person P2 = new Person(1,"peter");

		if(P1.equals(P2)){
			System.out.println("true");
		}

	}
}

class Person{
	private int id;
	private String name;

	public Person(int ID, String name){
		this.id = id;
		this.name = name;
	}
	public int getID()｛
		return id;
	｝
	public void setID(int id){
		this.id = id；
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	

	@override
	public boolean equals(Objiect obj){
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != this.getClass()){
			return false;
		}
		Person Sara = (Person)obj;
	
		return id == Sara.id && (name= Sara.name || (name !=null && name.equals(Sara.getName));
	}

	@override
	public int hashCode(){

		final int prime = 37;
		int result = 1;
		result = prime*result + id;
		result = prime*result + ((name == null) ? 0:name.hashCode());

		return result;

	}

}