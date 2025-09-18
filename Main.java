import java.util.Scanner;

/**
 * Основной класс приложения для демонстрации работы методов класса Test.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Test lab = new Test();
        CheckInput check = new CheckInput();
        Scanner in = new Scanner(System.in);

        int choice;
        boolean running = true;

        while (running) {
            System.out.println("=== МЕНЮ ПРОГРАММЫ ===");
            System.out.println("1. Задание 1.1 - Дробная часть");
            System.out.println("2. Задание 1.3 - Букву в число");
            System.out.println("3. Задание 1.5 - Двузначное");
            System.out.println("4. Задание 1.7 - Диапазон");
            System.out.println("5. Задание 1.9 - Равенство");
            System.out.println("6. Задание 2.1 - Модуль числа");
            System.out.println("7. Задание 2.3 - Тридцать пять");
            System.out.println("8. Задание 2.5 - Тройной максимум");
            System.out.println("9. Задание 2.7 - Двойная сумма");
            System.out.println("10. Задание 2.9 - День недели");
            System.out.println("11. Задание 3.1 - Числа подряд");
            System.out.println("12. Задание 3.3 - Четные числа");
            System.out.println("13. Задание 3.5 - Длина числа");
            System.out.println("14. Задание 3.7 - Квадрат");
            System.out.println("15. Задание 3.9 - Правый треугольник");
            System.out.println("16. Задание 4.1 - Поиск первого значения");
            System.out.println("17. Задание 4.3 - Поиск максимального");
            System.out.println("18. Задание 4.5 - Добавление массива в массив");
            System.out.println("19. Задание 4.7 - Возвратный реверс");
            System.out.println("20. Задание 4.9 - Все вхождения");
            System.out.println("0. Выход из программы");
            System.out.println("======================");
            System.out.print("Выберите задание (0-20): ");

            choice = check.checkInt();

            switch (choice) {
                case 0:
                    System.out.println("Завершение работы программы...");
                    running = false;
                    break;

                case 1:
                    System.out.println("Задание 1.1");
                    System.out.println("Метод возвращает только дробную часть числа x");
                    System.out.print("Введите вещественное число: ");
                    double fractionX = in.nextDouble();

                    System.out.println("Дробная часть введённого числа: " + lab.fraction(fractionX));
                    break;

                case 2:
                    System.out.println("Задание 1.3");
                    System.out.println("Метод преобразует символ в соответствующее число");
                    System.out.print("Введите символ от 0 до 9: ");

                    char cToNum = in.next().charAt(0);
                    while (cToNum < '0' || cToNum > '9') {
                        System.out.println("Ошибка: Символ должен быть цифрой от '0' до '9'");
                        System.out.println("Пожалуйста, введите символ ещё раз: ");
                        cToNum = in.next().charAt(0);
                    }

                    System.out.println("Символ, преобразованный в число: " + lab.charToNum(cToNum));
                    break;

                case 3:
                    System.out.println("Задание 1.5");
                    System.out.println("Метод возвращает True если введённое число - двузначное");
                    System.out.print("Введите целое число: ");
                    int is2DigitsX = check.checkInt();

                    System.out.println("Введённое число было двузначным? " + lab.is2Digits(is2DigitsX));
                    break;

                case 4:
                    System.out.println("Задание 1.7");
                    System.out.println("Метод возвращает True если введённое число находится в указанном диапазоне");
                    System.out.print("Введите первую границу: ");
                    int firstBorder = check.checkInt();
                    System.out.print("Введите вторую границу: ");
                    int secondBorder = check.checkInt();
                    System.out.print("Введите число: ");
                    int num = check.checkInt();

                    System.out.println(
                            "Число находится в указанном диапазоне? " + lab.isInRange(firstBorder, secondBorder, num));
                    break;

                case 5:
                    System.out.println("Задание 1.9");
                    System.out.println("Метод возвращает True если все введённые числа равны");
                    System.out.print("Введите первое число: ");
                    int firstNum = check.checkInt();
                    System.out.print("Введите второе число: ");
                    int secondNum = check.checkInt();
                    System.out.print("Введите третье число: ");
                    int thirdNum = check.checkInt();

                    System.out.println("Указанные числа равны? " + lab.isEqual(firstNum, secondNum, thirdNum));
                    break;

                case 6:
                    System.out.println("Задание 2.1");
                    System.out.println("Метод возвращает модуль введённого числа");
                    System.out.print("Введите число: ");
                    int moduleX = check.checkInt();

                    System.out.println("Модуль введённого числа: " + lab.abs(moduleX));
                    break;

                case 7:
                    System.out.println("Задание 2.3");
                    System.out.println("Метод возвращает True если число делится только на 3 или только на 5");
                    System.out.print("Введите число: ");
                    int x35 = check.checkInt();

                    System.out.println("Число делится на 3 или 5? " + lab.is35(x35));
                    break;

                case 8:
                    System.out.println("Задание 2.5");
                    System.out.println("Метод возвращает максимальное из трех чисел");
                    System.out.print("Введите первое число: ");
                    int max1 = check.checkInt();
                    System.out.print("Введите второе число: ");
                    int max2 = check.checkInt();
                    System.out.print("Введите третье число: ");
                    int max3 = check.checkInt();

                    System.out.println("Максимальное из введённых чисел: " + lab.max3(max1, max2, max3));
                    break;

                case 9:
                    System.out.println("Задание 2.7");
                    System.out.println("Метод возвращает сумму двух чисел, либо 20 если 10<=сумма<=19");
                    System.out.print("Введите первое число: ");
                    int sum1 = check.checkInt();
                    System.out.print("Введите второе число: ");
                    int sum2 = check.checkInt();

                    System.out.println("Сумма чисел: " + lab.sum2(sum1, sum2));
                    break;

                case 10:
                    System.out.println("Задание 2.9");
                    System.out.println("Метод возвращает день недели, соответственно введённой цифре");
                    System.out.print("Введите число от 1 до 7: ");
                    int day = check.checkInt();

                    System.out.println(lab.day(day));
                    break;

                case 11:
                    System.out.println("Задание 3.1");
                    System.out.println("Метод возвращает строку чисел от 0 до введённого числа");
                    System.out.print("Введите число: ");
                    int listNum = check.checkInt();

                    System.out.println("Полученный список: ");
                    System.out.println(lab.listNums(listNum));
                    break;

                case 12:
                    System.out.println("Задание 3.3");
                    System.out.println("Метод возвращает строку четных чисел от 0 до введённого числа");
                    System.out.print("Введите число: ");
                    int chetNum = check.checkInt();

                    System.out.println("Полученный список: ");
                    System.out.println(lab.chet(chetNum));
                    break;

                case 13:
                    System.out.println("Задание 3.5");
                    System.out.println("Метод возвращает количество знаков в введённом числе");
                    System.out.print("Введите число: ");
                    int numL = check.checkInt();

                    System.out.println("Кол-во знаков: " + lab.numLen(numL));
                    break;

                case 14:
                    System.out.println("Задание 3.7");
                    System.out.println("Метод выводит квадрат из символов '*' размером x на x");
                    System.out.print("Введите число х: ");
                    int squareX = check.checkPositive();

                    System.out.println("Полученный квадрат: ");
                    lab.square(squareX);
                    break;

                case 15:
                    System.out.println("Задание 3.9");
                    System.out.println("Метод выводит правый треугольник из символов '*', у которого x рядов");
                    System.out.print("Введите число х: ");
                    int triangleX = check.checkPositive();

                    System.out.println("Полученный треугольник: ");
                    lab.rightTriangle(triangleX);
                    break;

                case 16:
                    System.out.println("Задание 4.1");
                    System.out
                            .println("Метод возвращает индекс первого вхождения x в массив (-1 если число не найдено)");
                    System.out.print("Введите размер массива: ");
                    int N = check.checkPositive();

                    int[] arr = new int[N];
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("Введите " + (i + 1) + "-е число: ");
                        arr[i] = check.checkInt();
                    }

                    System.out.println("Полученный массив: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();

                    System.out.print("Введите число: ");
                    int firstX = check.checkInt();

                    if (lab.findFirst(arr, firstX) != -1) {
                        System.out.println("Позиция первого вхождения числа: " + lab.findFirst(arr, firstX));
                    } else {
                        System.out.println(lab.findFirst(arr, firstX));
                    }
                    break;

                case 17:
                    System.out.println("Задание 4.3");
                    System.out.println("Метод возвращает наибольшее по модулю значение массива");
                    System.out.print("Введите размер массива: ");
                    int absArrSize = check.checkPositive();

                    int[] absArr = new int[absArrSize];
                    for (int i = 0; i < absArr.length; i++) {
                        System.out.print("Введите " + (i + 1) + "-е число: ");
                        absArr[i] = check.checkInt();
                    }

                    System.out.println("Полученный массив: ");
                    for (int i = 0; i < absArr.length; i++) {
                        System.out.print(absArr[i] + " ");
                    }
                    System.out.println();

                    System.out.println("Максимальное число массива: " + lab.maxAbs(absArr));
                    break;

                case 18:
                    System.out.println("Задание 4.5");
                    System.out.println("Метод 'вставляет' второй массив в первый");
                    System.out.print("Введите размер первого массива: ");
                    N = check.checkPositive();

                    int[] arr1 = new int[N];
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print("Введите " + (i + 1) + "-е число: ");
                        arr1[i] = check.checkInt();
                    }

                    System.out.print("Введите размер второго массива: ");
                    N = check.checkPositive();

                    int[] arr2 = new int[N];
                    for (int i = 0; i < arr2.length; i++) {
                        System.out.print("Введите " + (i + 1) + "-е число: ");
                        arr2[i] = check.checkInt();
                    }

                    System.out.println("Первый массив: ");
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] + " ");
                    }
                    System.out.println();

                    System.out.println("Второй массив: ");
                    for (int i = 0; i < arr2.length; i++) {
                        System.out.print(arr2[i] + " ");
                    }
                    System.out.println();

                    System.out.print("Введите позицию для вставки: ");
                    int pos = check.checkPositive();
                    while (pos > arr1.length) {
                        System.out.println("Ошибка: Позиция находится вне первого массива.");
                        System.out.print("Введите позицию для вставки: ");
                        pos = check.checkPositive();
                    }

                    System.out.println("Получившийся массив: ");
                    int[] arrNew = lab.add(arr1, arr2, pos);
                    for (int i = 0; i < arrNew.length; i++) {
                        System.out.print(arrNew[i] + " ");
                    }
                    break;

                case 19:
                    System.out.println("Задание 4.7");
                    System.out.println("Массив возвращает список, обратный введённому");
                    System.out.print("Введите размер массива: ");
                    N = check.checkPositive();
                    int[] arrToReverse = new int[N];
                    for (int i = 0; i < arrToReverse.length; i++) {
                        System.out.print("Введите " + (i + 1) + "-е число: ");
                        arrToReverse[i] = check.checkInt();
                    }

                    System.out.println("Полученный массив: ");
                    for (int i = 0; i < arrToReverse.length; i++) {
                        System.out.print(arrToReverse[i] + " ");
                    }
                    System.out.println();

                    System.out.println("Обратный список: ");
                    arrNew = lab.reverseBack(arrToReverse);
                    for (int i = 0; i < arrNew.length; i++) {
                        System.out.print(arrNew[i] + " ");
                    }
                    break;

                case 20:
                    System.out.println("Задание 4.9");
                    System.out.println("Метод возвращает индексы всех вхождений числа в массив");
                    System.out.print("Введите размер массива: ");
                    N = check.checkPositive();
                    int[] arrFindAll = new int[N];
                    for (int i = 0; i < arrFindAll.length; i++) {
                        System.out.print("Введите " + (i + 1) + "-е число: ");
                        arrFindAll[i] = check.checkInt();
                    }

                    System.out.println("Полученный массив:");
                    for (int i = 0; i < arrFindAll.length; i++) {
                        System.out.print(arrFindAll[i] + " ");
                    }
                    System.out.println();

                    System.out.print("Введите число для поиска: ");
                    int xToFind = check.checkInt();

                    System.out.println("Найденные индексы:");
                    arrNew = lab.findAll(arrFindAll, xToFind);
                    for (int i = 0; i < arrNew.length; i++) {
                        System.out.print(arrNew[i] + " ");
                    }
                    break;

                default:
                    System.out.println("Ошибка! Выберите число от 0 до 20.");
                    break;
            }

            if (running && choice != 0) {
                System.out.println("\nНажмите Enter для продолжения...");
                in.nextLine(); // Ожидание нажатия Enter
            }
        }

        in.close();
        System.out.println("Программа завершена.");
    }

}
