package Apr25;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer chat=new StringBuffer();
		String sender="janavi";
		String mes="hey";
		
		chat.append(sender);
		chat.append(":");
		chat.append(mes);
		chat.append("\n");
		
		sender="partha";
		mes="hii";
		
		chat.append(sender);
		chat.append(":");
		chat.append(mes);
		chat.append("\n");
		
		System.out.println(chat);
		
	}

}
