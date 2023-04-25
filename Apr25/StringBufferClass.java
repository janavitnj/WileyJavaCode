package Apr25;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Wiley");
		StringBuffer sb1=new StringBuffer("Wiley");
		StringBuffer sb2=new StringBuffer("Wiley");
		
		String ss="Wiley";
		System.out.println(ss.equals(sb1.toString()));
		
		System.out.println(sb==sb1);
		System.out.println(sb);
		
		sb.append(" prog");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		sb.insert(4, "ja");
		System.out.println(sb);
		
	}

}
