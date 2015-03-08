package org.nd4j.linalg.api.ops.impl.accum;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Op;

/**
 * The class <code>MeanTest</code> contains tests for the class <code>{@link Mean}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:09 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class MeanTest {
	/**
	 * Run the Mean(INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testMean_1()
		throws Exception {
		INDArray x = null;

		Mean result = new Mean(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Mean(INDArray,INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testMean_2()
		throws Exception {
		INDArray x = null;
		INDArray y = null;

		Mean result = new Mean(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:64)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the Mean(INDArray,INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testMean_3()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		int n = 1;

		Mean result = new Mean(x, y, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.nd4j.linalg.factory.Nd4j
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.init(BaseAccumulation.java:177)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:58)
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:51)
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:56)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the Mean(INDArray,INDArray,INDArray,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testMean_4()
		throws Exception {
		INDArray x = null;
		INDArray y = null;
		INDArray z = null;
		int n = 1;

		Mean result = new Mean(x, y, z, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.init(BaseAccumulation.java:177)
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:58)
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:51)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:30)
		assertNotNull(result);
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
		Mean fixture = new Mean((INDArray) null);

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
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
		Mean fixture = new Mean((INDArray) null);
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
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
		Mean fixture = new Mean((INDArray) null);
		int index = 1;
		int dimension = 1;

		Op result = fixture.opForDimension(index, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the void update(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);
		Number result = new Byte((byte) 1);

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
	}

	/**
	 * Run the void update(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);
		Number result = new Byte((byte) 1);

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
	}

	/**
	 * Run the void update(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);
		Number result = new Byte((byte) 1);

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
	}

	/**
	 * Run the void update(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);
		Number result = new Byte((byte) 1);

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
	}

	/**
	 * Run the void update(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);
		IComplexNumber result = null;

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
	}

	/**
	 * Run the void update(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);
		IComplexNumber result = null;

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
	}

	/**
	 * Run the void update(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testUpdate_7()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);
		IComplexNumber result = null;

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
	}

	/**
	 * Run the void update(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testUpdate_8()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);
		IComplexNumber result = null;

		fixture.update(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
	}

	/**
	 * Run the Number zero() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testZero_1()
		throws Exception {
		Mean fixture = new Mean((INDArray) null);

		Number result = fixture.zero();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Mean.<init>(Mean.java:38)
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
		new org.junit.runner.JUnitCore().run(MeanTest.class);
	}
}