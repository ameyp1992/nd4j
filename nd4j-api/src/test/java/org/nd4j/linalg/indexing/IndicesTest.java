package org.nd4j.linalg.indexing;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IndicesTest</code> contains tests for the class <code>{@link Indices}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class IndicesTest {
	/**
	 * Run the NDArrayIndex[] adjustIndices(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testAdjustIndices_1()
		throws Exception {
		int[] originalShape = new int[] {0};

		NDArrayIndex[] result = Indices.adjustIndices(originalShape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertNotNull(result[0]);
		assertEquals(0, result[0].end());
		assertEquals(0, result[0].offset());
		assertEquals("NDArrayIndex{indices=[]}", result[0].toString());
		assertEquals(0, result[0].length());
		assertEquals(true, result[0].isInterval());
	}

	/**
	 * Run the NDArrayIndex[] adjustIndices(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testAdjustIndices_2()
		throws Exception {
		int[] originalShape = new int[] {};

		NDArrayIndex[] result = Indices.adjustIndices(originalShape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the NDArrayIndex[] adjustIndices(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testAdjustIndices_3()
		throws Exception {
		int[] originalShape = new int[] {1};

		NDArrayIndex[] result = Indices.adjustIndices(originalShape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertNotNull(result[0]);
		assertEquals(0, result[0].end());
		assertEquals(0, result[0].offset());
		assertEquals("NDArrayIndex{indices=[0]}", result[0].toString());
		assertEquals(0, result[0].length());
		assertEquals(true, result[0].isInterval());
	}

	/**
	 * Run the NDArrayIndex[] adjustIndices(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testAdjustIndices_4()
		throws Exception {
		int[] originalShape = new int[] {1};
		NDArrayIndex index1 = NDArrayIndex.interval(1, 1);

		NDArrayIndex[] result = Indices.adjustIndices(originalShape, index1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertNotNull(result[0]);
		assertEquals(0, result[0].end());
		assertEquals(0, result[0].offset());
		assertEquals("NDArrayIndex{indices=[]}", result[0].toString());
		assertEquals(0, result[0].length());
		assertEquals(true, result[0].isInterval());
	}

	/**
	 * Run the NDArrayIndex[] adjustIndices(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testAdjustIndices_5()
		throws Exception {
		int[] originalShape = new int[] {};

		NDArrayIndex[] result = Indices.adjustIndices(originalShape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the NDArrayIndex[] fillIn(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFillIn_1()
		throws Exception {
		int[] shape = new int[] {};

		NDArrayIndex[] result = Indices.fillIn(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the NDArrayIndex[] fillIn(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFillIn_2()
		throws Exception {
		int[] shape = new int[] {0};

		NDArrayIndex[] result = Indices.fillIn(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertNotNull(result[0]);
		assertEquals(0, result[0].end());
		assertEquals(0, result[0].offset());
		assertEquals("NDArrayIndex{indices=[]}", result[0].toString());
		assertEquals(0, result[0].length());
		assertEquals(true, result[0].isInterval());
	}

	/**
	 * Run the NDArrayIndex[] fillIn(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testFillIn_3()
		throws Exception {
		int[] shape = new int[] {};

		NDArrayIndex[] result = Indices.fillIn(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the boolean isContiguous(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_1()
		throws Exception {
		int[] indices = new int[] {};

		boolean result = Indices.isContiguous(indices);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_2()
		throws Exception {
		int[] indices = new int[] {};

		boolean result = Indices.isContiguous(indices);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_3()
		throws Exception {

		boolean result = Indices.isContiguous();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_4()
		throws Exception {

		boolean result = Indices.isContiguous();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(int,NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_5()
		throws Exception {
		int diff = 1;

		boolean result = Indices.isContiguous(diff);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(int,NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_6()
		throws Exception {
		int diff = 1;
		NDArrayIndex index1 = new NDArrayIndex(new int[] {});
		NDArrayIndex index2 = new NDArrayIndex(new int[] {});

		boolean result = Indices.isContiguous(diff, index1, index2);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(int,NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_7()
		throws Exception {
		int diff = 1;
		NDArrayIndex index1 = new NDArrayIndex(new int[] {});
		NDArrayIndex index2 = null;

		boolean result = Indices.isContiguous(diff, index1, index2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.Indices.isContiguous(Indices.java:172)
		assertTrue(result);
	}

	/**
	 * Run the boolean isContiguous(int,NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_8()
		throws Exception {
		int diff = 1;
		NDArrayIndex index1 = new NDArrayIndex(new int[] {});

		boolean result = Indices.isContiguous(diff, index1);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_9()
		throws Exception {
		int[] indices = new int[] {};
		int diff = 1;

		boolean result = Indices.isContiguous(indices, diff);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_10()
		throws Exception {
		int[] indices = new int[] {1, 1};
		int diff = 1;

		boolean result = Indices.isContiguous(indices, diff);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_11()
		throws Exception {
		int[] indices = new int[] {1, 1};
		int diff = 1;

		boolean result = Indices.isContiguous(indices, diff);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isContiguous(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsContiguous_12()
		throws Exception {
		int[] indices = new int[] {0};
		int diff = 1;

		boolean result = Indices.isContiguous(indices, diff);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int[] offsets(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOffsets_1()
		throws Exception {
		NDArrayIndex index1 = NDArrayIndex.interval(1, 1);

		int[] result = Indices.offsets(index1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(0, result[0]);
	}

	/**
	 * Run the int[] offsets(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOffsets_2()
		throws Exception {
		NDArrayIndex index1 = NDArrayIndex.interval(1, 1);

		int[] result = Indices.offsets(index1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(0, result[0]);
	}

	/**
	 * Run the int[] offsets(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOffsets_3()
		throws Exception {
		NDArrayIndex index1 = NDArrayIndex.interval(1, 1);

		int[] result = Indices.offsets(index1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(0, result[0]);
	}

	/**
	 * Run the int[] offsets(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOffsets_4()
		throws Exception {
		NDArrayIndex index1 = NDArrayIndex.interval(1, 1);

		int[] result = Indices.offsets(index1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(0, result[0]);
	}

	/**
	 * Run the int[] offsets(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOffsets_5()
		throws Exception {

		int[] result = Indices.offsets();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] shape(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testShape_1()
		throws Exception {
		NDArrayIndex index1 = new NDArrayIndex(new int[] {});

		int[] result = Indices.shape(index1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: -1
		//       at org.nd4j.linalg.indexing.Indices.shape(Indices.java:135)
		assertNotNull(result);
	}

	/**
	 * Run the int[] shape(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testShape_2()
		throws Exception {

		int[] result = Indices.shape();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] shape(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testShape_3()
		throws Exception {

		int[] result = Indices.shape();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] shape(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testShape_4()
		throws Exception {
		int[] shape = new int[] {};
		NDArrayIndex index1 = null;

		int[] result = Indices.shape(shape, index1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] shape(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testShape_5()
		throws Exception {
		int[] shape = new int[] {1};

		int[] result = Indices.shape(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] shape(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testShape_6()
		throws Exception {
		int[] shape = new int[] {};

		int[] result = Indices.shape(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] shape(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testShape_7()
		throws Exception {
		int[] shape = new int[] {1};

		int[] result = Indices.shape(shape);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] shape(int[],NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testShape_8()
		throws Exception {
		int[] shape = new int[] {};
		NDArrayIndex index1 = new NDArrayIndex(new int[] {});

		int[] result = Indices.shape(shape, index1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] strides(char,NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testStrides_1()
		throws Exception {
		char ordering = '';

		int[] result = Indices.strides(ordering);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.nd4j.linalg.indexing.Indices.strides(Indices.java:117)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
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
	 * @generatedBy CodePro at 3/7/15 7:13 PM
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
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(IndicesTest.class);
	}
}