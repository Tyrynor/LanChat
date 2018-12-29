package singletons;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketSingleton {
	private static ServerSocket ss;
	
	public static ServerSocket getIntance() throws IOException {
		if (ss == null) {
			ss = new ServerSocket(666);
		}
		return ss;
	}
	
	public static void clearInstance() throws IOException {
		ss.close();
		ss = null;
	}
}
