package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет бот.".equals(question)) {
            rsl = "Привет умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
    public static void main(String[] args) {
        String phrase = "Тук тук.";
        System.out.println(DummyBot.answer(phrase));
    }
}
