package ru.job4j.pojo;

/**
 * Массивы и модели. [#174892]
 * 1. Создайте модель данных книга с полями: имя и количество страниц. ru.job4j.pojo.Book.
 * 2. Создайте класс ru.job4j.pojo.Library и в нем метод main.
 * 3. В методе main создайте 4 объекта Book. Добавьте их в массив. Сделайте одну книгу с именем "Clean code".
 * 4. Выведите содержимое массива на консоль через цикл for + index.
 * 5. Переставьте книгу с индексом 0 и 3. Выведите содержимое массива на консоль.
 * 6. Добавьте цикл с выводом книг с именем "Clean code".
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.11.2019
 */
public class Library {
    //2. Создайте класс ru.job4j.pojo.Library и в нем метод main.
    public static void main(String[] args) {
        //3. В методе main создайте 4 объекта Book. Добавьте их в массив. Сделайте одну книгу с именем "Clean code".
        Book bookOne = new Book("Core Java Fundamental", 864);
        Book bookTwo = new Book("Core Java Advanced Features", 976);
        Book bookThree = new Book("Head First Java", 718);
        Book bookFour = new Book("Clean code", 619);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        //4. Выведите содержимое массива на консоль через цикл for + index.
        System.out.println("\tAll Books:");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + ": -" + bk.getCount());
        }
        //5. Переставьте книгу с индексом 0 и 3. Выведите содержимое массива на консоль.
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("\n\tReplace index[0] to index[3]:");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + ": -" + bk.getCount());
        }
        //6. Добавьте цикл с выводом книг с именем "Clean code".
        System.out.println("\n\tShow only \"Clean code\":");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + ": -" + bk.getCount());
            }
        }
    }
}
