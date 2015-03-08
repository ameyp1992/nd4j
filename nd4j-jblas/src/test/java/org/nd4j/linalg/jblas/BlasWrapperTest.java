package org.nd4j.linalg.jblas;

import org.jblas.exceptions.LapackArgumentException;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexFloat;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.jblas.complex.ComplexDouble;
import org.nd4j.linalg.jblas.complex.ComplexFloat;
import org.nd4j.linalg.jblas.complex.ComplexNDArray;

/**
 * The class <code>BlasWrapperTest</code> contains tests for the class <code>{@link BlasWrapper}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:19 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class BlasWrapperTest {
	/**
	 * Run the double asum(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAsum_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);

		double result = fixture.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.asum(BlasWrapper.java:395)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double asum(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAsum_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);

		double result = fixture.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.asum(BlasWrapper.java:395)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double asum(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAsum_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);

		double result = fixture.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.asum(BlasWrapper.java:395)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double asum(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAsum_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		double result = fixture.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.asum(BlasWrapper.java:376)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double asum(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAsum_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		double result = fixture.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.asum(BlasWrapper.java:376)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double asum(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAsum_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		double result = fixture.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.asum(BlasWrapper.java:376)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the INDArray axpy(double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAxpy_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double da = 1.0;
		INDArray dx = new NDArray();
		INDArray dy = new NDArray();

		INDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.axpy(BlasWrapper.java:173)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray axpy(double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAxpy_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double da = 1.0;
		INDArray dx = new NDArray();
		INDArray dy = new NDArray();

		INDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.axpy(BlasWrapper.java:173)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray axpy(float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAxpy_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float da = 1.0f;
		INDArray dx = new NDArray();
		INDArray dy = new NDArray();

		INDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.axpy(BlasWrapper.java:194)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray axpy(float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAxpy_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float da = 1.0f;
		INDArray dx = new NDArray();
		INDArray dy = new NDArray();

		INDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.axpy(BlasWrapper.java:194)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray axpy(IComplexNumber,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAxpy_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNumber da = new ComplexDouble(1.0);
		IComplexNDArray dx = new ComplexNDArray(1, 1);
		IComplexNDArray dy = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.axpy(BlasWrapper.java:223)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray axpy(IComplexNumber,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAxpy_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNumber da = new ComplexDouble(1.0);
		IComplexNDArray dx = new ComplexNDArray(1, 1);
		IComplexNDArray dy = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.axpy(BlasWrapper.java:223)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray axpy(IComplexNumber,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testAxpy_7()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNumber da = new ComplexDouble(1.0);
		IComplexNDArray dx = new ComplexNDArray(1, 1);
		IComplexNDArray dy = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.axpy(BlasWrapper.java:223)
		assertNotNull(result);
	}

	/**
	 * Run the void checkInfo(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testCheckInfo_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		String name = "";
		int info = 1;

		fixture.checkInfo(name, info);

		// add additional test code here
	}

	/**
	 * Run the void checkInfo(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test(expected = org.jblas.exceptions.LapackArgumentException.class)
	public void testCheckInfo_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		String name = "";
		int info = -2;

		fixture.checkInfo(name, info);

		// add additional test code here
	}

	/**
	 * Run the IComplexNDArray copy(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testCopy_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.copy(BlasWrapper.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray copy(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testCopy_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.copy(BlasWrapper.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray copy(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testCopy_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		INDArray result = fixture.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.copy(BlasWrapper.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray copy(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testCopy_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		INDArray result = fixture.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.copy(BlasWrapper.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the void dcopy(int,float[],int,int,float[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDcopy_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		int n = 1;
		float[] dx = new float[] {};
		int dxIdx = 1;
		int incx = 1;
		float[] dy = new float[] {};
		int dyIdx = 1;
		int incy = 1;

		fixture.dcopy(n, dx, dxIdx, incx, dy, dyIdx, incy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.dcopy(BlasWrapper.java:1437)
	}

	/**
	 * Run the double dot(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDot_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		double result = fixture.dot(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.dot(BlasWrapper.java:247)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double dot(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDot_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		double result = fixture.dot(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.dot(BlasWrapper.java:247)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double dot(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDot_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		double result = fixture.dot(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.dot(BlasWrapper.java:247)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the IComplexNumber dotc(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDotc_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNumber result = fixture.dotc(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.dotc(BlasWrapper.java:279)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber dotc(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDotc_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNumber result = fixture.dotc(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.dotc(BlasWrapper.java:279)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber dotc(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDotc_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNumber result = fixture.dotc(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.dotc(BlasWrapper.java:279)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber dotu(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDotu_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNumber result = fixture.dotu(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.dotu(BlasWrapper.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber dotu(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDotu_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNumber result = fixture.dotu(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.dotu(BlasWrapper.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber dotu(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testDotu_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNumber result = fixture.dotu(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.dotu(BlasWrapper.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_7()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_8()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeev_9()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new NDArray();
		INDArray WR = new NDArray();
		INDArray WI = new NDArray();
		INDArray VL = new NDArray();
		INDArray VR = new NDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geev(BlasWrapper.java:1179)
		assertEquals(0, result);
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_7()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_8()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGelsd_9()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gelsd(BlasWrapper.java:1299)
	}

	/**
	 * Run the INDArray gemm(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemm_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray b = new NDArray();
		double beta = 1.0;
		INDArray c = new NDArray();

		INDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemm(BlasWrapper.java:730)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemm(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemm_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray b = new NDArray();
		double beta = 1.0;
		INDArray c = new NDArray();

		INDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemm(BlasWrapper.java:730)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemm(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemm_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray b = new NDArray();
		double beta = 1.0;
		INDArray c = new NDArray();

		INDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemm(BlasWrapper.java:730)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemm(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemm_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray b = new NDArray();
		float beta = 1.0f;
		INDArray c = new NDArray();

		INDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemm(BlasWrapper.java:767)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemm(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemm_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray b = new NDArray();
		float beta = 1.0f;
		INDArray c = new NDArray();

		INDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemm(BlasWrapper.java:767)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemm(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemm_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray b = new NDArray();
		float beta = 1.0f;
		INDArray c = new NDArray();

		INDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemm(BlasWrapper.java:767)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemm(IComplexNumber,IComplexNDArray,IComplexNDArray,IComplexNumber,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemm_7()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNumber alpha = new ComplexDouble(1.0);
		IComplexNDArray a = new ComplexNDArray(1, 1);
		IComplexNDArray b = new ComplexNDArray(1, 1);
		IComplexNumber beta = new ComplexDouble(1.0);
		IComplexNDArray c = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemm(BlasWrapper.java:803)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemm(IComplexNumber,IComplexNDArray,IComplexNDArray,IComplexNumber,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemm_8()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNumber alpha = new ComplexDouble(1.0);
		IComplexNDArray a = new ComplexNDArray(1, 1);
		IComplexNDArray b = new ComplexNDArray(1, 1);
		IComplexNumber beta = new ComplexDouble(1.0);
		IComplexNDArray c = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemm(BlasWrapper.java:803)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		double beta = 0.0;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		double beta = 0.0;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		double beta = 0.0;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		double beta = 0.0;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		double beta = 0.0;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		double beta = 0.0;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_7()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		double beta = 0.0;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_8()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		float beta = 0.0f;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:500)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_9()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		float beta = 0.0f;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:500)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_10()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		float beta = 0.0f;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:500)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_11()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		float beta = 0.0f;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_12()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		float beta = 0.0f;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_13()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		float beta = 0.0f;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_14()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray a = new NDArray();
		INDArray x = new NDArray();
		float beta = 0.0f;
		INDArray y = new NDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemv(IComplexDouble,IComplexNDArray,IComplexNDArray,IComplexDouble,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_15()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray a = new ComplexNDArray(1, 1);
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexDouble beta = new ComplexDouble(1.0);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Given ndarray does not have data type double
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:40)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:573)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemv(IComplexDouble,IComplexNDArray,IComplexNDArray,IComplexDouble,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_16()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray a = new ComplexNDArray(1, 1);
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexDouble beta = new ComplexDouble(1.0);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Given ndarray does not have data type double
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:40)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:573)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemv(IComplexFloat,IComplexNDArray,IComplexNDArray,IComplexFloat,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGemv_17()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray a = new ComplexNDArray(1, 1);
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexFloat beta = new ComplexFloat(1.0f);
		IComplexNDArray y = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Given ndarray does not have data type double
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:40)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gemv(BlasWrapper.java:597)
		assertNotNull(result);
	}

	/**
	 * Run the void geqrf(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeqrf_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray tau = new NDArray();

		fixture.geqrf(A, tau);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geqrf(BlasWrapper.java:1373)
	}

	/**
	 * Run the void geqrf(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeqrf_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray A = new NDArray();
		INDArray tau = new NDArray();

		fixture.geqrf(A, tau);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geqrf(BlasWrapper.java:1373)
	}

	/**
	 * Run the INDArray ger(double,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGer_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray x = new NDArray();
		INDArray y = new NDArray();
		INDArray a = new NDArray();

		INDArray result = fixture.ger(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.ger(BlasWrapper.java:530)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray ger(float,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGer_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray x = new NDArray();
		INDArray y = new NDArray();
		INDArray a = new NDArray();

		INDArray result = fixture.ger(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.ger(BlasWrapper.java:554)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gerc(IComplexDouble,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGerc_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);
		IComplexNDArray a = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.gerc(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Given ndarray does not have data type double
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:40)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gerc(BlasWrapper.java:678)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gerc(IComplexFloat,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGerc_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);
		IComplexNDArray a = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.gerc(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.gerc(BlasWrapper.java:702)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray geru(IComplexDouble,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeru_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);
		IComplexNDArray a = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.geru(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Given ndarray does not have data type double
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:40)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.geru(BlasWrapper.java:627)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray geru(IComplexFloat,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGeru_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray x = new ComplexNDArray(1, 1);
		IComplexNDArray y = new ComplexNDArray(1, 1);
		IComplexNDArray a = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.geru(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.geru(BlasWrapper.java:655)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gesv(INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGesv_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray a = new NDArray();
		int[] ipiv = new int[] {};
		INDArray b = new NDArray();

		INDArray result = fixture.gesv(a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gesv(BlasWrapper.java:851)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gesv(INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGesv_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray a = new NDArray();
		int[] ipiv = new int[] {};
		INDArray b = new NDArray();

		INDArray result = fixture.gesv(a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gesv(BlasWrapper.java:851)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gesv(INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testGesv_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray a = new NDArray();
		int[] ipiv = new int[] {};
		INDArray b = new NDArray();

		INDArray result = fixture.gesv(a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.gesv(BlasWrapper.java:851)
		assertNotNull(result);
	}

	/**
	 * Run the int iamax(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testIamax_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);

		int result = fixture.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.iamax(BlasWrapper.java:447)
		assertEquals(0, result);
	}

	/**
	 * Run the int iamax(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testIamax_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);

		int result = fixture.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.iamax(BlasWrapper.java:447)
		assertEquals(0, result);
	}

	/**
	 * Run the int iamax(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testIamax_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		int result = fixture.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.iamax(BlasWrapper.java:420)
		assertEquals(0, result);
	}

	/**
	 * Run the int iamax(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testIamax_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		int result = fixture.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.iamax(BlasWrapper.java:420)
		assertEquals(0, result);
	}

	/**
	 * Run the int iamax(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testIamax_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		int result = fixture.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.iamax(BlasWrapper.java:420)
		assertEquals(0, result);
	}

	/**
	 * Run the double nrm2(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testNrm2_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);

		double result = fixture.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.nrm2(BlasWrapper.java:354)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testNrm2_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);

		double result = fixture.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.nrm2(BlasWrapper.java:354)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testNrm2_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexNDArray x = new ComplexNDArray(1, 1);

		double result = fixture.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.jblas.NativeBlas
		//       at org.nd4j.linalg.jblas.BlasWrapper.nrm2(BlasWrapper.java:354)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testNrm2_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		double result = fixture.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.nrm2(BlasWrapper.java:332)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testNrm2_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		double result = fixture.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.nrm2(BlasWrapper.java:332)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testNrm2_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();

		double result = fixture.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.jblas.BlasWrapper.nrm2(BlasWrapper.java:332)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the void ormqr(char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testOrmqr_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char side = '';
		char trans = '';
		INDArray A = new NDArray();
		INDArray tau = new NDArray();
		INDArray C = new NDArray();

		fixture.ormqr(side, trans, A, tau, C);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.ormqr(BlasWrapper.java:1401)
	}

	/**
	 * Run the void ormqr(char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testOrmqr_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char side = '';
		char trans = '';
		INDArray A = new NDArray();
		INDArray tau = new NDArray();
		INDArray C = new NDArray();

		fixture.ormqr(side, trans, A, tau, C);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.ormqr(BlasWrapper.java:1401)
	}

	/**
	 * Run the void posv(char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testPosv_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.posv(uplo, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.posv(BlasWrapper.java:1143)
	}

	/**
	 * Run the void posv(char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testPosv_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.posv(uplo, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.posv(BlasWrapper.java:1143)
	}

	/**
	 * Run the void posv(char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testPosv_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.posv(uplo, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.posv(BlasWrapper.java:1143)
	}

	/**
	 * Run the void posv(char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testPosv_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();

		fixture.posv(uplo, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.posv(BlasWrapper.java:1143)
	}

	/**
	 * Run the void saxpy(double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSaxpy_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		fixture.saxpy(alpha, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.saxpy(BlasWrapper.java:1449)
	}

	/**
	 * Run the void saxpy(float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSaxpy_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		fixture.saxpy(alpha, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.saxpy(BlasWrapper.java:1471)
	}

	/**
	 * Run the INDArray scal(double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testScal_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		double alpha = 1.0;
		INDArray x = new NDArray();

		INDArray result = fixture.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.jblas.BlasWrapper.scal(BlasWrapper.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray scal(float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testScal_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		float alpha = 1.0f;
		INDArray x = new NDArray();

		INDArray result = fixture.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.jblas.BlasWrapper.scal(BlasWrapper.java:89)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray scal(IComplexDouble,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testScal_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Given ndarray does not have data type double
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:40)
		//       at org.nd4j.linalg.jblas.BlasWrapper.scal(BlasWrapper.java:105)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray scal(IComplexFloat,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testScal_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray x = new ComplexNDArray(1, 1);

		IComplexNDArray result = fixture.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.jblas.util.LibraryLoader.loadLibrary(LibraryLoader.java:77)
		//       at org.jblas.NativeBlasLibraryLoader.loadLibraryAndCheckErrors(NativeBlasLibraryLoader.java:27)
		//       at org.jblas.NativeBlas.<clinit>(NativeBlas.java:77)
		//       at org.nd4j.linalg.jblas.BlasWrapper.scal(BlasWrapper.java:97)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray swap(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSwap_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		INDArray result = fixture.swap(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.swap(BlasWrapper.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray swap(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSwap_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		INDArray x = new NDArray();
		INDArray y = new NDArray();

		INDArray result = fixture.swap(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.swap(BlasWrapper.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the int syev(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyev_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray a = new NDArray();
		INDArray w = new NDArray();

		int result = fixture.syev(jobz, uplo, a, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syev(BlasWrapper.java:941)
		assertEquals(0, result);
	}

	/**
	 * Run the int syev(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyev_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray a = new NDArray();
		INDArray w = new NDArray();

		int result = fixture.syev(jobz, uplo, a, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syev(BlasWrapper.java:941)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevd(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevd_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray w = new NDArray();

		int result = fixture.syevd(jobz, uplo, A, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevd(BlasWrapper.java:1039)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevd(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevd_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray w = new NDArray();

		int result = fixture.syevd(jobz, uplo, A, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevd(BlasWrapper.java:1039)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevd(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevd_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray w = new NDArray();

		int result = fixture.syevd(jobz, uplo, A, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevd(BlasWrapper.java:1039)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevr(char,char,char,INDArray,double,double,int,int,double,INDArray,INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevr_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		double vl = 1.0;
		double vu = 1.0;
		int il = 1;
		int iu = 1;
		double abstol = 1.0;
		INDArray w = new NDArray();
		INDArray z = new NDArray();
		int[] isuppz = new int[] {};

		int result = fixture.syevr(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z, isuppz);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int syevr(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevr_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new NDArray();
		INDArray z = new NDArray();
		int[] isuppz = new int[] {};

		int result = fixture.syevr(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z, isuppz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevr(BlasWrapper.java:1081)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevr(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevr_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new NDArray();
		INDArray z = new NDArray();
		int[] isuppz = new int[] {};

		int result = fixture.syevr(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z, isuppz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevr(BlasWrapper.java:1081)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevr(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevr_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new NDArray();
		INDArray z = new NDArray();
		int[] isuppz = new int[] {};

		int result = fixture.syevr(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z, isuppz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevr(BlasWrapper.java:1081)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,double,double,int,int,double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevx_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		double vl = 1.0;
		double vu = 1.0;
		int il = 1;
		int iu = 1;
		double abstol = 1.0;
		INDArray w = new NDArray();
		INDArray z = new NDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevx(BlasWrapper.java:980)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,double,double,int,int,double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevx_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		double vl = 1.0;
		double vu = 1.0;
		int il = 1;
		int iu = 1;
		double abstol = 1.0;
		INDArray w = new NDArray();
		INDArray z = new NDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevx(BlasWrapper.java:980)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,double,double,int,int,double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevx_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		double vl = 1.0;
		double vu = 1.0;
		int il = 1;
		int iu = 1;
		double abstol = 1.0;
		INDArray w = new NDArray();
		INDArray z = new NDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevx(BlasWrapper.java:980)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,double,double,int,int,double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevx_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		double vl = 1.0;
		double vu = 1.0;
		int il = 1;
		int iu = 1;
		double abstol = 1.0;
		INDArray w = new NDArray();
		INDArray z = new NDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevx(BlasWrapper.java:980)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevx_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new NDArray();
		INDArray z = new NDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevx(BlasWrapper.java:1011)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevx_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new NDArray();
		INDArray z = new NDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevx(BlasWrapper.java:1011)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevx_7()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new NDArray();
		INDArray z = new NDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevx(BlasWrapper.java:1011)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSyevx_8()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new NDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new NDArray();
		INDArray z = new NDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.jblas.BlasWrapper.syevx(BlasWrapper.java:1011)
		assertEquals(0, result);
	}

	/**
	 * Run the int sygvd(int,char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSygvd_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		int itype = 1;
		char jobz = '';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();
		INDArray W = new NDArray();

		int result = fixture.sygvd(itype, jobz, uplo, A, B, W);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sygvd(BlasWrapper.java:1237)
		assertEquals(0, result);
	}

	/**
	 * Run the int sygvd(int,char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSygvd_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		int itype = 1;
		char jobz = '';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();
		INDArray W = new NDArray();

		int result = fixture.sygvd(itype, jobz, uplo, A, B, W);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sygvd(BlasWrapper.java:1237)
		assertEquals(0, result);
	}

	/**
	 * Run the int sygvd(int,char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSygvd_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		int itype = 1;
		char jobz = 'N';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();
		INDArray W = new NDArray();

		int result = fixture.sygvd(itype, jobz, uplo, A, B, W);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sygvd(BlasWrapper.java:1237)
		assertEquals(0, result);
	}

	/**
	 * Run the int sygvd(int,char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSygvd_4()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		int itype = 1;
		char jobz = 'V';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();
		INDArray W = new NDArray();

		int result = fixture.sygvd(itype, jobz, uplo, A, B, W);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sygvd(BlasWrapper.java:1237)
		assertEquals(0, result);
	}

	/**
	 * Run the int sygvd(int,char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSygvd_5()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		int itype = 1;
		char jobz = '';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();
		INDArray W = new NDArray();

		int result = fixture.sygvd(itype, jobz, uplo, A, B, W);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sygvd(BlasWrapper.java:1237)
		assertEquals(0, result);
	}

	/**
	 * Run the int sygvd(int,char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSygvd_6()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		int itype = 1;
		char jobz = '';
		char uplo = '';
		INDArray A = new NDArray();
		INDArray B = new NDArray();
		INDArray W = new NDArray();

		int result = fixture.sygvd(itype, jobz, uplo, A, B, W);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sygvd(BlasWrapper.java:1237)
		assertEquals(0, result);
	}

	/**
	 * Run the INDArray sysv(char,INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSysv_1()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char uplo = '';
		INDArray a = new NDArray();
		int[] ipiv = new int[] {};
		INDArray b = new NDArray();

		INDArray result = fixture.sysv(uplo, a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sysv(BlasWrapper.java:898)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sysv(char,INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSysv_2()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char uplo = '';
		INDArray a = new NDArray();
		int[] ipiv = new int[] {};
		INDArray b = new NDArray();

		INDArray result = fixture.sysv(uplo, a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sysv(BlasWrapper.java:898)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sysv(char,INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test
	public void testSysv_3()
		throws Exception {
		BlasWrapper fixture = new BlasWrapper();
		char uplo = '';
		INDArray a = new NDArray();
		int[] ipiv = new int[] {};
		INDArray b = new NDArray();

		INDArray result = fixture.sysv(uplo, a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.jblas.BlasWrapper.sysv(BlasWrapper.java:898)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
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
	 * @generatedBy CodePro at 3/7/15 7:19 PM
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
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BlasWrapperTest.class);
	}
}