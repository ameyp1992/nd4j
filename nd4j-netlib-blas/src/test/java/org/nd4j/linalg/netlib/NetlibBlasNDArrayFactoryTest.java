package org.nd4j.linalg.netlib;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.buffer.DoubleBuffer;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexFloat;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.netlib.complex.ComplexNDArray;

/**
 * The class <code>NetlibBlasNDArrayFactoryTest</code> contains tests for the class <code>{@link NetlibBlasNDArrayFactory}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:24 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class NetlibBlasNDArrayFactoryTest {
	/**
	 * Run the NetlibBlasNDArrayFactory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArrayFactory_1()
		throws Exception {

		NetlibBlasNDArrayFactory result = new NetlibBlasNDArrayFactory();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.dtype());
		assertEquals(' ', result.order());
	}

	/**
	 * Run the NetlibBlasNDArrayFactory(int,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArrayFactory_2()
		throws Exception {
		int dtype = 1;
		char order = '';

		NetlibBlasNDArrayFactory result = new NetlibBlasNDArrayFactory(dtype, order);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Order must either be c or f
		//       at org.nd4j.linalg.factory.BaseNDArrayFactory.<init>(BaseNDArrayFactory.java:86)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArrayFactory.<init>(NetlibBlasNDArrayFactory.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the NetlibBlasNDArrayFactory(int,Character) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArrayFactory_3()
		throws Exception {
		int dtype = 1;
		Character order = new Character('');

		NetlibBlasNDArrayFactory result = new NetlibBlasNDArrayFactory(dtype, order);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Order must either be c or f
		//       at org.nd4j.linalg.factory.BaseNDArrayFactory.<init>(BaseNDArrayFactory.java:62)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArrayFactory.<init>(NetlibBlasNDArrayFactory.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the NetlibBlasNDArrayFactory(Integer,Character) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testNetlibBlasNDArrayFactory_4()
		throws Exception {
		Integer dtype = new Integer(1);
		Character order = new Character('');

		NetlibBlasNDArrayFactory result = new NetlibBlasNDArrayFactory(dtype, order);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Order must either be c or f
		//       at org.nd4j.linalg.factory.BaseNDArrayFactory.<init>(BaseNDArrayFactory.java:74)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArrayFactory.<init>(NetlibBlasNDArrayFactory.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray create(DataBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);

		INDArray result = fixture.create(data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
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
	 * Run the INDArray create(double[][]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_2()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[][] data = new double[][] {};

		INDArray result = fixture.create(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the INDArray create(float[][]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_3()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[][] floats = new float[][] {};

		INDArray result = fixture.create(floats);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the INDArray create(List<INDArray>,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_4()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		List<INDArray> list = new LinkedList();
		int[] shape = new int[] {};

		INDArray result = fixture.create(list, shape);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:209)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:375)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArray.<init>(NetlibBlasNDArray.java:240)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArrayFactory.create(NetlibBlasNDArrayFactory.java:325)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray create(List<INDArray>,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_5()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		List<INDArray> list = new LinkedList();
		int[] shape = new int[] {};

		INDArray result = fixture.create(list, shape);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:209)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:375)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArray.<init>(NetlibBlasNDArray.java:240)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArrayFactory.create(NetlibBlasNDArrayFactory.java:325)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray create(DataBuffer,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_6()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};

		INDArray result = fixture.create(data, shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
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
	 * Run the INDArray create(int[],char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_7()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		int[] shape = new int[] {};
		char ordering = '';

		INDArray result = fixture.create(shape, ordering);

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
	 * Run the INDArray create(int[],DataBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_8()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		int[] shape = new int[] {};
		DataBuffer buffer = new DoubleBuffer(1);

		INDArray result = fixture.create(shape, buffer);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(0.0), result.element());
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
	 * Run the INDArray create(List<INDArray>,int[],char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_9()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		List<INDArray> list = new LinkedList();
		int[] shape = new int[] {};
		char ordering = '';

		INDArray result = fixture.create(list, shape, ordering);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:555)
		//       at java.util.LinkedList.get(LinkedList.java:476)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:224)
		//       at org.nd4j.linalg.api.ndarray.BaseNDArray.<init>(BaseNDArray.java:209)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArray.<init>(NetlibBlasNDArray.java:142)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArrayFactory.create(NetlibBlasNDArrayFactory.java:213)
		assertNotNull(result);
	}

	/**
	 * Run the INDArray create(DataBuffer,int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_10()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int offset = 1;

		INDArray result = fixture.create(buffer, shape, offset);

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
	 * Run the INDArray create(double[],int[],char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_11()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[] data = new double[] {};
		int[] shape = new int[] {};
		char ordering = '';

		INDArray result = fixture.create(data, shape, ordering);

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
	 * Run the INDArray create(double[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_12()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int offset = 1;

		INDArray result = fixture.create(data, shape, offset);

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
	 * Run the INDArray create(float[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_13()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;

		INDArray result = fixture.create(data, shape, offset);

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
	 * Run the INDArray create(DataBuffer,int[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_14()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		INDArray result = fixture.create(data, shape, stride, offset);

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
	 * Run the INDArray create(double[],int[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_15()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		INDArray result = fixture.create(data, shape, stride, offset);

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
	 * Run the INDArray create(float[],int[],int,Character) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_16()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;
		Character order = new Character('');

		INDArray result = fixture.create(data, shape, offset, order);

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
	 * Run the INDArray create(float[],int[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_17()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		INDArray result = fixture.create(data, shape, stride, offset);

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
	 * Run the INDArray create(DataBuffer,int,int,int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_18()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int rows = 1;
		int columns = 1;
		int[] stride = new int[] {};
		int offset = 1;

		INDArray result = fixture.create(data, rows, columns, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.offset());
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
	 * Run the INDArray create(DataBuffer,int[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_19()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int[] newShape = new int[] {};
		int[] newStride = new int[] {};
		int offset = 1;
		char ordering = '';

		INDArray result = fixture.create(data, newShape, newStride, offset, ordering);

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
	 * Run the INDArray create(double[],int[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_20()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		INDArray result = fixture.create(data, shape, stride, offset, ordering);

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
	 * Run the INDArray create(float[],int[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_21()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		INDArray result = fixture.create(data, shape, stride, offset, ordering);

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
	 * Run the INDArray create(float[],int,int,int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreate_22()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int rows = 1;
		int columns = 1;
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		INDArray result = fixture.create(data, rows, columns, stride, offset, ordering);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.data());
		assertEquals(1, result.offset());
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
	 * Run the IComplexNDArray createComplex(DataBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_1()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);

		IComplexNDArray result = fixture.createComplex(data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
		assertEquals(2, result.majorStride());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the IComplexNDArray createComplex(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_2()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		INDArray arr = new ComplexNDArray();

		IComplexNDArray result = fixture.createComplex(arr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.util.ArrayUtil.prod(ArrayUtil.java:115)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:100)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:122)
		//       at org.nd4j.linalg.api.complex.BaseComplexNDArray.<init>(BaseComplexNDArray.java:131)
		//       at org.nd4j.linalg.netlib.complex.ComplexNDArray.<init>(ComplexNDArray.java:99)
		//       at org.nd4j.linalg.netlib.NetlibBlasNDArrayFactory.createComplex(NetlibBlasNDArrayFactory.java:102)
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray createComplex(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_3()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] dim = new float[] {};

		IComplexNDArray result = fixture.createComplex(dim);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(1, result.rows());
		assertEquals(0, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(2, result.majorStride());
		assertEquals(false, result.isScalar());
	}

	/**
	 * Run the IComplexNDArray createComplex(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_4()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] dim = new float[] {1.0f, 1.0f};

		IComplexNDArray result = fixture.createComplex(dim);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
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
		assertEquals(2, result.majorStride());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the IComplexNDArray createComplex(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_5()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] dim = new float[] {};

		IComplexNDArray result = fixture.createComplex(dim);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(1, result.rows());
		assertEquals(0, result.columns());
		assertEquals('f', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(2, result.majorStride());
		assertEquals(false, result.isScalar());
	}

	/**
	 * Run the IComplexNDArray createComplex(List<IComplexNDArray>,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_6()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		List<IComplexNDArray> arrs = new LinkedList();
		int[] shape = new int[] {};

		IComplexNDArray result = fixture.createComplex(arrs, shape);

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
	 * Run the IComplexNDArray createComplex(List<IComplexNDArray>,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_7()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		List<IComplexNDArray> arrs = new LinkedList();
		int[] shape = new int[] {};

		IComplexNDArray result = fixture.createComplex(arrs, shape);

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
	 * Run the IComplexNDArray createComplex(DataBuffer,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_8()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};

		IComplexNDArray result = fixture.createComplex(data, shape);

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
	 * Run the IComplexNDArray createComplex(float[],Character) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_9()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		Character order = new Character('');

		IComplexNDArray result = fixture.createComplex(data, order);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
		assertEquals(0, result.offset());
		assertEquals(0, result.length());
		assertEquals(1, result.rows());
		assertEquals(0, result.columns());
		assertEquals('', result.ordering());
		assertEquals(true, result.isVector());
		assertEquals(false, result.isSquare());
		assertEquals(0, result.slices());
		assertEquals(1, result.secondaryStride());
		assertEquals(false, result.isMatrix());
		assertEquals(true, result.isRowVector());
		assertEquals(false, result.isColumnVector());
		assertEquals(2, result.majorStride());
		assertEquals(false, result.isScalar());
	}

	/**
	 * Run the IComplexNDArray createComplex(IComplexNumber[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_10()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};

		IComplexNDArray result = fixture.createComplex(data, shape);

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
	 * Run the IComplexNDArray createComplex(IComplexNumber[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_11()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};

		IComplexNDArray result = fixture.createComplex(data, shape);

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
	 * Run the IComplexNDArray createComplex(DataBuffer,int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_12()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int offset = 1;

		IComplexNDArray result = fixture.createComplex(buffer, shape, offset);

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
	 * Run the IComplexNDArray createComplex(DataBuffer,int[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_13()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};

		IComplexNDArray result = fixture.createComplex(data, shape, stride);

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
	 * Run the IComplexNDArray createComplex(double[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_14()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int offset = 1;

		IComplexNDArray result = fixture.createComplex(data, shape, offset);

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
	 * Run the IComplexNDArray createComplex(float[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_15()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;

		IComplexNDArray result = fixture.createComplex(data, shape, offset);

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
	 * Run the IComplexNDArray createComplex(IComplexNumber[],int[],char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_16()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, shape, ordering);

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
	 * Run the IComplexNDArray createComplex(DataBuffer,int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_17()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer buffer = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(buffer, shape, offset, ordering);

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
	 * Run the IComplexNDArray createComplex(DataBuffer,int[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_18()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		IComplexNDArray result = fixture.createComplex(data, shape, stride, offset);

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
	 * Run the IComplexNDArray createComplex(double[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_19()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, shape, offset, ordering);

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
	 * Run the IComplexNDArray createComplex(double[],int[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_20()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		IComplexNDArray result = fixture.createComplex(data, shape, stride, offset);

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
	 * Run the IComplexNDArray createComplex(float[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_21()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, shape, offset, ordering);

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
	 * Run the IComplexNDArray createComplex(float[],int[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_22()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		IComplexNDArray result = fixture.createComplex(data, shape, stride, offset);

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
	 * Run the IComplexNDArray createComplex(IComplexNumber[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_23()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};
		int offset = 1;
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, shape, offset, ordering);

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
	 * Run the IComplexNDArray createComplex(IComplexNumber[],int[],int[],char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_24()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, shape, stride, ordering);

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
	 * Run the IComplexNDArray createComplex(IComplexNumber[],int[],int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_25()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;

		IComplexNDArray result = fixture.createComplex(data, shape, stride, offset);

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
	 * Run the IComplexNDArray createComplex(DataBuffer,int,int,int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_26()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int rows = 1;
		int columns = 1;
		int[] stride = new int[] {};
		int offset = 1;

		IComplexNDArray result = fixture.createComplex(data, rows, columns, stride, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.blasOffset());
		assertEquals(1, result.offset());
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
		assertEquals(2, result.majorStride());
		assertEquals(true, result.isScalar());
	}

	/**
	 * Run the IComplexNDArray createComplex(DataBuffer,int[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_27()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		DataBuffer data = new DoubleBuffer(1);
		int[] newDims = new int[] {};
		int[] newStrides = new int[] {};
		int offset = 1;
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, newDims, newStrides, offset, ordering);

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
	 * Run the IComplexNDArray createComplex(double[],int[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_28()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double[] data = new double[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, shape, stride, offset, ordering);

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
	 * Run the IComplexNDArray createComplex(float[],int[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_29()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float[] data = new float[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, shape, stride, offset, ordering);

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
	 * Run the IComplexNDArray createComplex(IComplexNumber[],int[],int[],int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateComplex_30()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		IComplexNumber[] data = new IComplexNumber[] {};
		int[] shape = new int[] {};
		int[] stride = new int[] {};
		int offset = 1;
		char ordering = '';

		IComplexNDArray result = fixture.createComplex(data, shape, stride, offset, ordering);

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
	 * Run the IComplexDouble createDouble(double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateDouble_1()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		double real = 1.0;
		double imag = 1.0;

		IComplexDouble result = fixture.createDouble(real, imag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(1.0), result.imaginaryComponent());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isZero());
		assertEquals(new Double(0.7853981633974484), result.complexArgument());
		assertEquals(false, result.isReal());
		assertEquals(new Double(1.4142135623730951), result.absoluteValue());
		assertEquals(new Double(-1.0), result.realComponent());
		assertEquals(false, result.isImag());
	}

	/**
	 * Run the IComplexFloat createFloat(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	@Test
	public void testCreateFloat_1()
		throws Exception {
		NetlibBlasNDArrayFactory fixture = new NetlibBlasNDArrayFactory();
		float real = 1.0f;
		float imag = 1.0f;

		IComplexFloat result = fixture.createFloat(real, imag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Float(0.7853982f), result.complexArgument());
		assertEquals(new Float(1.0f), result.imaginaryComponent());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isZero());
		assertEquals(false, result.isReal());
		assertEquals(new Float(1.4142135f), result.absoluteValue());
		assertEquals(new Float(-1.0f), result.realComponent());
		assertEquals(false, result.isImag());
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
		new org.junit.runner.JUnitCore().run(NetlibBlasNDArrayFactoryTest.class);
	}
}