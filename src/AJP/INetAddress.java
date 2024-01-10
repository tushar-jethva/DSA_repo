package AJP;

import java.net.*;
import java.net.UnknownHostException;
import java.util.Arrays;

public class INetAddress {
    public static void main(String[] args) {
        try{
//            InetAddress ipAndHostName = InetAddress.getByName("www.google.com");
//            System.out.println(ipAndHostName);
//            InetAddress hostName = InetAddress.getLocalHost();
//            System.out.println(hostName);
//            InetAddress[] getAll = InetAddress.getAllByName("www.google.com");
//            System.out.println(Arrays.toString(getAll));
//            InetAddress getHostName = InetAddress.getByName("TEJ");
//            System.out.println(getHostName.getHostName());

            InetAddress ipAdddress = InetAddress.getByName("www.google.com");
            System.out.println(ipAdddress.getHostName());
            System.out.println(ipAdddress.getHostAddress());
        }
        catch (UnknownHostException e){
            System.out.println(e.toString());
        }
    }
}
