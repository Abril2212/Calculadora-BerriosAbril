package com.example.service;

import static org.junit.Assert.assertEquals;


public class CalculateSimpleTest {
	CalculateSimple calc = new CalculateSimple();
	
	@Test
	public void testAdd() {
		OperationModel operationModel = new OperationModel(5,6);
		int expResult = 11;
		int result = cal.add(operationModel);
		asertEquals(expResult,result);
	}
	
	@Test
	public void testSubtract() {
		OperationModel operationModel = new OperationModel(11,6);
		int expResult = 5;
		int result = cal.subtract(operationModel);
		asertEquals(expResult,result);
	}
	
	@Test
	public void testMultiply() {
		OperationModel operationModel = new OperationModel(11,6);
		int expResult = 66;
		int result = cal.multiply(operationModel);
		asertEquals(expResult,result);
	}
	
	@Test
	public void testDivide() {
		OperationModel operationModel = new OperationModel(8,2);
		int expResult = 4;
		int result = cal.divide(operationModel);
		asertEquals(expResult,result);
	}
	
	@Test
	public void testFibonacci() {
		OperationModel operationModel = new OperationModel(4);
		int expResult = 3;
		int result = cal.fibonacci(operationModel);
		asertEquals(expResult,result);
	}
	
	@Test
	public void testSqrt() {
		OperationModel operationModel = new OperationModel(4);
		int expResult = 2;
		int result = cal.sqrt(operationModel);
		asertEquals(expResult,result);
	}
	
	@Test
	public void testPower() {
		OperationModel operationModel = new OperationModel(4);
		int expResult = 16;
		int result = cal.power(operationModel);
		asertEquals(expResult,result);
	}
	
	@Test
	public void testFactorial() {
		OperationModel operationModel = new OperationModel(4);
		int expResult = 24;
		int result = cal.factorial(operationModel);
		asertEquals(expResult,result);
	}
	
}
