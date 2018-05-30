package _OCA_Understanding_Exercise;

public class _Try_Catch_Finally {

	public static void main(String[] args) {
		
		String s = "";
		try {
		  s += "t";
		} catch(Exception e) {
		  s += "c";
		} finally {
		  s += "f";
		}
		s += "a";
		System.out.print(s);

	}

}
