package SevenHomework;

import java.util.Objects;

//Задача №1
//   Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
//метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
public class Main{
    public static void main(String[] args) {
        Person tom = new Person();
        tom.name = "Tom";
        tom.age = 24;
        tom.sex = "Male";
        System.out.println(tom.getName());
        Person alice = new Person();
        alice.name = "Alice";
        alice.sex = "Female";
        System.out.println(alice.getName());
    }
}

class Person {
    int age;
    String name;
    String sex;

    String getName(){
        String name_with_prefix;
        if (Objects.equals(sex, "Male")){
            name_with_prefix = "Mr. " + name;
            return name_with_prefix;
        }
        else {
            name_with_prefix = "Mrs. " + name;
        }
        return name_with_prefix;
    }
}
