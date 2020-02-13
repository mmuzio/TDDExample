package com.revature.util;

import com.revature.exception.SumTooLargeException;

public class CalcImpl <T extends Number> implements Calculator<T> {

	@Override
	public T add(T x, T y) {
		// TODO Auto-generated method stub
		//double xd = (double) x;
		//double yd = (double) y;
		Number ret = null;
		if (y.intValue() > (Integer.MAX_VALUE-x.intValue())) {
			throw new SumTooLargeException();
		}
		if (x instanceof Short) {
			ret = (short) (x.shortValue() + y.shortValue());
		}
		if (x instanceof Integer) {
			ret = x.intValue() + y.intValue();
		}
		if (x instanceof Double) {
			ret = x.doubleValue() + y.doubleValue();
		}
		if (x instanceof Float) {
			ret = x.floatValue() + y.floatValue();
		}
		
		//Number ret = x.doubleValue() + y.doubleValue();
		return (T) ret;
	}

	@Override
	public T subtract(T x, T y) {
		// TODO Auto-generated method stub
		Number ret = null;
		if (x instanceof Short) {
			ret = (short) (x.shortValue() - y.shortValue());
		}
		if (x instanceof Integer) {
			ret = x.intValue() - y.intValue();
		}
		if (x instanceof Double) {
			ret = x.doubleValue() - y.doubleValue();
		}
		if (x instanceof Float) {
			ret = x.floatValue() - y.floatValue();
		}
		
		//Number ret = x.doubleValue() + y.doubleValue();
		return (T) ret;
	}

	@Override
	public T div(T x, T y) {
		Number ret = null;
		
		if (x instanceof Short) {
			ret = (short) (x.shortValue() / y.shortValue());
		}
		if (x instanceof Integer) {
			ret = x.intValue() / y.intValue();
		}
		if (x instanceof Double) {
			ret = x.doubleValue() / y.doubleValue();
		}
		if (x instanceof Float) {
			ret = x.floatValue() / y.floatValue();
		}
		
		//Number ret = x.doubleValue() + y.doubleValue();
		return (T) ret;
	}

	@Override
	public T mult(T x, T y) {
		Number ret = null;
		if (x instanceof Short) {
			ret = (short) (x.shortValue() * y.shortValue());
		}
		if (x instanceof Integer) {
			ret = x.intValue() * y.intValue();
		}
		if (x instanceof Double) {
			ret = x.doubleValue() * y.doubleValue();
		}
		if (x instanceof Float) {
			ret = x.floatValue() * y.floatValue();
		}
		
		//Number ret = x.doubleValue() + y.doubleValue();
		return (T) ret;
	}

}
