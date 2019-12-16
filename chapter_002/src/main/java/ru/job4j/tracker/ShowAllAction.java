package ru.job4j.tracker;

/**
 * Класс реализации отображения всех записей.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2019
 */
public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    /**
     * Показать записи.
     *
     * @param input   объект пользовательского ввода
     * @param tracker объект доступа к классу Tracker
     * @return флаг выхода.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("\n--- Show all items ---");
        int count = 0;
        for (Item item : tracker.findAll()) {
            System.out.println((count++) + ". [name]: " + item.getName() + " [id]: " + item.getId());
        }
        System.out.println();
        return true;
    }
}