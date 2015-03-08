package org.nd4j.jdbc.driverfinder;

import java.sql.Driver;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DriverFinderTest</code> contains tests for the class <code>{@link DriverFinder}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:22 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class DriverFinderTest {
	/**
	 * Run the DriverFinder() constructor test.
	 *
	 * @generatedBy CodePro at 3/7/15 7:22 PM
	 */
	@Test
	public void testDriverFinder_1()
		throws Exception {
		DriverFinder result = new DriverFinder();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Driver getDriver() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:22 PM
	 */
	@Test
	public void testGetDriver_1()
		throws Exception {

		Driver result = DriverFinder.getDriver();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: No org.nd4j.jdbc drivers found.
		//       at org.nd4j.jdbc.driverfinder.DriverFinder.discoverDriverClazz(DriverFinder.java:61)
		//       at org.nd4j.jdbc.driverfinder.DriverFinder.getDriver(DriverFinder.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the Driver getDriver() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:22 PM
	 */
	@Test
	public void testGetDriver_2()
		throws Exception {

		Driver result = DriverFinder.getDriver();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: No org.nd4j.jdbc drivers found.
		//       at org.nd4j.jdbc.driverfinder.DriverFinder.discoverDriverClazz(DriverFinder.java:61)
		//       at org.nd4j.jdbc.driverfinder.DriverFinder.getDriver(DriverFinder.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the Driver getDriver() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:22 PM
	 */
	@Test
	public void testGetDriver_3()
		throws Exception {

		Driver result = DriverFinder.getDriver();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: No org.nd4j.jdbc drivers found.
		//       at org.nd4j.jdbc.driverfinder.DriverFinder.discoverDriverClazz(DriverFinder.java:61)
		//       at org.nd4j.jdbc.driverfinder.DriverFinder.getDriver(DriverFinder.java:44)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:22 PM
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
	 * @generatedBy CodePro at 3/7/15 7:22 PM
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
	 * @generatedBy CodePro at 3/7/15 7:22 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DriverFinderTest.class);
	}
}