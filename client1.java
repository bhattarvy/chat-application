import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class client1 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s=new Socket("127.0.0.1",8080);
		InputStream is=s.getInputStream();
		OutputStream os=s.getOutputStream();
		BufferedInputStream bi=new BufferedInputStream(is);
		int i=bi.read();
		while(i!=-1){
			System.out.print((char)i);
			i=bi.read();
			
		}
		//bi.close();
		PrintWriter pw=new PrintWriter(os);
		pw.append("fhdif");
	//	System.out.println("ffsf");
		pw.flush();
}

}
