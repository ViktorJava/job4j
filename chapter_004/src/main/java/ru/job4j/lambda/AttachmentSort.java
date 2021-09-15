package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Класс реализации компаратора как анонимного inner класса.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/15/2021
 */
public class AttachmentSort {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 2", 35),
                new Attachment("image 1", 100),
                new Attachment("image 3", 12)
        );
        Comparator compSize = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
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
