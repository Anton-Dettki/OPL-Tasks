 package seminar3;

public class OrderFulfillmentStock {
public static void main(String[] args) {
    int article1 = 10;
    int article2 = 10;
    int article3 = 10;

    String orderName = "article1";
    int orderQuantity = 15;

    if(orderName.equals("article1")) {
        if(article1 > orderQuantity) {
            article1 -= orderQuantity;
            System.out.println(orderQuantity + " Stück entnommen." + "Jetzt noch " + article1 + " Stück im Lager");
        } else {
            System.out.println("Nicht genug Ware vorhanden. Es wird nachbestellt.");
            article1 += 20;
        }
    } else if (orderName.equals("article2")) {
        if(article2 > orderQuantity) {
            article2 -= orderQuantity;
            System.out.println(orderQuantity + " Stück entnommen." + "Jetzt noch " + article2 + " Stück im Lager");
        } else {
            System.out.println("Nicht genug Ware vorhanden. Es wird nachbestellt.");
            article2 += 20;
        }
    }  else if (orderName.equals("article3")) {
        if(article3 > orderQuantity) {
            article3 -= orderQuantity;
            System.out.println(orderQuantity + " Stück entnommen." + "Jetzt noch " + article3 + " Stück im Lager");
        } else {
            System.out.println("Nicht genug Ware vorhanden. Es wird nachbestellt.");
            article3 += 20;
        }
    }

    System.out.println("Article1 quantity: " + article1);
    System.out.println("Article3 quantity: " + article3);
    System.out.println("Article2 quantity: " + article2);
}
}
