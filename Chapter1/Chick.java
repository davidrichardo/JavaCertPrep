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
		String eyeTest = "\"Java Study Guide\" \n by Scott & Jeanne";
		String textBloock = """ 
		"Java Study Guide"  
		by Scott and Jeanne""";
		String block = """
			doe \
			deer""";
		System.out.println(block);
		System.out.println(eyeTest);
		System.out.println(textBloock);
		
		final int y = 10;
		int x = 20;
		y = x+10;
		
	}
}