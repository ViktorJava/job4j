package ru.job4j.tracker;

/**
 * Поиск пункта по индивидуальному идентификатору.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2019
 */
public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("\n--- Find item by Id ---");
        String id = input.askStr("Enter item id: ");
        System.out.println("please wait...");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("(OK) Task found");
            System.out.println("[name]: " + item.getName() + " [id]: " + item.getId());
        } else {
            System.out.println("(Info) Task not found");
        }
        System.out.println();
        return true;
    }
}