import java.lang.reflect.Array;
import java.util.ArrayList;

public class FifthHomework {
    public static void main(String[] args) {
        first_task();
        second_task();
        third_task();
        fourth_task();
    }

    /*
     Дана строка:
     String s = “Перестановочный алгоритм быстрого действия”;
     необходимо вывести все буквы “о” из этой строки.
     Для указанной строки ответ будет “ооооо” (или в столбик)
*/
    public static void first_task() {
        String s = "Перестановочный алгоритм быстрого действия";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                result += "о";
            }

        }
        System.out.println(result);
    }
//    Дана строка:
//    String s = “Перевыборы выбранного президента”;
//    необходимо подсчитать количество букв “е” в строке.
//    Для указанной строки ответ будет 4.

    public static void second_task() {
        String s = "Перевыборы выбранного президента";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                result += 1;
            }
        }
        System.out.println(result);
    }
//    Дана строка:
//    String s = “Посмотрите как Рите нравится ритм”;
//    необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//    Для указанной строки ответ будет 6, 15, 29.

    static public void third_task() {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < s.length() - 3; i++) {
            if (s.substring(i, i + 3).equals("рит")) {
                indexes.add(i);
            }
        }
        System.out.println(indexes);
    }

    //    Дан массив:
//    String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//    необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
    public static void fourth_task() {
        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};
        int counter = 0;
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if(!array[i][j].contains("е")){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}