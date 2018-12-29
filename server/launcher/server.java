package launcher;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

import singletons.ServerSocketSingleton;

public class server {
	
    public static DataInputStream dis;
    public static DataOutputStream dos;
    
	public static void main(String[] args) {
		try {
			
			System.out.println(ServerSocketSingleton.getIntance().toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
