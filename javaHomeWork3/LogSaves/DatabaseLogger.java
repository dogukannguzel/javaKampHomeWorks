package LogSaves;

import Ýnterfaces.Loggers;

public class DatabaseLogger implements Loggers {

	@Override
	public void log(String message) {
		System.out.println("database loglandý " + message);
		
	}

}
