package com.company;

public class Main {

    public static void main(String[] args) {

        Movement[] movements = new Movement[3];
        movements[0] = new Human("Гарри", 40, 1);
        movements[1] = new Cat("Барсик", 40, 3);
        movements[2] = new Robot("Валли", 70, 5);

        Сompetition[] сompetitions = new Сompetition[2];
        сompetitions[0] = new Waii("Стена", 2);
        сompetitions[1] = new Treadmill("Беговая дорожка", 50);

        for (int i = 0; i < movements.length; i++) {
            boolean rezult = true;
            for (int j = 0; j < сompetitions.length; j++) {
                rezult = сompetitions[j].moving(movements[i]);
                if (!rezult) {
                    System.out.println("Выбывает из соревнований");
                    break;
                }
            }
        }
    }
}
