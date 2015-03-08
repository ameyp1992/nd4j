package org.nd4j.linalg.indexing.conditions;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;

/**
 * The class <code>ConditionsTest</code> contains tests for the class <code>{@link Conditions}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class ConditionsTest {
	/**
	 * Run the Condition epsEquals(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEpsEquals_1()
		throws Exception {
		Number value = new Byte((byte) 1);

		Condition result = Conditions.epsEquals(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:26)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.epsEquals(Conditions.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the Condition epsEquals(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEpsEquals_2()
		throws Exception {
		IComplexNumber value = null;

		Condition result = Conditions.epsEquals(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:36)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:30)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.epsEquals(Conditions.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the Condition equals(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Number value = new Byte((byte) 1);

		Condition result = Conditions.equals(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:26)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.equals(Conditions.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the Condition equals(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		IComplexNumber value = null;

		Condition result = Conditions.equals(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:36)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:30)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.equals(Conditions.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the Condition greaterThan(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testGreaterThan_1()
		throws Exception {
		Number value = new Byte((byte) 1);

		Condition result = Conditions.greaterThan(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.GreaterThan.<init>(GreaterThan.java:26)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.greaterThan(Conditions.java:60)
		assertNotNull(result);
	}

	/**
	 * Run the Condition greaterThan(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testGreaterThan_2()
		throws Exception {
		IComplexNumber value = null;

		Condition result = Conditions.greaterThan(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:36)
		//       at org.nd4j.linalg.indexing.conditions.GreaterThan.<init>(GreaterThan.java:30)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.greaterThan(Conditions.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the Condition greaterThanOEqual(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testGreaterThanOEqual_1()
		throws Exception {
		Number value = new Byte((byte) 1);

		Condition result = Conditions.greaterThanOEqual(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.GreaterThanOrEqual.<init>(GreaterThanOrEqual.java:26)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.greaterThanOEqual(Conditions.java:84)
		assertNotNull(result);
	}

	/**
	 * Run the Condition greaterThanOrEqual(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testGreaterThanOrEqual_1()
		throws Exception {
		IComplexNumber value = null;

		Condition result = Conditions.greaterThanOrEqual(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:36)
		//       at org.nd4j.linalg.indexing.conditions.GreaterThanOrEqual.<init>(GreaterThanOrEqual.java:30)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.greaterThanOrEqual(Conditions.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the Condition isInfinite() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsInfinite_1()
		throws Exception {

		Condition result = Conditions.isInfinite();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Condition isNan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsNan_1()
		throws Exception {

		Condition result = Conditions.isNan();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Condition lessThan(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testLessThan_1()
		throws Exception {
		Number value = new Byte((byte) 1);

		Condition result = Conditions.lessThan(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.LessThan.<init>(LessThan.java:27)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.lessThan(Conditions.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Condition lessThan(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testLessThan_2()
		throws Exception {
		IComplexNumber value = null;

		Condition result = Conditions.lessThan(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:36)
		//       at org.nd4j.linalg.indexing.conditions.GreaterThan.<init>(GreaterThan.java:30)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.lessThan(Conditions.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the Condition lessThanOrEqual(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testLessThanOrEqual_1()
		throws Exception {
		Number value = new Byte((byte) 1);

		Condition result = Conditions.lessThanOrEqual(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.LessThanOrEqual.<init>(LessThanOrEqual.java:27)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.lessThanOrEqual(Conditions.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the Condition lessThanOrEqual(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testLessThanOrEqual_2()
		throws Exception {
		IComplexNumber value = null;

		Condition result = Conditions.lessThanOrEqual(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:36)
		//       at org.nd4j.linalg.indexing.conditions.LessThanOrEqual.<init>(LessThanOrEqual.java:31)
		//       at org.nd4j.linalg.indexing.conditions.Conditions.lessThanOrEqual(Conditions.java:72)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConditionsTest.class);
	}
}