package ro.ase.cts.g1099.design.patterns.models;

import java.io.IOException;
import java.util.HashMap;

import ro.ase.cts.g1099.design.patterns.exceptions.InvalidArgumentException;
import ro.ase.cts.g1099.design.patterns.interfaces.ILogging;

public class LoggerGenerator {
	private static HashMap<LoggerType, ILogging> loggers = new HashMap<>();
	
	public static ILogging getLogger(LoggerType type) {
		
		ILogging logger = loggers.get(type);
		
		if(logger == null) {
			try {
				logger = new Logger(type.getFilename(), type.getMessagePatern());
				loggers.put(type, logger);
			} catch (InvalidArgumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return logger;
	}
}
