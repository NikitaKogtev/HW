package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Nikita");
        User user2 = new User("Katya");
        User user3 = new User("Sofi");

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Все хорошо");
        user2.sendMessage(user1, "У тебя как?");
        user3.sendMessage(user1, "Привет");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Что будешь делать?");
        user1.sendMessage(user3, "Привет");
        user1.sendMessage(user3, "Все хорошо");
        user1.sendMessage(user3, "Пойду гулять. Твои дела как?");
        user3.sendMessage(user1, "Я с вами");

        MessageDatabase.showDialog(user1, user3);
    }
}
