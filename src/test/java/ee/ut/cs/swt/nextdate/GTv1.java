package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("12/32/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(8, 30, 2021);
	    assertEquals("8/31/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1973, 1973, 1973);
	    String string0 = nextDate0.run(4, 30, 1973);
	    assertEquals("5/1/1973", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 2021);
	    assertEquals("1/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate((-973), (-973), (-973));
	    String string0 = nextDate0.run(5, 5, 1801);
	    assertEquals("5/6/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate((-619), (-619), 1986);
	    String string0 = nextDate0.run(2, 31, 1986);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(2019, 2019, 2019);
	    String string0 = nextDate0.run(2, 29, 2019);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("12/32/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(9, 2533, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(25, 25, 25);
	    String string0 = nextDate0.run(3, 1, 1917);
	    assertEquals("3/2/1917", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2021, (-2603), 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate((-619), (-619), 2021);
	    String string0 = nextDate0.run(6, 3145, 265);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 2060);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(25, 25, 25);
	    String string0 = nextDate0.run(12, 11, 1917);
	    assertEquals("12/12/1917", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1994);
	    assertEquals("7/7/1994", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1960, 1960, 1960);
	    String string0 = nextDate0.run(2, 28, 1960);
	    assertEquals("3/1/1960", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2007, 2007, 2007);
	    String string0 = nextDate0.run(9, 31, 2007);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 2021);
	    assertEquals("2/3/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(25, 25, 25);
	    String string0 = nextDate0.run(29, 25, (-373));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1960, 1960, 1960);
	    String string0 = nextDate0.run(11, 30, 1960);
	    assertEquals("12/1/1960", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run((-42), 2021, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(10, 31, 2021);
	    assertEquals("11/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(6, 2, 1903);
	    assertEquals("6/3/1903", string0);
	}

}