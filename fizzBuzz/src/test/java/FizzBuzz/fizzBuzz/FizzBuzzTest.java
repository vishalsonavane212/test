package FizzBuzz.fizzBuzz;

import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzzTest {

	@Test
	public void shouldReturnFizzForMultipleOf3() {
		FizzBuzz fizzBuzz=new FizzBuzz();
		Assert.assertEquals("Fizz", fizzBuzz.chekNumber(8));
	}
}
