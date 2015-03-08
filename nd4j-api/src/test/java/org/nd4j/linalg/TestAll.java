package org.nd4j.linalg;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 3/7/15 7:14 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({

	org.nd4j.linalg.api.buffer.TestAll.class,
	org.nd4j.linalg.api.io.TestAll.class,
	org.nd4j.linalg.benchmark.TestAll.class,
	org.nd4j.linalg.convolution.TestAll.class,
	org.nd4j.linalg.indexing.TestAll.class,
	org.nd4j.linalg.lossfunctions.TestAll.class,
	org.nd4j.linalg.ops.TestAll.class,
	org.nd4j.linalg.sampling.TestAll.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/7/15 7:14 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
