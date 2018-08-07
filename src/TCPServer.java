import java.net.*;
import java.util.Scanner;
import java.io.*;

public class TCPServer {

	public TCPServer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws IOException{
		//Register service on port 1234
		int port = 1234;
		ServerSocket server = new ServerSocket(port);
		while(true) {
			Socket s1 = server.accept();	//Wait and accept a connection
			//Get a communication stream associated with the socket
			OutputStream s1Out = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(s1Out);
			//Send a string!
			String var = "Hi there!";
			dos.writeUTF(var);
			//Close the connection, but not the server socket
			dos.close();
			s1Out.close();
			s1.close();
		}
	}
}
