package FizzBuzz.fizzBuzz;

public class FizzBuzz {

	/*public static void main(String[] args) {
		System.out.println(chekNumber(3));
	}*/
	
	public static String chekNumber(Integer number) {
		if(number%3==0) {
			return "Fizz";
		}else if(number%5==0) {
			return "Buzz";
		}
		else if(number%5==0 && number%3==0) {
			return "FizzBuzz";
		}else {
		return number.toString();
		}
		
		
	}
}
