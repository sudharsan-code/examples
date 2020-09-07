package stringtypes;
interface abc
{
	public void show();
}
class AbcImpl implements abc{
	public void show() {
		System.out.println("in show");
	}
}
public class InterfEx {
	public static void main(String[] args) 
	{
		abc obj = new AbcImpl();
		abc obj1= ()-> System.out.println("showing..");	
		obj.show();
		obj1.show();
	}

}
