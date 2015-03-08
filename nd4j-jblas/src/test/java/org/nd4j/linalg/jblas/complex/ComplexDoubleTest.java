package org.nd4j.linalg.jblas.complex;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexFloat;
import org.nd4j.linalg.api.complex.IComplexNumber;

/**
 * The class <code>ComplexDoubleTest</code> contains tests for the class <code>{@link ComplexDouble}</code>.
 *
 * @generatedBy CodePro at 3/7/15 7:18 PM
 * @author saurabh
 * @version $Revision: 1.0 $
 */
public class ComplexDoubleTest {
	/**
	 * Run the ComplexDouble(double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testComplexDouble_1()
		throws Exception {
		double real = 1.0;

		ComplexDouble result = new ComplexDouble(real);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(-0.0, result.imag(), 1.0);
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(0.0, result.imag(), 1.0);
	}

	/**
	 * Run the ComplexDouble(ComplexDouble) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testComplexDouble_2()
		throws Exception {
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		ComplexDouble result = new ComplexDouble(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(-0.0, result.imag(), 1.0);
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(0.0, result.imag(), 1.0);
	}

	/**
	 * Run the ComplexDouble(double,double) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testComplexDouble_3()
		throws Exception {
		double real = 1.0;
		double imag = 1.0;

		ComplexDouble result = new ComplexDouble(real, imag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 1.0i", result.toString());
		assertEquals(1.4142135623730951, result.abs(), 1.0);
		assertEquals(0.7853981633974484, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.7853981633974484), result.complexArgument());
		assertEquals(new Double(0.5), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(0.7071067811865476), result.absoluteValue());
		assertEquals(-0.5, result.imag(), 1.0);
		assertEquals(new Double(-0.5), result.imaginaryComponent());
		assertEquals(false, result.isReal());
		assertEquals("-0.5 - 0.5i", result.toString());
		assertEquals(0.7071067811865476, result.abs(), 1.0);
		assertEquals(2.356194490192345, result.arg(), 1.0);
		assertEquals(-0.5, result.real(), 1.0);
		assertEquals(1.0, result.imag(), 1.0);
	}

	/**
	 * Run the double abs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAbs_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		double result = fixture.abs();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the Double absoluteValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAbsoluteValue_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		Double result = fixture.absoluteValue();

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
	 * Run the org.jblas.ComplexDouble add(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double c = 1.0;

		org.jblas.ComplexDouble result = fixture.add(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("2.0 + 0.0i", result.toString());
		assertEquals(2.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(2.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number c = new Byte((byte) 1);

		IComplexNumber result = fixture.add(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Double(0.46364760900080615), result.complexArgument());
		assertEquals(new Double(0.4), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(0.447213595499958), result.absoluteValue());
		assertEquals(new Double(-0.2), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexDouble add(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result = fixture.add(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("2.0 + 0.0i", result.toString());
		assertEquals(2.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(2.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.add(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(0.5), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(0.5), result.absoluteValue());
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexDouble addi(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double c = 1.0;

		org.jblas.ComplexDouble result = fixture.addi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("2.0 + 0.0i", result.toString());
		assertEquals(2.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(2.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number c = new Byte((byte) 1);

		IComplexNumber result = fixture.addi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Double(0.46364760900080615), result.complexArgument());
		assertEquals(new Double(0.4), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(0.447213595499958), result.absoluteValue());
		assertEquals(new Double(-0.2), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexDouble addi(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result = fixture.addi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("2.0 + 0.0i", result.toString());
		assertEquals(2.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(2.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.addi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(0.5), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(0.5), result.absoluteValue());
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexDouble addi(double,ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_5()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double a = 1.0;
		org.jblas.ComplexDouble result = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result2 = fixture.addi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("2.0 + 0.0i", result2.toString());
		assertEquals(2.0, result2.abs(), 1.0);
		assertEquals(0.0, result2.arg(), 1.0);
		assertEquals(2.0, result2.real(), 1.0);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0, result2.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the org.jblas.ComplexDouble addi(ComplexDouble,ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_8()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);
		org.jblas.ComplexDouble result = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result2 = fixture.addi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("2.0 + 0.0i", result2.toString());
		assertEquals(2.0, result2.abs(), 1.0);
		assertEquals(0.0, result2.arg(), 1.0);
		assertEquals(2.0, result2.real(), 1.0);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0, result2.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.addi(c, result);

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
	 * Run the IComplexNumber addi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAddi_10()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.addi(c, result);

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
	 * Run the double arg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testArg_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		double result = fixture.arg();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
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
		ComplexDouble fixture = new ComplexDouble(1.0);

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
	 * Run the IComplexFloat asFloat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testAsFloat_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		IComplexFloat result = fixture.asFloat();

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Float(0.0f), result.complexArgument());
		assertEquals(new Float(1.0f), result.realComponent());
		assertEquals(new Float(0.0f), result.imaginaryComponent());
		assertEquals(false, result.isZero());
		assertEquals(false, result.isImag());
		assertEquals(new Float(1.0f), result.absoluteValue());
		assertEquals(new Float(-0.0f), result.imaginaryComponent());
		assertEquals(true, result.isReal());
	}

	/**
	 * Run the Double complexArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testComplexArgument_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		Double result = fixture.complexArgument();

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
	 * Run the ComplexDouble conj() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testConj_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		ComplexDouble result = fixture.conj();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + -0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(0.0, result.imag(), 1.0);
		assertEquals(new Double(0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + 0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(-0.0, result.imag(), 1.0);
	}

	/**
	 * Run the ComplexDouble conji() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testConji_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		ComplexDouble result = fixture.conji();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + -0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(0.0, result.imag(), 1.0);
		assertEquals(new Double(0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + 0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(-0.0, result.imag(), 1.0);
	}

	/**
	 * Run the org.jblas.ComplexDouble copy(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testCopy_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble other = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result = fixture.copy(other);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the ComplexDouble div(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDiv_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double v = 1.0;

		ComplexDouble result = fixture.div(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(-0.0, result.imag(), 1.0);
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.div(v);

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
	 * Run the ComplexDouble div(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDiv_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		ComplexDouble result = fixture.div(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(-0.0, result.imag(), 1.0);
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.div(c);

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
	 * Run the ComplexDouble divi(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double v = 1.0;

		ComplexDouble result = fixture.divi(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(-0.0, result.imag(), 1.0);
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.divi(v);

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
	 * Run the ComplexDouble divi(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		ComplexDouble result = fixture.divi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(-0.0, result.imag(), 1.0);
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.divi(c);

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
	 * Run the ComplexDouble divi(double,ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_5()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double v = 1.0;
		org.jblas.ComplexDouble result = new org.jblas.ComplexDouble(1.0);

		ComplexDouble result2 = fixture.divi(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0, result2.abs(), 1.0);
		assertEquals(0.0, result2.arg(), 1.0);
		assertEquals(1.0, result2.real(), 1.0);
		assertEquals(new Double(0.0), result2.complexArgument());
		assertEquals(new Double(1.0), result2.realComponent());
		assertEquals(false, result2.isImag());
		assertEquals(new Double(1.0), result2.absoluteValue());
		assertEquals(-0.0, result2.imag(), 1.0);
		assertEquals(new Double(-0.0), result2.imaginaryComponent());
		assertEquals(true, result2.isReal());
		assertEquals("-1.0 + -0.0i", result2.toString());
		assertEquals(3.141592653589793, result2.arg(), 1.0);
		assertEquals(-1.0, result2.real(), 1.0);
		assertEquals(0.0, result2.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the org.jblas.ComplexDouble divi(ComplexDouble,ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDivi_8()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);
		org.jblas.ComplexDouble result = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result2 = fixture.divi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0, result2.abs(), 1.0);
		assertEquals(0.0, result2.arg(), 1.0);
		assertEquals(1.0, result2.real(), 1.0);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0, result2.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the ComplexDouble dup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testDup_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		ComplexDouble result = fixture.dup();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(-0.0, result.imag(), 1.0);
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(0.0, result.imag(), 1.0);
	}

	/**
	 * Run the boolean eq(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEq_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		boolean result = fixture.eq(c);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eq(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testEq_2()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the double imag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testImag_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		double result = fixture.imag();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the Double imaginaryComponent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testImaginaryComponent_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		Double result = fixture.imaginaryComponent();

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
	 * Run the ComplexDouble inv() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testInv_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		ComplexDouble result = fixture.inv();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + -0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(0.0, result.imag(), 1.0);
		assertEquals(new Double(0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + 0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(-0.0, result.imag(), 1.0);
	}

	/**
	 * Run the ComplexDouble invi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testInvi_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		ComplexDouble result = fixture.invi();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + -0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(0.0, result.imag(), 1.0);
		assertEquals(new Double(0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + 0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);

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
		ComplexDouble fixture = new ComplexDouble(1.0);

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
		ComplexDouble fixture = new ComplexDouble(1.0);

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
		ComplexDouble fixture = new ComplexDouble(1.0);

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
		ComplexDouble fixture = new ComplexDouble(1.0);

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
		ComplexDouble fixture = new ComplexDouble(1.0);

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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the org.jblas.ComplexDouble mul(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMul_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double v = 1.0;

		org.jblas.ComplexDouble result = fixture.mul(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.mul(v);

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
	 * Run the org.jblas.ComplexDouble mul(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMul_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result = fixture.mul(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.mul(c);

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
	 * Run the org.jblas.ComplexDouble muli(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double v = 1.0;

		org.jblas.ComplexDouble result = fixture.muli(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.muli(v);

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
	 * Run the org.jblas.ComplexDouble muli(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result = fixture.muli(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.muli(c);

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
	 * Run the org.jblas.ComplexDouble muli(double,ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_5()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double v = 1.0;
		org.jblas.ComplexDouble result = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result2 = fixture.muli(v, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0, result2.abs(), 1.0);
		assertEquals(0.0, result2.arg(), 1.0);
		assertEquals(1.0, result2.real(), 1.0);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0, result2.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the org.jblas.ComplexDouble muli(ComplexDouble,ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testMuli_8()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);
		org.jblas.ComplexDouble result = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result2 = fixture.muli(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0, result2.abs(), 1.0);
		assertEquals(0.0, result2.arg(), 1.0);
		assertEquals(1.0, result2.real(), 1.0);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0, result2.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the boolean ne(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNe_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		boolean result = fixture.ne(c);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean ne(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNe_2()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		boolean result = fixture.ne(c);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the ComplexDouble neg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNeg_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		ComplexDouble result = fixture.neg();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(new Double(3.141592653589793), result.complexArgument());
		assertEquals(new Double(-1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(0.0, result.imag(), 1.0);
		assertEquals(new Double(0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(-0.0, result.imag(), 1.0);
	}

	/**
	 * Run the ComplexDouble negi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testNegi_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		ComplexDouble result = fixture.negi();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(new Double(3.141592653589793), result.complexArgument());
		assertEquals(new Double(-1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(0.0, result.imag(), 1.0);
		assertEquals(new Double(0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(-0.0, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.rdiv(v);

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
	 * Run the IComplexNumber rdiv(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdiv_2()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.rdiv(c);

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
	 * Run the IComplexNumber rdivi(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdivi_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number v = new Byte((byte) 1);

		IComplexNumber result = fixture.rdivi(v);

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
	 * Run the IComplexNumber rdivi(IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdivi_2()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.rdivi(c);

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
	 * Run the IComplexNumber rdivi(Number,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRdivi_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the double real() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testReal_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		double result = fixture.real();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the Double realComponent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testRealComponent_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		Double result = fixture.realComponent();

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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number r = new Byte((byte) 1);

		IComplexNumber result = fixture.rsub(r);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Double(Double.NaN), result.complexArgument());
		assertEquals(new Double(Double.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(Double.NaN), result.absoluteValue());
		assertEquals(new Double(Double.NaN), result.imaginaryComponent());
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.rsub(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Double(Double.NaN), result.complexArgument());
		assertEquals(new Double(Double.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(Double.NaN), result.absoluteValue());
		assertEquals(new Double(Double.NaN), result.imaginaryComponent());
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number a = new Byte((byte) 1);

		IComplexNumber result = fixture.rsubi(a);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Double(Double.NaN), result.complexArgument());
		assertEquals(new Double(Double.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(Double.NaN), result.absoluteValue());
		assertEquals(new Double(Double.NaN), result.imaginaryComponent());
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.rsubi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Double(Double.NaN), result.complexArgument());
		assertEquals(new Double(Double.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(Double.NaN), result.absoluteValue());
		assertEquals(new Double(Double.NaN), result.imaginaryComponent());
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber set = new ComplexDouble(1.0);

		IComplexNumber result = fixture.set(set);

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
	 * Run the org.jblas.ComplexDouble set(double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSet_2()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double real = 1.0;
		double imag = 1.0;

		org.jblas.ComplexDouble result = fixture.set(real, imag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 1.0i", result.toString());
		assertEquals(1.4142135623730951, result.abs(), 1.0);
		assertEquals(0.7853981633974484, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(-0.5, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number real = new Byte((byte) 1);
		Number imag = new Byte((byte) 1);

		IComplexNumber result = fixture.set(real, imag);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Double(0.7853981633974484), result.complexArgument());
		assertEquals(new Double(0.5), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(0.7071067811865476), result.absoluteValue());
		assertEquals(new Double(-0.5), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the ComplexDouble sqrt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSqrt_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

		ComplexDouble result = fixture.sqrt();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals("1.0 + 0.0i", result.toString());
		assertEquals(1.0, result.abs(), 1.0);
		assertEquals(0.0, result.arg(), 1.0);
		assertEquals(1.0, result.real(), 1.0);
		assertEquals(new Double(0.0), result.complexArgument());
		assertEquals(new Double(1.0), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(-0.0, result.imag(), 1.0);
		assertEquals(new Double(-0.0), result.imaginaryComponent());
		assertEquals(true, result.isReal());
		assertEquals("-1.0 + -0.0i", result.toString());
		assertEquals(3.141592653589793, result.arg(), 1.0);
		assertEquals(-1.0, result.real(), 1.0);
		assertEquals(0.0, result.imag(), 1.0);
	}

	/**
	 * Run the org.jblas.ComplexDouble sub(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSub_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double r = 1.0;

		org.jblas.ComplexDouble result = fixture.sub(r);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0.0, result.abs(), 1.0);
		assertEquals(Double.NaN, result.arg(), 1.0);
		assertEquals(0.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(Double.NaN, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number r = new Byte((byte) 1);

		IComplexNumber result = fixture.sub(r);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Double(1.5707963267948966), result.complexArgument());
		assertEquals(new Double(0.0), result.realComponent());
		assertEquals(true, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(new Double(1.0), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexDouble sub(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSub_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result = fixture.sub(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0.0, result.abs(), 1.0);
		assertEquals(Double.NaN, result.arg(), 1.0);
		assertEquals(0.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(Double.NaN, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.sub(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Double(Double.NaN), result.complexArgument());
		assertEquals(new Double(Double.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(Double.NaN), result.absoluteValue());
		assertEquals(new Double(Double.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexDouble subi(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double a = 1.0;

		org.jblas.ComplexDouble result = fixture.subi(a);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0.0, result.abs(), 1.0);
		assertEquals(Double.NaN, result.arg(), 1.0);
		assertEquals(0.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(Double.NaN, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		Number a = new Byte((byte) 1);

		IComplexNumber result = fixture.subi(a);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isZero());
		assertEquals(new Double(1.5707963267948966), result.complexArgument());
		assertEquals(new Double(0.0), result.realComponent());
		assertEquals(true, result.isImag());
		assertEquals(new Double(1.0), result.absoluteValue());
		assertEquals(new Double(1.0), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexDouble subi(ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_3()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result = fixture.subi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals("0.0 + 0.0i", result.toString());
		assertEquals(0.0, result.abs(), 1.0);
		assertEquals(Double.NaN, result.arg(), 1.0);
		assertEquals(0.0, result.real(), 1.0);
		assertEquals(false, result.isImag());
		assertEquals(Double.NaN, result.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);

		IComplexNumber result = fixture.subi(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isZero());
		assertEquals(new Double(Double.NaN), result.complexArgument());
		assertEquals(new Double(Double.NaN), result.realComponent());
		assertEquals(false, result.isImag());
		assertEquals(new Double(Double.NaN), result.absoluteValue());
		assertEquals(new Double(Double.NaN), result.imaginaryComponent());
		assertEquals(false, result.isReal());
	}

	/**
	 * Run the org.jblas.ComplexDouble subi(double,ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_5()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		double a = 1.0;
		org.jblas.ComplexDouble result = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result2 = fixture.subi(a, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(true, result2.isZero());
		assertEquals("0.0 + 0.0i", result2.toString());
		assertEquals(0.0, result2.abs(), 1.0);
		assertEquals(Double.NaN, result2.arg(), 1.0);
		assertEquals(0.0, result2.real(), 1.0);
		assertEquals(false, result2.isImag());
		assertEquals(Double.NaN, result2.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
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
	 * Run the org.jblas.ComplexDouble subi(ComplexDouble,ComplexDouble) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_8()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		org.jblas.ComplexDouble c = new org.jblas.ComplexDouble(1.0);
		org.jblas.ComplexDouble result = new org.jblas.ComplexDouble(1.0);

		org.jblas.ComplexDouble result2 = fixture.subi(c, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(false, result2.isZero());
		assertEquals("1.0 + 0.0i", result2.toString());
		assertEquals(1.0, result2.abs(), 1.0);
		assertEquals(0.0, result2.arg(), 1.0);
		assertEquals(1.0, result2.real(), 1.0);
		assertEquals(false, result2.isImag());
		assertEquals(-0.0, result2.imag(), 1.0);
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
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.subi(c, result);

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
	 * Run the IComplexNumber subi(IComplexNumber,IComplexNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testSubi_10()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);
		IComplexNumber c = new ComplexDouble(1.0);
		IComplexNumber result = new ComplexDouble(1.0);

		IComplexNumber result2 = fixture.subi(c, result);

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
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/7/15 7:18 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ComplexDouble fixture = new ComplexDouble(1.0);

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
		new org.junit.runner.JUnitCore().run(ComplexDoubleTest.class);
	}
}