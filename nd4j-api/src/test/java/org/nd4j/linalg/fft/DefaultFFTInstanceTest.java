package org.nd4j.linalg.fft;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>DefaultFFTInstanceTest</code> contains tests for the class <code>{@link DefaultFFTInstance}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class DefaultFFTInstanceTest {
	/**
	 * Run the IComplexNDArray fft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_1()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;
		int numElements = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.fft(inputC, numElements, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.fft(DefaultFFTInstance.java:60)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_2()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;
		int numElements = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.fft(inputC, numElements, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.fft(DefaultFFTInstance.java:60)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fft(INDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_3()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int numElements = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.fft(transform, numElements, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.fft(DefaultFFTInstance.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray fft(INDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFft_4()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int numElements = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.fft(transform, numElements, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.fft(DefaultFFTInstance.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifft(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfft_1()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;

		IComplexNDArray result = fixture.ifft(inputC);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.ifft(DefaultFFTInstance.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifft(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfft_2()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;

		IComplexNDArray result = fixture.ifft(inputC);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.ifft(DefaultFFTInstance.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifft(INDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfft_3()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int numElements = 1;

		IComplexNDArray result = fixture.ifft(transform, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.ifft(DefaultFFTInstance.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifft(INDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfft_4()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int numElements = 1;

		IComplexNDArray result = fixture.ifft(transform, numElements);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.ifft(DefaultFFTInstance.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfft_5()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;
		int numElements = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.ifft(inputC, numElements, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.ifft(DefaultFFTInstance.java:97)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfft_6()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray inputC = null;
		int numElements = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.ifft(inputC, numElements, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.ifft(DefaultFFTInstance.java:97)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifft(INDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfft_7()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int numElements = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.ifft(transform, numElements, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.ifft(DefaultFFTInstance.java:78)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray ifft(INDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIfft_8()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		INDArray transform = null;
		int numElements = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.ifft(transform, numElements, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.ifft(DefaultFFTInstance.java:78)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawfft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawfft_1()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int n = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.rawfft(transform, n, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.rawfft(DefaultFFTInstance.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawfft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawfft_2()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int n = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.rawfft(transform, n, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.rawfft(DefaultFFTInstance.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawfft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawfft_3()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int n = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.rawfft(transform, n, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.rawfft(DefaultFFTInstance.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawifft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawifft_1()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int n = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.rawifft(transform, n, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.rawifft(DefaultFFTInstance.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawifft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawifft_2()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int n = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.rawifft(transform, n, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.rawifft(DefaultFFTInstance.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray rawifft(IComplexNDArray,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testRawifft_3()
		throws Exception {
		DefaultFFTInstance fixture = new DefaultFFTInstance();
		IComplexNDArray transform = null;
		int n = 1;
		int dimension = 1;

		IComplexNDArray result = fixture.rawifft(transform, n, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.fft.DefaultFFTInstance.rawifft(DefaultFFTInstance.java:179)
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
		new org.junit.runner.JUnitCore().run(DefaultFFTInstanceTest.class);
	}
}