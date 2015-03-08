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
 * The class <code>NetlibBlasWrapperTest</code> contains tests for the class <code>{@link NetlibBlasWrapper}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:24 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class NetlibBlasWrapperTest {
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
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexNDArray x = new ComplexNDArray();

		double result = fixture.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.asum(SimpleNetlibBlas.java:433)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.asum(NetlibBlasWrapper.java:143)
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
	public void testAsum_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray x = new ComplexNDArray();

		double result = fixture.asum(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.asum(SimpleNetlibBlas.java:475)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.asum(NetlibBlasWrapper.java:137)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the INDArray axpy(double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		double da = 1.0;
		INDArray dx = new ComplexNDArray();
		INDArray dy = new ComplexNDArray();

		INDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:536)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.axpy(NetlibBlasWrapper.java:88)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray axpy(float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		float da = 1.0f;
		INDArray dx = new ComplexNDArray();
		INDArray dy = new ComplexNDArray();

		INDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:575)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.axpy(NetlibBlasWrapper.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray axpy(IComplexNumber,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testAxpy_3()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexNumber da = new ComplexDouble(1.0);
		IComplexNDArray dx = new ComplexNDArray();
		IComplexNDArray dy = new ComplexNDArray();

		IComplexNDArray result = fixture.axpy(da, dx, dy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:612)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.axpy(NetlibBlasWrapper.java:101)
		assertNotNull(result);
	}

	/**
	 * Run the void checkInfo(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCheckInfo_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		String name = "";
		int info = 1;

		fixture.checkInfo(name, info);

		// add additional test code here
	}

	/**
	 * Run the IComplexNDArray copy(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCopy_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		IComplexNDArray result = fixture.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.copy(SimpleNetlibBlas.java:395)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.copy(NetlibBlasWrapper.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray copy(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCopy_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		INDArray result = fixture.copy(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.copy(SimpleNetlibBlas.java:688)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.copy(NetlibBlasWrapper.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the void dcopy(int,float[],int,int,float[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDcopy_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		int n = 1;
		float[] dx = new float[] {};
		int dxIdx = 1;
		int incx = 1;
		float[] dy = new float[] {};
		int dyIdx = 1;
		int incy = 1;

		fixture.dcopy(n, dx, dxIdx, incx, dy, dyIdx, incy);

		// add additional test code here
	}

	/**
	 * Run the double dot(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDot_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		double result = fixture.dot(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dot(SimpleNetlibBlas.java:718)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.dot(NetlibBlasWrapper.java:107)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the IComplexNumber dotc(IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDotc_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		IComplexNumber result = fixture.dotc(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dot(SimpleNetlibBlas.java:755)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.dotc(NetlibBlasWrapper.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the double dotd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testDotd_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		double result = fixture.dotd(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dot(SimpleNetlibBlas.java:718)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.dotd(NetlibBlasWrapper.java:112)
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
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();

		IComplexNumber result = fixture.dotu(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dotu(SimpleNetlibBlas.java:832)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.dotu(NetlibBlasWrapper.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGeev_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new ComplexNDArray();
		INDArray WR = new ComplexNDArray();
		INDArray WI = new ComplexNDArray();
		INDArray VL = new ComplexNDArray();
		INDArray VR = new ComplexNDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.geev(NetlibBlasWrapper.java:606)
		assertEquals(0, result);
	}

	/**
	 * Run the int geev(char,char,INDArray,INDArray,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGeev_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobvl = '';
		char jobvr = '';
		INDArray A = new ComplexNDArray();
		INDArray WR = new ComplexNDArray();
		INDArray WI = new ComplexNDArray();
		INDArray VL = new ComplexNDArray();
		INDArray VR = new ComplexNDArray();

		int result = fixture.geev(jobvl, jobvr, A, WR, WI, VL, VR);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.geev(NetlibBlasWrapper.java:606)
		assertEquals(0, result);
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGelsd_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gelsd(NetlibBlasWrapper.java:767)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGelsd_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gelsd(NetlibBlasWrapper.java:767)
	}

	/**
	 * Run the void gelsd(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGelsd_3()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		fixture.gelsd(A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gelsd(NetlibBlasWrapper.java:767)
	}

	/**
	 * Run the INDArray gemm(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemm_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		double alpha = 1.0;
		INDArray a = new ComplexNDArray();
		INDArray b = new ComplexNDArray();
		double beta = 1.0;
		INDArray c = new ComplexNDArray();

		INDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemm(SimpleNetlibBlas.java:175)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gemm(NetlibBlasWrapper.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemm(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemm_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		float alpha = 1.0f;
		INDArray a = new ComplexNDArray();
		INDArray b = new ComplexNDArray();
		float beta = 1.0f;
		INDArray c = new ComplexNDArray();

		INDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemm(SimpleNetlibBlas.java:211)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gemm(NetlibBlasWrapper.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemm(IComplexNumber,IComplexNDArray,IComplexNDArray,IComplexNumber,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemm_3()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexNumber alpha = new ComplexDouble(1.0);
		IComplexNDArray a = new ComplexNDArray();
		IComplexNDArray b = new ComplexNDArray();
		IComplexNumber beta = new ComplexDouble(1.0);
		IComplexNDArray c = new ComplexNDArray();

		IComplexNDArray result = fixture.gemm(alpha, a, b, beta, c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemm(SimpleNetlibBlas.java:117)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gemm(NetlibBlasWrapper.java:213)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(double,INDArray,INDArray,double,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemv_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		double alpha = 1.0;
		INDArray a = new ComplexNDArray();
		INDArray x = new ComplexNDArray();
		double beta = 1.0;
		INDArray y = new ComplexNDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemv(SimpleNetlibBlas.java:53)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gemv(NetlibBlasWrapper.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gemv(float,INDArray,INDArray,float,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemv_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		float alpha = 1.0f;
		INDArray a = new ComplexNDArray();
		INDArray x = new ComplexNDArray();
		float beta = 1.0f;
		INDArray y = new ComplexNDArray();

		INDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gemv(SimpleNetlibBlas.java:83)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gemv(NetlibBlasWrapper.java:164)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemv(IComplexDouble,IComplexNDArray,IComplexNDArray,IComplexDouble,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemv_3()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray a = new ComplexNDArray();
		IComplexNDArray x = new ComplexNDArray();
		IComplexDouble beta = new ComplexDouble(1.0);
		IComplexNDArray y = new ComplexNDArray();

		IComplexNDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gemv(NetlibBlasWrapper.java:220)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemv(IComplexDouble,IComplexNDArray,IComplexNDArray,IComplexDouble,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemv_4()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray a = new ComplexNDArray();
		IComplexNDArray x = new ComplexNDArray();
		IComplexDouble beta = new ComplexDouble(1.0);
		IComplexNDArray y = new ComplexNDArray();

		IComplexNDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gemv(NetlibBlasWrapper.java:220)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gemv(IComplexFloat,IComplexNDArray,IComplexNDArray,IComplexFloat,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGemv_5()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray a = new ComplexNDArray();
		IComplexNDArray x = new ComplexNDArray();
		IComplexFloat beta = new ComplexFloat(1.0f);
		IComplexNDArray y = new ComplexNDArray();

		IComplexNDArray result = fixture.gemv(alpha, a, x, beta, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gemv(NetlibBlasWrapper.java:245)
		assertNotNull(result);
	}

	/**
	 * Run the void geqrf(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGeqrf_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray A = new ComplexNDArray();
		INDArray tau = new ComplexNDArray();

		fixture.geqrf(A, tau);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.geqrf(NetlibBlasWrapper.java:860)
	}

	/**
	 * Run the void geqrf(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGeqrf_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray A = new ComplexNDArray();
		INDArray tau = new ComplexNDArray();

		fixture.geqrf(A, tau);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.geqrf(NetlibBlasWrapper.java:860)
	}

	/**
	 * Run the INDArray ger(double,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGer_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		double alpha = 1.0;
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();
		INDArray a = new ComplexNDArray();

		INDArray result = fixture.ger(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.ger(SimpleNetlibBlas.java:784)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.ger(NetlibBlasWrapper.java:169)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray ger(float,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGer_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		float alpha = 1.0f;
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();
		INDArray a = new ComplexNDArray();

		INDArray result = fixture.ger(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.ger(SimpleNetlibBlas.java:804)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.ger(NetlibBlasWrapper.java:174)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gerc(IComplexDouble,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGerc_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();
		IComplexNDArray a = new ComplexNDArray();

		IComplexNDArray result = fixture.gerc(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gerc(SimpleNetlibBlas.java:906)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gerc(NetlibBlasWrapper.java:196)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray gerc(IComplexFloat,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGerc_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();
		IComplexNDArray a = new ComplexNDArray();

		IComplexNDArray result = fixture.gerc(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.gerc(SimpleNetlibBlas.java:906)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gerc(NetlibBlasWrapper.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray geru(IComplexDouble,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGeru_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();
		IComplexNDArray a = new ComplexNDArray();

		IComplexNDArray result = fixture.geru(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.geru(SimpleNetlibBlas.java:865)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.geru(NetlibBlasWrapper.java:180)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray geru(IComplexFloat,IComplexNDArray,IComplexNDArray,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGeru_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray x = new ComplexNDArray();
		IComplexNDArray y = new ComplexNDArray();
		IComplexNDArray a = new ComplexNDArray();

		IComplexNDArray result = fixture.geru(alpha, x, y, a);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.geru(SimpleNetlibBlas.java:865)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.geru(NetlibBlasWrapper.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gesv(INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGesv_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray a = new ComplexNDArray();
		int[] ipiv = new int[] {};
		INDArray b = new ComplexNDArray();

		INDArray result = fixture.gesv(a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gesv(NetlibBlasWrapper.java:270)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray gesv(INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testGesv_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray a = new ComplexNDArray();
		int[] ipiv = new int[] {};
		INDArray b = new ComplexNDArray();

		INDArray result = fixture.gesv(a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.gesv(NetlibBlasWrapper.java:270)
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
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexNDArray x = new ComplexNDArray();

		int result = fixture.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.iamax(SimpleNetlibBlas.java:421)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.iamax(NetlibBlasWrapper.java:153)
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
	public void testIamax_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray x = new ComplexNDArray();

		int result = fixture.iamax(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.iamax(SimpleNetlibBlas.java:509)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.iamax(NetlibBlasWrapper.java:148)
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
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexNDArray x = new ComplexNDArray();

		double result = fixture.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.nrm2(SimpleNetlibBlas.java:375)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.nrm2(NetlibBlasWrapper.java:132)
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
	public void testNrm2_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray x = new ComplexNDArray();

		double result = fixture.nrm2(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.nrm2(SimpleNetlibBlas.java:491)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.nrm2(NetlibBlasWrapper.java:127)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the void ormqr(char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testOrmqr_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char side = '';
		char trans = '';
		INDArray A = new ComplexNDArray();
		INDArray tau = new ComplexNDArray();
		INDArray C = new ComplexNDArray();

		fixture.ormqr(side, trans, A, tau, C);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.ormqr(NetlibBlasWrapper.java:908)
	}

	/**
	 * Run the void ormqr(char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testOrmqr_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char side = '';
		char trans = '';
		INDArray A = new ComplexNDArray();
		INDArray tau = new ComplexNDArray();
		INDArray C = new ComplexNDArray();

		fixture.ormqr(side, trans, A, tau, C);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.ormqr(NetlibBlasWrapper.java:908)
	}

	/**
	 * Run the void posv(char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testPosv_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char uplo = '';
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		fixture.posv(uplo, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.posv(NetlibBlasWrapper.java:569)
	}

	/**
	 * Run the void posv(char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testPosv_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char uplo = '';
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();

		fixture.posv(uplo, A, B);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.posv(NetlibBlasWrapper.java:569)
	}

	/**
	 * Run the void saxpy(double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSaxpy_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		double alpha = 1.0;
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		fixture.saxpy(alpha, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:30)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:536)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.saxpy(NetlibBlasWrapper.java:952)
	}

	/**
	 * Run the void saxpy(float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSaxpy_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		float alpha = 1.0f;
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		fixture.saxpy(alpha, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:35)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.axpy(SimpleNetlibBlas.java:575)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.saxpy(NetlibBlasWrapper.java:964)
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
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		double alpha = 1.0;
		INDArray x = new ComplexNDArray();

		INDArray result = fixture.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertDouble(DataTypeValidation.java:39)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.scal(SimpleNetlibBlas.java:647)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.scal(NetlibBlasWrapper.java:52)
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
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		float alpha = 1.0f;
		INDArray x = new ComplexNDArray();

		INDArray result = fixture.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.scal(SimpleNetlibBlas.java:668)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.scal(NetlibBlasWrapper.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray scal(IComplexDouble,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testScal_3()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexDouble alpha = new ComplexDouble(1.0);
		IComplexNDArray x = new ComplexNDArray();

		IComplexNDArray result = fixture.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.dscal(SimpleNetlibBlas.java:947)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.scal(NetlibBlasWrapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray scal(IComplexFloat,IComplexNDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testScal_4()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		IComplexFloat alpha = new ComplexFloat(1.0f);
		IComplexNDArray x = new ComplexNDArray();

		IComplexNDArray result = fixture.scal(alpha, x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertFloat(DataTypeValidation.java:44)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.sscal(SimpleNetlibBlas.java:959)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.scal(NetlibBlasWrapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray swap(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSwap_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		INDArray x = new ComplexNDArray();
		INDArray y = new ComplexNDArray();

		INDArray result = fixture.swap(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.DataTypeValidation.assertSameDataType(DataTypeValidation.java:52)
		//       at org.nd4j.linalg.netlib.SimpleNetlibBlas.swap(SimpleNetlibBlas.java:448)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.swap(NetlibBlasWrapper.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the int syev(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyev_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray a = new ComplexNDArray();
		INDArray w = new ComplexNDArray();

		int result = fixture.syev(jobz, uplo, a, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.syev(NetlibBlasWrapper.java:366)
		assertEquals(0, result);
	}

	/**
	 * Run the int syev(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyev_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray a = new ComplexNDArray();
		INDArray w = new ComplexNDArray();

		int result = fixture.syev(jobz, uplo, a, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.syev(NetlibBlasWrapper.java:366)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevd(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyevd_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray A = new ComplexNDArray();
		INDArray w = new ComplexNDArray();

		int result = fixture.syevd(jobz, uplo, A, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.syevd(NetlibBlasWrapper.java:420)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevd(char,char,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyevd_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobz = '';
		char uplo = '';
		INDArray A = new ComplexNDArray();
		INDArray w = new ComplexNDArray();

		int result = fixture.syevd(jobz, uplo, A, w);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.syevd(NetlibBlasWrapper.java:420)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevr(char,char,char,INDArray,double,double,int,int,double,INDArray,INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyevr_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new ComplexNDArray();
		double vl = 1.0;
		double vu = 1.0;
		int il = 1;
		int iu = 1;
		double abstol = 1.0;
		INDArray w = new ComplexNDArray();
		INDArray z = new ComplexNDArray();
		int[] isuppz = new int[] {};

		int result = fixture.syevr(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z, isuppz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.syevr(NetlibBlasWrapper.java:476)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevr(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyevr_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new ComplexNDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new ComplexNDArray();
		INDArray z = new ComplexNDArray();
		int[] isuppz = new int[] {};

		int result = fixture.syevr(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z, isuppz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.syevr(NetlibBlasWrapper.java:522)
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,double,double,int,int,double,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyevx_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new ComplexNDArray();
		double vl = 1.0;
		double vu = 1.0;
		int il = 1;
		int iu = 1;
		double abstol = 1.0;
		INDArray w = new ComplexNDArray();
		INDArray z = new ComplexNDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int syevx(char,char,char,INDArray,float,float,int,int,float,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSyevx_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char jobz = '';
		char range = '';
		char uplo = '';
		INDArray a = new ComplexNDArray();
		float vl = 1.0f;
		float vu = 1.0f;
		int il = 1;
		int iu = 1;
		float abstol = 1.0f;
		INDArray w = new ComplexNDArray();
		INDArray z = new ComplexNDArray();

		int result = fixture.syevx(jobz, range, uplo, a, vl, vu, il, iu, abstol, w, z);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int sygvd(int,char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSygvd_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		int itype = 1;
		char jobz = '';
		char uplo = '';
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();
		INDArray W = new ComplexNDArray();

		int result = fixture.sygvd(itype, jobz, uplo, A, B, W);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.sygvd(NetlibBlasWrapper.java:672)
		assertEquals(0, result);
	}

	/**
	 * Run the int sygvd(int,char,char,INDArray,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSygvd_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		int itype = 1;
		char jobz = '';
		char uplo = '';
		INDArray A = new ComplexNDArray();
		INDArray B = new ComplexNDArray();
		INDArray W = new ComplexNDArray();

		int result = fixture.sygvd(itype, jobz, uplo, A, B, W);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.isMatrix(BaseNDArray.java:1175)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.rows(BaseNDArray.java:3127)
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.sygvd(NetlibBlasWrapper.java:672)
		assertEquals(0, result);
	}

	/**
	 * Run the INDArray sysv(char,INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSysv_1()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char uplo = '';
		INDArray a = new ComplexNDArray();
		int[] ipiv = new int[] {};
		INDArray b = new ComplexNDArray();

		INDArray result = fixture.sysv(uplo, a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.sysv(NetlibBlasWrapper.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sysv(char,INDArray,int[],INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testSysv_2()
		throws Exception {
		NetlibBlasWrapper fixture = new NetlibBlasWrapper();
		char uplo = '';
		INDArray a = new ComplexNDArray();
		int[] ipiv = new int[] {};
		INDArray b = new ComplexNDArray();

		INDArray result = fixture.sysv(uplo, a, ipiv, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.netlib.NetlibBlasWrapper.sysv(NetlibBlasWrapper.java:316)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(NetlibBlasWrapperTest.class);
	}
}