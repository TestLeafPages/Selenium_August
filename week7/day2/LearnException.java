package week7.day2;

import java.io.IOException;

public class LearnException {

	public static void main(String[] args) throws IOException {

		int x = 10;
		
		int y = 0;
		
		int[] num = {5,6,7};
		
		try {
			System.out.println(x / y);
			System.out.println(num[2]);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			Runtime.getRuntime().exec("TASKKILL /F /IM chromedriver.exe");
		}
		
		
		System.out.println("last line of code");
		
		

	}

}
