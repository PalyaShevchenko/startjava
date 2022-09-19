public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        int age = 15;
        boolean maleGender = true;
        double height = 1.75;

        if(age > 20) {
            System.out.println("старше 20");
        } else {
            System.out.println("не старше 20");
        }

        if(!maleGender) {
            System.out.println("не мужского пола");
        } else {
            System.out.println("мужского пола");
        }

        if(height < 1.80) {
            System.out.println("рост средний или ниже среднего");
        } else {
            System.out.println("высокого роста");
        }

        char letter1Name = "Gary".charAt(0);
        if(letter1Name == 'M') {
            System.out.println("Имя начинается с буквы M");
        } else if(letter1Name == 'I') {
            System.out.println("Имя начинается с буквы I");
        } else {
            System.out.println("Имя начинается не с букв M и I");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 3;
        int num2 = 5;
        if(num1 > num2) {
            System.out.println(num1 + " - MAX     " + num2 + " - MIN");
        } else if(num1 < num2) {
            System.out.println(num1 + " - MIN     " + num2 + " - MAX");
        } else {
            System.out.println("числа равны " + num1);
        }

        System.out.println("\n3. Работа с числом\n");
        int num = -5;
        System.out.println("num = "+ num);
        if(num != 0) {
            if(num % 2 == 0) {
                System.out.println("num - четное");
            } else {
                System.out.println("num - нечетное");
            }
            if(num > 0) {
                System.out.println("num - положительное");
            } else {
                System.out.println("num - отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        num = 953;
        num1 = 943;
        System.out.println("исходные числа " + num + "   " + num1);
        if((num - num1) % 10 == 0) {
            System.out.println("одинаковые цифры в 1 разряде    " + num % 10);
        }
        if(num / 10 % 10  == num1 / 10 % 10) {
            System.out.println("одинаковые цифры во 2 разряде   " + num / 10 % 10);
        }
        if(num / 100  == num1 / 100) {
            System.out.println("одинаковые цифры в 3 разряде    " + num / 100);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char codeSymbol = '\u0057';
        System.out.println("Символ " + codeSymbol);
        if((codeSymbol >= 'a') && (codeSymbol <= 'z')) {
            System.out.println("маленькая буква");
        } else if((codeSymbol >= 'A') && (codeSymbol < 'Z')) {
            System.out.println("большая буква");
        } else if((codeSymbol >= '0') && (codeSymbol <= '9')) {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        double sumDeposit = 300_000;
        double rate = 0.05;
        System.out.println("сумма вклада "+ sumDeposit);
        if((sumDeposit >= 100_000) && (sumDeposit <= 300_000)) {
            rate = 0.07;
        } else if (sumDeposit > 300_000) {
            rate = 0.1;
        }
        System.out.println("начисленный процент " + sumDeposit * rate);
        System.out.println("итоговая сумма с % " + sumDeposit * (1 + rate));

        System.out.println("\n7. Определение оценки по предметам\n");
        int percentFinalHistory = 59;
        int percentFinalProgramming = 91;
        int ratingHistory = 5;
        if (percentFinalHistory <= 60) {
            ratingHistory = 2;
        } else if((percentFinalHistory > 60) && (percentFinalHistory <= 73)) {
            ratingHistory = 3;
        } else if((percentFinalHistory > 73) && (percentFinalHistory <= 91)) {
            ratingHistory = 4;
        }
        System.out.println(ratingHistory + " История");
        int ratingProgramming = 5;
        if (percentFinalProgramming <= 60) {
            ratingProgramming = 2;
        } else if((percentFinalProgramming > 60) && (percentFinalProgramming <= 73)) {
            ratingProgramming = 3;
        } else if((percentFinalProgramming > 73) && (percentFinalProgramming <= 91)) {
            ratingProgramming = 4;
        }
        System.out.println(ratingProgramming + " Программирование");
        System.out.println("средний балл оценок по предметам  " + (ratingHistory + ratingProgramming) / 2);
        System.out.println("средний % по предметам  " + (percentFinalHistory + percentFinalProgramming) / 2);

        System.out.println("\n8. Расчет прибыли\n");
        double rente = 5000;
        double revenue = 13000;
        double costPrice = 9000;
        double profitYear = (13000 - 9000 - 5000) * 12;
        if(profitYear > 0) {
            System.out.println("прибыль за год: +" + profitYear + "руб.");
        } else {
            System.out.println("прибыль за год: " + profitYear + "руб");
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int sum = 567;
        int limitbanknote10 = 5;
        int banknote100 = sum / 100;
        int banknote10 = (sum - banknote100 *100) / 10;
        if (banknote10 > limitbanknote10) {
            banknote10 = limitbanknote10;
        }
        int banknote1 = sum - banknote100 * 100 - banknote10 * 10;
        System.out.println("номиналы банкнот   требуемое их количество");
        System.out.println("        100          " + banknote100);
        System.out.println("        10           " + banknote10);
        System.out.println("        1            " + banknote1);
        System.out.println("сумма к выдаче  " + (banknote100 * 100 + banknote10 * 10 + banknote1));
    }
}