package Apr25;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder log =new StringBuilder();
		long timestamp=System.currentTimeMillis();
		log.append("[").append(timestamp).append("] ");
		
		int user=1234;
		
		log.append("User:").append(user).append(":");
		log.append("logged in");
		
		System.out.println(log.toString());//can use both of them
	}

}
