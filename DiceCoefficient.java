import java.util.HashSet;
import java.util.Scanner;

public class DiceCoefficient {
	public static void main(String[] args) {
		System.out.println("Dice's Coefficient");
		System.out.println("Formula: D=2C/(A+B)");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string 1:");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2:");
		String s2 = sc.nextLine();
		s1 =s1.replaceAll("\\s+", "");
		s2 =s2.replaceAll("\\s+", "");
		HashSet<String> h1 = new HashSet<String>();
		HashSet<String> h2 = new HashSet<String>();
		String sb = new String();
		
		for(int i=0;i<s1.length()-1;i++){
				sb = "" + s1.charAt(i) + s1.charAt(i+1);
				h1.add(sb);
		}

		for(int i=0;i<s2.length()-1;i++){
				sb ="" + s2.charAt(i) + s2.charAt(i+1);
				h2.add(sb);				
		}
		double s=0;
		double a=h1.size();
		double b=h2.size();
		double c=0;
		h1.retainAll(h2);
		c=h1.size();

		System.out.println("Common bigrams:" + h1.toString());
		s=(2*c)/(a+b);
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		System.out.println("Simiarlity D = "+s);
	}
}
