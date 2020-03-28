package Storage;

import java.util.Objects;

public class Main {



    public static ObjectWithAmount addAmount(Object a){
        Double amount = null;
        String name = a.getName();
        Double quantity = a.getQuantity();
        String measure = a.getMeasure();
        Double price = a.getPrice();
        String itemCode = a.getItemCode();
        amount = price*quantity;
        ObjectWithAmount b = new ObjectWithAmount(name, quantity, measure, itemCode, price, amount);
        return b;

    }
    public static void main(String[] args) {
        Object obj1 = new Object("Стол", 2.0, "штуки", "1c", 150.0);
        System.out.println("Товар без цены: "+obj1.toString());
        ObjectWithAmount a = addAmount(obj1);
        System.out.println("Товар с ценой : " + a.toString());




    }
}


