package io.hexlet.oop;
import java.io.*;
import java.net.*;
public class AppUrl {
    public static void main(String[] args)
        {
            try
            {
                URL u = new URL("http://www.google.com");
                System.out.println("Protocol: " + u.getProtocol());
                System.out.println("Port Number: " + u.getPort());
                System.out.println("File Name: " + u.getFile());
                System.out.println("Host Name: " + u.getHost());
            } catch (Exception ex)
            {
                System.out.println(ex);
            }
        }

    }
