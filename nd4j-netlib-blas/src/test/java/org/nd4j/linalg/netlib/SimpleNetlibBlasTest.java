package org.nd4j.linalg.netlib;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexFloat;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.netlib.complex.ComplexDouble;
import org.nd4j.linalg.netlib.complex.ComplexFloat;
import org.nd4j.linalg.netlib.complex.ComplexNDArray;

/**
 * The class <code>SimpleNetlibBlasTest</code> contains tests for the class <code>{@link SimpleNetlibBlas}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:24 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class SimpleNetlibBlasTest {
	/**
	 * Run the double asum(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAsum_1()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();

		double result = SimpleNetlibBlas.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.asum(SimpleNetlibBlas.java:433)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double asum(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAsum_2()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();

		double result = SimpleNetlibBlas.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.asum(SimpleNetlibBlas.java:433)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double asum(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAsum_3()
		throws Exception {
		INDArray x = new ComplexNDArray();

		double result = SimpleNetlibBlas.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.asum(SimpleNetlibBlas.java:475)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double asum(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAsum_4()
		throws Exception {
		INDArray x = new ComplexNDArray();

		double result = SimpleNetlibBlas.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.asum(SimpleNetlibBlas.java:475)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the void axpy(double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_1()
		throws Exception {
		double da = 1.0;
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		SimpleNetlibBlas.axpy(da, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:536)
	}

	/**
	 * Run the void axpy(double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_2()
		throws Exception {
		double da = 1.0;
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		SimpleNetlibBlas.axpy(da, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:536)
	}

	/**
	 * Run the void axpy(float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_3()
		throws Exception {
		float da = 1.0f;
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		SimpleNetlibBlas.axpy(da, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:575)
	}

	/**
	 * Run the void axpy(float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_4()
		throws Exception {
		float da = 1.0f;
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		SimpleNetlibBlas.axpy(da, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:575)
	}

	/**
	 * Run the void axpy(IComplexNumber,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_5()
		throws Exception {
		IComplexNumber da = new ComplexDouble(1.0);
		IComplexNDArray A = new ComplexNDArray();
		IComplexNDArray B = new ComplexNDArray();

		SimpleNetlibBlas.axpy(da, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:612)
	}

	/**
	 * Run the void axpy(IComplexNumber,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_6()
		throws Exception {
		IComplexNumber da = new ComplexDouble(1.0);
		IComplexNDArray A = new ComplexNDArray();
		IComplexNDArray B = new ComplexNDArray();

		SimpleNetlibBlas.axpy(da, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:612)
	}

	/**
	 * Run the void copy(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCopy_1()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		SimpleNetlibBlas.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.copy(SimpleNetlibBlas.java:395)
	}

	/**
	 * Run the void copy(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCopy_2()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		SimpleNetlibBlas.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.copy(SimpleNetlibBlas.java:395)
	}

	/**
	 * Run the void copy(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCopy_3()
		throws Exception {
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		SimpleNetlibBlas.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.copy(SimpleNetlibBlas.java:688)
	}

	/**
	 * Run the void copy(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCopy_4()
		throws Exception {
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		SimpleNetlibBlas.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.copy(SimpleNetlibBlas.java:688)
	}

	/**
	 * Run the IComplexDouble dot(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDot_1()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		IComplexDouble result = SimpleNetlibBlas.dot(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dot(SimpleNetlibBlas.java:755)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexDouble dot(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDot_2()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		IComplexDouble result = SimpleNetlibBlas.dot(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dot(SimpleNetlibBlas.java:755)
		assertNotNull(result);
	}

	/**
	 * Run the double dot(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDot_3()
		throws Exception {
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		double result = SimpleNetlibBlas.dot(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dot(SimpleNetlibBlas.java:718)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double dot(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDot_4()
		throws Exception {
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		double result = SimpleNetlibBlas.dot(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dot(SimpleNetlibBlas.java:718)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the IComplexNumber dotu(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDotu_1()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		IComplexNumber result = SimpleNetlibBlas.dotu(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dotu(SimpleNetlibBlas.java:832)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber dotu(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDotu_2()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		IComplexNumber result = SimpleNetlibBlas.dotu(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dotu(SimpleNetlibBlas.java:832)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray dscal(IComplexDouble,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDscal_1()
		throws Exception {
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray();

		IComplexNDArray result = SimpleNetlibBlas.dscal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dscal(SimpleNetlibBlas.java:947)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemm(IComplexNDArray,IComplexNDArray,IComplexNumber,IComplexNDArray,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemm_1()
		throws Exception {
		IComplexNDArray A = new ComplexNDArray();
		IComplexNDArray B = new ComplexNDArray();
		IComplexNumber a = new ComplexDouble(1.0);
		IComplexNDArray C = new ComplexNDArray();
		IComplexNumber b = new ComplexDouble(1.0);

		IComplexNDArray result = SimpleNetlibBlas.gemm(A, B, a, C, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemm(SimpleNetlibBlas.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemm(IComplexNDArray,IComplexNDArray,IComplexNumber,IComplexNDArray,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemm_2()
		throws Exception {
		IComplexNDArray A = new ComplexNDArray();
		IComplexNDArray B = new ComplexNDArray();
		IComplexNumber a = new ComplexDouble(1.0);
		IComplexNDArray C = new ComplexNDArray();
		IComplexNumber b = new ComplexDouble(1.0);

		IComplexNDArray result = SimpleNetlibBlas.gemm(A, B, a, C, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemm(SimpleNetlibBlas.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemm(IComplexNDArray,IComplexNDArray,IComplexNumber,IComplexNDArray,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemm_3()
		throws Exception {
		IComplexNDArray A = new ComplexNDArray();
		IComplexNDArray B = new ComplexNDArray();
		IComplexNumber a = new ComplexDouble(1.0);
		IComplexNDArray C = new ComplexNDArray();
		IComplexNumber b = new ComplexDouble(1.0);

		IComplexNDArray result = SimpleNetlibBlas.gemm(A, B, a, C, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemm(SimpleNetlibBlas.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemm(INDArray,INDArray,INDArray,double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemm_4()
		throws Exception {
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();
		INDArray C = new ComplexNDArray();
		double alpha = 1.0;
		double beta = 1.0;

		INDArray result = SimpleNetlibBlas.gemm(A, B, C, alpha, beta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemm(SimpleNetlibBlas.java:175)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemm(INDArray,INDArray,INDArray,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemm_5()
		throws Exception {
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();
		INDArray C = new ComplexNDArray();
		float alpha = 1.0f;
		float beta = 1.0f;

		INDArray result = SimpleNetlibBlas.gemm(A, B, C, alpha, beta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemm(SimpleNetlibBlas.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(INDArray,INDArray,INDArray,double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemv_1()
		throws Exception {
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();
		INDArray C = new ComplexNDArray();
		double alpha = 1.0;
		double beta = 1.0;

		INDArray result = SimpleNetlibBlas.gemv(A, B, C, alpha, beta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemv(SimpleNetlibBlas.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(INDArray,INDArray,INDArray,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemv_2()
		throws Exception {
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();
		INDArray C = new ComplexNDArray();
		float alpha = 1.0f;
		float beta = 1.0f;

		INDArray result = SimpleNetlibBlas.gemv(A, B, C, alpha, beta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemv(SimpleNetlibBlas.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray ger(INDArray,INDArray,INDArray,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGer_1()
		throws Exception {
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();
		INDArray C = new ComplexNDArray();
		double alpha = 1.0;

		INDArray result = SimpleNetlibBlas.ger(A, B, C, alpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.ger(SimpleNetlibBlas.java:784)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray ger(INDArray,INDArray,INDArray,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGer_2()
		throws Exception {
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();
		INDArray C = new ComplexNDArray();
		float alpha = 1.0f;

		INDArray result = SimpleNetlibBlas.ger(A, B, C, alpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.ger(SimpleNetlibBlas.java:804)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gerc(IComplexNDArray,IComplexNDArray,IComplexNDArray,IComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGerc_1()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();
		IComplexNDArray a = new ComplexNDArray();
		IComplexDouble alpha = new ComplexDouble(1.0);

		IComplexNDArray result = SimpleNetlibBlas.gerc(x, y, a, alpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gerc(SimpleNetlibBlas.java:906)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gerc(IComplexNDArray,IComplexNDArray,IComplexNDArray,IComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGerc_2()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();
		IComplexNDArray a = new ComplexNDArray();
		IComplexDouble alpha = new ComplexDouble(1.0);

		IComplexNDArray result = SimpleNetlibBlas.gerc(x, y, a, alpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gerc(SimpleNetlibBlas.java:906)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray geru(IComplexNumber,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGeru_1()
		throws Exception {
		IComplexNumber alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();
		IComplexNDArray a = new ComplexNDArray();

		IComplexNDArray result = SimpleNetlibBlas.geru(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.geru(SimpleNetlibBlas.java:865)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray geru(IComplexNumber,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGeru_2()
		throws Exception {
		IComplexNumber alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();
		IComplexNDArray a = new ComplexNDArray();

		IComplexNDArray result = SimpleNetlibBlas.geru(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.geru(SimpleNetlibBlas.java:865)
		assertNotNull(result);
	}

	/**
	 * Run the int iamax(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testIamax_1()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();

		int result = SimpleNetlibBlas.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.iamax(SimpleNetlibBlas.java:421)
		assertEquals(0, result);
	}

	/**
	 * Run the int iamax(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testIamax_2()
		throws Exception {
		IComplexNDArray x = new ComplexNDArray();

		int result = SimpleNetlibBlas.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.iamax(SimpleNetlibBlas.java:421)
		assertEquals(0, result);
	}

	/**
	 * Run the int iamax(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testIamax_3()
		throws Exception {
		INDArray x = new ComplexNDArray();

		int result = SimpleNetlibBlas.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.iamax(SimpleNetlibBlas.java:509)
		assertEquals(0, result);
	}

	/**
	 * Run the int iamax(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testIamax_4()
		throws Exception {
		INDArray x = new ComplexNDArray();

		int result = SimpleNetlibBlas.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.iamax(SimpleNetlibBlas.java:509)
		assertEquals(0, result);
	}

	/**
	 * Run the double nrm2(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNrm2_1()
		throws Exception {
		IComplexNDArray A = new ComplexNDArray();

		double result = SimpleNetlibBlas.nrm2(A);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.nrm2(SimpleNetlibBlas.java:375)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNrm2_2()
		throws Exception {
		IComplexNDArray A = new ComplexNDArray();

		double result = SimpleNetlibBlas.nrm2(A);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.nrm2(SimpleNetlibBlas.java:375)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNrm2_3()
		throws Exception {
		IComplexNDArray A = new ComplexNDArray();

		double result = SimpleNetlibBlas.nrm2(A);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.nrm2(SimpleNetlibBlas.java:375)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNrm2_4()
		throws Exception {
		INDArray x = new ComplexNDArray();

		double result = SimpleNetlibBlas.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.nrm2(SimpleNetlibBlas.java:491)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double nrm2(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNrm2_5()
		throws Exception {
		INDArray x = new ComplexNDArray();

		double result = SimpleNetlibBlas.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.nrm2(SimpleNetlibBlas.java:491)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the INDArray scal(double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testScal_1()
		throws Exception {
		double alpha = 1.0;
		INDArray x = new ComplexNDArray();

		INDArray result = SimpleNetlibBlas.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.scal(SimpleNetlibBlas.java:647)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray scal(float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testScal_2()
		throws Exception {
		float alpha = 1.0f;
		INDArray x = new ComplexNDArray();

		INDArray result = SimpleNetlibBlas.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.scal(SimpleNetlibBlas.java:668)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray sscal(IComplexFloat,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSscal_1()
		throws Exception {
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray x = new ComplexNDArray();

		IComplexNDArray result = SimpleNetlibBlas.sscal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.sscal(SimpleNetlibBlas.java:959)
		assertNotNull(result);
	}

	/**
	 * Run the void swap(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSwap_1()
		throws Exception {
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		SimpleNetlibBlas.swap(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.swap(SimpleNetlibBlas.java:448)
	}

	/**
	 * Run the void swap(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSwap_2()
		throws Exception {
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		SimpleNetlibBlas.swap(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.swap(SimpleNetlibBlas.java:448)
	}

	/**
	 * Run the int syevr(char,char,char,INDArray,double,int,int,int,double,INDArray,INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyevr_1()
		throws Exception {
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new ComplexNDArray();
		double vl = 1.0;
		int vu = 1;
		int il = 1;
		int iu = 1;
		double abstol = 1.0;
		INDArray w = new ComplexNDArray();
		INDArray z = new ComplexNDArray();
		int[] isuppz = new int[] {};

		int result = SimpleNetlibBlas.syevr(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z, isuppz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.syevr(SimpleNetlibBlas.java:256)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevr(char,char,char,INDArray,float,int,int,int,float,INDArray,INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyevr_2()
		throws Exception {
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new ComplexNDArray();
		float vl = 1.0f;
		int vu = 1;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new ComplexNDArray();
		INDArray z = new ComplexNDArray();
		int[] isuppz = new int[] {};

		int result = SimpleNetlibBlas.syevr(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z, isuppz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.syevr(SimpleNetlibBlas.java:322)
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
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
	 * @generatedBy CodePro at 3/7/15 7:24 PM
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
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SimpleNetlibBlasTest.class);
	}
}