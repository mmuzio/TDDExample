package com.revature.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.util.CalcImpl;
import com.revature.util.Calculator;

public class CalculatorTest {

	private Calculator<Integer> intCalc;
	private Calculator<Double> doubCalc;
	private Calculator<Float> floatCalc;
	private Calculator<Short> shortCalc;
	
	@BeforeClass // runs once before any tests
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass // runs once after all tests finish
	public static void tearDownAfterClass() throws Exception {
	}

	@Before // runs once before each test
	public void setUp() throws Exception {
		intCalc = new CalcImpl<Integer>();
		doubCalc = new CalcImpl<Double>();
		floatCalc = new CalcImpl<Float>();
		shortCalc = new CalcImpl<Short>();
	}

	@After // runs once after each test
	public void tearDown() throws Exception {
	}

	@Test
	public void addTwoPositiveIntegers() {
		assertEquals("3 + 5 should equal 8", new Integer(8), intCalc.add(3, 5));
	}
	
	@Test
	public void addTwoPositiveDoubles() {
		assertEquals("3.0 + 5.0 should equal 8", new Double(8.0), doubCalc.add(3.0, 5.0));
	}
	
	@Test
	public void addTwoPositiveFloats() {
		assertEquals("3.0 + 5.0 should equal 8", new Float(8.0), floatCalc.add((float) 3.0, (float) 5.0));
	}
	
	@Test
	public void addTwoPositiveShorts() {
		assertEquals("3 + 5 should equal 8", new Short((short) 8), shortCalc.add((short) 3, (short) 5));
	}
	
	@Test
	public void addTwoNegativeIntegers() {
		assertEquals("3 - 5 should equal -2", new Integer(-2), intCalc.add(3, -5));
	}
	
	@Test
	public void addTwoNegativeDoubles() {
		assertEquals("3.0 - 5.0 should equal -2.0", new Double(-2.0), doubCalc.add(3.0, -5.0));
	}
	
	@Test
	public void addTwoNegativeFloats() {
		assertEquals("3.0 - 5.0 should equal -2.0", new Float(-2.0), floatCalc.add((float) 3.0, (float) -5.0));
	}
	
	@Test
	public void addTwoNegativeShorts() {
		assertEquals("3 - 5 should equal -2", new Short((short) -2), shortCalc.add((short) 3, (short) -5));
	}
	
	@Test
	public void subtractTwoPositiveIntegers() {
		assertEquals("3 - 5 should equal -2", new Integer(-2), intCalc.subtract(3, 5));
	}
	
	@Test
	public void subtractTwoPositiveDoubles() {
		assertEquals("3.0 - 5.0 should equal -2.0", new Double(-2.0), doubCalc.subtract(3.0, 5.0));
	}
	
	@Test
	public void subtractTwoPositiveFloats() {
		assertEquals("3.0 - 5.0 should equal -2.0", new Float(-2.0), floatCalc.subtract((float) 3.0, (float) 5.0));
	}
	
	@Test
	public void subtractTwoPositiveShorts() {
		assertEquals("3 - 5 should equal -2", new Short((short) -2), shortCalc.subtract((short) 3, (short) 5));
	}
	
	@Test
	public void subtractTwoNegativeIntegers() {
		assertEquals("3 - -5 should equal 8", new Integer(8), intCalc.subtract(3, -5));
	}
	
	@Test
	public void subtractTwoNegativeDoubles() {
		assertEquals("3.0 - -5.0 should equal 8.0", new Double(8.0), doubCalc.subtract(3.0, -5.0));
	}
	
	@Test
	public void subtractTwoNegativeFloats() {
		assertEquals("3.0 - -5.0 should equal 8.0", new Float(8.0), floatCalc.subtract((float) 3.0, (float) -5.0));
	}
	
	@Test
	public void subtractTwoNegativeShorts() {
		assertEquals("3 - 5 should equal 8", new Short((short) 8), shortCalc.subtract((short) 3, (short) -5));
	}
	
	@Test
	public void divTwoPositiveIntegers() {
		assertEquals("15 + 5 should equal 3", new Integer(3), intCalc.div(15, 5));
	}
	
	@Test
	public void divTwoPositiveDoubles() {
		assertEquals("15.0 + 5.0 should equal 3", new Double(3.0), doubCalc.div(15.0, 5.0));
	}
	
	@Test
	public void divTwoPositiveFloats() {
		assertEquals("15.0 + 5.0 should equal 3", new Float(3.0), floatCalc.div((float) 15.0, (float) 5.0));
	}
	
	@Test
	public void divTwoPositiveShorts() {
		assertEquals("15 + 5 should equal 3", new Short((short) 3), shortCalc.div((short) 15, (short) 5));
	}
	
	@Test
	public void divTwoNegativeIntegers() {
		assertEquals("15 - 5 should equal -3", new Integer(-3), intCalc.div(15, -5));
	}
	
	@Test
	public void divTwoNegativeDoubles() {
		assertEquals("15.0 - 5.0 should equal -3.0", new Double(-3.0), doubCalc.div(15.0, -5.0));
	}
	
	@Test
	public void divTwoNegativeFloats() {
		assertEquals("15.0 - 5.0 should equal -3.0", new Float(-3.0), floatCalc.div((float) 15.0, (float) -5.0));
	}
	
	@Test
	public void divTwoNegativeShorts() {
		assertEquals("15 / 5 should equal -3", new Short((short) -3), shortCalc.div((short) 15, (short) -5));
	}
	
	@Test
	public void multPositiveIntegers() {
		assertEquals("3 * 5 should equal 15", new Integer(15), intCalc.mult(3, 5));
	}
	
	@Test
	public void multPositiveDoubles() {
		assertEquals("3.0 * 5.0 should equal 15", new Double(15.0), doubCalc.mult(3.0, 5.0));
	}
	
	@Test
	public void multPositiveFloats() {
		assertEquals("3.0 * 5.0 should equal 15", new Float(15.0), floatCalc.mult((float) 3.0, (float) 5.0));
	}
	
	@Test
	public void multPositiveShorts() {
		assertEquals("3 * 5 should equal 15", new Short((short) 15), shortCalc.mult((short) 3, (short) 5));
	}
	@Test
	public void multTwoNegativeIntegers() {
		assertEquals("3 * -5 should equal -15", new Integer(-15), intCalc.mult(3, -5));
	}
	
	@Test
	public void multTwoNegativeDoubles() {
		assertEquals("3.0 * 5.0 should equal -15.0", new Double(-15.0), doubCalc.mult(3.0, -5.0));
	}
	
	@Test
	public void multTwoNegativeFloats() {
		assertEquals("3.0 * -5.0 should equal -15.0", new Float(-15.0), floatCalc.mult((float) 3.0, (float) -5.0));
	}
	
	@Test
	public void multTwoNegativeShorts() {
		assertEquals("3 * -5 should equal 15", new Short((short) -15), shortCalc.mult((short) 3, (short) -5));
	}

}
