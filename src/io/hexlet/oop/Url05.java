package io.hexlet.oop;
class Url05 {
    private String url05;
    private String protocol;
    private String host;

    Url05(String url05){
        this.url05 = url05;
    }

    public String getProtocol(){
        String[] parts = url05.split("://");
        protocol = parts[0];
        host = parts[1];
        return this.protocol;
    }

    public String getHost(){
        String[] parts = url05.split("://");
        protocol = parts[0];
        host = parts[1];
        return this.host;
    }
}