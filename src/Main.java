public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 4: Условный оператор. Часть 1");
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Вы - совершеннолетний! Поздравляем Вас!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");

        }

        System.out.println();
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек учится в университете.");
        }
        if (age >=24) {
            System.out.println("Человек окончил университет и работает.");
        }

        System.out.println();
        System.out.println("Задание 3");
        int carCapacityFull = 102;
        int carCapacitySeat = 60;
        int carCapacityOther = carCapacityFull - carCapacitySeat;

        int pax = 87; // количество пассажиров

        if (pax <= carCapacitySeat) {
            System.out.println("В вагоне есть сидячие места: " + (carCapacitySeat - pax) + " мест.");
        }
        if (pax > carCapacitySeat && pax <= carCapacityFull) {
            System.out.println("В вагоне есть только стоячие места: " + (carCapacityFull - pax) + " мест.");
        }
        if (pax > carCapacityFull) {
            System.out.println("В вагоне мест нет.");
        }
        System.out.println("");
        System.out.println("Задание 4");
        int age2 = 25;
        if (age2 >= 18) {
            System.out.println("Вы - совершеннолетний! Поздравляем Вас!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        System.out.println();
        System.out.println("Задание 5");
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу!");
        } else if (age2 >= 18 && age2 < 24) {
            System.out.println("Человек учится в университете.");
        } else {
            System.out.println("Человек окончил университет и работает.");
        }

        System.out.println();
        System.out.println("Задание 6");
        int carCapacityFull2 = 102;
        int carCapacitySeat2 = 60;
        int carCapacityOther2 = carCapacityFull2 - carCapacitySeat2;

        int pax2 = 90; // количество пассажиров

        if (pax2 <= carCapacitySeat2) {
            System.out.println("В вагоне еще есть " + (carCapacitySeat2 - pax2)  + " сидячих мест.");
        } else if (pax2 > carCapacitySeat2 && pax2 <= carCapacityFull2) {
            System.out.println("В вагоне еще есть " + (carCapacityFull2 - pax2) + " стоячих мест.");
        } else {
            System.out.println("В вагоне мест нет.");
        }
        System.out.println();
        System.out.println("Задание 7");
        int age7 = 25;
        if (age7 >=2 && age7 <= 6) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в детский сад");
        } else if (age7 >=7 && age7 <= 18) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в школу");
        } else if (age7 >=19 && age7 <= 23) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить на работу");
        }

        System.out.println();
        System.out.println("Задание 8");
        int childAge = 14;
        if (childAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (childAge >=5 && childAge <14) {
            System.out.println("Ребенок может кататься только в сопровожеднии взрослого.");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }


        System.out.println();
        System.out.println("Задание 9");
        int one = 30;
        int two = 30;
        int three = 30;
        if (one > two) {
            if (one >= three) {
                System.out.println("Наибольшее число: " + one);
            } else {
                System.out.println("Наибольшее число: " + three);
            }
        } else if (two > three) {
            if (two >= one) {
                System.out.println("Наибольшее число: " + two);
            }
        } else {
            if (one > three) {
                System.out.println("Наибольшее число: " + one);
            } else if (three > one) {
                System.out.println("Наибольшее число: " + three);
            } else {
                System.out.println("Числа равны");
            }
        }
    }
}