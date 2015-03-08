package org.nd4j.linalg.ops.transforms;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>TransformsTest</code> contains tests for the class <code>{@link Transforms}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:14 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class TransformsTest {
	/**
	 * Run the INDArray abs(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testAbs_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.abs(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.abs(Transforms.java:448)
		//       at org.nd4j.linalg.ops.transforms.Transforms.abs(Transforms.java:248)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray abs(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testAbs_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.abs(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Abs.<init>(Abs.java:44)
		//       at org.nd4j.linalg.ops.transforms.Transforms.abs(Transforms.java:448)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray abs(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testAbs_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.abs(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.abs(Transforms.java:448)
		assertNotNull(result);
	}

	/**
	 * Run the double cosineSim(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testCosineSim_1()
		throws Exception {
		INDArray d1 = null;
		INDArray d2 = null;

		double result = Transforms.cosineSim(d1, d2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.cosineSim(Transforms.java:160)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the INDArray downSample(INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testDownSample_1()
		throws Exception {
		INDArray d1 = null;
		int[] stride = new int[] {0, 1};

		INDArray result = Transforms.downSample(d1, stride);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.ops.transforms.Transforms.downSample(Transforms.java:91)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray eps(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testEps_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.eps(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.eps(Transforms.java:322)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray eps(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testEps_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.eps(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.comparison.Eps.<init>(Eps.java:37)
		//       at org.nd4j.linalg.ops.transforms.Transforms.eps(Transforms.java:378)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray eps(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testEps_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.eps(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.eps(Transforms.java:378)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray exp(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testExp_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.exp(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.exp(Transforms.java:253)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray exp(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testExp_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.exp(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Exp.<init>(Exp.java:45)
		//       at org.nd4j.linalg.ops.transforms.Transforms.exp(Transforms.java:459)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray exp(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testExp_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.exp(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.exp(Transforms.java:459)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray floor(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testFloor_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.floor(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.floor(Transforms.java:220)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray floor(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testFloor_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.floor(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Floor.<init>(Floor.java:44)
		//       at org.nd4j.linalg.ops.transforms.Transforms.floor(Transforms.java:390)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray floor(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testFloor_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.floor(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.floor(Transforms.java:390)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray greaterThanOrEqual(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testGreaterThanOrEqual_1()
		throws Exception {
		INDArray first = null;
		INDArray ndArray = null;

		INDArray result = Transforms.greaterThanOrEqual(first, ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.greaterThanOrEqual(Transforms.java:332)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray greaterThanOrEqual(INDArray,INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testGreaterThanOrEqual_2()
		throws Exception {
		INDArray first = null;
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.greaterThanOrEqual(first, ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:39)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:28)
		//       at org.nd4j.linalg.api.ops.impl.transforms.comparison.GreaterThanOrEqual.<init>(GreaterThanOrEqual.java:32)
		//       at org.nd4j.linalg.ops.transforms.Transforms.greaterThanOrEqual(Transforms.java:366)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray greaterThanOrEqual(INDArray,INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testGreaterThanOrEqual_3()
		throws Exception {
		INDArray first = null;
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.greaterThanOrEqual(first, ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.greaterThanOrEqual(Transforms.java:366)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray hardTanh(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testHardTanh_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.hardTanh(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.hardTanh(Transforms.java:258)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray hardTanh(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testHardTanh_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.hardTanh(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.HardTanh.<init>(HardTanh.java:46)
		//       at org.nd4j.linalg.ops.transforms.Transforms.hardTanh(Transforms.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray hardTanh(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testHardTanh_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.hardTanh(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.hardTanh(Transforms.java:470)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray identity(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testIdentity_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.identity(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.identity(Transforms.java:264)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray identity(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testIdentity_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.identity(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Identity.<init>(Identity.java:43)
		//       at org.nd4j.linalg.ops.transforms.Transforms.identity(Transforms.java:480)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray identity(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testIdentity_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.identity(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.identity(Transforms.java:480)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray lessThanOrEqual(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testLessThanOrEqual_1()
		throws Exception {
		INDArray first = null;
		INDArray ndArray = null;

		INDArray result = Transforms.lessThanOrEqual(first, ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.lessThanOrEqual(Transforms.java:342)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray lessThanOrEqual(INDArray,INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testLessThanOrEqual_2()
		throws Exception {
		INDArray first = null;
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.lessThanOrEqual(first, ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:39)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:28)
		//       at org.nd4j.linalg.api.ops.impl.transforms.comparison.LessThanOrEqual.<init>(LessThanOrEqual.java:32)
		//       at org.nd4j.linalg.ops.transforms.Transforms.lessThanOrEqual(Transforms.java:354)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray lessThanOrEqual(INDArray,INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testLessThanOrEqual_3()
		throws Exception {
		INDArray first = null;
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.lessThanOrEqual(first, ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.lessThanOrEqual(Transforms.java:354)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray log(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testLog_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.log(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.log(Transforms.java:318)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray log(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testLog_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.log(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Log.<init>(Log.java:45)
		//       at org.nd4j.linalg.ops.transforms.Transforms.log(Transforms.java:543)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray log(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testLog_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.log(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.log(Transforms.java:543)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray max(INDArray,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMax_1()
		throws Exception {
		INDArray ndArray = null;
		double k = 1.0;

		INDArray result = Transforms.max(ndArray, k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.max(Transforms.java:424)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray max(INDArray,double,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMax_2()
		throws Exception {
		INDArray ndArray = null;
		double k = 1.0;
		boolean dup = false;

		INDArray result = Transforms.max(ndArray, k, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarMax.<init>(ScalarMax.java:21)
		//       at org.nd4j.linalg.ops.transforms.Transforms.max(Transforms.java:414)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray max(INDArray,double,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMax_3()
		throws Exception {
		INDArray ndArray = null;
		double k = 1.0;
		boolean dup = true;

		INDArray result = Transforms.max(ndArray, k, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.max(Transforms.java:414)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray maxPool(INDArray,int[],boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMaxPool_1()
		throws Exception {
		INDArray input = null;
		int[] ds = new int[] {};
		boolean ignoreBorder = true;

		INDArray result = Transforms.maxPool(input, ds, ignoreBorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.maxPool(Transforms.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray maxPool(INDArray,int[],boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMaxPool_2()
		throws Exception {
		INDArray input = null;
		int[] ds = new int[] {};
		boolean ignoreBorder = true;

		INDArray result = Transforms.maxPool(input, ds, ignoreBorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.maxPool(Transforms.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray maxPool(INDArray,int[],boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMaxPool_3()
		throws Exception {
		INDArray input = null;
		int[] ds = new int[] {0, 0};
		boolean ignoreBorder = true;

		INDArray result = Transforms.maxPool(input, ds, ignoreBorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.maxPool(Transforms.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray maxPool(INDArray,int[],boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMaxPool_4()
		throws Exception {
		INDArray input = null;
		int[] ds = new int[] {1, 1};
		boolean ignoreBorder = false;

		INDArray result = Transforms.maxPool(input, ds, ignoreBorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.maxPool(Transforms.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray maxPool(INDArray,int[],boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMaxPool_5()
		throws Exception {
		INDArray input = null;
		int[] ds = new int[] {1, 1};
		boolean ignoreBorder = true;

		INDArray result = Transforms.maxPool(input, ds, ignoreBorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.maxPool(Transforms.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray maxPool(INDArray,int[],boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMaxPool_6()
		throws Exception {
		INDArray input = null;
		int[] ds = new int[] {1, 1};
		boolean ignoreBorder = true;

		INDArray result = Transforms.maxPool(input, ds, ignoreBorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.maxPool(Transforms.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray maxPool(INDArray,int[],boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMaxPool_7()
		throws Exception {
		INDArray input = null;
		int[] ds = new int[] {1, 1};
		boolean ignoreBorder = true;

		INDArray result = Transforms.maxPool(input, ds, ignoreBorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.maxPool(Transforms.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray maxPool(INDArray,int[],boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testMaxPool_8()
		throws Exception {
		INDArray input = null;
		int[] ds = new int[] {1, 1};
		boolean ignoreBorder = true;

		INDArray result = Transforms.maxPool(input, ds, ignoreBorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.maxPool(Transforms.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray neg(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNeg_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.neg(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.neg(Transforms.java:208)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray neg(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNeg_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.neg(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Negative.<init>(Negative.java:42)
		//       at org.nd4j.linalg.ops.transforms.Transforms.neg(Transforms.java:554)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray neg(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNeg_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.neg(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.neg(Transforms.java:554)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray normalizeZeroMeanAndUnitVariance(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testNormalizeZeroMeanAndUnitVariance_1()
		throws Exception {
		INDArray toNormalize = null;

		INDArray result = Transforms.normalizeZeroMeanAndUnitVariance(toNormalize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.normalizeZeroMeanAndUnitVariance(Transforms.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray pool(INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testPool_1()
		throws Exception {
		INDArray toPool = null;
		int[] stride = new int[] {};

		INDArray result = Transforms.pool(toPool, stride);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.pool(Transforms.java:108)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray pool(INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testPool_2()
		throws Exception {
		INDArray toPool = null;
		int[] stride = new int[] {0, 1};

		INDArray result = Transforms.pool(toPool, stride);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.pool(Transforms.java:108)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray pool(INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testPool_3()
		throws Exception {
		INDArray toPool = null;
		int[] stride = new int[] {0, 1};

		INDArray result = Transforms.pool(toPool, stride);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.pool(Transforms.java:108)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray pool(INDArray,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testPool_4()
		throws Exception {
		INDArray toPool = null;
		int[] stride = new int[] {0, 1};

		INDArray result = Transforms.pool(toPool, stride);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.pool(Transforms.java:108)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray pow(INDArray,Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testPow_1()
		throws Exception {
		INDArray ndArray = null;
		Number power = new Byte((byte) 1);

		INDArray result = Transforms.pow(ndArray, power);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.pow(Transforms.java:276)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray pow(INDArray,Number,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testPow_2()
		throws Exception {
		INDArray ndArray = null;
		Number power = new Byte((byte) 1);
		boolean dup = false;

		INDArray result = Transforms.pow(ndArray, power, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Pow.<init>(Pow.java:55)
		//       at org.nd4j.linalg.ops.transforms.Transforms.pow(Transforms.java:492)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray pow(INDArray,Number,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testPow_3()
		throws Exception {
		INDArray ndArray = null;
		Number power = new Byte((byte) 1);
		boolean dup = true;

		INDArray result = Transforms.pow(ndArray, power, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.pow(Transforms.java:492)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray round(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testRound_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.round(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.round(Transforms.java:286)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray round(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testRound_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.round(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Round.<init>(Round.java:45)
		//       at org.nd4j.linalg.ops.transforms.Transforms.round(Transforms.java:502)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray round(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testRound_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.round(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.round(Transforms.java:502)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sigmoid(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSigmoid_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.sigmoid(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.sigmoid(Transforms.java:295)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sigmoid(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSigmoid_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.sigmoid(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Sigmoid.<init>(Sigmoid.java:47)
		//       at org.nd4j.linalg.ops.transforms.Transforms.sigmoid(Transforms.java:513)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sigmoid(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSigmoid_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.sigmoid(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.sigmoid(Transforms.java:513)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sign(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSign_1()
		throws Exception {
		INDArray toSign = null;

		INDArray result = Transforms.sign(toSign);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.sign(Transforms.java:232)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sign(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSign_2()
		throws Exception {
		INDArray toSign = null;
		boolean dup = false;

		INDArray result = Transforms.sign(toSign, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Sign.<init>(Sign.java:45)
		//       at org.nd4j.linalg.ops.transforms.Transforms.sign(Transforms.java:403)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sign(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSign_3()
		throws Exception {
		INDArray toSign = null;
		boolean dup = true;

		INDArray result = Transforms.sign(toSign, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.sign(Transforms.java:403)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sqrt(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSqrt_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.sqrt(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.sqrt(Transforms.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sqrt(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSqrt_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.sqrt(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Sqrt.<init>(Sqrt.java:45)
		//       at org.nd4j.linalg.ops.transforms.Transforms.sqrt(Transforms.java:523)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray sqrt(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testSqrt_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.sqrt(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.sqrt(Transforms.java:523)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray stabilize(INDArray,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testStabilize_1()
		throws Exception {
		INDArray ndArray = null;
		double k = 1.0;

		INDArray result = Transforms.stabilize(ndArray, k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.stabilize(Transforms.java:238)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray stabilize(INDArray,double,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testStabilize_2()
		throws Exception {
		INDArray ndArray = null;
		double k = 1.0;
		boolean dup = false;

		INDArray result = Transforms.stabilize(ndArray, k, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.<init>(Stabilize.java:51)
		//       at org.nd4j.linalg.ops.transforms.Transforms.stabilize(Transforms.java:437)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray stabilize(INDArray,double,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testStabilize_3()
		throws Exception {
		INDArray ndArray = null;
		double k = 1.0;
		boolean dup = true;

		INDArray result = Transforms.stabilize(ndArray, k, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.stabilize(Transforms.java:437)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray tanh(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testTanh_1()
		throws Exception {
		INDArray ndArray = null;

		INDArray result = Transforms.tanh(ndArray);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.ops.transforms.Transforms.tanh(Transforms.java:313)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray tanh(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testTanh_2()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = false;

		INDArray result = Transforms.tanh(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Tanh.<init>(Tanh.java:45)
		//       at org.nd4j.linalg.ops.transforms.Transforms.tanh(Transforms.java:533)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray tanh(INDArray,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testTanh_3()
		throws Exception {
		INDArray ndArray = null;
		boolean dup = true;

		INDArray result = Transforms.tanh(ndArray, dup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.tanh(Transforms.java:533)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray unitVec(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testUnitVec_1()
		throws Exception {
		INDArray toScale = null;

		INDArray result = Transforms.unitVec(toScale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.unitVec(Transforms.java:189)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray unitVec(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testUnitVec_2()
		throws Exception {
		INDArray toScale = null;

		INDArray result = Transforms.unitVec(toScale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.unitVec(Transforms.java:189)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray unitVec(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testUnitVec_3()
		throws Exception {
		INDArray toScale = null;

		INDArray result = Transforms.unitVec(toScale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.unitVec(Transforms.java:189)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray upSample(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testUpSample_1()
		throws Exception {
		INDArray d = null;
		INDArray scale = null;

		INDArray result = Transforms.upSample(d, scale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.upSample(Transforms.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray upSample(INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	@Test
	public void testUpSample_2()
		throws Exception {
		INDArray d = null;
		INDArray scale = null;

		INDArray result = Transforms.upSample(d, scale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.ops.transforms.Transforms.upSample(Transforms.java:138)
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
		new org.junit.runner.JUnitCore().run(TransformsTest.class);
	}
}