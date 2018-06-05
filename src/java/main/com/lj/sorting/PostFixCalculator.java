package com.lj.sorting;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostFixCalculator {
	
	public int postFix(String input) {
		String[] stringArray = input.split(" ");
		Deque<Integer> intValues = new ArrayDeque<>();
		Deque<String> operation = new ArrayDeque<>();
		
		for(String x : stringArray) {
			try {
				intValues.push(Integer.valueOf(x));
			} catch(NumberFormatException e) {
				operation.push(x);
			}
		}
		int runningSum = intValues.pop();
		while(!operation.isEmpty()) {
			switch(operation.pop()) {
			case "+" :
				runningSum += intValues.pop();
				break;
			case "*" :
				runningSum *= intValues.pop();
				break;
			case "/" :
				if(intValues.peek() == 0 ) {
					System.out.println("can't divide by zero");
					intValues.pop();
				} else {
				runningSum /= intValues.pop();
				}
				break;
			case "-" :
				runningSum -= intValues.pop();
				break;
			default :
				break;
			}
		}
		
		return runningSum;
	}
}
