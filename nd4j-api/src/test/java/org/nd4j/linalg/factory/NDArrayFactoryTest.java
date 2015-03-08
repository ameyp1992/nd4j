package org.nd4j.linalg.factory;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexFloat;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * The class <code>NDArrayFactoryTest</code> contains tests for the class <code>{@link NDArrayFactory}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:11 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class NDArrayFactoryTest {

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
	 * @generatedBy CodePro at 3/7/15 7:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NDArrayFactoryTest.class);
	}
}