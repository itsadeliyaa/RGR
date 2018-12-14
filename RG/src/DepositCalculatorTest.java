import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DepositCalculatorTest {

	@Test
	public void testDeposit() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(60000.0 , 11.0, 5);
		assertEquals(93000, result,0);
	}


	@Test
	public void testDeposit1() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(16000.0 , 9.0, 3);
		assertEquals(20320, result,0);
	}
}
