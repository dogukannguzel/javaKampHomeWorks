package LogSaves;

import �nterfaces.Loggers;

public class EmailLogger implements Loggers {

	@Override
	public void log(String message) {
		System.out.println("email log g�nderildi " + message);
		
	}

}
