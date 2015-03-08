package org.nd4j.linalg.indexing.conditions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConditionBuilderTest</code> contains tests for the class <code>{@link ConditionBuilder}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class ConditionBuilderTest {
	/**
	 * Run the ConditionBuilder and(Condition[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testAnd_1()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		ConditionBuilder result = fixture.and();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConditionBuilder and(Condition[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testAnd_2()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		ConditionBuilder result = fixture.and();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Condition build() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testBuild_1()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		Condition result = fixture.build();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ConditionBuilder eq(Condition[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEq_1()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		ConditionBuilder result = fixture.eq();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConditionBuilder eq(Condition[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEq_2()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		ConditionBuilder result = fixture.eq();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConditionBuilder not() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testNot_1()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		ConditionBuilder result = fixture.not();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: No condition to take the opposite of
		//       at org.nd4j.linalg.indexing.conditions.ConditionBuilder.not(ConditionBuilder.java:60)
		assertNotNull(result);
	}

	/**
	 * Run the ConditionBuilder not() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testNot_2()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		ConditionBuilder result = fixture.not();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConditionBuilder or(Condition[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOr_1()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		ConditionBuilder result = fixture.or();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConditionBuilder or(Condition[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOr_2()
		throws Exception {
		ConditionBuilder fixture = new ConditionBuilder();

		ConditionBuilder result = fixture.or();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(ConditionBuilderTest.class);
	}
}