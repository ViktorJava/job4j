package ru.job4j.inheritance;

/**
 * Класс демонстрации переопределения метода и генерирования отчётов
 * в текстовом, HTML и JSON форматах.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/31/2021
 */
public class ReportUsage {
    public static void main(String[] args) {
        TextReport tReport = new TextReport();
        String textReport = tReport.generate("Report's name", "Report's body");
        System.out.println(textReport);

        HtmlReport hReport = new HtmlReport();
        String htmlReport = hReport.generate("Report's name", "Report's body");
        System.out.println(htmlReport);

        JSONReport jReport = new JSONReport();
        String jsonReport = jReport.generate("Report is name", "Report is body");
        System.out.println(jsonReport);
    }
}
