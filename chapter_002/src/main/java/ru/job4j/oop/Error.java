package ru.job4j.oop;

/**
 * Конструктор [#173889]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/29/2021
 */
public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error errorFatal = new Error(true, 127,
                "Fatal error detected, unable to continue.");
        Error ioError = new Error(false, 9298,
                "I/O System Error.");
        errorFatal.printInfo();
        ioError.printInfo();
    }

    public void printInfo() {
        System.out.println("Error status: " + status);
        System.out.println("active: " + active);
        System.out.println("message: " + message);
    }
}
