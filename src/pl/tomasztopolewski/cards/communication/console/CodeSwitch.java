package pl.tomasztopolewski.cards.communication.console;

public class CodeSwitch {

    // format: XX; np. AA, AB, BA etc.
    private String letters;
    // format: xxxxx; np. 100, 10101, 30201 etc.
    private int digits;

    /**
     * Poprawny konstruktor wywowałny w prawidłowy sposób.
     *
     */
    public CodeSwitch(String letters, int digits) {
        setLetters(letters);
        setDigits(digits);
    }

    /**
     * Domyślny konstruktor tworzący przypadek nieprawidłowy. Wywołanie go i
     * jednocześnie nieprawidłowe wartości w zmiennych świadczą o błędzie,
     * jaki został wykonany podczas pracy programu.
     */
    public CodeSwitch() {
        letters = "--";
        digits = -1;
    };


    public void setLetters(String letters) {
        this.letters = isLookingGood(letters) ? letters : "--";
    }
    public String getLetters() {
        return letters;
    }

    public void setDigits(int digits) {
        this.digits = isLookingGood(digits) ? digits : -1;
    }
    public int getDigits() {
        return digits;
    }

    private boolean isLookingGood(String letters) {
        if (letters.equals(letters)) return true;
        return true;
    }
    private boolean isLookingGood(int digits) {
        if (digits == digits) return true;
        return true;
    }
}
