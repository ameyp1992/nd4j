package org.nd4j.linalg.netlib;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.buffer.DoubleBuffer;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>NetlibBlasNDArrayTest</code> contains tests for the class <code>{@link NetlibBlasNDArray}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:24 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class NetlibBlasNDArrayTest {
	/**
	 * Run the NetlibBlasNDArray() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_1()
		throws Exception {

		NetlibBlasNDArray result = new NetlibBlasNDArray();

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
	 * Run the NetlibBlasNDArray(DataBuffer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_2()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);

		NetlibBlasNDArray result = new NetlibBlasNDArray(buffer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
		assertEquals(0, result.offset());
		assertEquals("0.0", result.toString());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(1, result.slices());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(1, result.majorStride());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(NetlibBlasNDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_3()
		throws Exception {
		NetlibBlasNDArray doubleMatrix = new NetlibBlasNDArray();

		NetlibBlasNDArray result = new NetlibBlasNDArray(doubleMatrix);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(0, result.rows());
		assertEquals(0, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(true, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(1, result.secondaryStride());
		assertEquals(true, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(1, result.majorStride());
		assertEquals(false, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(double[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_4()
		throws Exception {
		double[][] data = new double[][] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the NetlibBlasNDArray(float[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_5()
		throws Exception {
		float[][] floats = new float[][] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(floats);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the NetlibBlasNDArray(int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_6()
		throws Exception {
		int[] shape = new int[] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_7()
		throws Exception {
		int newRows = 1;
		int newColumns = 1;

		NetlibBlasNDArray result = new NetlibBlasNDArray(newRows, newColumns);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(1, result.slices());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(1, result.majorStride());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(List<INDArray>,int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_8()
		throws Exception {
		List<INDArray> slices = new LinkedList();
		int[] shape = new int[] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(slices, shape);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:209)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:375)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArray.<init>(NetlibBlasNDArray.java:240)
		assertNotNull(result);
	}

	/**
	 * Run the NetlibBlasNDArray(DataBuffer,int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_9()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
		assertEquals(0, result.offset());
		assertEquals("0.0", result.toString());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(float[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_10()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_11()
		throws Exception {
		int[] shape = new int[] {};
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_12()
		throws Exception {
		int[] shape = new int[] {};
		int offset = 1;

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int[],DataBuffer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_13()
		throws Exception {
		int[] shape = new int[] {};
		DataBuffer buffer = new DoubleBuffer(1);

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape, buffer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
		assertEquals(0, result.offset());
		assertEquals("0.0", result.toString());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_14()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int,int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_15()
		throws Exception {
		int newRows = 1;
		int newColumns = 1;
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(newRows, newColumns, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.columns());
		assertEquals('', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(1, result.slices());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(1, result.majorStride());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(List<INDArray>,int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_16()
		throws Exception {
		List<INDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(slices, shape, ordering);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:209)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArray.<init>(NetlibBlasNDArray.java:142)
		assertNotNull(result);
	}

	/**
	 * Run the NetlibBlasNDArray(List<INDArray>,int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_17()
		throws Exception {
		List<INDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(slices, shape, stride);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:389)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArray.<init>(NetlibBlasNDArray.java:254)
		assertNotNull(result);
	}

	/**
	 * Run the NetlibBlasNDArray(DataBuffer,int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_18()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int offset = 1;

		NetlibBlasNDArray result = new NetlibBlasNDArray(buffer, shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(double[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_19()
		throws Exception {
		double[] data = new double[] {};
		int[] shape = new int[] {};
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(float[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_20()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(float[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_21()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(float[],int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_22()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_23()
		throws Exception {
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_24()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape, stride, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_25()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(List<INDArray>,int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_26()
		throws Exception {
		List<INDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(slices, shape, stride, ordering);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArray.<init>(NetlibBlasNDArray.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the NetlibBlasNDArray(DataBuffer,int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_27()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(double[],int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_28()
		throws Exception {
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(float[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_29()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(float[],int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_30()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, stride, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(float[],int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_31()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('f', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_32()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(DataBuffer,int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_33()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(buffer, shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(double[],int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_34()
		throws Exception {
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the NetlibBlasNDArray(float[],int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArray_35()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		NetlibBlasNDArray result = new NetlibBlasNDArray(data, shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
		assertEquals(0, result.length());
		assertEquals('', result.ordering());
		assertEquals(false, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(false, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
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
		new org.junit.runner.JUnitCore().run(NetlibBlasNDArrayTest.class);
	}
}