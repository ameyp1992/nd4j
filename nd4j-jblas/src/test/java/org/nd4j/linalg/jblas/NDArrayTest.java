package org.nd4j.linalg.jblas;

import java.util.LinkedList;
import java.util.List;
import org.jblas.DoubleMatrix;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.buffer.DoubleBuffer;
import org.nd4j.linalg.api.buffer.FloatBuffer;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>NDArrayTest</code> contains tests for the class <code>{@link NDArray}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:18 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class NDArrayTest {
	/**
	 * Run the NDArray() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_1()
		throws Exception {

		NDArray result = new NDArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(null, result.shape());
		assertEquals(null, result.stride());
		assertEquals(' ', result.ordering());
	}

	/**
	 * Run the NDArray(DoubleMatrix) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_2()
		throws Exception {
		DoubleMatrix doubleMatrix = new DoubleMatrix();
		doubleMatrix.data = new double[] {};
		doubleMatrix.columns = 1;
		doubleMatrix.rows = 1;

		NDArray result = new NDArray(doubleMatrix);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.majorStride());
		assertEquals(1, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(true, result.isVector());
		assertEquals(1, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(DataBuffer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_3()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);

		NDArray result = new NDArray(buffer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
		assertEquals(0, result.offset());
		assertEquals("0.0", result.toString());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.majorStride());
		assertEquals(1, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(true, result.isVector());
		assertEquals(1, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(double[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_4()
		throws Exception {
		double[][] data = new double[][] {};

		NDArray result = new NDArray(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the NDArray(float[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_5()
		throws Exception {
		float[][] floats = new float[][] {};

		NDArray result = new NDArray(floats);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the NDArray(float[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_6()
		throws Exception {
		float[] data = new float[] {};

		NDArray result = new NDArray(data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(null, result.shape());
		assertEquals(null, result.stride());
		assertEquals(' ', result.ordering());
	}

	/**
	 * Run the NDArray(int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_7()
		throws Exception {
		int[] shape = new int[] {};

		NDArray result = new NDArray(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_8()
		throws Exception {
		int newRows = 1;
		int newColumns = 1;

		NDArray result = new NDArray(newRows, newColumns);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.majorStride());
		assertEquals(1, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(true, result.isVector());
		assertEquals(1, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(List<INDArray>,int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_9()
		throws Exception {
		List<INDArray> slices = new LinkedList();
		int[] shape = new int[] {};

		NDArray result = new NDArray(slices, shape);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:209)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:375)
		//       at org.nd4j.linalg.jblas.NDArray.<init>(NDArray.java:232)
		assertNotNull(result);
	}

	/**
	 * Run the NDArray(DataBuffer,int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_10()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};

		NDArray result = new NDArray(data, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
		assertEquals(0, result.offset());
		assertEquals("0.0", result.toString());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(FloatBuffer,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_11()
		throws Exception {
		FloatBuffer floatBuffer = new FloatBuffer(1);
		char order = '';

		NDArray result = new NDArray(floatBuffer, order);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Float(0.0f), result.element());
		assertEquals(0, result.offset());
		assertEquals("0.0", result.toString());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.majorStride());
		assertEquals(1, result.columns());
		assertEquals('', result.ordering());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(true, result.isVector());
		assertEquals(1, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_12()
		throws Exception {
		float[] data = new float[] {};
		char order = '';

		NDArray result = new NDArray(data, order);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals("[]\n ", result.toString());
		assertEquals(0, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.majorStride());
		assertEquals(0, result.columns());
		assertEquals('', result.ordering());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(true, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(false, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_13()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};

		NDArray result = new NDArray(data, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_14()
		throws Exception {
		int[] shape = new int[] {};
		char ordering = '';

		NDArray result = new NDArray(shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_15()
		throws Exception {
		int[] shape = new int[] {};
		int offset = 1;

		NDArray result = new NDArray(shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],DataBuffer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_16()
		throws Exception {
		int[] shape = new int[] {};
		DataBuffer buffer = new DoubleBuffer(1);

		NDArray result = new NDArray(shape, buffer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
		assertEquals(0, result.offset());
		assertEquals("0.0", result.toString());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_17()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		NDArray result = new NDArray(shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int,int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_18()
		throws Exception {
		int newRows = 1;
		int newColumns = 1;
		char ordering = '';

		NDArray result = new NDArray(newRows, newColumns, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.majorStride());
		assertEquals(1, result.columns());
		assertEquals('', result.ordering());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(true, result.isVector());
		assertEquals(1, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(List<INDArray>,int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_19()
		throws Exception {
		List<INDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		char ordering = '';

		NDArray result = new NDArray(slices, shape, ordering);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:209)
		//       at org.nd4j.linalg.jblas.NDArray.<init>(NDArray.java:141)
		assertNotNull(result);
	}

	/**
	 * Run the NDArray(List<INDArray>,int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_20()
		throws Exception {
		List<INDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		NDArray result = new NDArray(slices, shape, stride);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:389)
		//       at org.nd4j.linalg.jblas.NDArray.<init>(NDArray.java:246)
		assertNotNull(result);
	}

	/**
	 * Run the NDArray(DataBuffer,int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_21()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int offset = 1;

		NDArray result = new NDArray(buffer, shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(DataBuffer,int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_22()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] strides = new int[] {};

		NDArray result = new NDArray(buffer, shape, strides);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
		assertEquals(0, result.offset());
		assertEquals("0.0", result.toString());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(DoubleBuffer,int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_23()
		throws Exception {
		DoubleBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int offset = 1;

		NDArray result = new NDArray(buffer, shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(double[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_24()
		throws Exception {
		double[] data = new double[] {};
		int[] shape = new int[] {};
		char ordering = '';

		NDArray result = new NDArray(data, shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_25()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		char ordering = '';

		NDArray result = new NDArray(data, shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_26()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;

		NDArray result = new NDArray(data, shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_27()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		NDArray result = new NDArray(data, shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_28()
		throws Exception {
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		NDArray result = new NDArray(shape, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_29()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		NDArray result = new NDArray(shape, stride, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_30()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		NDArray result = new NDArray(shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_31()
		throws Exception {
		int[] data = new int[] {};
		int[] shape = new int[] {};
		int[] strides = new int[] {};

		NDArray result = new NDArray(data, shape, strides);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(List<INDArray>,int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_32()
		throws Exception {
		List<INDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		NDArray result = new NDArray(slices, shape, stride, ordering);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.jblas.NDArray.<init>(NDArray.java:156)
		assertNotNull(result);
	}

	/**
	 * Run the NDArray(DataBuffer,int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_33()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		NDArray result = new NDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(double[],int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_34()
		throws Exception {
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		NDArray result = new NDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_35()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		NDArray result = new NDArray(data, shape, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_36()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		NDArray result = new NDArray(data, shape, stride, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_37()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		NDArray result = new NDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_38()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		NDArray result = new NDArray(shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(DataBuffer,int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_39()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		NDArray result = new NDArray(buffer, shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(double[],int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_40()
		throws Exception {
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		NDArray result = new NDArray(data, shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NDArray(float[],int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNDArray_41()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		NDArray result = new NDArray(data, shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isSquare());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isVector());
		assertEquals(0, result.slices());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
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
	 * @generatedBy CodePro at 3/7/15 7:18 PM
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
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NDArrayTest.class);
	}
}