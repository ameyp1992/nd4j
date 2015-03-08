package org.nd4j.linalg.api.ops.impl.accum.distances;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Op;

/**
 * The class <code>ManhattanDistanceTest</code> contains tests for the class <code>{@link ManhattanDistance}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:10 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class ManhattanDistanceTest {
	/**
	 * Run the ManhattanDistance(INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testManhattanDistance_1()
		throws Exception {
		INDArray x = null;

		ManhattanDistance result = new ManhattanDistance(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the ManhattanDistance(INDArray,INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testManhattanDistance_2()
		throws Exception {
		INDArray x = null;
		INDArray y = null;

		ManhattanDistance result = new ManhattanDistance(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:64)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the ManhattanDistance(INDArray,INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testManhattanDistance_3()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		int n = 1;

		ManhattanDistance result = new ManhattanDistance(x, y, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.init(BaseAccumulation.java:177)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:58)
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:51)
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:56)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the ManhattanDistance(INDArray,INDArray,INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testManhattanDistance_4()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;

		ManhattanDistance result = new ManhattanDistance(x, y, z, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.init(BaseAccumulation.java:177)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:58)
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:51)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:34)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		double origin = 1.0;

		double result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		float origin = 1.0f;

		float result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		IComplexNumber origin = null;

		IComplexNumber result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		double origin = 1.0;
		double other = 1.0;

		double result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		float origin = 1.0f;
		float other = 1.0f;

		float result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		IComplexNumber origin = null;
		double other = 1.0;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		IComplexNumber origin = null;
		float other = 1.0f;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		IComplexNumber origin = null;
		IComplexNumber other = null;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the void update(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		Number result = new Byte((byte) 1);

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
	}

	/**
	 * Run the void update(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);
		IComplexNumber result = null;

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
	}

	/**
	 * Run the Number zero() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testZero_1()
		throws Exception {
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);

		Number result = fixture.zero();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber zeroComplex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testZeroComplex_1()
		throws Exception {
		ManhattanDistance fixture = new ManhattanDistance((INDArray) null);

		IComplexNumber result = fixture.zeroComplex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance.<init>(ManhattanDistance.java:42)
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
		new org.junit.runner.JUnitCore().run(ManhattanDistanceTest.class);
	}
}