package ru.job4j.tracker;

/**
 * Класс реализации поиска записи по имени.
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

    /**
     * Поиск записи по имени.
     *
     * @param input   объект пользовательского ввода
     * @param tracker объект доступа к классу Tracker
     * @return флаг выхода.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println();
        System.out.println("--- Find items by name ---");
        String name = input.askStr("Enter item name: ");
        System.out.println("please wait...");
        for (Item item : tracker.findByName(name)) {
            System.out.println(String.format("[name]: %s [id]: %s", item.getName(), item.getId()));
        }
        System.out.println("(Info) search over");
        System.out.println();
        return true;
    }
}