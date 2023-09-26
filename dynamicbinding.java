package Tasks;
class animal
{
	void print() {
		System.out.println("The dog is eating");
	}
	
}
public class dynamicbinding extends animal {
	void print() {
		System.out.println("The animal is eating");
	}
	public static void main(String[] args) {
		animal a=new dynamicbinding();
		a.print();
	}
}
