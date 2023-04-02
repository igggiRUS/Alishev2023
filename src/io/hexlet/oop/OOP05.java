package io.hexlet.oop;

public class OOP05 {
    public static void main(String[] args) {

        Url05 url05 = new Url05("https://google.com");
        OOP05.checkSecurity(url05);
    }

    public static String checkSecurity(Url05 url05) {
        // BEGIN (write your solution here)
        if (url05.getProtocol().equals("https")) {
            return "Connection to " + url05.getHost() + " is secure";
        } else {
            return "Connection to " + url05.getHost() + " is not secure";
        }
        // END
    }
}

