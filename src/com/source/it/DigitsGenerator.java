package com.source.it;

import IstrategyLogClasses.ConsoleLog;

//import java.util.ArrayList;

public class DigitsGenerator {
	static ConsoleLog cl = ConsoleLog.getConsoleLog();
	
	static int a = (int) (Math.random()*(9)+1);
	static int b = (int) (Math.random()*(10));
	static int c = (int) (Math.random()*(10));
	static int d = (int) (Math.random()*(10));
	
	public static void generateNumber() {		
		cl.infoLog("Переменная a равна: " + a);
		
		while (b == a) {
			b = (int) (Math.random()*(10));
			cl.debugLog("Результат сравнения второй и первой переменной: " + (b == a));
			cl.errorLog("Переменная b изменена!");
		} 
		cl.infoLog("Переменная b равна: " + b);
		
		while (c == a || c == b) {
			c = (int) (Math.random()*(10));
			cl.debugLog("Результат сравнения третьей и первой переменной: " + (c == a));
			cl.debugLog("Результат сравнения третьей и второй переменной: " + (c == b));
			cl.errorLog("Переменная c изменена!");
		} 
		cl.infoLog("Переменная c равна: " + c);
		
		while (d == a || d == b || d == c) {
			d = (int) (Math.random()*(10));
			cl.debugLog("Результат сравнения четвертой и первой переменной: " + (d == a));
			cl.debugLog("Результат сравнения четвертой и второй переменной: " + (d == b));
			cl.debugLog("Результат сравнения четвертой и третьей переменной: " + (d == c));
			cl.errorLog("Переменная d изменена!");
		} 
		cl.infoLog("Переменная d равна: " + d);
		cl.infoLog("Все проверки пройдены успешно!");
	}
	
	static void print() {
		cl.infoLog("Результат: " + a + b + c + d);
	}
	
//	static ArrayList<Integer> al = new ArrayList<Integer>();
	
//	private static int size = 4;
//	private static int ind = 0;
//	private static int prev = 0;
	
//	public static ArrayList<Integer> generateNumber() {
//		for (ind = 0; ind < size; ind++) {
//			int i = (int) (Math.random()*(10));
//			
//			if (ind == 0 && i == 0)
//				i++;
//			while (prev == i) {
//				i = (int) (Math.random()*(10));
//			}				
//			prev = i;
//			al.add(i);
//		}
//		return al;
//	}
	
//	public static void printNumber() {
//		System.out.println(al);
//	}
//	
//	public void printElement(int ind) {
//		System.out.println(al.get(ind));
//	}
}