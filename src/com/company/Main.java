package com.company;

public class Main {

    public static void main(String[] args) {
        String number = "89092052525"; //Вводим номер
        correct(number);
    }

    public static void correct(String correctnumber) {
        String a; //Сюда записывается скорректировнный номер
        String[] b = new String[3]; //Массив для вывода сообщений
        //Замена +7 на 8
        if (correctnumber.startsWith("+7")) {
            correctnumber = correctnumber.replace("+7", "8");
            b[0] = "Замена +7 на 8";
        }
        // Проверка наличия скобок и пробелов
        if (correctnumber.contains("(") || correctnumber.contains(")") || correctnumber.contains(" ")) {
            correctnumber = correctnumber.replace("(", "");
            correctnumber = correctnumber.replace(")", "");
            correctnumber = correctnumber.replace(" ", "");
            if (b[0] == null) {
                b[0] = "В номере есть пробелы и/или скобки";
            } else {
                b[1] = "В номере есть пробелы и/или скобки";
            }
        }
        //Проверка количества цифр
        if (correctnumber.length() != 11) {
            a = "Введен некорректный номер";
            if (b[0] == null) {
                b[0] = "Сумма символов не равна 11";
            } else {
                if (b[1] == null) {
                    b[1] = "Сумма символов не равна 11";
                } else {
                    b[2] = "Сумма символов не равна 11";
                }
            }
        } else {
            a = correctnumber;
            b[2] = null;
        }
        //Вывод
        System.out.println(a);
        if (b[0] != null) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] != null) {
                    System.out.print(b[i] + "; ");
                }
            }
        }
    }
}
