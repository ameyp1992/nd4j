package org.nd4j.linalg.api.ops.impl.transforms.arithmetic;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Op;

/**
 * The class <code>MulOpTest</code> contains tests for the class <code>{@link MulOp}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:10 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class MulOpTest {
	/**
	 * Run the MulOp(INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testMulOp_1()
		throws Exception {
		INDArray x = null;

		MulOp result = new MulOp(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the MulOp(INDArray,INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testMulOp_2()
		throws Exception {
		INDArray x = null;
		INDArray z = null;

		MulOp result = new MulOp(x, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:39)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:28)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the MulOp(INDArray,INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testMulOp_3()
		throws Exception {
		INDArray x = null;
		INDArray z = null;
		int n = 1;

		MulOp result = new MulOp(x, z, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No components to multiply
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.init(MulOp.java:111)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:58)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:49)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:32)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the MulOp(INDArray,INDArray,INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testMulOp_4()
		throws Exception {
		INDArray x = null;
		INDArray xDup = null;
		INDArray x1 = null;

		MulOp result = new MulOp(x, xDup, x1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the MulOp(INDArray,INDArray,INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testMulOp_5()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;

		MulOp result = new MulOp(x, y, z, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No components to multiply
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.init(MulOp.java:111)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:58)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the void init(INDArray,INDArray,INDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;

		fixture.init(x, y, z, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
	}

	/**
	 * Run the void init(INDArray,INDArray,INDArray,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;

		fixture.init(x, y, z, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the double op(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOp_1()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		double origin = 1.0;

		double result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the float op(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOp_2()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		float origin = 1.0f;

		float result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the IComplexNumber op(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOp_3()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		IComplexNumber origin = null;

		IComplexNumber result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the double op(double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOp_4()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		double origin = 1.0;
		double other = 1.0;

		double result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the float op(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOp_5()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		float origin = 1.0f;
		float other = 1.0f;

		float result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the IComplexNumber op(IComplexNumber,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOp_6()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		IComplexNumber origin = null;
		double other = 1.0;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber op(IComplexNumber,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOp_7()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		IComplexNumber origin = null;
		float other = 1.0f;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber op(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOp_8()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		IComplexNumber origin = null;
		IComplexNumber other = null;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the Op opForDimension(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOpForDimension_1()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the Op opForDimension(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testOpForDimension_2()
		throws Exception {
		MulOp fixture = new MulOp((INDArray) null);
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp.<init>(MulOp.java:34)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MulOpTest.class);
	}
}