package org.nd4j.linalg.convolution;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>BaseConvolutionTest</code> contains tests for the class <code>{@link BaseConvolution}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class BaseConvolutionTest {
	/**
	 * Run the INDArray conv2d(IComplexNDArray,IComplexNDArray,Type) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConv2d_1()
		throws Exception {
		BaseConvolution fixture = new DefaultConvolutionInstance();
		IComplexNDArray input = null;
		IComplexNDArray kernel = null;
		Convolution.Type type = Convolution.Type.FULL;

		INDArray result = fixture.conv2d(input, kernel, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.convolution.BaseConvolution.conv2d(BaseConvolution.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray conv2d(IComplexNDArray,IComplexNDArray,Type) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConv2d_2()
		throws Exception {
		BaseConvolution fixture = new DefaultConvolutionInstance();
		IComplexNDArray input = null;
		IComplexNDArray kernel = null;
		Convolution.Type type = Convolution.Type.FULL;

		INDArray result = fixture.conv2d(input, kernel, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.convolution.BaseConvolution.conv2d(BaseConvolution.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray conv2d(INDArray,INDArray,Type) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConv2d_3()
		throws Exception {
		BaseConvolution fixture = new DefaultConvolutionInstance();
		INDArray input = null;
		INDArray kernel = null;
		Convolution.Type type = Convolution.Type.FULL;

		INDArray result = fixture.conv2d(input, kernel, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.convolution.BaseConvolution.conv2d(BaseConvolution.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray conv2d(INDArray,INDArray,Type) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConv2d_4()
		throws Exception {
		BaseConvolution fixture = new DefaultConvolutionInstance();
		INDArray input = null;
		INDArray kernel = null;
		Convolution.Type type = Convolution.Type.FULL;

		INDArray result = fixture.conv2d(input, kernel, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.convolution.BaseConvolution.conv2d(BaseConvolution.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray convn(IComplexNDArray,IComplexNDArray,Type) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConvn_1()
		throws Exception {
		BaseConvolution fixture = new DefaultConvolutionInstance();
		IComplexNDArray input = null;
		IComplexNDArray kernel = null;
		Convolution.Type type = Convolution.Type.FULL;

		IComplexNDArray result = fixture.convn(input, kernel, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.convolution.BaseConvolution.convn(BaseConvolution.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray convn(INDArray,INDArray,Type) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConvn_2()
		throws Exception {
		BaseConvolution fixture = new DefaultConvolutionInstance();
		INDArray input = null;
		INDArray kernel = null;
		Convolution.Type type = Convolution.Type.FULL;

		INDArray result = fixture.convn(input, kernel, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.convolution.BaseConvolution.convn(BaseConvolution.java:61)
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
		new org.junit.runner.JUnitCore().run(BaseConvolutionTest.class);
	}
}