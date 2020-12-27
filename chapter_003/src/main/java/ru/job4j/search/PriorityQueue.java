package ru.job4j.search;

import java.util.LinkedList;

/**
 * Очередь с приоритетами - это коллекция,
 * в которой элементы при добавлении
 * располагаются в определенном порядке.
 * Это позволяет их извлекать в нужном порядке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 13.05.2020
 */
public class PriorityQueue {
    private final LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позицию определять по полю приоритет.
     * Для вставки использовать add(int index, E value).
     *
     * @param task Добавляемая задача.
     */
    public void put(Task task) {
        var index = 0;
        for (var current : tasks) {

            if (task.getPriority() < current.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод возвращает первый элемент из списка и удаляет его.
     *
     * @return первый элемент из списка.
     */
    public Task take() {
        return tasks.poll();
    }
}
