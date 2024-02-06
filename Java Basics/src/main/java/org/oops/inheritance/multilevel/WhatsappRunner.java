package org.oops.inheritance.multilevel;

public class WhatsappRunner {
    public static void main(String[] args) {
        System.out.println("-------------v1---------------");

        WhatsappV1 v1=new WhatsappV1();
        v1.message();


        System.out.println("--------------v2--------------");

        WhatsappV2 v2= new WhatsappV2();
        v2.call();
        v2.message();

        System.out.println("--------------v3--------------");

        WhatsappV3 v3=new WhatsappV3();
        v3.call();
        v3.message();
        v3.videoCall();

        System.out.println("------------------------------");

    }
}
