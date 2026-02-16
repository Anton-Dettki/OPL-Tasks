package seminar3;

public class OrderShipment {
    public static void main(String[] args) {
        String orderName = "article1";
        int orderQuantity = 1;
        /*
        switch (orderName) {
            case "article1":
                System.out.println("Füllmaterial Bereitstellen");
                if(orderQuantity >= 5) {
                    System.out.println("Gutschein 5€");
                }
                if (orderQuantity >= 10) {
                    System.out.println("Another Gutschein 5€");
                }
            case "article2":
                System.out.println("In Karton packen");
                break;
            case "article3":
                System.out.println("Direkt befestigen");
                break;
        }
        System.out.println("Versenden");
        if(orderQuantity < 5) {
            System.out.println("Kosten an Kunden");
        } if( orderQuantity <= 3) {
            System.out.println("Sonderkosten as well");
        }
        */

        // Task 3.2.6
        int status = 20;

        switch (status) {
            case 1,2,3:
                System.out.println("Voller Zugriff");
                break;
            case 4,5,6:
                System.out.println("Beschränkter Zugriff");
                break;
            default:
                System.out.println("Kein Zugriff");
        }
    }
}
