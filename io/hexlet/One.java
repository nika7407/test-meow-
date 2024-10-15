package io.hexlet;

import org.apache.commons.lang3.StringUtils;

public class One {
    public static void main(String[] args) {
        // Переворачиваем слово "Hexlet"
        String word = "Hexlet";
        String reversedWord = StringUtils.reverse(word);
        
        // Выводим результат
        System.out.println(reversedWord);  // Ожидаемый вывод: telxeH
    }
}
