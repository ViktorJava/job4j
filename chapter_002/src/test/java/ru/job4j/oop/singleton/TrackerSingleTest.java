package ru.job4j.oop.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Тесты синглтонов на синглетность.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.01.2020
 */
public class TrackerSingleTest {

    @Test
    public void singletonTSSFC() {
        TrackerSingleStaticFinalClass tracker = TrackerSingleStaticFinalClass.getInstance();
        TrackerSingleStaticFinalClass tracker2 = TrackerSingleStaticFinalClass.getInstance();
        assertSame(tracker, tracker2);
    }

    @Test
    public void singletonTSE() {
        TrackerSingleEnum tracker = TrackerSingleEnum.INSTANCE;
        TrackerSingleEnum tracker2 = TrackerSingleEnum.INSTANCE;
        assertSame(tracker, tracker2);
    }

    @Test
    public void singletonTSSFF() {
        TrackerSingleStaticFinalField tracker = TrackerSingleStaticFinalField.getInstance();
        TrackerSingleStaticFinalField tracker2 = TrackerSingleStaticFinalField.getInstance();
        assertSame(tracker, tracker2);
    }

    @Test
    public void singletonTSSF() {
        TrackerSingleStaticField tracker = TrackerSingleStaticField.getInstance();
        TrackerSingleStaticField tracker2 = TrackerSingleStaticField.getInstance();
        assertSame(tracker, tracker2);
    }
}
