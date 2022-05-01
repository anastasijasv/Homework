public class HWB2_1 {

    public static void main (String[] args) {

        String line = "______________________________________";

        // Task 11. Создать целочисленные переменные k, l, m и присвоить им значения на ваше усмотрение
        int k = 20;
        int l = 34;
        int m = 13;

        // Task 12. Вывести значения переменных в столбик
        System.out.println("Task 12");
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);

        //Task 13. Вывести значения переменных в строку
        System.out.println("Task 13");
        System.out.print(k);
        System.out.print("\t");
        System.out.print(l);
        System.out.print("\t");
        System.out.println(m);
        System.out.println(line);

        //Task 14. Используя конкатенацию, вывести значения переменных в строку через запятую
        System.out.println("Task 14");
        System.out.println(k + ", " + l + ", " + m);
        System.out.println(line);

        //Task 15. Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится
        System.out.println("Task 15");
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println(line);

        //Task 16. Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции
        System.out.println("Task 16");
        int sumKL= k + l;
        int multKM = k * m;
        int subLM = l - m;

        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + multKM);
        System.out.println("Разность переменных l и m = " + subLM);
        System.out.println(line);

        //Task 17. Распечатать следующие выражения
        System.out.println("Task 17");
        int divKL = k / l;
        int remKL = k % l;
        int divKM = k / m;
        int remKM = k % m;
        int divLM = l / m;
        int remLM = l % m;
        int divMK = m / k;
        int remMK = m % k;
        int divLK = l / k;
        int remLK = l % k;
        int divML = m / l;
        int remML = m % l;
        String div = "Результат деления ";
        String rem = ", а остаток от деления = ";

        System.out.println(div + "k на l = " + divKL + rem + remKL);
        System.out.println(div + "k на m = " + divKM + rem + remKM);
        System.out.println(div + "l на m = " + divLM + rem + remLM);
        System.out.println(div + "m на k = " + divMK + rem + remMK);
        System.out.println(div + "l на k = " + divLK + rem + remLK);
        System.out.println(div + "m на l = " + divML + rem + remML);
        System.out.println(line);

        /*Task 18. Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно.
         * Распечатать выражение
         */
        System.out.println("Task 18");
        int apple = 40;
        int student = 6;
        int divAS = apple / student;
        int remAS = apple % student;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + divAS + " яблок, и " + remAS + " яблока останется учителю.");

        apple = 100;
        student = 21;
        int divAS2 = apple / student;
        int remAS2 = apple % student;

        System.out.println("Если " + apple + " яблок поделить на " + student + " ученика, то каждый ученик получит по "
                + divAS2 + " яблока, и " + remAS2 + " яблок останется учителю.");
        System.out.println(line);

        //Task 19. Распечатать вычисления и итоговый результат
        System.out.println("Task 19");
        int sumKLM = k + l + m;
        m++;
        int sumKLM1 = k + l + m++;
        sumKLM--;
        int sumTotal = sumKLM1 + sumKLM2;
        int sub = m++ - sumKLM;

        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + sumTotal + ", а разность m++ и sumKLM = " + sub);
        System.out.println(line);

        //Task 20. Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.
        System.out.println("Task 20");
        int a = 48;
        int b = 8;
        int remAB = a % b;
        int remA = a % 2;
        int remB = b % 2;

        System.out.println(remAB);
        System.out.println(remA);
        System.out.println(remB);

        int c = 47;
        int d = 49;
        int remC = c % 2;
        int remD = d % 2;

        System.out.println(remC);
        System.out.println(remD);
        System.out.println(line);
    }
}
