package pl.tomasztopolewski.cards.communication.console;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Order {
    private final String charNewOrder = ">";
    private final int minimumLengthDownloadLine = 1;
    private final int maximumLengthDownloadLine = 64;

    private String downloadLine;

    private String order;

    private int numberSwitch = 0;
    public final int minimumNumberSwitch = 0;
    public final int maximumNumberSwitch = 100000;

    public Order() {
        downloadLine(charNewOrder);
        setOrder(downloadLine);
        createNumber();
    }
    public Order(String downloadLine) {
        setDownloadLine(downloadLine);
        setOrder(this.downloadLine);
        createNumber();
    }

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

    private void setDownloadLine(String downloadLine) {
        this.downloadLine = (downloadLine.length() >= minimumLengthDownloadLine && downloadLine.length() <= maximumLengthDownloadLine) ? downloadLine : "0";
    }
    private String getDownloadLine() {
        return downloadLine;
    }

    private void setOrder(String downloadLine) {
        //System.out.print("  SYSTEM_INFO: Ustawianie 'order' z pobranej linii przez 'Order'.\n");
        if (checkDownloadLine(downloadLine)) this.order = downloadLine;
        else {
            this.order = "0";
            System.out.print("Error: Polecenie jest niezgodne z warunkami. Jego dlugosc jest zbyt krotka lub zbyt dluga.\n");
        }
    }
    private void addOrder(String string) {
        if (string.length() > 0) order = order + " " + string;
    }
    public String getOrder() {
        return order;
    }

    private void setNumberSwitch(int numberSwitch) {
        //System.out.print("local number in setNumberSwitch: " + numberSwitch + "\t" + (numberSwitch >= minimumNumberSwitch && numberSwitch <= maximumNumberSwitch) + "\n");

        if (numberSwitch >= minimumNumberSwitch && numberSwitch <= maximumNumberSwitch) this.numberSwitch = numberSwitch;
        else this.numberSwitch = 0;

        //System.out.print("global number in setNumberSwitch: " + this.numberSwitch + "\n");
    }
    private void addNumberSwitch(int numberSwitch) {
        this.numberSwitch = (this.numberSwitch + numberSwitch) >= minimumNumberSwitch && numberSwitch >= minimumNumberSwitch && (this.numberSwitch + numberSwitch) <= maximumNumberSwitch && numberSwitch <= maximumNumberSwitch ? (this.numberSwitch + numberSwitch) : 0;
    }
    public int getNumberSwitch() {
        return numberSwitch;
    }

//////////////////////////////////////////////////////////////////////////

    public void downloadLine(String charNewOrder) throws NoSuchElementException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(charNewOrder + " ");

            String downloadLine = scanner.nextLine();
            setDownloadLine(downloadLine.trim());

        } catch (NoSuchElementException nsee) {
            setDownloadLine("0");
        } finally {}
        scanner.reset();

        //System.out.print("download line: " + downloadLine + "\n");
    }

    /*public boolean processDownloadLine() {
        if (order.equals("buy building architect") || order.equals("buy building warehouse") || order.equals("buy building quarry") || order.equals("buy building lumberjack") ||order.equals("buy building flowerbed") || order.equals("buy building house")) return true;
        else return false;
    }*/

    public void createNumber() {
        //System.out.print("\torder in createNumber: " + order + "\n");

        if (order.startsWith("/")) {
            //System.out.print("  SYSTEM_INFO: Ustawianie 'numberSwitch' przez 'Order' w warunku komendy.\n");
            createNumberForCommand();
        } else if (order.startsWith("$/")) {
            //System.out.print("  SYSTEM_INFO: Ustawianie 'numberSwitch' przez 'Order' w warunku super komendy.\n");
            createNumberForSuperCommand();
        } else {
            //System.out.print("  SYSTEM_INFO: Ustawianie 'numberSwitch' przez 'Order' w warunku polecenia.\n");
            //polecenie 'exit'
            if (order.startsWith("exit") && order.length() == 4) setNumberSwitch(999);

            //polecenia 'buy'
            if (order.startsWith("buy")) {
                addNumberSwitch(1);
                if (order.startsWith("buy building")) {
                    addNumberSwitch(100);
                    if (order.startsWith("buy building architect")) addNumberSwitch(10000);
                    else if (order.startsWith("buy building warehouse")) addNumberSwitch(20000);
                    else if (order.startsWith("buy building quarry")) addNumberSwitch(30000);
                    else if (order.startsWith("buy building lumberjack")) addNumberSwitch(40000);
                    else if (order.startsWith("buy building flowerbed")) addNumberSwitch(50000);
                    else if (order.startsWith("buy building house")) addNumberSwitch(60000);
                    else setNumberSwitch(0);
                } else setNumberSwitch(0);

                //polecenia 'upgrade'
            } else if (order.startsWith("upgrade")) {
                addNumberSwitch(2);
                if (order.startsWith("upgrade building")) {
                    addNumberSwitch(100);
                    if (order.startsWith("upgrade building architect")) addNumberSwitch(10000);
                    else if (order.startsWith("upgrade building warehouse")) addNumberSwitch(20000);
                    else if (order.startsWith("upgrade building quarry")) addNumberSwitch(30000);
                    else if (order.startsWith("upgrade building lumberjack")) addNumberSwitch(40000);
                    else if (order.startsWith("upgrade building flowerbed")) addNumberSwitch(50000);
                    else if (order.startsWith("upgrade building house")) addNumberSwitch(60000);
                    else setNumberSwitch(0);
                } else setNumberSwitch(0);

                //ustawiam numberSwitch dla numberSwitch poleceń 'window'
            } else if (order.startsWith("window")) {
                addNumberSwitch(3);
                if (order.startsWith("window parameter")) {
                    addNumberSwitch(10);
                    if (order.startsWith("window parameter building level architect")) addNumberSwitch(100000);
                    else if (order.startsWith("window parameter building level warehouse")) addNumberSwitch(200000);
                    else if (order.startsWith("window parameter building level quarry")) addNumberSwitch(300000);
                    else if (order.startsWith("window parameter building level lumberjack")) addNumberSwitch(400000);
                    else if (order.startsWith("window parameter building level flowerbed")) addNumberSwitch(500000);
                    else if (order.startsWith("window parameter building level house")) addNumberSwitch(600000);
                    else setNumberSwitch(0);
                }
            } else setNumberSwitch(0);

        }

        /*
        //ustawiam liczbe dla polecen 'window'
        if (order.startsWith("window")) {
            //if (order.startsWith("window "))
        } else setNumberSwitch(-1);
        */
    }

    public void createNumberForCommand() {
        if (order.startsWith("/999") && order.length() == 4) setNumberSwitch(999);

        //ustawiam numberSwitch dla numberSwitch poleceń 'buy'
        if (order.startsWith("/10101") && order.length() == 6) setNumberSwitch(10101);
        if (order.startsWith("/20101") && order.length() == 6) setNumberSwitch(20101);
        if (order.startsWith("/30101") && order.length() == 6) setNumberSwitch(30101);
        if (order.startsWith("/40101") && order.length() == 6) setNumberSwitch(40101);
        if (order.startsWith("/50101") && order.length() == 6) setNumberSwitch(50101);
        if (order.startsWith("/60101") && order.length() == 6) setNumberSwitch(60101);

        //ustawiam numberSwitch dla numberSwitch poleceń 'upgrade'
        if (order.startsWith("/10102") && order.length() == 6) setNumberSwitch(10102);
        if (order.startsWith("/20102") && order.length() == 6) setNumberSwitch(20102);
        if (order.startsWith("/30102") && order.length() == 6) setNumberSwitch(30102);
        if (order.startsWith("/40102") && order.length() == 6) setNumberSwitch(40102);
        if (order.startsWith("/50102") && order.length() == 6) setNumberSwitch(50102);
        if (order.startsWith("/60102") && order.length() == 6) setNumberSwitch(60102);

        //ustawiam numberSwitch dla numberSwitch poleceń 'window'


    }

    private void createNumberForSuperCommand() {}

    /*public boolean checkSyntaxOfDownloadLine(String downloadLine) {
        return downloadLine.startsWith("buy") ? true : false;
    }*/

    private boolean checkDownloadLine(String downloadLine) {
        return (downloadLine.length() >= minimumLengthDownloadLine && downloadLine.length() <= maximumLengthDownloadLine) ? true : false;
    }

    public void resetOrder() {
        downloadLine = "0";
        order = "0";
        numberSwitch = 0;
    }

///////////////////////////////////////////////////

    public String getTagNumberOfOrder(int i) {
        if (i >= 0 && i <= 9) return "00" + i;
        if (i >= 10 && i <= 99) return "0" + i;
        if (i >= 100 && i <= 999) return "" + i;
        return "0";
    }
}

// Tomasz Topolewski