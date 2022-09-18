public class IfElseStatementTheme {

    public static void main (String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        int age = 15;
        boolean maleGender = true;
        double height = 1.75;
        // char letter1Name

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
        double num1 = 3;
        double num2 = 5;
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
            if(num / 2 == num % 2) {
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
        int num3 = 943;
        System.out.println("исходные числа " + num + "   " + num3);
        if((num - num3) % 10 == 0) {
            System.out.println("одинаковые цифры в 1 разряде    " + num % 10);
        }
        if(num / 10 %10  == num3 / 10 % 10) {
            System.out.println("одинаковые цифры во 2 разряде   " + num / 10 % 10);
        }
        if(num / 100  == num3 / 100) {
            System.out.println("одинаковые цифры в 3 разряде    " + num / 100);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char codeSymbol = '\u0057';
        System.out.println("Символ " + codeSymbol);
        if(((int) codeSymbol > 96) && ((int) codeSymbol < 123)) {
            System.out.println("маленькая буква");
        } else if(((int) codeSymbol > 64) && ((int) codeSymbol < 91)) {
            System.out.println("большая буква");
        } else if(((int) codeSymbol > 47) && ((int) codeSymbol < 58)) {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        double sumDeposit = 300_000;
        double rate = 0.05;
        System.out.println("сумма вклада "+ sumDeposit);
        if((sumDeposit>=100_000) && (sumDeposit<=300_000)) {
            rate = 0.07;
        } else if (sumDeposit > 300_000) {
            rate = 0.1;
        }
        System.out.println("начисленный процент " + sumDeposit * rate);
        System.out.println("итоговая сумма с % " + sumDeposit * (1 + rate));

        System.out.println("\n7. Определение оценки по предметам\n");
        double percentFinalHistory = 59;
        double percentFinalProgramming = 91;
        double temp = percentFinalHistory;
        int rating = 5;
        if (temp <= 60) {
            rating = 2;
        } else if((temp > 60) && (temp <= 73)) {
            rating = 3;
        } else if((temp > 73) && (temp <= 91)) {
            rating = 4;
        }
        System.out.println(rating + " История");
        int tempRating = rating;
        temp = percentFinalProgramming;
        rating = 5;
        if (temp <= 60) {
            rating = 2;
        } else if((temp > 60) && (temp <= 73)) {
            rating = 3;
        } else if((temp > 73) && (temp <= 91)) {
            rating = 4;
        }
        System.out.println(rating + " Программирование");
        tempRating += rating;
        System.out.println("средний балл оценок по предметам  " + tempRating / 2);
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
        int limitbanknote = 5;
        int banknote100 = sum / 100;
        int banknote10 = (sum - banknote100 *100) / 10;
        if (banknote10 > limitbanknote) {
            banknote10 = limitbanknote;
        }
        int banknote1 = sum - banknote100 * 100 - banknote10 * 10;
        System.out.println("номиналы банкнот   требуемое их количество");
        System.out.println("        100          " + banknote100);
        System.out.println("        10           " + banknote10);
        System.out.println("        1            " + banknote1);
        System.out.println("сумма к выдаче  " + (banknote100 * 100 + banknote10 * 10 + banknote1));
    }
}