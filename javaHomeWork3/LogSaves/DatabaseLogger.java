package LogSaves;

import �nterfaces.Loggers;

public class DatabaseLogger implements Loggers {

	@Override
	public void log(String message) {
		System.out.println("database logland� " + message);
		
	}

}
