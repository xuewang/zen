/*
 * Given two binary strings, return their sum (also a binary string).
 *INPUT: a = "11", b = "1"
 *OUTPUT: ¡°100¡å
 */

package addBinary;

public class AddBinary {
	public String binarySum(String str1, String str2) {
		//If one or both of the string contains only "0"s
		if (str1.indexOf("1") == -1)
			return str2.indexOf("1") == -1 ? "0" : str2.substring(str2.indexOf("1"));
		
		//Make both strings of the same length
		int diff = Math.abs(str1.length() - str2.length());
		if (str1.length() > str2.length()) {
			for (int i = 0; i < diff; i++)
				str2 = "0" + str2;
		} 
		else {
			for (int i = 0; i < diff; i++)
				str1 = "0" + str1;
		}
		
		//Sum loop
		String sum = new String();
		String carry = "0";
		for (int i = str1.length() - 1; i >= 0; i--) {
			if ((str1.charAt(i) == '0' && str2.charAt(i) == '0') ||
				(str1.charAt(i) == '1' && str2.charAt(i) == '1'))
				sum = "0" + sum;
			else sum = "1" + sum;
			if (str1.charAt(i) == '1' && str2.charAt(i) == '1')
				carry = "1" + carry;
			else carry = "0" + carry;
		}
		//Call a method within the method itself???
		if (carry.indexOf("1") == -1)
			return binarySum(sum, carry);
		else return sum;
	}
}

class RunAddBinary {
	public static void main(String args[]) {
		AddBinary test = new AddBinary();
		String a = "0001010";
		String b = "010";
		
		System.out.println(test.binarySum(a, b));
	}
}
