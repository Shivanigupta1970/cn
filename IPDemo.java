import java.net.*;
import java.util.*;

public class ipdemo
{
	public static void main(String[] arg)
	{
		String host;
		Scanner ch=new Scanner(System.in);
		System.out.println("1) enter host 2)enter ip");
		int choice=ch.nextInt();
		if(choice==1)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("enter host :");
			host=input.nextLine();
			try
			{
				InetAddress address=InetAddress.getByName(host);
				System.out.println("host : "+address.getHostName());
				System.out.println("address : "+address.getHostAddress());
				System.out.println(""+address.toString());
			}
			catch(UnknownHostException ex)
			{
				System.out.println("Not found");
			}
		}
		else
		{
			Scanner input=new Scanner(System.in);
			System.out.println("enter ip :");
			host=input.nextLine();
			try
			{
				InetAddress address=InetAddress.getByName(host);
				System.out.println("host : "+address.getHostName());
				System.out.println("address : "+address.getHostAddress());
				System.out.println(""+address.toString());
			}
			catch(UnknownHostException ex)
			{
				System.out.println("Not found");
			}
		}
	}
}