package org.nd4j.linalg.api.buffer;

import java.io.RandomAccessFile;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FloatBufferTest</code> contains tests for the class <code>{@link FloatBuffer}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:10 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class FloatBufferTest {
	/**
	 * Run the FloatBuffer(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFloatBuffer_1()
		throws Exception {
		int length = 1;

		FloatBuffer result = new FloatBuffer(length);

		// add additional test code here
		assertNotNull(result);
		assertEquals("FloatBuffer{buffer=[0.0]}", result.toString());
		assertEquals(1, result.dataType());
		assertEquals(1, result.length());
	}

	/**
	 * Run the FloatBuffer(float[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFloatBuffer_2()
		throws Exception {
		float[] buffer = new float[] {};

		FloatBuffer result = new FloatBuffer(buffer);

		// add additional test code here
		assertNotNull(result);
		assertEquals("FloatBuffer{buffer=[]}", result.toString());
		assertEquals(1, result.dataType());
		assertEquals(0, result.length());
	}

	/**
	 * Run the FloatBuffer(float[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFloatBuffer_3()
		throws Exception {
		float[] buffer = new float[] {};
		boolean copy = false;

		FloatBuffer result = new FloatBuffer(buffer, copy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("FloatBuffer{buffer=[]}", result.toString());
		assertEquals(1, result.dataType());
		assertEquals(0, result.length());
	}

	/**
	 * Run the FloatBuffer(float[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFloatBuffer_4()
		throws Exception {
		float[] buffer = new float[] {};
		boolean copy = true;

		FloatBuffer result = new FloatBuffer(buffer, copy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("FloatBuffer{buffer=[]}", result.toString());
		assertEquals(1, result.dataType());
		assertEquals(0, result.length());
	}

	/**
	 * Run the byte[] asBytes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsBytes_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * Run the byte[] asBytes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsBytes_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 0;

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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsDouble_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsDouble_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsFloat_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsFloat_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 0;

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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsFloat_3()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsInt_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * Run the int[] asInt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAsInt_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAssign_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testAssign_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDataType_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDestroy_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDestroy_3()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDestroy_4()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = null;
		fixture.path = "";
		fixture.length = 1;

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDestroy_5()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = null;
		fixture.path = "";
		fixture.length = 1;

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the DataBuffer dup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDup_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 1;
		FloatBuffer o = new FloatBuffer(1);
		o.setData(new float[] {});
		o.memoryMappedBuffer = new RandomAccessFile("", "");
		o.path = "";
		o.length = 1;

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 1;
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 1;
		FloatBuffer o = new FloatBuffer(1);
		o.setData(new float[] {});

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 1;
		FloatBuffer o = new FloatBuffer(1);
		o.setData(new float[] {});

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertTrue(result);
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFlush_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFlush_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = null;
		fixture.path = "";
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:231)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		//       at org.nd4j.linalg.api.buffer.FloatBuffer.flush(FloatBuffer.java:189)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFlush_3()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = null;
		fixture.path = "";
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:231)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		//       at org.nd4j.linalg.api.buffer.FloatBuffer.flush(FloatBuffer.java:189)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFlush_4()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = null;
		fixture.path = "";
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:231)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		//       at org.nd4j.linalg.api.buffer.FloatBuffer.flush(FloatBuffer.java:189)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testFlush_5()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = null;
		fixture.path = "";
		fixture.length = 1;

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:231)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		//       at org.nd4j.linalg.api.buffer.FloatBuffer.flush(FloatBuffer.java:189)
	}

	/**
	 * Run the double getDouble(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testGetDouble_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * Run the double getDouble(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testGetDouble_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testGetFloat_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testGetInt_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testGetNumber_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 1;

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 1;

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
		assertEquals(0, result);
	}

	/**
	 * Run the void put(int,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testPut_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * Run the void put(int,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testPut_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testPut_3()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testPut_4()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSetData_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSetData_2()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSetData_3()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
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
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FloatBuffer fixture = new FloatBuffer(1);
		fixture.setData(new float[] {});
		fixture.memoryMappedBuffer = new RandomAccessFile("", "");
		fixture.path = "";
		fixture.length = 1;

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Illegal mode "" must be one of "r", "rw", "rws", or "rwd"
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:223)
		//       at java.io.RandomAccessFile.<init>(RandomAccessFile.java:124)
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
		new org.junit.runner.JUnitCore().run(FloatBufferTest.class);
	}
}