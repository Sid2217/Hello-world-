//Network Details
package Network;
import java.net.*;
public class NetworkDetails {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println("Output of getlocalhost method" + ia);
		ia = InetAddress.getByName("siddhesh");
		System.out.println("Output of Getbyname method" + ia);
		InetAddress iaall[] = InetAddress.getAllByName("siddhesh");
		for (int i = 0; i < iaall.length; i++) {
			System.out.println("Output of all getallbyname method : " + iaall[i]);
		}
		System.out.println("Output of getAddress : " + ia.getAddress());
		System.out.println("Output of getHostAddress : " + ia.getHostAddress());
		System.out.println("Output of getHostName : " + ia.getHostName());
		System.out.println("Output of isMulticastAddress : " + ia.isMulticastAddress());
		
	}

}
