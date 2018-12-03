public class Main {


    public static void main(String[] args) {

        //ex1(3);
        //ex2();
        //ex3();
        //ex4();
        //ex5(2, 5, 5);
        //ex6(-4);
        //ex7();
        //ex8();
        //ex9(3, 3, 5, 3);
        //ex10();
        //ex11();
        //ex12();
        //ex13(1, 4);
        //ex14();
        //ex15();
        //ex16();
        //ex17(3);
        //ex18();
        //ex19();

    }

    static void ex1(double a) {
        double S;
        a = 4;
        S = a * a;
        System.out.println("Площадь квадрата: " + S);
    }

    static void ex2(double V1, double V2, double S, double T) {

        double L;      // L - расстояние между авто через Т часов
        double D;      //D - общий пройденый путь
        D = V1 * T + V2 * T;
        L = Math.abs(S - D);
        System.out.println("Расстояние между автомобилями через " + T + " часов = " + L + " км");
    }

    static void ex3(double a, double b, double c) {

        double d;
        double x1, x2;
        a = 1;
        b = 3;
        c = -4;
        d = b * b - 4 * a * c;
        if (d < 0 || a < 1) {
            System.out.println("error");
        } else {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни квадратного уравнения " + a + "x^" + "2" + "+" + b + "x" + c + " равны: " + x1 + " и " + x2);
        }
    }

    static void ex4(int a) {

        if (a > 0) {
            a++;
        } else if (a == 0) {
            a = 10;
        } else {
            a = a - 2;
        }
        System.out.println(a);
    }

    static void ex5(double a, double b, double c) {
        double sum = 0;
        if (a >= b) {
            if (b >= c) {
                sum = (a + b);
            } else {
                sum = (a + c);
            }
        } else {
            if (a >= c) {
                sum = (b + a);
            } else {
                sum = (b + c);
            }
        }
        System.out.println("Сумма двух наибольших чисел: " + sum);
    }

    static void ex6(int a) {
        if (a == 0) {
            System.out.println("Нулевое число");
        } else {
            if (a > 0) {
                if ((a % 2) == 0) {
                    System.out.println("Положительное четное");
                } else {
                    System.out.println("Положительное нечетное");
                }
            } else if (a < 0) {
                if ((a % 2) == 0) {
                    System.out.println("Отрицательное четное");
                } else {
                    System.out.println("Отрицательное нечетное");
                }
            }
        }
    }

    static void ex7(int a, int b) {
        if (a > 2 && b <= 3) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }

    static void ex8(int a, int b, int c) {

        if (a < b && b < c) {
            System.out.println("a < b < c - справедливо");
        } else {
            System.out.println("a < b < c -  НЕ справедливо");
        }
    }

    static void ex9(int a, int b, int c, int d) {
        System.out.print("Число №");
        if (a != b) {
            if (a != c) {
                System.out.println("1");
            }
            if (b != c) {
                System.out.println("2");
            }
        } else {
            if (c != b) {
                System.out.println("3");
            }
            if (d != a) {
                System.out.println("4");
            }
        }
    }

    static void ex10(int k) {

        if (k < 1 || k > 5) {
            System.out.println("ошибка");
        } else {
            switch (k) {
                case 1:
                    System.out.println("плохо");
                    break;
                case 2:
                    System.out.println("неудовлетворительно");
                    break;
                case 3:
                    System.out.println("удовлетворительно");
                    break;
                case 4:
                    System.out.println("хорошо");
                    break;
                case 5:
                    System.out.println("отлично");
                    break;
            }
        }


    }

    static void ex11(int a) {

        switch (a) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
        }
        if (a < 1 || a > 12) {
            System.out.println("ERROR");
        }

    }

    static void ex12(int a, int b, int n) {
        double v = 0;

        if (b == 0 || n < 1 || n > 4) {
            System.out.println("ERROR");
        } else {
            if (n == 1) {
                v = a + b;
            }
            if (n == 2) {
                v = a - b;
            }
            if (n == 3) {
                v = a * b;
            }
            if (n == 4) {
                v = a / b;
            }
            System.out.println(v);
        }
    }

    static void ex13(int a, int b) {
        int n = 0;
        System.out.println(a);
        if (a < b) {
            for (int c = a + 1; c < b; c++) {
                System.out.println(c);
                n++;
            }
            System.out.println(b);
            System.out.println("Чисел: " + n);
        } else {
            System.out.println("ERROR");
        }

    }

    static void ex14(int a, int b) {
        int sum = 0;
        if (a < b) {
            for (int c = a; c <= b; c++) {
                sum = sum + c;
            }
            System.out.println(sum);
        } else {
            System.out.println("error");
        }
    }

    static void ex15(int n) {
        int factorial = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println(n + "! = " + factorial);
        } else {
            System.out.println("error");
        }
    }

    static void ex16(double a, double b) {
        if (a > b) {
            double c = a;
            while (c >= b) {
                c = c - b;
            }
            System.out.println("Свободно : " + c);
        } else {
            System.out.println("error");
        }
    }

    static void ex17(int n) {
        int k = 0;
        if (n > 1) {
            while ((3 * k) <= n) {
                k++;
            }
            System.out.println("Наименьшее число " + k);
        } else {
            System.out.println("error");
        }
    }

    static void ex18() {
        int n, x, k = 10;
        n = 6234;
        while (n % k != 0) {
            x = n % k;
            n = (n - x) / k;
            System.out.println(x);
        }
    }

    static void ex19(int a, int b) {
        if (a < b) {
            for (int i = 0; i < (b - a + 1); i++) {
                for (int j = 1; j <= (i + 1); j++) {
                    System.out.print(a + i + " ");
                }
            }
        } else System.out.println("error");
    }

}
