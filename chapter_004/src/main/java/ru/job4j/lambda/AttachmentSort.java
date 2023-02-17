package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Анонимные классы.
 * Класс реализации компаратора как анонимного класса.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/15/2021
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 2", 35),
                new Attachment("image 1", 100),
                new Attachment("image 3", 12)
        );
        Comparator<Attachment> compSize = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(compSize);
        System.out.println(attachments);

        Comparator<Attachment> compName = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(compName);
        System.out.println(attachments);
    }
}
