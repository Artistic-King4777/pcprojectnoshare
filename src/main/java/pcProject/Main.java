package pcProject;

public class Main {
    public static void main(String[] args) {

        PC rainbowJelly = new PC(new Motherboard("Rainbow Sparkle: Extravaganza Special Edition", "Gheyzz INC.", 6, 9, "z4.42"),
                new Monitor("AliENfoRcE Monitors", "ButterflyGalaxy INC.", 36, new Resolution(2080, 900)),
                new Case("HeavyDuty Guardian Box 6.0", "Quark Star Systems INC.", "480V", new Dimensions(42, 24, 8)));
        // end of pc obkect

        System.out.println(rainbowJelly.toString() + "\n" + "==================================================");

        rainbowJelly.getMotherboard().loadProgram("GheyzzRainbowWare Systems 42");
        rainbowJelly.powerUp();

        System.out.println("============================================================");

        rainbowJelly.getCases().pressPowerButton();

        



    }
}
