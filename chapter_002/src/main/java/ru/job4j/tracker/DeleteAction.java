package ru.job4j.tracker;

/**
 * Класс реализации удаления записи.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2019
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    /**
     * Удаление записи.
     *
     * @param input   объект пользовательского ввода
     * @param tracker объект доступа к классу Tracker
     * @return флаг выхода.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("\n--- Delete item ---");
        String id = input.askStr("Enter item id: ");
        if (tracker.delete(id)) {
            System.out.println("(OK) Task deleted");
        } else {
            System.out.println("(Error) Task not found");
        }
        System.out.println();
        return true;
    }
}