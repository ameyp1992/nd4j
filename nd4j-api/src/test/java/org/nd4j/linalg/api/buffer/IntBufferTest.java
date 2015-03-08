package org.nd4j.linalg.api.buffer;

import java.io.RandomAccessFile;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IntBufferTest</code> contains tests for the class <code>{@link IntBuffer}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:09 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class IntBufferTest {
	/**
	 * Run the IntBuffer(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testIntBuffer_1()
		throws Exception {
		int length = 1;

		IntBuffer result = new IntBuffer(length);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.asInt());
		assertEquals(2, result.dataType());
		assertEquals(1, result.length());
	}

	/**
	 * Run the IntBuffer(int[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testIntBuffer_2()
		throws Exception {
		int[] buffer = new int[] {};

		IntBuffer result = new IntBuffer(buffer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.buffer.IntBuffer.<init>(IntBuffer.java:42)
		//       at org.nd4j.linalg.api.buffer.IntBuffer.<init>(IntBuffer.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the IntBuffer(int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testIntBuffer_3()
		throws Exception {
		int[] buffer = new int[] {};
		boolean copy = true;

		IntBuffer result = new IntBuffer(buffer, copy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.api.buffer.IntBuffer.<init>(IntBuffer.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the IntBuffer(int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testIntBuffer_4()
		throws Exception {
		int[] buffer = new int[] {};
		boolean copy = false;

		IntBuffer result = new IntBuffer(buffer, copy);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.dataType());
		assertEquals(0, result.length());
	}

	/**
	 * Run the byte[] asBytes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testAsBytes_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		byte[] result = fixture.asBytes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the double[] asDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testAsDouble_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		double[] result = fixture.asDouble();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the double[] asDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testAsDouble_2()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		double[] result = fixture.asDouble();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the float[] asFloat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testAsFloat_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		float[] result = fixture.asFloat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the float[] asFloat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testAsFloat_2()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		float[] result = fixture.asFloat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the int[] asInt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testAsInt_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		int[] result = fixture.asInt();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the void assign(Number,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testAssign_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		Number value = new Byte((byte) 1);
		int offset = 1;

		fixture.assign(value, offset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void assign(Number,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testAssign_2()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		Number value = new Byte((byte) 1);
		int offset = 1;

		fixture.assign(value, offset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the int dataType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testDataType_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		int result = fixture.dataType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertEquals(0, result);
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		fixture.destroy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testDestroy_2()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		fixture.destroy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testDestroy_3()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		fixture.destroy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testDestroy_4()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = null;
		fixture.length = 1;

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testDestroy_5()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = null;
		fixture.length = 1;

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the DataBuffer dup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testDup_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		DataBuffer result = fixture.dup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testFlush_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testFlush_2()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = null;
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:231)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		//       at org.nd4j.linalg.api.buffer.IntBuffer.flush(IntBuffer.java:159)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testFlush_3()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = null;
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:231)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		//       at org.nd4j.linalg.api.buffer.IntBuffer.flush(IntBuffer.java:159)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testFlush_4()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = null;
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:231)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		//       at org.nd4j.linalg.api.buffer.IntBuffer.flush(IntBuffer.java:159)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testFlush_5()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = null;
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:231)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		//       at org.nd4j.linalg.api.buffer.IntBuffer.flush(IntBuffer.java:159)
	}

	/**
	 * Run the double getDouble(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testGetDouble_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		int i = 1;

		double result = fixture.getDouble(i);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the float getFloat(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testGetFloat_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		int i = 1;

		float result = fixture.getFloat(i);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the int getInt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testGetInt_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		int ix = 1;

		int result = fixture.getInt(ix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertEquals(0, result);
	}

	/**
	 * Run the Number getNumber(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testGetNumber_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		int i = 1;

		Number result = fixture.getNumber(i);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the void put(int,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testPut_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		int i = 1;
		double element = 1.0;

		fixture.put(i, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void put(int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testPut_2()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		int i = 1;
		float element = 1.0f;

		fixture.put(i, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void put(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testPut_3()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		int i = 1;
		int element = 1;

		fixture.put(i, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void setData(double[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testSetData_1()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		double[] data = new double[] {};

		fixture.setData(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void setData(float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testSetData_2()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		float[] data = new float[] {};

		fixture.setData(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
	}

	/**
	 * Run the void setData(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:09 PM
	 */
	@Test
	public void testSetData_3()
		throws Exception {
		IntBuffer fixture = new IntBuffer(1);
		fixture.setData(new int[] {});
		fixture.path = "";
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.length = 1;
		int[] data = new int[] {};

		fixture.setData(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
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
		new org.junit.runner.JUnitCore().run(IntBufferTest.class);
	}
}