package ru.job4j.tracker;

/**
 * Поиск пункта по имени.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2019
 */
public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("\n--- Find items by name ---");
        String name = input.askStr("Enter item name: ");
        System.out.println("please wait...");
        for (Item item : tracker.findByName(name)) {
            System.out.println("[name]: " + item.getName() + " [id]: " + item.getId());
        }
        System.out.println("(Info) search over\n");
        return true;
    }
}