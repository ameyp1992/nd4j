package org.nd4j.linalg.netlib;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 3/7/15 7:24 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	SimpleNetlibBlasTest.class,
	NetlibBlasNDArrayTest.class,
	NetlibBlasNDArrayFactoryTest.class,
	NetlibBlasWrapperTest.class,
	org.nd4j.linalg.netlib.complex.TestAll.class,
	org.nd4j.linalg.netlib.ndarray.TestAll.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/7/15 7:24 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
