package IstrategyLogClasses;

import Interfaces.IStrategyLog;

public class ConsoleLog implements IStrategyLog {
	private static ConsoleLog consoleLog  = new ConsoleLog();
	
	private ConsoleLog() {
		
	}
	
	@Override
	public void errorLog(String el) {
		System.err.println(">>> " + el);		
	}

	@Override
	public void infoLog(String el) {
		System.out.println(">>> " + el);		
	}

	@Override
	public void debugLog(String el) {
		System.out.println(">>> " + el);		
	}
	
	public static ConsoleLog getConsoleLog() {
		return consoleLog;
	}
}
