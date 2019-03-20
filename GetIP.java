import java.net.*;
import java.io.*;
import java.util.Scanner;

class GetIP {
  public static void main(String args[])throws UnknownHostException{
  Scanner sc = new Scanner(System.in);
  System.out.println("please enter name  if the website");
  String s = sc.next();
  try{
  URL url = new URL(s);
  InetAddress ip = InetAdress.getByName(url.getHost());
  System.out.println("Public IP Address of: "| ip);
  }
  catch (MalformedURLException e){
  System.out.println("Invalid URL");
  }
  }
  }
