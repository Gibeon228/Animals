import Animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Animal> petTeam;
    public static List<Animal> packTeam;
    public static int count;

    public Main() {
    }

    public static void main(String[] args) {
        init();
        Count count = new Count();
        int input = -1;
        while (input != 0) {
            System.out.println("Выберите дальнейшее действие: 0 - выйти из программы, 1 - Добавить животное в реестр, 2 - посмотреть команду домашнего животного, 3 - посмотреть команду вьючное животное, 4 - изменить команду домашнему животному, 5 - изменить команду вьючному животному");
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Какое животное вы хотите добавить");
                String inp = scanner1.nextLine();
                switch (inp) {
                    case "cat":
                        System.out.println("Вбейте имя, дату рожденья");
                        inp = scanner1.nextLine();
                        String date0 = scanner1.nextLine();
                        petTeam.add((new Cat(inp, date0)));
                        count.add();
                        break;
                    case "dog":
                        System.out.println("Вбейте имя, дату рожденья");
                        inp = scanner1.nextLine();
                        String date1 = scanner1.nextLine();
                        petTeam.add((new Dog(inp, date1)));
                        count.add();
                        break;
                    case "Hamster":
                        System.out.println("Вбейте имя, дату рожденья");
                        inp = scanner.nextLine();
                        String date = scanner.nextLine();
                        petTeam.add((new Hamster(inp, date)));
                        count.add();
                        break;
                    case "Horse":
                        System.out.println("Вбейте имя, дату рожденья");
                        inp = scanner1.nextLine();
                        String date2 = scanner1.nextLine();
                        packTeam.add((new Horse(inp, date2)));
                        count.add();
                        break;
                    case "Donkey":
                        System.out.println("Вбейте имя, дату рожденья");
                        inp = scanner1.nextLine();
                        String date3 = scanner1.nextLine();
                        packTeam.add((new Donkey(inp, date3)));
                        count.add();
                        break;
                    case "Camel":
                        System.out.println("Вбейте имя, дату рожденья");
                        inp = scanner1.nextLine();
                        String date4 = scanner1.nextLine();
                        packTeam.add((new Camel(inp, date4)));
                        count.add();
                        break;
                    default:
                        System.out.println("Некорректно введены данные");
                }
            } else if (input == 2) {
                System.out.println("Введите имя домашнего животного");
                String inp = scanner1.nextLine();
                seeCommandPet(inp);
            } else if (input == 3) {
                System.out.println("Введите имя вьючного животного: ");
                String inp = scanner1.nextLine();
                seeCommandPack(inp);
            } else if (input == 4) {
                System.out.println("Введите имя домашнего животного: ");
                String inp = scanner1.nextLine();
                setCommandPet(inp);
            } else if (input == 5) {
                System.out.println("Введите имя домашнего животного: ");
                String inp = scanner1.nextLine();
                setCommandPack(inp);
            }
        }
    }

    private static void setCommandPack(String name) {
        for (int i = 0; i < packTeam.size(); i++) {
            if (packTeam.get(i).getName().equals(name)) {
                System.out.printf("Введите название команды");
                Scanner scanner = new Scanner(System.in);
                String inp = scanner.nextLine();
                packTeam.get(i).setCommand(Commands.valueOf(inp));
            }
        }
    }

    private static void setCommandPet(String name) {
        for (int i = 0; i < petTeam.size(); i++) {
            if (petTeam.get(i).getName().equals(name)) {
                System.out.printf("Введите название команды");
                Scanner scanner = new Scanner(System.in);
                String inp = scanner.nextLine();
                petTeam.get(i).setCommand(Commands.valueOf(inp));
            }
        }
    }

    private static void seeCommandPack(String name) {
        for (int i = 0; i < packTeam.size(); i++) {
            if (packTeam.get(i).getName().equals(name)) {
                System.out.println(packTeam.get(i).getCommand());
            }
        }
    }


    private static void seeCommandPet(String name) {
        for (int i = 0; i < petTeam.size(); i++) {
            if (petTeam.get(i).getName().equals(name)) {
                System.out.println(petTeam.get(i).getCommand());
            }
        }
    }

    private static void init() {
        petTeam = new ArrayList<>();
        packTeam = new ArrayList<>();
        count = 0;
    }
}