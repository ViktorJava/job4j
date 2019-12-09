package ru.job4j.tracker;

/**
 * Реализация класса StartUI [#784]
 * 1. Доработайте класс StartUI. Реализовать методы: showMenu() и init()
 * 2. Программа должна выводить меню. Каждый пункт меню должен работать.
 * <p>
 * Разрыв зависимости StartUI от Scanner. [#181778]
 * 1. Разорвите зависимость класса StartUI от класса Scanner.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.11.2019
 */
public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.viewItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemId(input, tracker);
            } else if (select == 5) {
                StartUI.findItemName(input, tracker);
            } else if (select == 6) {
                System.out.println("=== Exit program ===");
                run = false;
            }
        }
    }

    public static void findItemName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ===");
        String name = input.askStr("Enter item name: ");
        for (Item item : tracker.findByName(name)) {
            System.out.println("Name: " + item.getName() + " id: " + item.getId());
        }
    }

    public static void findItemId(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        String id = input.askStr("Enter item id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("name: " + item.getName() + " id: " + item.getId());
        } else {
            System.out.println("Task not found");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter item id: ");
        if (tracker.delete(id)) {
            System.out.println("[OK] Task deleted");
        } else {
            System.out.println("[Error] Task not found");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter old id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("[OK] Task changed");
            System.out.println("Name: " + item.getName() + " id: " + item.getId());
        } else {
            System.out.println("[Error] Task not found");
        }
    }

    public static void viewItems(Tracker tracker) {
        System.out.println("=== All items ===");
        for (Item item : tracker.findAll()) {
            System.out.println("Name: " + item.getName() + " id: " + item.getId());
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String select = input.askStr("Enter name: ");
        Item item = new Item(select);
        tracker.add(item);
        System.out.println("=== New item ===");
        System.out.println("name: " + item.getName() + " id: " + item.getId());
    }

    public static void showMenu() {
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
//         создаём объект на который не сохраняем ссылку в переменной,
//         это используется, когда объект одноразовый.
        new StartUI().init(input, tracker);
    }
}