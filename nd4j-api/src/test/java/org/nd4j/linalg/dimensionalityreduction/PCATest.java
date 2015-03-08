package org.nd4j.linalg.dimensionalityreduction;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>PCATest</code> contains tests for the class <code>{@link PCA}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class PCATest {
	/**
	 * Run the INDArray pca(INDArray,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testPca_1()
		throws Exception {
		INDArray X = null;
		int nDims = 1;
		boolean normalize = true;

		INDArray result = PCA.pca(X, nDims, normalize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.dimensionalityreduction.PCA.pca(PCA.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray pca(INDArray,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testPca_2()
		throws Exception {
		INDArray X = null;
		int nDims = 1;
		boolean normalize = false;

		INDArray result = PCA.pca(X, nDims, normalize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.dimensionalityreduction.PCA.pca(PCA.java:52)
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
		new org.junit.runner.JUnitCore().run(PCATest.class);
	}
}