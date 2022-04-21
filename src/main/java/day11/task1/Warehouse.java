package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public void plusCountPicked() {
        countPickedOrders++;
    }

    public void plusCountDelivered() {
        countDeliveredOrders++;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Количество собрынных заказов: " + countPickedOrders + "\nКоличество доставленных заказов: " + countDeliveredOrders;
    }
}
