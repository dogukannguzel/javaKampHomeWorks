package LogSaves;

import �nterfaces.Loggers;

public class FileLogger implements Loggers {

	@Override
	public void log(String message) {
		System.out.println("dosyaya logland� " + message);
		
	}

}
