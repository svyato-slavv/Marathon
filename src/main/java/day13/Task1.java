package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Svyatoslav");
        User user2 = new User("Masha");
        User user3 = new User("Vova");
        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "...");
        user2.sendMessage(user1, "Ну привет!");
        user2.sendMessage(user1, "Чего хотел?");
        user2.sendMessage(user1, "Алоооо???");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Что делаешь?");
        user3.sendMessage(user1, "Ответь пожалуйста!!!");
        user1.sendMessage(user3, "Все хорошо");
        user1.sendMessage(user3, "Ничего не делаю");
        user1.sendMessage(user3, "Чего пристал то?");
        user3.sendMessage(user1,"Пока!");
        MessageDatabase.showDialog(user1,user3);

    }
}
