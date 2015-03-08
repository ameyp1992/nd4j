package org.nd4j.linalg.sampling;

import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>SamplingTest</code> contains tests for the class <code>{@link Sampling}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:14 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class SamplingTest {
	/**
	 * Run the INDArray binomial(INDArray,int,RandomGenerator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testBinomial_1()
		throws Exception {
		INDArray p = null;
		int n = 1;
		RandomGenerator rng = new Well1024a();

		INDArray result = Sampling.binomial(p, n, rng);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.sampling.Sampling.binomial(Sampling.java:92)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray binomial(INDArray,int,RandomGenerator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testBinomial_2()
		throws Exception {
		INDArray p = null;
		int n = 1;
		RandomGenerator rng = new Well1024a();

		INDArray result = Sampling.binomial(p, n, rng);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.sampling.Sampling.binomial(Sampling.java:92)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray normal(RandomGenerator,INDArray,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNormal_1()
		throws Exception {
		RandomGenerator rng = new Well1024a();
		INDArray mean = null;
		double sigma = 1.0;

		INDArray result = Sampling.normal(rng, mean, sigma);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.sampling.Sampling.normal(Sampling.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray normal(RandomGenerator,INDArray,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNormal_2()
		throws Exception {
		RandomGenerator rng = new Well1024a();
		INDArray mean = null;
		double sigma = 1.0;

		INDArray result = Sampling.normal(rng, mean, sigma);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.sampling.Sampling.normal(Sampling.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray normal(RandomGenerator,INDArray,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNormal_3()
		throws Exception {
		RandomGenerator rng = new Well1024a();
		INDArray mean = null;
		double sigma = 1.0;

		INDArray result = Sampling.normal(rng, mean, sigma);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.sampling.Sampling.normal(Sampling.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray normal(RandomGenerator,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNormal_4()
		throws Exception {
		RandomGenerator rng = new Well1024a();
		INDArray mean = null;
		INDArray sigma = null;

		INDArray result = Sampling.normal(rng, mean, sigma);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.sampling.Sampling.normal(Sampling.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray normal(RandomGenerator,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNormal_5()
		throws Exception {
		RandomGenerator rng = new Well1024a();
		INDArray mean = null;
		INDArray sigma = null;

		INDArray result = Sampling.normal(rng, mean, sigma);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.sampling.Sampling.normal(Sampling.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray normal(RandomGenerator,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNormal_6()
		throws Exception {
		RandomGenerator rng = new Well1024a();
		INDArray mean = null;
		INDArray sigma = null;

		INDArray result = Sampling.normal(rng, mean, sigma);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.sampling.Sampling.normal(Sampling.java:46)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
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
	 * @generatedBy CodePro at 3/7/15 7:14 PM
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
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SamplingTest.class);
	}
}