package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Реализация класса StartUI [#784]
 * 1. Доработайте класс StartUI. Реализовать методы: showMenu() и init()
 * 2. Программа должна выводить меню. Каждый пункт меню должен работать.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.11.2019
 */
public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("--- All items ---");
                tracker.findAll();
            } else if (select == 2) {
                System.out.println("--- Edit item ---");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                Item item = new Item(name);
                tracker.replace(id, item);
            } else if (select == 3) {
                System.out.println("--- Delete item ---");
                System.out.print("Enter item Id: ");
                String id = scanner.nextLine();
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("--- Find item by Id ---");
                System.out.print("Enter item Id: ");
                String id = scanner.nextLine();
                tracker.findById(id);
            } else if (select == 5) {
                System.out.println("--- Find item by name ---");
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);
            } else if (select == 6) {
                System.out.println("--- Exit program ---");
                run = false;
            }
        }
    }

    public void showMenu() {
        System.out.println("=== Menu ===");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
