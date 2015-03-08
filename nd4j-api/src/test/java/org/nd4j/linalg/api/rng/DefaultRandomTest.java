package org.nd4j.linalg.api.rng;

import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultRandomTest</code> contains tests for the class <code>{@link DefaultRandom}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:10 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class DefaultRandomTest {
	/**
	 * Run the DefaultRandom(long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDefaultRandom_1()
		throws Exception {
		long seed = 1L;

		DefaultRandom result = new DefaultRandom(seed);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2084377003539008444L, result.nextLong());
		assertEquals(false, result.nextBoolean());
		assertEquals(0.93472123f, result.nextFloat(), 1.0f);
		assertEquals(0.9860040539625815, result.nextGaussian(), 1.0);
		assertEquals(0.8056470269312428, result.nextDouble(), 1.0);
		assertEquals(1423829729, result.nextInt());
	}

	/**
	 * Run the DefaultRandom(RandomGenerator) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testDefaultRandom_2()
		throws Exception {
		RandomGenerator randomGenerator = new Well1024a();

		DefaultRandom result = new DefaultRandom(randomGenerator);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4732740362737101250L, result.nextLong());
		assertEquals(false, result.nextBoolean());
		assertEquals(0.5754485f, result.nextFloat(), 1.0f);
		assertEquals(0.5012107907582698, result.nextGaussian(), 1.0);
		assertEquals(0.3132783140918374, result.nextDouble(), 1.0);
		assertEquals(-405482434, result.nextInt());
	}

	/**
	 * Run the boolean nextBoolean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextBoolean_1()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());

		boolean result = fixture.nextBoolean();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean nextBoolean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextBoolean_2()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());

		boolean result = fixture.nextBoolean();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void nextBytes(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextBytes_1()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());
		byte[] bytes = new byte[] {};

		fixture.nextBytes(bytes);

		// add additional test code here
	}

	/**
	 * Run the double nextDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextDouble_1()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());

		double result = fixture.nextDouble();

		// add additional test code here
		assertEquals(0.10859113959675515, result, 0.1);
	}

	/**
	 * Run the float nextFloat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextFloat_1()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());

		float result = fixture.nextFloat();

		// add additional test code here
		assertEquals(0.96729696f, result, 0.1f);
	}

	/**
	 * Run the double nextGaussian() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextGaussian_1()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());

		double result = fixture.nextGaussian();

		// add additional test code here
		assertEquals(0.09178848128621625, result, 0.1);
	}

	/**
	 * Run the int nextInt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextInt_1()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());

		int result = fixture.nextInt();

		// add additional test code here
		assertEquals(-163552178, result);
	}

	/**
	 * Run the int nextInt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextInt_2()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());
		int n = 1;

		int result = fixture.nextInt(n);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the long nextLong() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testNextLong_1()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());

		long result = fixture.nextLong();

		// add additional test code here
		assertEquals(-2475703134902098011L, result);
	}

	/**
	 * Run the void setSeed(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSetSeed_1()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());
		int seed = 1;

		fixture.setSeed(seed);

		// add additional test code here
	}

	/**
	 * Run the void setSeed(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSetSeed_2()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());
		long seed = 1L;

		fixture.setSeed(seed);

		// add additional test code here
	}

	/**
	 * Run the void setSeed(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:10 PM
	 */
	@Test
	public void testSetSeed_3()
		throws Exception {
		DefaultRandom fixture = new DefaultRandom(new Well1024a());
		int[] seed = new int[] {};

		fixture.setSeed(seed);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DefaultRandomTest.class);
	}
}