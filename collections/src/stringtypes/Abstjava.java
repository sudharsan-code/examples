package stringtypes;

public class Abstjava {
	public static void main(String[] args) {
		Iphone obj = new Iphone();
		Samsung obj1 = new Samsung();
		show(obj);}
				public static void show (Phone obj) {
			obj.showConfig();
		}
		
	}


abstract class Phone{
	public abstract void showConfig();
}
class Iphone extends Phone{
	public void showConfig() {
		System.out.println("2 gb ram, IOS 9.3");
	}
}
class Samsung extends Phone{
	public void showConfig() {
		System.out.println("2gb ram, Lolipop andriod");
	}
}
