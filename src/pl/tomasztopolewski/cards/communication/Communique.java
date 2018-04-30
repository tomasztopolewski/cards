package pl.tomasztopolewski.cards.communication;

public abstract class Communique {
    public static String nameGame = "Cards";
    public static String author = "Tomasz Topolewski";
    public static String version = "v1.01.15";
    public static String typeOfVersion = "preDEV";
    public static String longStartDateWork = "23rd Feburary 2018";
    public static String medianStartDateWork = "Feburary 2018";
    public static String shortStartDateWork = "Feb 2018";
    public static String longDate = "//4th July 2017";
    public static String medianDate = "//July 2017";
    public static String shortDate = "//Jul 2017";

    public static String welcome =  "\t" + nameGame + version + "\n";
    public static String startWelcome = "\t" + nameGame + version + "\n\t" + shortStartDateWork + " - " + shortDate + "\n\n";
    public static String shortWelcome = "\n---------------------------------------------------\n\t" + nameGame + version + " - Oct2015\n\n";


    public static String getNameGame() {
        return nameGame;
    }
    public static String getAuthor() {
        return author;
    }
    public static String getVersion() {
        return version;
    }
    public static String getStartDateWork() {
        return longStartDateWork;
    }
    public static String getShortStartDateWork() {
        return shortStartDateWork;
    }
    public static String getShortDate() {
        return shortDate;
    }

    /*public void viewWelcome() {
        System.out.print(welcome);
    }
    public void viewShortWelcome() {
        System.out.print(shortWelcome);
    }
    public void viewStartWelcome() {
        System.out.print(startWelcome);
    }*/
    public static void viewWelcome() {
        System.out.print("\t" + nameGame + version + "\n");
        System.out.print("\t" + medianStartDateWork + " - " + medianDate + "\n\n");
    }


    public static void viewNameGame() {
        System.out.print("Name game: " + nameGame);
    }
    public static void viewAuthor() {
        System.out.print("Author of game: " + author + "\n");
    }
    public static void viewVersion() {
        System.out.print("Version of game: " + version + "\n");
    }

    public static void animationWait(int sec) throws InterruptedException {
        System.out.print("\n\tWaiting");
        Thread.sleep(1000);
        for (int i = 1; i <= sec; i++) {
            System.out.print(".");
            Thread.sleep(2000);
        }
        System.out.print("\n");
    }
    public static void animationSimpleWaitLoadSettings(int sec) throws InterruptedException {
        Thread.sleep(2000);
        System.out.print("\n\tLoading settings");
        Thread.sleep(1000);
        for (int i = 1; i <= sec; i++) {
            System.out.print(".");
            Thread.sleep(2000);
        }
        System.out.print("\n");
    }
    public static void animationStartLoadingSettings() throws InterruptedException {
        Thread.sleep(500);
        System.out.print("Loading settings ");
        Thread.sleep(200);
        System.out.print("0% ");
        for (int k = 0; k < 3; k++) {
            Thread.sleep(500);
            System.out.print(".");
        }
    }
    public static void animationEndLoadingSettings() throws InterruptedException {
        Thread.sleep(1000);
        System.out.print(" 100%\n\n");
        Thread.sleep(1000);
    }

    public static void viewGoodbay() throws InterruptedException {
        System.out.print("Good bay!\n");
        Thread.sleep(5000);
        System.out.print("\n\nCreated by " + author + "\n");
        Thread.sleep(2500);
        System.exit(1);
    }
}

// Tomasz Topolewski