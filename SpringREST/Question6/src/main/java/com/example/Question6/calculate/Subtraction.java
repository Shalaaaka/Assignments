package com.example.Question6.calculate;

import com.example.Question6.calculator.Operation;

public class Subtraction implements Operation
{

	@Override
	public int apply(int a, int b) {
		return a-b;
	}

	@Override
	public boolean valid(char operator) {
		return '-'==operator;
	}

}
