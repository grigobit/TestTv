public class TestTv {
    public static void main(String[] args) {
        TV tv1 = new TV();
        System.out.println("Is tv1 on?");
        System.out.println(tv1.on);

        tv1.turnOn();
        System.out.println("Is tv1 on?");
        System.out.println(tv1.on);
        tv1.setChannel(30);
        tv1.setVolume(3);
        System.out.println("The channels of tv1 is: " + tv1.channel);
        System.out.println("the volume of tv1 is: " + tv1.volumeLevel);

        TV tv2 = new TV();
        tv2.turnOn();
        System.out.println("The default channel of tv2 is: " + tv2.channel);
        tv2.channelUp();
        System.out.println("The channel of tv2 is: " + tv2.channel);
        tv2.channelUp();
        System.out.println("The channel of tv2 is: " + tv2.channel);
        System.out.println("The default volume of tv2 is: " + tv2.volumeLevel);
        tv2.volumeUp();
        System.out.println("The volume of tv2 is: " + tv2.volumeLevel);






    }
}
