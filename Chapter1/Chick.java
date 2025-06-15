public class Chick {
	
	int numEggs = 12; // Initialize on line

	private String name;
	{
		System.out.println("Setting field");
	}
	
	public Chick(){
		name = "Duke"; // Initialize on constructor
		System.out.println("Setting In constructor");
	}
	
	public static void main(String[] args) {
		Chick chick = new Chick();
		System.out.println(chick.name);
		
	}
}