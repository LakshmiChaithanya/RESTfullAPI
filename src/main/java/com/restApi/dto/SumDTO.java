package com.restApi.dto;

import java.util.ArrayList;

public class SumDTO {
	private ArrayList<Integer> numbers;
	private long runningTotal;
	public SumDTO(){
		this.numbers = new ArrayList<Integer>();
	}
	public ArrayList<Integer> getListOfNumbers() {
		return numbers;
	}
	public void setListOfNumbers(ArrayList<Integer> listOfNumbers) {
		this.numbers = listOfNumbers;
	}
	public long getSum() {
		return runningTotal;
	}
	public void setSum(long sum) {
		this.runningTotal = sum;
	}
	public void addElement(int value){
		numbers.add(value);
	}
}
