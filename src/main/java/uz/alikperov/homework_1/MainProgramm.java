package uz.alikperov.homework_1;
// Домашнее практическое задание Аликперова Вагифа
public class MainProgramm {

    // Задание 1. Создать метод main()
    public static void main(String[] args) {

        // Задание 2. Создание и инициализация переменных изученных типов
        byte aByte = 2; // переменная типа byte
        short aShort = 7; // переменная типа short
        int aInt = 50000; // переменная типа int
        long aLong = 70l; // переменная типа long
        float aFloat = 1.5f; // переменная типа float
        double aDouble = 7.777; // переменная типа double
        char aChar = 'U'; // переменная типа char
        boolean theBoolean = true; // переменная типа boolean

        System.out.println(anExpression(4.5f,2,8.4f,2.1f)); // 27
        System.out.println(isBetween(10,5)); // true
        isNegativePrintVersion(-5); // Число -5 является отрицательным числом
        System.out.println(isNegative(4)); //false
        greetingByName("Вася"); // Привет, Вася!

        isLeapYear(20); // год является високосным
        isLeapYear(7); // год не является високосным
        isLeapYear(1920); // год является високосным
        isLeapYear(100); // год не является високосным
        isLeapYear(400); // год не является високосным
        isLeapYear(1000); // год не является високосным
        isLeapYear(2020); // год не является високосным
        isLeapYear(2022); // год не является високосным
        isLeapYear(1120); // год является високосным
        isLeapYear(2000); // год является високосным

    }

    /**
     * Задание 3. Написать метод вычисляющий выражение a * (b + (c / d)) и
     * возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
     * @param a аргумент
     * @param b аргумент
     * @param c аргумент
     * @param d аргумент
     * @return возвращаемое значение - результат вычисления выражения
     */
    public static float anExpression(float a, float b, float c, float d){
        return a*(b+(c/d));
    }

    /**
     * Задание 5. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     * от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     * @param num1 слагаемое 1
     * @param num2 слагаемое 2
     * @return возвращаемое значение - результат подсчета суммы двух слагаемых
     */
    public static boolean isBetween(int num1, int num2){
        return (num1 + num2) >= 10 && (num1 + num2) <= 20;
    }

    /**
     * Задание 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     * @param num проверяемое число
     */
    public static void isNegativePrintVersion(int num){
        if(num<0)
            System.out.printf("Число %d является отрицательным числом \n",num);
        else
            System.out.printf("Число %d является положительным числом \n",num);
    }


    /**
     * Задание 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     * если число отрицательное, и вернуть false если положительное.
     * @param num проверяемое число
     * @return возвращаемое значение - результат проверки, является ли число отрицательным или нет
     */
    public static boolean isNegative(int num){
        return num < 0;
    }

    /**
     * Задание 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
     * @param name Имя человека, которого надо поприветствовать
     */
    public static void greetingByName(String name){
        System.out.printf("Привет, %s!\n",name);
    }

    /**
     * Задание 8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
     * @param year Проверяемый год
     */
    public static void isLeapYear(int year){
        boolean isLeap = false;
        if(year % 400 == 0)
            isLeap = true;
            else if(year % 100 != 0 && year % 4 == 0)
                isLeap = true;
        if(isLeap)
            System.out.printf("%d год является високосным \n",year);
        else
            System.out.printf("%d год не является високосным \n",year);
    }

}
