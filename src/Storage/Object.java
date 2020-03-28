package Storage;
//todo [11.03.20 20:51]
//нужно спроектировать свою систему склада: у Вас должен быть класс товар,
// наполните его 5 атрибутами, должен класс - Приёмщик, у него тоже 5 атрибутов.
// Почти тоже самое, что мы узнали на прошло занятии, просто нужно потренироваться
// самим выделять классы из реальной жизни.
//У каждого класса должно быть по 2 метода, которые выводят различную информацию об этом классе

public class Object {
    String name;
    Double quantity;
    String measure;
    String itemCode;
    Double price;
   // Double amount;

    public Object(String name, Double quantity, String measure, String itemCode, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.measure = measure;
        this.itemCode = itemCode;
     //   this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Object{" +
                "name ='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", measure ='" + measure + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
    int counter = 0;
    public Object[] objects;

    public void objectAdd(Object object){
        objects[counter] = object;
        counter++;
    }
    public void objectsInfo() {
        System.out.println("Список объектов на складе:"+ objects);
    }
    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public String getItemCode() {
        return itemCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
