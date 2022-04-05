package ro.ase.cts.g1099.design.patterns.main;

import java.io.IOException;

import ro.ase.cts.g1099.design.patterns.exceptions.InvalidArgumentException;
import ro.ase.cts.g1099.design.patterns.models.Logger;
import ro.ase.cts.g1099.design.patterns.models.LoggerGenerator;
import ro.ase.cts.g1099.design.patterns.models.LoggerType;
import ro.ase.cts.g1099.design.patterns.models.singleton.registry.LoggerSingleton;

public class Main {

	public static void main(String[] args) throws InvalidArgumentException, IOException {
		
//		Logger logger = new Logger("info.log", "<Info>");
//		logger.log("Hello");
		
//		Logger logger = Logger.getLogger("info.log", "<Singleton>");
//		logger.log("Hello Singleton");
//		
//		Logger errorLoger = Logger.getLogger("error.log", "*Error*");
//		logger.log("Error");
		
		
		// VERSION 1 - same principle but without the pattern
		Logger logger = (Logger) LoggerGenerator.getLogger(LoggerType.ERROR);
		logger.log("Testing the singleton registry");
		
		Logger infoLogger = (Logger) LoggerGenerator.getLogger(LoggerType.INFO);
		infoLogger.log("Testing the INFO registry");
		
		// VERSION 2 - the singleton registry pattern
		LoggerSingleton info = LoggerSingleton.getLogger(LoggerType.INFO);
		info.log("Info message");
		
		LoggerSingleton error = LoggerSingleton.getLogger(LoggerType.ERROR);
		error.log("Error message");
	}

}
