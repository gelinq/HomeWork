package Storage;
//todo [11.03.20 20:51]
//нужно спроектировать свою систему склада: у Вас должен быть класс товар,
// наполните его 5 атрибутами, должен класс - Приёмщик, у него тоже 5 атрибутов.
// Почти тоже самое, что мы узнали на прошло занятии, просто нужно потренироваться
// самим выделять классы из реальной жизни.
//У каждого класса должно быть по 2 метода, которые выводят различную информацию об этом классе

public class ObjectWithAmount extends Object{
    Double amount;

    public ObjectWithAmount(String name, Double quantity, String measure, String itemCode, Double price, Double amount) {
        super(name, quantity, measure, itemCode, price);
        this.amount = amount;

    }

    @Override
    public String toString() {
        return "Object{" +
                "name ='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", measure ='" + measure + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

}
