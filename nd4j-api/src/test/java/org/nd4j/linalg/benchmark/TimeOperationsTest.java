package org.nd4j.linalg.benchmark;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>TimeOperationsTest</code> contains tests for the class <code>{@link TimeOperations}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class TimeOperationsTest {
	/**
	 * Run the TimeOperations(INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testTimeOperations_1()
		throws Exception {
		INDArray n = null;

		TimeOperations result = new TimeOperations(n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the TimeOperations(INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testTimeOperations_2()
		throws Exception {
		INDArray n = null;
		int numTimesRun = 1;

		TimeOperations result = new TimeOperations(n, numTimesRun);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the void benchMarkElementWiseAdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testBenchMarkElementWiseAdd_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);

		fixture.benchMarkElementWiseAdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
	}

	/**
	 * Run the void benchMarkElementWiseMul() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testBenchMarkElementWiseMul_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);

		fixture.benchMarkElementWiseMul();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
	}

	/**
	 * Run the void benchMarkScalarAdd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testBenchMarkScalarAdd_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);

		fixture.benchMarkScalarAdd();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
	}

	/**
	 * Run the void benchMarkScalarMuli() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testBenchMarkScalarMuli_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);

		fixture.benchMarkScalarMuli();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
	}

	/**
	 * Run the void benchmarkCreation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testBenchmarkCreation_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);

		fixture.benchmarkCreation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
	}

	/**
	 * Run the void benchmarkRavel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testBenchmarkRavel_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);

		fixture.benchmarkRavel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
	}

	/**
	 * Run the SummaryStatistics runNTimes(Runnable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRunNTimes_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);
		Runnable run = new Thread();

		SummaryStatistics result = fixture.runNTimes(run);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the SummaryStatistics runNTimes(Runnable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRunNTimes_2()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 0);
		Runnable run = new Thread();

		SummaryStatistics result = fixture.runNTimes(run);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the long timeOp(Runnable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testTimeOp_1()
		throws Exception {
		TimeOperations fixture = new TimeOperations((INDArray) null, 1);
		Runnable run = new Thread();

		long result = fixture.timeOp(run);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.benchmark.TimeOperations.<init>(TimeOperations.java:45)
		assertEquals(0L, result);
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
		new org.junit.runner.JUnitCore().run(TimeOperationsTest.class);
	}
}