package chappter3sachbt;

import java.util.*;

class WebAddressCheckException extends Exception {
	public WebAddressCheckException(String str) {
		super(str);
	}
}

public class WebAddressCheck {
	public static void checkWebaddress(String s) throws WebAddressException {
		String numReg = "^https?://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%=]*)?$";

		Boolean b = s.matches(numReg);
		if (b == false)
			throw new WebAddressCheckException("dia chi email khong hop le ");

		else
			System.out.println("dia chi web hop le");
	}

	public static void main(String args[]) {
		try {
			Scanner kb = new Scanner(System.in);
			System.out.println("nhap dia chi web:");
			String webadd = kb.nextLine();
			checkWebaddress(webadd);
		} catch (WebAddressCheckException e) {
			System.out.println(e.getMessage());
		}
	}
}
