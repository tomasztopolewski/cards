/**
 * Klasa wchodzą w skład nowego rozumienia połączenia Console-Order.
 * Po ukończeniu zaimplementowany zostanie nowy kod polecenia składający się z liter i cyft.
 * Klasa wspomagająca i rozszerzająca o nowy typ: CodeSwitch.
 */

package pl.tomasztopolewski.cards.communication.console;

public abstract class Orders {

    public final int quantityOfNumbersSwitch = 9;
    /*public final String
            AA10101 = "AA-10101", AA20101 = "AA-20101", AA30101 = "AA-30101",
            AB10101 = "AB-10101", AB20101 = "AB-20101", AB30101 = "AB-30101",
            BA10101 = "BA-10101", BA20101 = "BA-20101", BA30101 = "BA-30101";*/

    public final String[] numbersSwitchLetters = {"AA", "AA", "AA", "AB", "AB", "AB", "BA", "BA", "BA"};
    public final int[] numbersSwitchDigits = {10101, 20101, 30101, 10101, 20101, 30101, 10101, 20101, 30101};

    public final int
            AA10101 = 0, AA20101 = 1, AA30101 = 2,
            AB10101 = 3, AB20101 = 4, AB30101 = 5,
            BA10101 = 6, BA20101 = 7, BA30101 = 8;

    //public getCodeSwitch(String codeSwitch)
}
