package org.nd4j.linalg.api.ops.impl.scalar;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Op;

/**
 * The class <code>ScalarReverseDivisionTest</code> contains tests for the class <code>{@link ScalarReverseDivision}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:09 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class ScalarReverseDivisionTest {
	/**
	 * Run the ScalarReverseDivision(INDArray,Number) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testScalarReverseDivision_1()
		throws Exception {
		INDArray x = null;
		Number num = new Byte((byte) 1);

		ScalarReverseDivision result = new ScalarReverseDivision(x, num);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the ScalarReverseDivision(INDArray,IComplexNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testScalarReverseDivision_2()
		throws Exception {
		INDArray x = null;
		IComplexNumber num = null;

		ScalarReverseDivision result = new ScalarReverseDivision(x, num);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:45)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the ScalarReverseDivision(INDArray,INDArray,INDArray,int,Number) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testScalarReverseDivision_3()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;
		Number num = new Byte((byte) 1);

		ScalarReverseDivision result = new ScalarReverseDivision(x, y, z, n, num);

		// add additional test code here
		assertNotNull(result);
		assertEquals("rdiv_scalar", result.name());
		assertEquals(new Byte((byte) 1), result.scalar());
		assertEquals(null, result.complexScalar());
		assertEquals(null, result.z());
		assertEquals(null, result.y());
		assertEquals(1, result.n());
		assertEquals("rdiv_scalar", result.toString());
		assertEquals(null, result.x());
		assertEquals(0, result.numProcessed());
		assertEquals(null, result.extraArgs());
	}

	/**
	 * Run the ScalarReverseDivision(INDArray,INDArray,INDArray,int,IComplexNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testScalarReverseDivision_4()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;
		IComplexNumber num = null;

		ScalarReverseDivision result = new ScalarReverseDivision(x, y, z, n, num);

		// add additional test code here
		assertNotNull(result);
		assertEquals("rdiv_scalar", result.name());
		assertEquals(null, result.scalar());
		assertEquals(null, result.complexScalar());
		assertEquals(null, result.z());
		assertEquals(null, result.y());
		assertEquals(1, result.n());
		assertEquals("rdiv_scalar", result.toString());
		assertEquals(null, result.x());
		assertEquals(0, result.numProcessed());
		assertEquals(null, result.extraArgs());
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the double op(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOp_1()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		double origin = 1.0;

		double result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the float op(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOp_2()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		float origin = 1.0f;

		float result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the IComplexNumber op(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOp_3()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		IComplexNumber origin = null;

		IComplexNumber result = fixture.op(origin);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the double op(double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOp_4()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		double origin = 1.0;
		double other = 1.0;

		double result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the float op(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOp_5()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		float origin = 1.0f;
		float other = 1.0f;

		float result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the IComplexNumber op(IComplexNumber,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOp_6()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		IComplexNumber origin = null;
		double other = 1.0;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber op(IComplexNumber,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOp_7()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		IComplexNumber origin = null;
		float other = 1.0f;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNumber op(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOp_8()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		IComplexNumber origin = null;
		IComplexNumber other = null;

		IComplexNumber result = fixture.op(origin, other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the Op opForDimension(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOpForDimension_1()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the Op opForDimension(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testOpForDimension_2()
		throws Exception {
		ScalarReverseDivision fixture = new ScalarReverseDivision((INDArray) null, new Byte((byte) 1));
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseDivision.<init>(ScalarReverseDivision.java:34)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
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
	 * @generatedBy CodePro at 3/7/15 7:09 PM
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
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ScalarReverseDivisionTest.class);
	}
}