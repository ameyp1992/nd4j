package org.nd4j.linalg.jblas.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.jblas.NDArray;
import org.nd4j.linalg.jblas.complex.ComplexNDArray;

/**
 * The class <code>JblasNDArrayIOTest</code> contains tests for the class <code>{@link JblasNDArrayIO}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:18 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class JblasNDArrayIOTest {
	/**
	 * Run the INDArray read(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testRead_1()
		throws Exception {
		JblasNDArrayIO fixture = new JblasNDArrayIO();
		InputStream is = new PipedInputStream();

		INDArray result = fixture.read(is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INDArray read(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testRead_2()
		throws Exception {
		JblasNDArrayIO fixture = new JblasNDArrayIO();
		InputStream is = new PipedInputStream();

		INDArray result = fixture.read(is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray readComplex(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testReadComplex_1()
		throws Exception {
		JblasNDArrayIO fixture = new JblasNDArrayIO();
		InputStream is = new PipedInputStream();

		IComplexNDArray result = fixture.readComplex(is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IComplexNDArray readComplex(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testReadComplex_2()
		throws Exception {
		JblasNDArrayIO fixture = new JblasNDArrayIO();
		InputStream is = new PipedInputStream();

		IComplexNDArray result = fixture.readComplex(is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void write(INDArray,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testWrite_1()
		throws Exception {
		JblasNDArrayIO fixture = new JblasNDArrayIO();
		INDArray out = new NDArray();
		OutputStream to = new ByteArrayOutputStream();

		fixture.write(out, to);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.Nd4j.write(Nd4j.java:943)
		//       at org.nd4j.linalg.jblas.io.JblasNDArrayIO.write(JblasNDArrayIO.java:63)
	}

	/**
	 * Run the void write(INDArray,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testWrite_2()
		throws Exception {
		JblasNDArrayIO fixture = new JblasNDArrayIO();
		INDArray out = new NDArray();
		OutputStream to = new ByteArrayOutputStream();

		fixture.write(out, to);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.nd4j.linalg.factory.Nd4j.write(Nd4j.java:943)
		//       at org.nd4j.linalg.jblas.io.JblasNDArrayIO.write(JblasNDArrayIO.java:63)
	}

	/**
	 * Run the void writeComplex(IComplexNDArray,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testWriteComplex_1()
		throws Exception {
		JblasNDArrayIO fixture = new JblasNDArrayIO();
		IComplexNDArray out = new ComplexNDArray(1, 1);
		OutputStream to = new ByteArrayOutputStream();

		fixture.writeComplex(out, to);

		// add additional test code here
	}

	/**
	 * Run the void writeComplex(IComplexNDArray,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testWriteComplex_2()
		throws Exception {
		JblasNDArrayIO fixture = new JblasNDArrayIO();
		IComplexNDArray out = new ComplexNDArray(1, 1);
		OutputStream to = new ByteArrayOutputStream();

		fixture.writeComplex(out, to);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(JblasNDArrayIOTest.class);
	}
}