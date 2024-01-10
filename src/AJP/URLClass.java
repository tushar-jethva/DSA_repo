package AJP;
import java.io.IOException;
import java.net.*;
import java.util.Date;

public class URLClass {
    public static void main(String[] args) {
        try{
//            URL url = new URL("https","www.google.com",80,"/home.html");
//            System.out.println(url);
//            System.out.println(url.getProtocol());
//            System.out.println(url.getHost());
//            System.out.println(url.getPort());
//            System.out.println(url.getFile());
//            System.out.println(url.toURI());
//            System.out.println(url.getAuthority());
//            System.out.println(url.getDefaultPort());
            URL obj = new URL("https://www.w3schools.com/html/default.asp");
            URLConnection urlConnection = obj.openConnection();
            System.out.println(urlConnection.getOutputStream());
        }
        catch (MalformedURLException e){
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
