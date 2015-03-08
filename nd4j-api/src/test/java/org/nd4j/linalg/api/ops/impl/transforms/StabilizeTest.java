package org.nd4j.linalg.api.ops.impl.transforms;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Op;

/**
 * The class <code>StabilizeTest</code> contains tests for the class <code>{@link Stabilize}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:10 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class StabilizeTest {
	/**
	 * Run the Stabilize(INDArray,double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testStabilize_1()
		throws Exception {
		INDArray x = null;
		double k = 1.0;

		Stabilize result = new Stabilize(x, k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.<init>(Stabilize.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the Stabilize(INDArray,INDArray,double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testStabilize_2()
		throws Exception {
		INDArray x = null;
		INDArray z = null;
		double k = 1.0;

		Stabilize result = new Stabilize(x, z, k);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:39)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:28)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.<init>(Stabilize.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the Stabilize(INDArray,INDArray,int,double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testStabilize_3()
		throws Exception {
		INDArray x = null;
		INDArray z = null;
		int n = 1;
		double k = 1.0;

		Stabilize result = new Stabilize(x, z, n, k);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stabilize", result.name());
		assertEquals(null, result.z());
		assertEquals(null, result.y());
		assertEquals(1, result.n());
		assertEquals("stabilize", result.toString());
		assertEquals(null, result.x());
		assertEquals(0, result.numProcessed());
	}

	/**
	 * Run the Stabilize(INDArray,INDArray,INDArray,int,double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testStabilize_4()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;
		double k = 1.0;

		Stabilize result = new Stabilize(x, y, z, n, k);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stabilize", result.name());
		assertEquals(null, result.z());
		assertEquals(null, result.y());
		assertEquals(1, result.n());
		assertEquals("stabilize", result.toString());
		assertEquals(null, result.x());
		assertEquals(0, result.numProcessed());
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;

		String result = fixture.name();

		// add additional test code here
		assertEquals("stabilize", result);
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		double origin = 1.0;

		double result = fixture.op(origin);

		// add additional test code here
		assertEquals(-1.0, result, 0.1);
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		float origin = 1.0f;

		float result = fixture.op(origin);

		// add additional test code here
		assertEquals(-1.0f, result, 0.1f);
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		IComplexNumber origin = null;

		IComplexNumber result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.stabilize(Stabilize.java:120)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.op(Stabilize.java:113)
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		double origin = 1.0;
		double other = 1.0;

		double result = fixture.op(origin, other);

		// add additional test code here
		assertEquals(-1.0, result, 0.1);
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		float origin = 1.0f;
		float other = 1.0f;

		float result = fixture.op(origin, other);

		// add additional test code here
		assertEquals(-1.0f, result, 0.1f);
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		IComplexNumber origin = null;
		double other = 1.0;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.stabilize(Stabilize.java:120)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.op(Stabilize.java:62)
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		IComplexNumber origin = null;
		float other = 1.0f;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.stabilize(Stabilize.java:120)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.op(Stabilize.java:67)
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		IComplexNumber origin = null;
		IComplexNumber other = null;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.stabilize(Stabilize.java:120)
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.op(Stabilize.java:72)
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.opForDimension(Stabilize.java:137)
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
		Stabilize fixture = new Stabilize((INDArray) null, (INDArray) null, (INDArray) null, 1, 1.0);
		fixture.realMin = 1.0;
		fixture.cutOff = 1.0;
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.impl.transforms.Stabilize.opForDimension(Stabilize.java:137)
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
		new org.junit.runner.JUnitCore().run(StabilizeTest.class);
	}
}