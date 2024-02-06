package org.oops.inheritance.single;

public class WhatsappRunner {
    public static void main(String[] args) {
        Whatsapp w=new Whatsapp();
        w.message();

        WhatsappSub w1=new WhatsappSub();
        w1.call();
        w1.message();
    }
}
