package LogSaves;

import Ýnterfaces.Loggers;

public class FileLogger implements Loggers {

	@Override
	public void log(String message) {
		System.out.println("dosyaya loglandý " + message);
		
	}

}
