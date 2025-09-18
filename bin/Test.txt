/*
 * Класс содержит методы для решений задач по лабораторной
 */
public class Test {
    public double fraction(double x) {
        int integerPart = (int) x;

        return x - integerPart;
    }

    public int charToNum(char x) {
        return x - '0';
    }

    public boolean is2Digits(int x) {
        return (x > 9 && x < 100) || (x < -9 && x > -100);
    }

    public boolean isInRange(int a, int b, int num) {
        return (num <= b && num >= a) || (num >= b && num <= a);
    }

    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public int abs(int x) {
        if (x < 0) {
            x *= -1;
        }
        return x;
    }

    public boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
    }

    public int max3(int x, int y, int z) {
        if (x < y) {
            x = y;
        }
        if (x < z) {
            x = z;
        }
        return x;
    }

    public int sum2(int x, int y) {
        if (10 <= x + y && x + y <= 19) {
            return 20;
        }
        return x + y;
    }

    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "это не день недели";
        }
    }

    public String listNums(int x) {
        String list = "";
        for (int i = 0; i <= x; i++) {
            list += i + " ";
        }
        return list;
    }

    public String chet(int x) {
        String list = "";
        for (int i = 0; i <= x; i += 2) {
            list += i + " ";
        }
        return list;
    }

    public int numLen(long x) {
        int len = 0;
        do {
            x /= 10;
            len++;
        } while (x != 0);
        return len;
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (int y = 0; y < i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (abs(arr[i]) > abs(x)) {
                x = arr[i];
            }
        }
        return x;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        // Создаем новый массив нужного размера
        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }

        return result;
    }

    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        int x = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[x] = arr[i];
            x++;
        }
        return result;
    }

    public int[] findAll(int[] arr, int x) {
        int N = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                N++;
            }
        }
        int[] result = new int[N];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}
