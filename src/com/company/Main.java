package com.company;

public class Main {

    public static void main(String[] args) {
        String number = "+7 9092052525"; //Вводим номер
        correct(number);
    }

    public static void correct(String correctnumber) {
        String[] a = new String[4]; //Массив для вывода номера и сообщений
        //Замена +7 на 8
        if (correctnumber.startsWith("+7")) {
            correctnumber = correctnumber.replace("+7", "8");
            a[1] = "Замена +7 на 8";
        }
        // Проверка наличия скобок и пробелов
        if (correctnumber.contains("(") || correctnumber.contains(")") || correctnumber.contains(" ")) {
            correctnumber = correctnumber.replace("(", "");
            correctnumber = correctnumber.replace(")", "");
            correctnumber = correctnumber.replace(" ", "");
            if (a[1] == null) {
                a[1] = "В номере есть пробелы и/или скобки";
            } else {
                a[2] = "В номере есть пробелы и/или скобки";
            }
        }
        //Проверка количества цифр
        if (correctnumber.length() != 11) {
            a[0] = "Введен некорректный номер";
            if (a[1] == null) {
                a[1] = "Сумма символов не равна 11";
            } else {
                if (a[2] == null) {
                    a[2] = "Сумма символов не равна 11";
                } else {
                    a[3] = "Сумма символов не равна 11";
                }
            }
        } else {
            a[0] = correctnumber;
            a[3] = null;
        }
        //Вывод
        System.out.println(a[0]); //Вывод номера телефона или сообщения об ошибке
        if (a[1] != null) { //Вывод сообщений об изменениях
            for (int i = 1; i < a.length; i++) {
                if (a[i] != null) {
                    System.out.print(a[i]);
                }
                if (i == a.length - 1) { //Разделитель "; ". Всю голову сломал, как сделать так, чтоб список изменений не заканчивался точкой с запятой... Но вроде работает
                    break;
                }
                else{
                    if (a[i + 1] != null) {
                        System.out.print("; ");
                    }
                }
            }
        }
    }
}

