import java.net.*;
import java.io.*;

public class TCPClient {

	public TCPClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws IOException {
		//Open your connection to a server, at port 1234
		String host = "127.0.0.1";
		int port = 1234;
		try {
			Socket client = new Socket(host, port);
			//Get an input file handle from the socket and read the oinput
			InputStream clientIn = null;
			DataInputStream dis = null;
			clientIn = client.getInputStream();
			dis = new DataInputStream(clientIn);
			String st = new String(dis.readUTF());
			System.out.println(st);
			//When done, just close the connection and exit
			dis.close();
			clientIn.close();
			client.close();
		} catch(UnknownHostException uhe) {
			System.out.println("Unknow Host:" + host);
			uhe.printStackTrace();
		} catch(IOException ioe) {
			System.out.println("IOException:" + ioe);
			ioe.printStackTrace();
		}
	}
}
