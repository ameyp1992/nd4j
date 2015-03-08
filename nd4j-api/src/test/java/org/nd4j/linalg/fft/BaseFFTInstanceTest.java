package org.nd4j.linalg.fft;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>BaseFFTInstanceTest</code> contains tests for the class <code>{@link BaseFFTInstance}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class BaseFFTInstanceTest {
	/**
	 * Run the IComplexNDArray fft(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_1()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;

		IComplexNDArray result = fixture.fft(inputC);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fft(BaseFFTInstance.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fft(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_2()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;

		IComplexNDArray result = fixture.fft(inputC);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fft(BaseFFTInstance.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fft(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_3()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		INDArray input = null;

		IComplexNDArray result = fixture.fft(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fft(BaseFFTInstance.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fft(IComplexNDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_4()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;
		int numElements = 1;

		IComplexNDArray result = fixture.fft(inputC, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fft(BaseFFTInstance.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fft(INDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_5()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int numElements = 1;

		IComplexNDArray result = fixture.fft(transform, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fft(BaseFFTInstance.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fft(INDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_6()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int numElements = 1;

		IComplexNDArray result = fixture.fft(transform, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fft(BaseFFTInstance.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fftn(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFftn_1()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;

		IComplexNDArray result = fixture.fftn(transform);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fftn(BaseFFTInstance.java:230)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fftn(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFftn_2()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;

		IComplexNDArray result = fixture.fftn(transform);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fftn(BaseFFTInstance.java:219)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fftn(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFftn_3()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;
		int numElements = 1;

		IComplexNDArray result = fixture.fftn(transform, dimension, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fftn(BaseFFTInstance.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fftn(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFftn_4()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;
		int numElements = 1;

		IComplexNDArray result = fixture.fftn(transform, dimension, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fftn(BaseFFTInstance.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fftn(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFftn_5()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;
		int numElements = 1;

		IComplexNDArray result = fixture.fftn(transform, dimension, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fftn(BaseFFTInstance.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fftn(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testFftn_6()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;
		int numElements = 0;

		IComplexNDArray result = fixture.fftn(transform, dimension, numElements);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fftn(INDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFftn_7()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int dimension = 1;
		int numElements = 1;

		IComplexNDArray result = fixture.fftn(transform, dimension, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.BaseFFTInstance.fftn(BaseFFTInstance.java:208)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifftn(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfftn_1()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;

		IComplexNDArray result = fixture.ifftn(transform);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.ifftn(BaseFFTInstance.java:240)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifftn(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfftn_2()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;

		IComplexNDArray result = fixture.ifftn(transform);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.ifftn(BaseFFTInstance.java:245)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifftn(IComplexNDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfftn_3()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;

		IComplexNDArray result = fixture.ifftn(transform, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.ifftn(BaseFFTInstance.java:235)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifftn(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfftn_4()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;
		int numElements = 1;

		IComplexNDArray result = fixture.ifftn(transform, dimension, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.ifftn(BaseFFTInstance.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifftn(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfftn_5()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;
		int numElements = 1;

		IComplexNDArray result = fixture.ifftn(transform, dimension, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.ifftn(BaseFFTInstance.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifftn(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfftn_6()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;
		int numElements = 1;

		IComplexNDArray result = fixture.ifftn(transform, dimension, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.ifftn(BaseFFTInstance.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifftn(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testIfftn_7()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;
		int numElements = 0;

		IComplexNDArray result = fixture.ifftn(transform, dimension, numElements);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifftn(INDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfftn_8()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int dimension = 1;
		int numElements = 1;

		IComplexNDArray result = fixture.ifftn(transform, dimension, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.BaseFFTInstance.ifftn(BaseFFTInstance.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray irfft(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIrfft_1()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray arr = null;

		IComplexNDArray result = fixture.irfft(arr);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IComplexNDArray irfft(IComplexNDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIrfft_2()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray arr = null;
		int dimension = 1;

		IComplexNDArray result = fixture.irfft(arr, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.irfft(BaseFFTInstance.java:129)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray irfftn(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIrfftn_1()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray arr = null;

		IComplexNDArray result = fixture.irfftn(arr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.irfftn(BaseFFTInstance.java:116)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray irfftn(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIrfftn_2()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray arr = null;

		IComplexNDArray result = fixture.irfftn(arr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.irfftn(BaseFFTInstance.java:116)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawfftn(IComplexNDArray,int[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawfftn_1()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int[] shape = new int[] {0};
		int[] axes = new int[] {};

		IComplexNDArray result = fixture.rawfftn(transform, shape, axes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.rawfftn(BaseFFTInstance.java:268)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawfftn(IComplexNDArray,int[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawfftn_2()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int[] shape = new int[] {};
		int[] axes = new int[] {};

		IComplexNDArray result = fixture.rawfftn(transform, shape, axes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.rawfftn(BaseFFTInstance.java:268)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawifft(IComplexNDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawifft_1()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int dimension = 1;

		IComplexNDArray result = fixture.rawifft(transform, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.rawifft(BaseFFTInstance.java:282)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawifftn(IComplexNDArray,int[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawifftn_1()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int[] shape = new int[] {};
		int[] axes = new int[] {};

		IComplexNDArray result = fixture.rawifftn(transform, shape, axes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.rawifftn(BaseFFTInstance.java:254)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawifftn(IComplexNDArray,int[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawifftn_2()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int[] shape = new int[] {0};
		int[] axes = new int[] {};

		IComplexNDArray result = fixture.rawifftn(transform, shape, axes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.rawifftn(BaseFFTInstance.java:254)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawifftn(IComplexNDArray,int[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawifftn_3()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int[] shape = new int[] {0};
		int[] axes = new int[] {0};

		IComplexNDArray result = fixture.rawifftn(transform, shape, axes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.rawifftn(BaseFFTInstance.java:254)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawifftn(IComplexNDArray,int[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawifftn_4()
		throws Exception {
		BaseFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int[] shape = new int[] {0};
		int[] axes = new int[] {0};

		IComplexNDArray result = fixture.rawifftn(transform, shape, axes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.BaseFFTInstance.rawifftn(BaseFFTInstance.java:254)
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
		new org.junit.runner.JUnitCore().run(BaseFFTInstanceTest.class);
	}
}