package pl.tomasztopolewski.cards.communication.console;

import pl.tomasztopolewski.cards.communication.Communique;

public class Console {
    private Order order;

    /*private ManagerObjects managerObjects;*/

    /*public Console() throws FileNotFoundException {
        managerObjects = new ManagerObjects("load values from file");
    }*/
//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////

    public void createOrder() {
        //System.out.print("  SYSTEM_INFO: Tworzenie obiektu 'Order' przez Console..\n");
        order = new Order();
    }

    public void removeOrder() {
        //System.out.print("  SYSTEM_INFO: Kasowanie obiektu 'Order' przez Console.\n");
        order = null;
    }

    public void doOrder() throws InterruptedException {
        switch (order.getNumberSwitch()) {
            case 999:
                try {
                    Communique.viewGoodbay();
                } catch (InterruptedException e) { /*e.printStackTrace();*/ }
                break;

            /*case 10101:
                //System.out.print("buy building Architect\n");
                managerObjects.buyArchitect();
                break;*/


            case 0:
                System.out.print("SYSTEM-WARN: Wpisane polecenie nie jest obsługiwane.\n");
                break;
            default:
                System.out.print("SYSTEM-WARN: System nie rozpoznaje polecenia.");
                break;
        }
    }
}

// Tomasz Topolewski