package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;


    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;

    }


    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String BonusIsPayed() {
        if (isPayed) {
            return "Да";
        } else
            return "Нет";
    }

    @Override
    public String toString() {
        return "Заработная плата: " + salary + "\nБыл выплачен бонус или нет: " + BonusIsPayed();
    }

    @Override
    public void doWork() {
        warehouse.plusCountDelivered();
        salary +=100 ;

    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return ;
        }
        if (warehouse.getCountDeliveredOrders() >= 10000) {
            isPayed = true;
        }
        if (!isPayed) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary+=50000;
            System.out.println("Выплачен бонус в размере 50000");
        }
    }
}
