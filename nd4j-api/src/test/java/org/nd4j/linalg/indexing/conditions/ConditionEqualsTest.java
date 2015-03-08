package org.nd4j.linalg.indexing.conditions;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;

/**
 * The class <code>ConditionEqualsTest</code> contains tests for the class <code>{@link ConditionEquals}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class ConditionEqualsTest {
	/**
	 * Run the ConditionEquals(Condition[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConditionEquals_1()
		throws Exception {

		ConditionEquals result = new ConditionEquals();

		// add additional test code here
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
		ConditionEquals fixture = new ConditionEquals(new Condition[] {});
		Number input = new Byte((byte) 1);

		Boolean result = fixture.apply(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at org.nd4j.linalg.indexing.conditions.ConditionEquals.apply(ConditionEquals.java:36)
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
		ConditionEquals fixture = new ConditionEquals(new Condition[] {});
		Number input = new Byte((byte) 1);

		Boolean result = fixture.apply(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at org.nd4j.linalg.indexing.conditions.ConditionEquals.apply(ConditionEquals.java:36)
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
		ConditionEquals fixture = new ConditionEquals(new Condition[] {});
		IComplexNumber input = null;

		Boolean result = fixture.apply(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at org.nd4j.linalg.indexing.conditions.ConditionEquals.apply(ConditionEquals.java:45)
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
		ConditionEquals fixture = new ConditionEquals(new Condition[] {});
		IComplexNumber input = null;

		Boolean result = fixture.apply(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at org.nd4j.linalg.indexing.conditions.ConditionEquals.apply(ConditionEquals.java:45)
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
		new org.junit.runner.JUnitCore().run(ConditionEqualsTest.class);
	}
}