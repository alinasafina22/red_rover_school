public class FourthHomework {
    public static void main(String[] args) {
        first_task();
        second_task();
        third_task();
        fourth_task();
        fifth_task();
        sixth_task();
        seventh_task();
        ninth_task();
        last_task();
    }
    public static void first_task(){
        for (int i = 1; i<=15; i++){
            System.out.println(i);
        }
    }
    //Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
    public static void second_task(){
        int main_num = 5;
        for (int i = 1; i<100; i++){
            if (Math.pow(main_num, i) < 10000) {
                System.out.println(Math.pow(main_num, i));
            }
            else {
                break;
            }
        }
    }
   /* Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
            Реализовать 2 варианта:
    использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
    без использования конструкции if (шаг цикла на ваше усмотрение). */

    public static void third_task(){
        for (int i = 40;i<=60; i++){
            if (i%4 == 0) {
                System.out.println(i);
            }
        }
        for( int i =40; i<=60; i = i +4){
            System.out.println(i);
        }
    }
    /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести сумму всех значений массива.

    * */
    public static void fourth_task(){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (var item: array){
            sum += item;
        }
        System.out.println(sum);
    }
    /*
    * Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести максимальное значение массива.
    */
    public static void fifth_task(){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = 0;
        for (var item: array){
            if (item>max) {
                max = item;
            }
        }
        System.out.println(max);
    }
    /*Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести минимальное значение массива.
    */
    public static void sixth_task(){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0];
        for (var item: array){
            if (item<min) {
                min = item;
            }
        }
        System.out.println(min);
    }
    /*
    * Дан массив:
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    необходимо вывести среднее арифметическое всех значений массива.
    */
    public static void seventh_task(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (var item: array){
            sum += item;
        }
        double middle_sum = sum / array.length ;
        System.out.println(middle_sum);
    }
    /*
    * Задача №9
    Дан массив произвольных целых чисел.
    проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так, что каждое следующее число больше предыдущего.
*/
    static public void ninth_task(){
        int[] array = {0, 1, 3, 10, -5, 4, 7};
        boolean flag = true;
        for (int i = 1; i<array.length; i++){
            if (array[i]>array[i-1]){
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array isn't sorted");
        }
    }
    /*Задача №10

Дано положительное целое число n.
создать ряд из n чисел так, чтобы:
первые два элемента ряда равнялись 1
любой другой элемент ряда был суммой двух предыдущих.
Пример:
1, 1, 2, 3, 5, 8, …
*/
    static public void last_task(){
        int n = 10;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        int sum = 0;
        for (int i = 2; i<n; i++){
            array[i] = array[i-1] + array[i-2];
        }
        for(var item: array){
            System.out.println(item);
        }
    }
}
