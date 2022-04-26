package tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import DSA.problems.Stack.*;
public class ValidParenthesisTest {

	public static ValidParentheses a;
	@BeforeClass
	public static void setUpBeforeClass(){
		a = new ValidParentheses();
	}

	@AfterClass
	public static void tearDownAfterClass(){
		a = null;
	}
	@Test
	public void isValid1() {
		boolean ans = a.isValid("{[]}");
		boolean exp = true;
		assertEquals(exp,ans);
	}
	@Test
	public void isValid2() {
		boolean ans = a.isValid("{[)}");
		boolean exp = false;
		assertEquals(exp,ans);
	}
	@Test
	public void isValid3() {
		boolean ans = a.isValid("{)");
		boolean exp = false;
		assertEquals(exp,ans);
	}@Test
	public void isValid4() {
		boolean ans = a.isValid("{{{{{{");
		boolean exp = false;
		assertEquals(exp,ans);
	}@Test
	public void isValid5() {
		boolean ans = a.isValid("{}))))");
		boolean exp = false;
		assertEquals(exp,ans);
	}

}
