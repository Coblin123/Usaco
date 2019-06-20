
public class Test {
	public static void main(String[] args) {
		
		int a = 67;
		System.out.println(a);
		
		char b = 'C';
		System.out.println(b);
		
		System.out.println((char)a);
		System.out.println((int)b);
		
		String str = "CD";
		int result = 1;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			System.out.println((int)ch);
			result *= (int)ch;
		}
		
		System.out.println(result);
		
		char ch = 'T';
		
		System.out.println((int)ch-'A');
		
	}
}
