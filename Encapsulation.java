package Tasks;
class student
{
	private int roll_no;
	private String medicine;
	public void set_roll_no(int roll_no)
	{
		this.roll_no=roll_no;
	}
	public int	get_roll_no()
	{
		return roll_no;
	}
	public void set_medicine(String medicine)
	{
		this.medicine=medicine;
	}
	public String get_medicine()
	{
		return medicine;
		
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		student c = new student();
		c.set_medicine("Pooja");
		c.set_roll_no(123);
		System.out.println(c.get_medicine()+" "+c.get_roll_no());

	}

}
