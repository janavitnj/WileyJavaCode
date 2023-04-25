package Apr25;

public class StringProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="wiley";
		String s2="wiley";
		//System.out.println(s1 == s2);
		
		String s3=new String("wiley");
		String s4=new String("wiley");
		//System.out.println(s1 == s3);
		//System.out.println(s3 == s4);
		
		String str1="I am a Java dev";
		String str2="Python";
		
		System.out.println(str1.length());
		System.out.println(str2.charAt(1));
		System.out.println(str1+" ".concat(str2));
		System.out.println(str1.replace("d", "D"));
		String st[]=str1.split(" ");
		
		for(String s:st)
		{
			System.out.println(s);
		}
		
		String st1="T";
		String st2="N";
		
		System.out.println(st1.concat(" ").concat(st2));
		
		String st3=" dfsd ";
		System.out.println(st3.trim());
		
		System.out.println(st3.substring(0,3));
		
	}

}
