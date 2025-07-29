public class Valid {
	public static void main(String[] args) {
		int reply = valid();
		//int reply2 = nonValid();
		findAnswer(false);
	}
	
	public static int valid(){
		int y = 10;
		int x ; // x is declared here
		x = 3; // x is inicialized here
		int z ; // z is declared here but never inialized or used
		int reply = x+y;
		return reply;
	}
	
/*	public static int nonValid(){
		int y = 10;
		int x;
		int reply = x+y;
		return reply;
	}*/
	
	public static void findAnswer(boolean check){
		int answer;
		int otherAnswer;
		int onlyOneBranch;
		if(check){
			onlyOneBranch = 1;
			answer = 1;
		}else{
			answer =2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch);
	}
}