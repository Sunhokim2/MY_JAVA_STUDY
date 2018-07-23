package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String king = "세종대왕";
		String kingS = "10000";
		int year = 2017;
		int intkingS = Integer.parseInt(kingS);
		
		System.out.println(king + " : " +kingS);
		System.out.println(year + "년");
		System.out.println(kingS + year);
		System.out.println(intkingS + year);

	}

}
