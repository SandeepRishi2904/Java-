package alas;

public class Every {

	public static void main(String[] args) {
		sandeep s=new sandeep();
		s.run();
		s.print();

	}

}
class hell{
	void print() {
		System.out.println("Hello");
	}
}
class sandeep extends hell
{
	void run()
	{
		System.out.println("Running");
	}
}