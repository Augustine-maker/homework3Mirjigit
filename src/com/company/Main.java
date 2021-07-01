package com.company;

import java.util.Scanner;

public class Main {


    /*Создать массив, заполнив его именами людей, элементов массива должно быть 3
    Создать switch на каждый элемент массива (Но всего в программе должен быть только 1 свитч)
    Первому человеку программа должна желать доброго утра, второму доброго дня, а третьему доброго вечера.
    Программа должна поприветствовать всех.*/
    public static void main(String[] args) {
	    String[] name = new String[3];
	    name[0] = "Кутман";
	    name[1] = "Аллаберди";
	    name[2] = "Нурбек";
        System.out.println("1 - доброе утро\n2 - добрый день\n3 - добрый вечер\n4 - Приветствие к вам");

        Scanner scanner = new Scanner(System.in);
        int pick = scanner.nextInt();

	    switch (pick){
            case 1:
            {
                System.out.println("Доброе утро, "+ name[1]); break;
            }
            case 2: {
                System.out.println("Добрый день, " + name[2]); break;
            }
            case 3: {
                System.out.println("Добрый вечер, " + name[3]);
            }
            case 4: {
                System.out.println("Введите ваше имя!");
                Scanner scanner1 = new Scanner(System.in);
                String newName= scanner1.nextLine();

                System.out.println("Добрый день, " + newName);

            }
            default: {
                System.out.println("Вы вышли за границы дозволенного");
            }
            }

	    }


    }

