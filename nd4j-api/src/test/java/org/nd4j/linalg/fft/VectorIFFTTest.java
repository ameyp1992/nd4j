package org.nd4j.linalg.fft;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNDArray;

/**
 * The class <code>VectorIFFTTest</code> contains tests for the class <code>{@link VectorIFFT}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:12 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class VectorIFFTTest {
	/**
	 * Run the VectorIFFT(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:12 PM
	 */
	@Test
	public void testVectorIFFT_1()
		throws Exception {
		int n = 1;

		VectorIFFT result = new VectorIFFT(n);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray apply(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:12 PM
	 */
	@Test
	public void testApply_1()
		throws Exception {
		VectorIFFT fixture = new VectorIFFT(1);
		IComplexNDArray ndArray = null;

		IComplexNDArray result = fixture.apply(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.VectorIFFT.apply(VectorIFFT.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray apply(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:12 PM
	 */
	@Test
	public void testApply_2()
		throws Exception {
		VectorIFFT fixture = new VectorIFFT(1);
		IComplexNDArray ndArray = null;

		IComplexNDArray result = fixture.apply(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.VectorIFFT.apply(VectorIFFT.java:51)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:12 PM
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
	 * @generatedBy CodePro at 3/7/15 7:12 PM
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
	 * @generatedBy CodePro at 3/7/15 7:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VectorIFFTTest.class);
	}
}