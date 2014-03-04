/**
 * 
 */
package TCPClient;

/**
 * @author alvin
 *
 */
import java.io.*;
import java.net.*;

public class TCPClient {
	
	static int port = 1024;
	
	public static void main(String[] args) throws IOException {
		Socket MyClient = null;
		try {
			MyClient = new Socket("0.0.0.0", port);
		} catch (IOException e) {
			System.out.println(e);
		} DataInputStream input;
		try {
			input = new DataInputStream(MyClient.getInputStream());
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}

