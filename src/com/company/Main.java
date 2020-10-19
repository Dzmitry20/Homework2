package com.company;

    class Main{
        public static void main(String[] args) {
            int month = 2;
            System.out.println("1 способ :");
            if (month >= 3 & month <= 5)
                System.out.println("Весна");
            else if (month >= 6 & month <= 8)
                System.out.println("Лето");
            else if (month >= 9 & month <= 11)
                System.out.println("Осень");
            else if (month == 12 | month == 1 | month == 2)
                System.out.println("Зима");
            else System.out.println("Ошибочный ввод");

            System.out.println("2 способ :");
            switch (month) {
                case 1:
                case 2:
                case 12:                             //Правильно ли поставить case12 здесь а не в конце?
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Ошибочный ввод");
            }
            {
                int[] mass = new int[10];
                mass[0] = 20;
                mass[1] = 21;
                mass[2] = 22;
                mass[3] = 23;
                mass[4] = 24;
                mass[5] = 25;
                mass[6] = 26;
                mass[7] = 27;
                mass[8] = 28;
                mass[9] = 29;
                System.out.println();

            System.out.print("Массив : ");
                for (int i = mass.length - 1; i >= 0; i--)
                    System.out.print(mass[i] + " "); }
            System.out.println();
                {
                int[][] squareArray = new int[3][4];
                    squareArray[0][0]=20;
                    squareArray[0][1]=25;
                    squareArray[0][2]=30;
                    squareArray[0][3]=35;
                    squareArray[1][0]=40;
                    squareArray[1][1]=45;
                    squareArray[1][2]=50;
                    squareArray[1][3]=55;
                    squareArray[2][0]=60;
                    squareArray[2][1]=65;
                    squareArray[2][2]=70;
                    squareArray[2][3]=75;
                    System.out.println();

            System.out.println("Вывод двумерного массива :");

            for (int i = 0; i < squareArray.length; i++) {
                    for (int j = 0; j < squareArray[i].length; j++) {
                        System.out.print(squareArray[i][j] +"[" + i + "]" + "[" +j +"]" +"  ");
                    }
                    System.out.println();}
                }
            }
        }
