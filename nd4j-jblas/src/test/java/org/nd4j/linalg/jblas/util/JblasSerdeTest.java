package org.nd4j.linalg.jblas.util;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>JblasSerdeTest</code> contains tests for the class <code>{@link JblasSerde}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:19 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class JblasSerdeTest {
	/**
	 * Run the INDArray fromAscii(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFromAscii_1()
		throws Exception {
		String path = "";

		INDArray result = JblasSerde.fromAscii(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INDArray fromAscii(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFromAscii_2()
		throws Exception {
		String path = "";

		INDArray result = JblasSerde.fromAscii(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INDArray readJblasBinary(DataInputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testReadJblasBinary_1()
		throws Exception {
		DataInputStream dataInputStream = new DataInputStream(new PipedInputStream());

		INDArray result = JblasSerde.readJblasBinary(dataInputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INDArray readJblasBinary(DataInputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testReadJblasBinary_2()
		throws Exception {
		DataInputStream dataInputStream = new DataInputStream(new PipedInputStream());

		INDArray result = JblasSerde.readJblasBinary(dataInputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/7/15 7:19 PM
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
	 * @generatedBy CodePro at 3/7/15 7:19 PM
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
	 * @generatedBy CodePro at 3/7/15 7:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JblasSerdeTest.class);
	}
}