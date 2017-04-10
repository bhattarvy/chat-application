import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class server1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner q=new Scanner(System.in);
		ServerSocket ss=new ServerSocket(8080);
		Socket s=ss.accept();
		OutputStream os=s.getOutputStream();
		BufferedInputStream bi=new BufferedInputStream(s.getInputStream());
		PrintWriter pw=new PrintWriter(os);
		boolean t=true;
		String h=q.next();
		
		pw.write(h);
		pw.flush();
		
		//pw.close();
		
		
		
		//InputStream is=s.getInputStream();
		System.out.println("sdsdsa");
		int i=bi.read();
		System.out.println((char)i);
		
		
		
		

	}

}
