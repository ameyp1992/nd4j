package org.nd4j.linalg.indexing.conditions;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;

/**
 * The class <code>EqualsConditionTest</code> contains tests for the class <code>{@link EqualsCondition}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class EqualsConditionTest {
	/**
	 * Run the EqualsCondition(Number) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEqualsCondition_1()
		throws Exception {
		Number value = new Byte((byte) 1);

		EqualsCondition result = new EqualsCondition(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:26)
		assertNotNull(result);
	}

	/**
	 * Run the EqualsCondition(IComplexNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEqualsCondition_2()
		throws Exception {
		IComplexNumber complexNumber = null;

		EqualsCondition result = new EqualsCondition(complexNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:36)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the Boolean apply(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testApply_1()
		throws Exception {
		EqualsCondition fixture = new EqualsCondition(new Byte((byte) 1));
		fixture.value = new Byte((byte) 1);
		fixture.complexNumber = null;
		Number input = new Byte((byte) 1);

		Boolean result = fixture.apply(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:26)
		assertNotNull(result);
	}

	/**
	 * Run the Boolean apply(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testApply_2()
		throws Exception {
		EqualsCondition fixture = new EqualsCondition(new Byte((byte) 1));
		fixture.value = new Byte((byte) 1);
		fixture.complexNumber = null;
		Number input = new Byte((byte) 1);

		Boolean result = fixture.apply(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:26)
		assertNotNull(result);
	}

	/**
	 * Run the Boolean apply(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testApply_3()
		throws Exception {
		EqualsCondition fixture = new EqualsCondition(new Byte((byte) 1));
		fixture.value = new Byte((byte) 1);
		fixture.complexNumber = null;
		IComplexNumber input = null;

		Boolean result = fixture.apply(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:26)
		assertNotNull(result);
	}

	/**
	 * Run the Boolean apply(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testApply_4()
		throws Exception {
		EqualsCondition fixture = new EqualsCondition(new Byte((byte) 1));
		fixture.value = new Byte((byte) 1);
		fixture.complexNumber = null;
		IComplexNumber input = null;

		Boolean result = fixture.apply(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.indexing.conditions.BaseCondition.<init>(BaseCondition.java:31)
		//       at org.nd4j.linalg.indexing.conditions.EqualsCondition.<init>(EqualsCondition.java:26)
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
		new org.junit.runner.JUnitCore().run(EqualsConditionTest.class);
	}
}