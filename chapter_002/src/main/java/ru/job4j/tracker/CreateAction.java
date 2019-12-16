package ru.job4j.tracker;

/**
 * Класс реализации создния записи.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2019
 */
public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "Create a new Item";
    }

    /**
     * Создать запись.
     *
     * @param input   объект пользовательского ввода
     * @param tracker объект доступа к классу Tracker
     * @return флаг выхода.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("\n--- Create a new item ---");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("New item created:");
        System.out.println("[name]: " + item.getName() + " [id]: " + item.getId());
        System.out.println();
        return true;
    }
}