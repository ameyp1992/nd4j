package org.nd4j.linalg.api.ops.impl.transforms;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Op;

/**
 * The class <code>SoftMaxDerivativeTest</code> contains tests for the class <code>{@link SoftMaxDerivative}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:10 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class SoftMaxDerivativeTest {
	/**
	 * Run the SoftMaxDerivative(INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSoftMaxDerivative_1()
		throws Exception {
		INDArray x = null;

		SoftMaxDerivative result = new SoftMaxDerivative(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the SoftMaxDerivative(INDArray,INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSoftMaxDerivative_2()
		throws Exception {
		INDArray x = null;
		INDArray z = null;

		SoftMaxDerivative result = new SoftMaxDerivative(x, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:39)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:28)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:49)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the SoftMaxDerivative(INDArray,INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSoftMaxDerivative_3()
		throws Exception {
		INDArray x = null;
		INDArray z = null;
		int n = 1;

		SoftMaxDerivative result = new SoftMaxDerivative(x, z, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.init(SoftMax.java:158)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:58)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:49)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:32)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:53)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the SoftMaxDerivative(INDArray,INDArray,INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSoftMaxDerivative_4()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;

		SoftMaxDerivative result = new SoftMaxDerivative(x, y, z, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.init(SoftMax.java:158)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:58)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:57)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:39)
		assertNotNull(result);
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		double origin = 1.0;

		double result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		float origin = 1.0f;

		float result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		IComplexNumber origin = null;

		IComplexNumber result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		double origin = 1.0;
		double other = 1.0;

		double result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		float origin = 1.0f;
		float other = 1.0f;

		float result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		IComplexNumber origin = null;
		double other = 1.0;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		IComplexNumber origin = null;
		float other = 1.0f;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		IComplexNumber origin = null;
		IComplexNumber other = null;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		SoftMaxDerivative fixture = new SoftMaxDerivative((INDArray) null);
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMax.<init>(SoftMax.java:61)
		//       at org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative.<init>(SoftMaxDerivative.java:43)
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
		new org.junit.runner.JUnitCore().run(SoftMaxDerivativeTest.class);
	}
}