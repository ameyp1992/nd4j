package org.nd4j.linalg.api.ops.executioner;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Accumulation;
import org.nd4j.linalg.api.ops.Op;
import org.nd4j.linalg.api.ops.ScalarOp;
import org.nd4j.linalg.api.ops.TransformOp;
import org.nd4j.linalg.api.ops.impl.accum.Bias;
import org.nd4j.linalg.api.ops.impl.scalar.ScalarAdd;
import org.nd4j.linalg.api.ops.impl.transforms.ACos;

/**
 * The class <code>DefaultOpExecutionerTest</code> contains tests for the class <code>{@link DefaultOpExecutioner}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:10 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class DefaultOpExecutionerTest {
	/**
	 * Run the Op exec(Op) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_1()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new ACos((INDArray) null);

		Op result = fixture.exec(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.ACos.<init>(ACos.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_2()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new ScalarAdd((INDArray) null, new Byte((byte) 1));

		Op result = fixture.exec(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarAdd.<init>(ScalarAdd.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_3()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new ScalarAdd((INDArray) null, new Byte((byte) 1));

		Op result = fixture.exec(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarAdd.<init>(ScalarAdd.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_4()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new Bias((INDArray) null);

		Op result = fixture.exec(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Bias.<init>(Bias.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_5()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new Bias((INDArray) null);

		Op result = fixture.exec(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Bias.<init>(Bias.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_6()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new Bias((INDArray) null);

		Op result = fixture.exec(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Bias.<init>(Bias.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_7()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new ACos((INDArray) null);

		Op result = fixture.exec(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.ACos.<init>(ACos.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_8()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new ACos((INDArray) null);

		Op result = fixture.exec(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.ACos.<init>(ACos.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_9()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new Bias((INDArray) null);
		int dimension = 1;

		Op result = fixture.exec(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Bias.<init>(Bias.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_10()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new ACos((INDArray) null);
		int dimension = 1;

		Op result = fixture.exec(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.ACos.<init>(ACos.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_11()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new Bias((INDArray) null);
		int dimension = 1;

		Op result = fixture.exec(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Bias.<init>(Bias.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the Op exec(Op,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExec_12()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Op op = new Bias((INDArray) null);
		int dimension = 1;

		Op result = fixture.exec(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Bias.<init>(Bias.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the Accumulation execAndReturn(Accumulation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExecAndReturn_1()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Accumulation op = new Bias((INDArray) null);

		Accumulation result = fixture.execAndReturn(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Bias.<init>(Bias.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray execAndReturn(ScalarOp) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExecAndReturn_2()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		ScalarOp op = new ScalarAdd((INDArray) null, new Byte((byte) 1));

		INDArray result = fixture.execAndReturn(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarAdd.<init>(ScalarAdd.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray execAndReturn(TransformOp) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExecAndReturn_3()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		TransformOp op = new ACos((INDArray) null);

		INDArray result = fixture.execAndReturn(op);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.ACos.<init>(ACos.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the Accumulation execAndReturn(Accumulation,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExecAndReturn_4()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		Accumulation op = new Bias((INDArray) null);
		int dimension = 1;

		Accumulation result = fixture.execAndReturn(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseAccumulation.<init>(BaseAccumulation.java:60)
		//       at org.nd4j.linalg.api.ops.impl.accum.Bias.<init>(Bias.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray execAndReturn(ScalarOp,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExecAndReturn_5()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		ScalarOp op = new ScalarAdd((INDArray) null, new Byte((byte) 1));
		int dimension = 1;

		INDArray result = fixture.execAndReturn(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseScalarOp.<init>(BaseScalarOp.java:36)
		//       at org.nd4j.linalg.api.ops.impl.scalar.ScalarAdd.<init>(ScalarAdd.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray execAndReturn(TransformOp,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExecAndReturn_6()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		TransformOp op = new ACos((INDArray) null);
		int dimension = 1;

		INDArray result = fixture.execAndReturn(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.ACos.<init>(ACos.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray execAndReturn(TransformOp,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExecAndReturn_7()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		TransformOp op = new ACos((INDArray) null);
		int dimension = 1;

		INDArray result = fixture.execAndReturn(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.ACos.<init>(ACos.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray execAndReturn(TransformOp,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testExecAndReturn_8()
		throws Exception {
		DefaultOpExecutioner fixture = new DefaultOpExecutioner();
		TransformOp op = new ACos((INDArray) null);
		int dimension = 1;

		INDArray result = fixture.execAndReturn(op, dimension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.ops.BaseOp.<init>(BaseOp.java:73)
		//       at org.nd4j.linalg.api.ops.BaseTransformOp.<init>(BaseTransformOp.java:40)
		//       at org.nd4j.linalg.api.ops.impl.transforms.ACos.<init>(ACos.java:36)
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
		new org.junit.runner.JUnitCore().run(DefaultOpExecutionerTest.class);
	}
}