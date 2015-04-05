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
		cl.infoLog("���������� a �����: " + a);
		
		while (b == a) {
			b = (int) (Math.random()*(10));
			cl.debugLog("��������� ��������� ������ � ������ ����������: " + (b == a));
			cl.errorLog("���������� b ��������!");
		} 
		cl.infoLog("���������� b �����: " + b);
		
		while (c == a || c == b) {
			c = (int) (Math.random()*(10));
			cl.debugLog("��������� ��������� ������� � ������ ����������: " + (c == a));
			cl.debugLog("��������� ��������� ������� � ������ ����������: " + (c == b));
			cl.errorLog("���������� c ��������!");
		} 
		cl.infoLog("���������� c �����: " + c);
		
		while (d == a || d == b || d == c) {
			d = (int) (Math.random()*(10));
			cl.debugLog("��������� ��������� ��������� � ������ ����������: " + (d == a));
			cl.debugLog("��������� ��������� ��������� � ������ ����������: " + (d == b));
			cl.debugLog("��������� ��������� ��������� � ������� ����������: " + (d == c));
			cl.errorLog("���������� d ��������!");
		} 
		cl.infoLog("���������� d �����: " + d);
		cl.infoLog("��� �������� �������� �������!");
	}
	
	static void print() {
		cl.infoLog("���������: " + a + b + c + d);
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