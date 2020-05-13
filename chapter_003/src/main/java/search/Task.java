package search;

/**
 * Модель данных.
 * Задача с описанием и приоритетом.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.05.2020
 */
public class Task {
    private String description;
    private int priority;

    /**
     * Конструктор модели данных.
     *
     * @param description описание задачи.
     * @param priority    приоритет задачи.
     */
    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    /**
     * Возвращет приоритет задачи.
     *
     * @return приоритет.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Возвращает описание задачи.
     *
     * @return описание задачи.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Метод используется при отладке.
     *
     * @return специально сформированная строка.
     */
    @Override
    public String toString() {
        return "Task{"
                + "description='"
                + description + '\''
                + ", priority=" + priority
                + '}';
    }
}
