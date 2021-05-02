package LogSaves;

import Ýnterfaces.Loggers;

public class EmailLogger implements Loggers {

	@Override
	public void log(String message) {
		System.out.println("email log gönderildi " + message);
		
	}

}
