
public class mainClass {
	public static void main(String[] args) {
		   calculator c1 = new calculator();
		   calculator c2 = new calculator();
		   
		   c1.name = "Grand";
		   c2.name = "Circus";
		   
		   System.out.println(c1.name + " calculated " + c1.add(492, 617));
		   System.out.println(c1.name + " calculated " + c1.subtract(492, 125));
		   System.out.println(c2.name + " calculated " + c2.subtract(617, 125));
		   
		   }

}
