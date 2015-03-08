package org.nd4j.linalg.jblas.complex;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexNumber;

/**
 * The class <code>ComplexFloatTest</code> contains tests for the class <code>{@link ComplexFloat}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:18 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class ComplexFloatTest {
	/**
	 * Run the ComplexFloat(float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testComplexFloat_1()
		throws Exception {
		float real = 1.0f;

		ComplexFloat result = new ComplexFloat(real);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the ComplexFloat(ComplexFloat) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testComplexFloat_2()
		throws Exception {
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		ComplexFloat result = new ComplexFloat(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the ComplexFloat(float,float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testComplexFloat_3()
		throws Exception {
		float real = 1.0f;
		float imag = 1.0f;

		ComplexFloat result = new ComplexFloat(real, imag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 1.0i", result.toString());
		assertEquals(1.4142135f, result.abs(), 1.0f);
		assertEquals(0.7853982f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.7853982f), result.complexArgument());
		assertEquals(new Float(0.5f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(0.70710677f), result.absoluteValue());
		assertEquals(-0.5f, result.imag(), 1.0f);
		assertEquals(new Float(-0.5f), result.imaginaryComponent());
		assertEquals(false, result.isReal());
		assertEquals("-0.5 - 0.5i", result.toString());
		assertEquals(0.70710677f, result.abs(), 1.0f);
		assertEquals(2.3561945f, result.arg(), 1.0f);
		assertEquals(-0.5f, result.real(), 1.0f);
		assertEquals(1.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the float abs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAbs_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		float result = fixture.abs();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the Float absoluteValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAbsoluteValue_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		Float result = fixture.absoluteValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1.0", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
		assertEquals(false, result.isNaN());
		assertEquals(false, result.isInfinite());
	}

	/**
	 * Run the org.jblas.ComplexFloat add(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float c = 1.0f;

		org.jblas.ComplexFloat result = fixture.add(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("2.0 + 0.0i", result.toString());
		assertEquals(2.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(2.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber add(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number c = new Byte((byte) 1);

		IComplexNumber result = fixture.add(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.46364763f), result.complexArgument());
		assertEquals(new Float(0.4f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(0.44721362f), result.absoluteValue());
		assertEquals(new Float(-0.2f), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat add(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result = fixture.add(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("2.0 + 0.0i", result.toString());
		assertEquals(2.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(2.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber add(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAdd_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.add(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(0.5f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(0.5f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat addi(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float c = 1.0f;

		org.jblas.ComplexFloat result = fixture.addi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("2.0 + 0.0i", result.toString());
		assertEquals(2.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(2.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber addi(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number c = new Byte((byte) 1);

		IComplexNumber result = fixture.addi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.46364763f), result.complexArgument());
		assertEquals(new Float(0.4f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(0.44721362f), result.absoluteValue());
		assertEquals(new Float(-0.2f), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat addi(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result = fixture.addi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("2.0 + 0.0i", result.toString());
		assertEquals(2.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(2.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber addi(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.addi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(0.5f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(0.5f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat addi(float,ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_5()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float a = 1.0f;
		org.jblas.ComplexFloat result = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result2 = fixture.addi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("2.0 + 0.0i", result2.toString());
		assertEquals(2.0f, result2.abs(), 1.0f);
		assertEquals(0.0f, result2.arg(), 1.0f);
		assertEquals(2.0f, result2.real(), 1.0f);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0f, result2.imag(), 1.0f);
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber addi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_6()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number a = new Byte((byte) 1);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.addi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Double(0.46364760900080615), result2.complexArgument());
		assertEquals(new Double(0.4), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(0.447213595499958), result2.absoluteValue());
		assertEquals(new Double(-0.2), result2.imaginaryComponent());
		assertEquals(false, result2.isReal());
	}

	/**
	 * Run the IComplexNumber addi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_7()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number a = new Byte((byte) 1);
		IComplexNumber result = new ComplexFloat(1.0f);

		IComplexNumber result2 = fixture.addi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Float(0.46364763f), result2.complexArgument());
		assertEquals(new Float(0.4f), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Float(0.44721362f), result2.absoluteValue());
		assertEquals(new Float(-0.2f), result2.imaginaryComponent());
		assertEquals(false, result2.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat addi(ComplexFloat,ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_8()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);
		org.jblas.ComplexFloat result = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result2 = fixture.addi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("2.0 + 0.0i", result2.toString());
		assertEquals(2.0f, result2.abs(), 1.0f);
		assertEquals(0.0f, result2.arg(), 1.0f);
		assertEquals(2.0f, result2.real(), 1.0f);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0f, result2.imag(), 1.0f);
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber addi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_9()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.addi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Float(0.0f), result2.complexArgument());
		assertEquals(new Float(1.0f), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Float(1.0f), result2.absoluteValue());
		assertEquals(new Float(-0.0f), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber addi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_10()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexFloat(1.0f);

		IComplexNumber result2 = fixture.addi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Float(0.0f), result2.complexArgument());
		assertEquals(new Float(1.0f), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Float(1.0f), result2.absoluteValue());
		assertEquals(new Float(-0.0f), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the float arg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testArg_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		float result = fixture.arg();

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the IComplexDouble asDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAsDouble_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		IComplexDouble result = fixture.asDouble();

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(new Double(0.0), result.imaginaryComponent());
		assertEquals(false, result.isZero());
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the ComplexFloat asFloat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAsFloat_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.asFloat();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the Float complexArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testComplexArgument_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		Float result = fixture.complexArgument();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0.0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
		assertEquals(false, result.isNaN());
		assertEquals(false, result.isInfinite());
	}

	/**
	 * Run the ComplexFloat conj() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testConj_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.conj();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + -0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(0.0f, result.imag(), 1.0f);
		assertEquals(new Float(0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + 0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(-0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the ComplexFloat conji() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testConji_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.conji();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + -0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(0.0f, result.imag(), 1.0f);
		assertEquals(new Float(0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + 0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(-0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the org.jblas.ComplexFloat copy(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testCopy_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat other = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result = fixture.copy(other);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber copy(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testCopy_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber other = new ComplexDouble(1.0);

		IComplexNumber result = fixture.copy(other);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the ComplexFloat div(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDiv_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float v = 1.0f;

		ComplexFloat result = fixture.div(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the IComplexNumber div(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDiv_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.div(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the ComplexFloat div(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDiv_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		ComplexFloat result = fixture.div(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the IComplexNumber div(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDiv_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.div(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the ComplexFloat divi(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float v = 1.0f;

		ComplexFloat result = fixture.divi(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the IComplexNumber divi(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.divi(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the ComplexFloat divi(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		ComplexFloat result = fixture.divi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the IComplexNumber divi(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.divi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the ComplexFloat divi(float,ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_5()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float v = 1.0f;
		org.jblas.ComplexFloat result = new org.jblas.ComplexFloat(1.0f);

		ComplexFloat result2 = fixture.divi(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0f, result2.abs(), 1.0f);
		assertEquals(0.0f, result2.arg(), 1.0f);
		assertEquals(1.0f, result2.real(), 1.0f);
		assertEquals(new Float(0.0f), result2.complexArgument());
		assertEquals(new Float(1.0f), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Float(1.0f), result2.absoluteValue());
		assertEquals(-0.0f, result2.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
		assertEquals("-1.0 + -0.0i", result2.toString());
		assertEquals(3.1415927f, result2.arg(), 1.0f);
		assertEquals(-1.0f, result2.real(), 1.0f);
		assertEquals(0.0f, result2.imag(), 1.0f);
	}

	/**
	 * Run the IComplexNumber divi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_6()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.divi(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Double(0.0), result2.complexArgument());
		assertEquals(new Double(1.0), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(1.0), result2.absoluteValue());
		assertEquals(new Double(-0.0), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber divi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_7()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);
		IComplexNumber result = new ComplexFloat(1.0f);

		IComplexNumber result2 = fixture.divi(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Float(0.0f), result2.complexArgument());
		assertEquals(new Float(1.0f), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Float(1.0f), result2.absoluteValue());
		assertEquals(new Float(-0.0f), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat divi(ComplexFloat,ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_8()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);
		org.jblas.ComplexFloat result = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result2 = fixture.divi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0f, result2.abs(), 1.0f);
		assertEquals(0.0f, result2.arg(), 1.0f);
		assertEquals(1.0f, result2.real(), 1.0f);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0f, result2.imag(), 1.0f);
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber divi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_9()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.divi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Double(0.0), result2.complexArgument());
		assertEquals(new Double(1.0), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(1.0), result2.absoluteValue());
		assertEquals(new Double(-0.0), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the ComplexFloat dup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDup_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.dup();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the boolean eq(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEq_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		boolean result = fixture.eq(c);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eq(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEq_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		boolean result = fixture.eq(c);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eq(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEq_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		boolean result = fixture.eq(c);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the IComplexNumber eqc(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEqc_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.eqc(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber eqc(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEqc_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.eqc(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber eqc(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEqc_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.eqc(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber eqc(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEqc_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.eqc(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
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
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the IComplexNumber gt(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testGt_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.gt(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber gt(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testGt_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.gt(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber gt(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testGt_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.gt(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber gt(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testGt_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.gt(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the float imag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testImag_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		float result = fixture.imag();

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the Float imaginaryComponent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testImaginaryComponent_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		Float result = fixture.imaginaryComponent();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0.0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
		assertEquals(false, result.isNaN());
		assertEquals(false, result.isInfinite());
	}

	/**
	 * Run the ComplexFloat inv() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testInv_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.inv();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + -0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(0.0f, result.imag(), 1.0f);
		assertEquals(new Float(0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + 0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(-0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the ComplexFloat invi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testInvi_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.invi();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + -0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(0.0f, result.imag(), 1.0f);
		assertEquals(new Float(0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + 0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(-0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the boolean isImag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testIsImag_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		boolean result = fixture.isImag();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testIsImag_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		boolean result = fixture.isImag();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isReal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testIsReal_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		boolean result = fixture.isReal();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isReal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testIsReal_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		boolean result = fixture.isReal();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isZero() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testIsZero_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		boolean result = fixture.isZero();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isZero() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testIsZero_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		boolean result = fixture.isZero();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the IComplexNumber lt(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testLt_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.lt(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber lt(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testLt_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.lt(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber lt(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testLt_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.lt(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber lt(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testLt_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.lt(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat mul(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMul_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float v = 1.0f;

		org.jblas.ComplexFloat result = fixture.mul(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber mul(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMul_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.mul(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat mul(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMul_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result = fixture.mul(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber mul(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMul_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.mul(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat muli(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float v = 1.0f;

		org.jblas.ComplexFloat result = fixture.muli(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber muli(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.muli(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat muli(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result = fixture.muli(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber muli(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.muli(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat muli(float,ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_5()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float v = 1.0f;
		org.jblas.ComplexFloat result = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result2 = fixture.muli(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0f, result2.abs(), 1.0f);
		assertEquals(0.0f, result2.arg(), 1.0f);
		assertEquals(1.0f, result2.real(), 1.0f);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0f, result2.imag(), 1.0f);
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber muli(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_6()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.muli(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Double(0.0), result2.complexArgument());
		assertEquals(new Double(1.0), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(1.0), result2.absoluteValue());
		assertEquals(new Double(-0.0), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber muli(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_7()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);
		IComplexNumber result = new ComplexFloat(1.0f);

		IComplexNumber result2 = fixture.muli(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Float(0.0f), result2.complexArgument());
		assertEquals(new Float(1.0f), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Float(1.0f), result2.absoluteValue());
		assertEquals(new Float(-0.0f), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat muli(ComplexFloat,ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_8()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);
		org.jblas.ComplexFloat result = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result2 = fixture.muli(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0f, result2.abs(), 1.0f);
		assertEquals(0.0f, result2.arg(), 1.0f);
		assertEquals(1.0f, result2.real(), 1.0f);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0f, result2.imag(), 1.0f);
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber muli(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_9()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.muli(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Double(0.0), result2.complexArgument());
		assertEquals(new Double(1.0), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(1.0), result2.absoluteValue());
		assertEquals(new Double(-0.0), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the boolean ne(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNe_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		boolean result = fixture.ne(c);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean ne(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNe_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		boolean result = fixture.ne(c);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean ne(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNe_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		boolean result = fixture.ne(c);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the ComplexFloat neg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNeg_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.neg();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(new Float(3.1415927f), result.complexArgument());
		assertEquals(new Float(-1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(0.0f, result.imag(), 1.0f);
		assertEquals(new Float(0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(-0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the ComplexFloat negi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNegi_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.negi();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(new Float(3.1415927f), result.complexArgument());
		assertEquals(new Float(-1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(0.0f, result.imag(), 1.0f);
		assertEquals(new Float(0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(-0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the IComplexNumber neqc(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNeqc_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.neqc(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber neqc(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNeqc_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.neqc(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber neqc(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNeqc_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.neqc(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber neqc(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNeqc_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber num = new ComplexDouble(1.0);

		IComplexNumber result = fixture.neqc(num);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber rdiv(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdiv_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.rdiv(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber rdiv(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdiv_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.rdiv(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber rdivi(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdivi_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.rdivi(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber rdivi(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdivi_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.rdivi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the IComplexNumber rdivi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdivi_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number v = new Byte((byte) 1);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.rdivi(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Double(0.0), result2.complexArgument());
		assertEquals(new Double(1.0), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(1.0), result2.absoluteValue());
		assertEquals(new Double(-0.0), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber rdivi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdivi_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.rdivi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Double(0.0), result2.complexArgument());
		assertEquals(new Double(1.0), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(1.0), result2.absoluteValue());
		assertEquals(new Double(-0.0), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the float real() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testReal_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		float result = fixture.real();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the Float realComponent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRealComponent_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		Float result = fixture.realComponent();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1.0", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
		assertEquals(false, result.isNaN());
		assertEquals(false, result.isInfinite());
	}

	/**
	 * Run the IComplexNumber rsub(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRsub_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number r = new Byte((byte) 1);

		IComplexNumber result = fixture.rsub(r);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber rsub(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRsub_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.rsub(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber rsubi(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRsubi_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number a = new Byte((byte) 1);

		IComplexNumber result = fixture.rsubi(a);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber rsubi(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRsubi_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.rsubi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber rsubi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRsubi_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number a = new Byte((byte) 1);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.rsubi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(true, result2.isZero());
		assertEquals(new Double(Double.NaN), result2.complexArgument());
		assertEquals(new Double(Double.NaN), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(Double.NaN), result2.absoluteValue());
		assertEquals(new Double(Double.NaN), result2.imaginaryComponent());
		assertEquals(false, result2.isReal());
	}

	/**
	 * Run the IComplexNumber rsubi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRsubi_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber a = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.rsubi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(true, result2.isZero());
		assertEquals(new Double(Double.NaN), result2.complexArgument());
		assertEquals(new Double(Double.NaN), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(Double.NaN), result2.absoluteValue());
		assertEquals(new Double(Double.NaN), result2.imaginaryComponent());
		assertEquals(false, result2.isReal());
	}

	/**
	 * Run the IComplexNumber set(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSet_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber set = new ComplexDouble(1.0);

		IComplexNumber result = fixture.set(set);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat set(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSet_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float real = 1.0f;
		float imag = 1.0f;

		org.jblas.ComplexFloat result = fixture.set(real, imag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 1.0i", result.toString());
		assertEquals(1.4142135f, result.abs(), 1.0f);
		assertEquals(0.7853982f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(-0.5f, result.imag(), 1.0f);
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber set(Number,Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSet_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number real = new Byte((byte) 1);
		Number imag = new Byte((byte) 1);

		IComplexNumber result = fixture.set(real, imag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(0.7853982f), result.complexArgument());
		assertEquals(new Float(0.5f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(0.70710677f), result.absoluteValue());
		assertEquals(new Float(-0.5f), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the ComplexFloat sqrt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSqrt_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		ComplexFloat result = fixture.sqrt();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0f, result.abs(), 1.0f);
		assertEquals(0.0f, result.arg(), 1.0f);
		assertEquals(1.0f, result.real(), 1.0f);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(-0.0f, result.imag(), 1.0f);
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.1415927f, result.arg(), 1.0f);
		assertEquals(-1.0f, result.real(), 1.0f);
		assertEquals(0.0f, result.imag(), 1.0f);
	}

	/**
	 * Run the org.jblas.ComplexFloat sub(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSub_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float r = 1.0f;

		org.jblas.ComplexFloat result = fixture.sub(r);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0.0f, result.abs(), 1.0f);
		assertEquals(Float.NaN, result.arg(), 1.0f);
		assertEquals(0.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(Float.NaN, result.imag(), 1.0f);
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber sub(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSub_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number r = new Byte((byte) 1);

		IComplexNumber result = fixture.sub(r);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(1.5707964f), result.complexArgument());
		assertEquals(new Float(0.0f), result.realComponent());
		assertEquals(true, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(1.0f), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat sub(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSub_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result = fixture.sub(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0.0f, result.abs(), 1.0f);
		assertEquals(Float.NaN, result.arg(), 1.0f);
		assertEquals(0.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(Float.NaN, result.imag(), 1.0f);
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber sub(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSub_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.sub(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat subi(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float a = 1.0f;

		org.jblas.ComplexFloat result = fixture.subi(a);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0.0f, result.abs(), 1.0f);
		assertEquals(Float.NaN, result.arg(), 1.0f);
		assertEquals(0.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(Float.NaN, result.imag(), 1.0f);
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber subi(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_2()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number a = new Byte((byte) 1);

		IComplexNumber result = fixture.subi(a);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Float(1.5707964f), result.complexArgument());
		assertEquals(new Float(0.0f), result.realComponent());
		assertEquals(true, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(1.0f), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat subi(ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_3()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result = fixture.subi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0.0f, result.abs(), 1.0f);
		assertEquals(Float.NaN, result.arg(), 1.0f);
		assertEquals(0.0f, result.real(), 1.0f);
		assertEquals(false, result.isImag());
		assertEquals(Float.NaN, result.imag(), 1.0f);
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the IComplexNumber subi(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_4()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.subi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Float(Float.NaN), result.complexArgument());
		assertEquals(new Float(Float.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Float(Float.NaN), result.absoluteValue());
		assertEquals(new Float(Float.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat subi(float,ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_5()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		float a = 1.0f;
		org.jblas.ComplexFloat result = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result2 = fixture.subi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(true, result2.isZero());
		assertEquals("0.0 + 0.0i", result2.toString());
		assertEquals(0.0f, result2.abs(), 1.0f);
		assertEquals(Float.NaN, result2.arg(), 1.0f);
		assertEquals(0.0f, result2.real(), 1.0f);
		assertEquals(false, result2.isImag());
		assertEquals(Float.NaN, result2.imag(), 1.0f);
		assertEquals(false, result2.isReal());
	}

	/**
	 * Run the IComplexNumber subi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_6()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number a = new Byte((byte) 1);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.subi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Double(1.5707963267948966), result2.complexArgument());
		assertEquals(new Double(0.0), result2.realComponent());
		assertEquals(true, result2.isImag());
		assertEquals(new Double(1.0), result2.absoluteValue());
		assertEquals(new Double(1.0), result2.imaginaryComponent());
		assertEquals(false, result2.isReal());
	}

	/**
	 * Run the IComplexNumber subi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_7()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		Number a = new Byte((byte) 1);
		IComplexNumber result = new ComplexFloat(1.0f);

		IComplexNumber result2 = fixture.subi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Float(1.5707964f), result2.complexArgument());
		assertEquals(new Float(0.0f), result2.realComponent());
		assertEquals(true, result2.isImag());
		assertEquals(new Float(1.0f), result2.absoluteValue());
		assertEquals(new Float(1.0f), result2.imaginaryComponent());
		assertEquals(false, result2.isReal());
	}

	/**
	 * Run the org.jblas.ComplexFloat subi(ComplexFloat,ComplexFloat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_8()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		org.jblas.ComplexFloat c = new org.jblas.ComplexFloat(1.0f);
		org.jblas.ComplexFloat result = new org.jblas.ComplexFloat(1.0f);

		org.jblas.ComplexFloat result2 = fixture.subi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0f, result2.abs(), 1.0f);
		assertEquals(0.0f, result2.arg(), 1.0f);
		assertEquals(1.0f, result2.real(), 1.0f);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0f, result2.imag(), 1.0f);
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber subi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_9()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.subi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Float(0.0f), result2.complexArgument());
		assertEquals(new Float(1.0f), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Float(1.0f), result2.absoluteValue());
		assertEquals(new Float(-0.0f), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the IComplexNumber subi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_10()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexFloat(1.0f);

		IComplexNumber result2 = fixture.subi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals(new Float(0.0f), result2.complexArgument());
		assertEquals(new Float(1.0f), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Float(1.0f), result2.absoluteValue());
		assertEquals(new Float(-0.0f), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ComplexFloat fixture = new ComplexFloat(1.0f);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1.0 + 0.0i", result);
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
		new org.junit.runner.JUnitCore().run(ComplexFloatTest.class);
	}
}