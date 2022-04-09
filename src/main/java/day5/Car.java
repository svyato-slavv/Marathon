package day5;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        if (model.isEmpty()){
            System.out.println("Ошибка ввода");
        }else {
            this.model = model;
        }
    }

    public void setColor(String color) {
        if (color.isEmpty()){
            System.out.println("Ошибка ввода");
        }else {
            this.color = color;
        }
    }

    public void setYear(int year) {
        if (year<=0){
            System.out.println("Ошибка ввода");
        }else {
            this.year = year;
        }
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
