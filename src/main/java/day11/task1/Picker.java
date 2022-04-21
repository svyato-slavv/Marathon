package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        warehouse.plusCountPicked();
        salary += 80;


    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountPickedOrders() >= 10000) {
            isPayed = true;
        }
        if (!isPayed) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += 70000;
            System.out.println("Выплачен бонус в размере 70000");
        }

    }
}
