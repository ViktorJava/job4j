package ru.job4j.tracker;

/**
 * Редактирование пункта.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2019
 */
public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("\n--- Edit item ---");
        String id = input.askStr("Enter old id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("(OK) Task changed");
            System.out.println("[name]: " + item.getName() + " [id]: " + item.getId());
        } else {
            System.out.println("(Error) Task not found");
        }
        System.out.println();
        return true;
    }
}