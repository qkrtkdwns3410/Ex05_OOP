package default11;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        SystemSpeaker speaker = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        //5 ,5
        System.out.println(speaker.getVolume());
        System.out.println(speaker2.getVolume());

        speaker.setVolume(11);
        //11 , 11
        System.out.println(speaker.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolume(22);
        //22, 22
        System.out.println(speaker.getVolume());
        System.out.println(speaker2.getVolume());


    }
}














