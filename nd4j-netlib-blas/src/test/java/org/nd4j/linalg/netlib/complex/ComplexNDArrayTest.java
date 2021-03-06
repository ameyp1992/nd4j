package org.nd4j.linalg.netlib.complex;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.buffer.DoubleBuffer;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>ComplexNDArrayTest</code> contains tests for the class <code>{@link ComplexNDArray}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:24 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class ComplexNDArrayTest {
	/**
	 * Run the ComplexNDArray() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_1()
		throws Exception {

		ComplexNDArray result = new ComplexNDArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
		assertEquals(null, result.data());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(null, result.shape());
		assertEquals(null, result.stride());
		assertEquals(' ', result.ordering());
	}

	/**
	 * Run the ComplexNDArray(DataBuffer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_2()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);

		ComplexNDArray result = new ComplexNDArray(data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
		assertEquals(1, result.secondaryStride());
		assertEquals(2, result.majorStride());
		assertEquals(0, result.offset());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(1, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the ComplexNDArray(INDArray) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_3()
		throws Exception {
		INDArray m = new ComplexNDArray();

		ComplexNDArray result = new ComplexNDArray(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.util.ArrayUtil.prod(ArrayUtil.java:115)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:100)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:122)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:131)
		//       at org.nd4j.linalg.netlib.complex.ComplexNDArray.<init>(ComplexNDArray.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the ComplexNDArray(float[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_4()
		throws Exception {
		float[] doubles = new float[] {};

		ComplexNDArray result = new ComplexNDArray(doubles);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(null, result.shape());
		assertEquals(null, result.stride());
		assertEquals(' ', result.ordering());
	}

	/**
	 * Run the ComplexNDArray(float[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_5()
		throws Exception {
		float[][] floats = new float[][] {};

		ComplexNDArray result = new ComplexNDArray(floats);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the ComplexNDArray(int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_6()
		throws Exception {
		int[] shape = new int[] {};

		ComplexNDArray result = new ComplexNDArray(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_7()
		throws Exception {
		int newRows = 1;
		int newColumns = 1;

		ComplexNDArray result = new ComplexNDArray(newRows, newColumns);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0, result.blasOffset());
		assertEquals(1, result.secondaryStride());
		assertEquals(2, result.majorStride());
		assertEquals(0, result.offset());
		assertEquals("0.0 + -0.0i", result.toString());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(1, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the ComplexNDArray(List<IComplexNDArray>,int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_8()
		throws Exception {
		List<IComplexNDArray> slices = new LinkedList();
		int[] shape = new int[] {};

		ComplexNDArray result = new ComplexNDArray(slices, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(DataBuffer,int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_9()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};

		ComplexNDArray result = new ComplexNDArray(data, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(INDArray,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_10()
		throws Exception {
		INDArray m = new ComplexNDArray();
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(m, ordering);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.util.ArrayUtil.prod(ArrayUtil.java:115)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:100)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:122)
		//       at org.nd4j.linalg.netlib.complex.ComplexNDArray.<init>(ComplexNDArray.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ComplexNDArray(INDArray,int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_11()
		throws Exception {
		INDArray m = new ComplexNDArray();
		int[] stride = new int[] {};

		ComplexNDArray result = new ComplexNDArray(m, stride);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.util.ArrayUtil.prod(ArrayUtil.java:115)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:366)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:378)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:112)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:142)
		//       at org.nd4j.linalg.netlib.complex.ComplexNDArray.<init>(ComplexNDArray.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the ComplexNDArray(float[],Character) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_12()
		throws Exception {
		float[] data = new float[] {};
		Character order = new Character('');

		ComplexNDArray result = new ComplexNDArray(data, order);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[]\n", result.toString());
		assertEquals(0, result.blasOffset());
		assertEquals(1, result.secondaryStride());
		assertEquals(2, result.majorStride());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(1, result.rows());
		assertEquals(0, result.columns());
		assertEquals('', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(false, result.isScalar());
	}

	/**
	 * Run the ComplexNDArray(float[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_13()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};

		ComplexNDArray result = new ComplexNDArray(data, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_14()
		throws Exception {
		int[] shape = new int[] {};
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_15()
		throws Exception {
		int[] shape = new int[] {};
		int offset = 1;

		ComplexNDArray result = new ComplexNDArray(shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_16()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		ComplexNDArray result = new ComplexNDArray(shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(IComplexNumber[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_17()
		throws Exception {
		IComplexNumber[] newData = new IComplexNumber[] {};
		int[] shape = new int[] {};

		ComplexNDArray result = new ComplexNDArray(newData, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int,int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_18()
		throws Exception {
		int newRows = 1;
		int newColumns = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(newRows, newColumns, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0, result.blasOffset());
		assertEquals(1, result.secondaryStride());
		assertEquals(2, result.majorStride());
		assertEquals(0, result.offset());
		assertEquals("0.0 + -0.0i", result.toString());
		assertEquals(1, result.length());
		assertEquals(1, result.rows());
		assertEquals(1, result.columns());
		assertEquals('', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(1, result.slices());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the ComplexNDArray(List<IComplexNDArray>,int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_19()
		throws Exception {
		List<IComplexNDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(slices, shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(List<IComplexNDArray>,int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_20()
		throws Exception {
		List<IComplexNDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		ComplexNDArray result = new ComplexNDArray(slices, shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(DataBuffer,int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_21()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int offset = 1;

		ComplexNDArray result = new ComplexNDArray(buffer, shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(DataBuffer,int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_22()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		ComplexNDArray result = new ComplexNDArray(data, shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(INDArray,int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_23()
		throws Exception {
		INDArray m = new ComplexNDArray();
		int[] stride = new int[] {};
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(m, stride, ordering);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.util.ArrayUtil.prod(ArrayUtil.java:115)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:366)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:378)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:112)
		//       at org.nd4j.linalg.netlib.complex.ComplexNDArray.<init>(ComplexNDArray.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the ComplexNDArray(float[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_24()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(data, shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(float[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_25()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;

		ComplexNDArray result = new ComplexNDArray(data, shape, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(float[],int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_26()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		ComplexNDArray result = new ComplexNDArray(data, shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_27()
		throws Exception {
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(shape, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_28()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(shape, stride, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_29()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		ComplexNDArray result = new ComplexNDArray(shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(IComplexNumber[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_30()
		throws Exception {
		IComplexNumber[] newData = new IComplexNumber[] {};
		int[] shape = new int[] {};
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(newData, shape, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(IComplexNumber[],int[],int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_31()
		throws Exception {
		IComplexNumber[] newData = new IComplexNumber[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		ComplexNDArray result = new ComplexNDArray(newData, shape, stride);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(List<IComplexNDArray>,int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_32()
		throws Exception {
		List<IComplexNDArray> slices = new LinkedList();
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(slices, shape, stride, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(DataBuffer,int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_33()
		throws Exception {
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(buffer, shape, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(DataBuffer,int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_34()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		ComplexNDArray result = new ComplexNDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(float[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_35()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(data, shape, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(float[],int[],int[],char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_36()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(data, shape, stride, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(float[],int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_37()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		ComplexNDArray result = new ComplexNDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_38()
		throws Exception {
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(IComplexNumber[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_39()
		throws Exception {
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(data, shape, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(IComplexNumber[],int[],int[],int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_40()
		throws Exception {
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		ComplexNDArray result = new ComplexNDArray(data, shape, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(DataBuffer,int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_41()
		throws Exception {
		DataBuffer data = new DoubleBuffer(1);
		int[] newDims = new int[] {};
		int[] newStrides = new int[] {};
		int offset = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(data, newDims, newStrides, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(float[],int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_42()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(data, shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(float[],int[],int[],int,Character) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_43()
		throws Exception {
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		Character order = new Character('');

		ComplexNDArray result = new ComplexNDArray(data, shape, stride, offset, order);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
	 * Run the ComplexNDArray(IComplexNumber[],int[],int[],int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testComplexNDArray_44()
		throws Exception {
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		ComplexNDArray result = new ComplexNDArray(data, shape, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
		new org.junit.runner.JUnitCore().run(ComplexNDArrayTest.class);
	}
}