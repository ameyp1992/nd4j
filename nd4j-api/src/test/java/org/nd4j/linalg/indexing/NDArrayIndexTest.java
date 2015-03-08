package org.nd4j.linalg.indexing;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>NDArrayIndexTest</code> contains tests for the class <code>{@link NDArrayIndex}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:13 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class NDArrayIndexTest {
	/**
	 * Run the NDArrayIndex(int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testNDArrayIndex_1()
		throws Exception {

		NDArrayIndex result = new NDArrayIndex();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.end());
		assertEquals(0, result.offset());
		assertEquals("NDArrayIndex{indices=[]}", result.toString());
		assertEquals(0, result.length());
		assertEquals(false, result.isInterval());
	}

	/**
	 * Run the NDArrayIndex concat(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConcat_1()
		throws Exception {
		NDArrayIndex index1 = new NDArrayIndex(new int[] {});

		NDArrayIndex result = NDArrayIndex.concat(index1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.end());
		assertEquals(0, result.offset());
		assertEquals("NDArrayIndex{indices=[]}", result.toString());
		assertEquals(0, result.length());
		assertEquals(false, result.isInterval());
	}

	/**
	 * Run the NDArrayIndex concat(NDArrayIndex[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testConcat_2()
		throws Exception {

		NDArrayIndex result = NDArrayIndex.concat();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.end());
		assertEquals(0, result.offset());
		assertEquals("NDArrayIndex{indices=[]}", result.toString());
		assertEquals(0, result.length());
		assertEquals(false, result.isInterval());
	}

	/**
	 * Run the NDArrayIndex[] create(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		INDArray index = null;

		NDArrayIndex[] result = NDArrayIndex.create(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.NDArrayIndex.create(NDArrayIndex.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the NDArrayIndex[] create(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testCreate_2()
		throws Exception {
		INDArray index = null;

		NDArrayIndex[] result = NDArrayIndex.create(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.NDArrayIndex.create(NDArrayIndex.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the NDArrayIndex[] create(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testCreate_3()
		throws Exception {
		INDArray index = null;

		NDArrayIndex[] result = NDArrayIndex.create(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.NDArrayIndex.create(NDArrayIndex.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the NDArrayIndex[] create(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testCreate_4()
		throws Exception {
		INDArray index = null;

		NDArrayIndex[] result = NDArrayIndex.create(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.NDArrayIndex.create(NDArrayIndex.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the NDArrayIndex[] create(INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testCreate_5()
		throws Exception {
		INDArray index = null;

		NDArrayIndex[] result = NDArrayIndex.create(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.indexing.NDArrayIndex.create(NDArrayIndex.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the int end() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEnd_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int result = fixture.end();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int end() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEnd_2()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int result = fixture.end();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int end() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEnd_3()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int result = fixture.end();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);
		NDArrayIndex o = new NDArrayIndex(new int[] {});
		o.setInterval(true);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);
		Object o = new NDArrayIndex(new int[] {});

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);
		Object o = new NDArrayIndex(new int[] {});

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int[] indices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIndices_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int[] result = fixture.indices();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the NDArrayIndex interval(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testInterval_1()
		throws Exception {
		int begin = 1;
		int end = 1;

		NDArrayIndex result = NDArrayIndex.interval(begin, end);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.end());
		assertEquals(0, result.offset());
		assertEquals("NDArrayIndex{indices=[]}", result.toString());
		assertEquals(0, result.length());
		assertEquals(true, result.isInterval());
	}

	/**
	 * Run the NDArrayIndex interval(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testInterval_2()
		throws Exception {
		int begin = 1;
		int end = 1;
		boolean inclusive = true;

		NDArrayIndex result = NDArrayIndex.interval(begin, end, inclusive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.end());
		assertEquals(1, result.offset());
		assertEquals("NDArrayIndex{indices=[1]}", result.toString());
		assertEquals(0, result.length());
		assertEquals(true, result.isInterval());
	}

	/**
	 * Run the NDArrayIndex interval(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testInterval_3()
		throws Exception {
		int begin = 1;
		int end = 1;
		boolean inclusive = false;

		NDArrayIndex result = NDArrayIndex.interval(begin, end, inclusive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.end());
		assertEquals(0, result.offset());
		assertEquals("NDArrayIndex{indices=[]}", result.toString());
		assertEquals(0, result.length());
		assertEquals(true, result.isInterval());
	}

	/**
	 * Run the NDArrayIndex interval(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testInterval_4()
		throws Exception {
		int begin = 1;
		int end = 1;
		boolean inclusive = true;

		NDArrayIndex result = NDArrayIndex.interval(begin, end, inclusive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.end());
		assertEquals(1, result.offset());
		assertEquals("NDArrayIndex{indices=[1]}", result.toString());
		assertEquals(0, result.length());
		assertEquals(true, result.isInterval());
	}

	/**
	 * Run the boolean isInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsInterval_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		boolean result = fixture.isInterval();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testIsInterval_2()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(false);

		boolean result = fixture.isInterval();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int length() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testLength_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int result = fixture.length();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int length() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testLength_2()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int result = fixture.length();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int offset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOffset_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int result = fixture.offset();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int offset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testOffset_2()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		int result = fixture.offset();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void reverse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testReverse_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		fixture.reverse();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at org.nd4j.linalg.util.ArrayUtil.reverse(ArrayUtil.java:608)
		//       at org.nd4j.linalg.indexing.NDArrayIndex.reverse(NDArrayIndex.java:145)
	}

	/**
	 * Run the void setInterval(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testSetInterval_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);
		boolean isInterval = true;

		fixture.setInterval(isInterval);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:13 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		NDArrayIndex fixture = new NDArrayIndex(new int[] {});
		fixture.setInterval(true);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NDArrayIndex{indices=[]}", result);
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
		new org.junit.runner.JUnitCore().run(NDArrayIndexTest.class);
	}
}