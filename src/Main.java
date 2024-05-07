public class Main {
    public static void main(String[] args) {

        int a = 3333;
        byte b = -12;
        short c = 129;
        long d = 67598;
        float e = 6.545f;
        double x = 0.14527896;

        System.out.println("Значение переменной а с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной x с типом double равно " + x);

        float firstValue = 27.12f;
        long secondValue = 987678965549L;
        float thirdValue = 2.786f;
        short fourthValue = 569;
        short fifthValue = -159;
        int sixthValue = 27897;
        byte seventhValue = 67;

        System.out.println(firstValue);
        System.out.println(secondValue);
        System.out.println(thirdValue);
        System.out.println(fourthValue);
        System.out.println(fifthValue);
        System.out.println(sixthValue);
        System.out.println(seventhValue);

        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int totalNumberOfChildren = firstClass + secondClass + thirdClass;
        short totalNumberOfPaper = 480;
        int paperForOneChild = totalNumberOfPaper / totalNumberOfChildren;
        System.out.println("На каждого ученика рассчитано " + paperForOneChild + " листов бумаги.");

        byte twoMinutes = 16;
        int oneMinutes = twoMinutes / 2;
        int twentyMinutes = oneMinutes * 20;
        int minutesInADay = 24 * 60;
        int day = oneMinutes * minutesInADay;
        int hoursInThreeDays = 3 * 24;
        int minutesInThreeDays = hoursInThreeDays * 60;
        int threeDays = oneMinutes * minutesInThreeDays;
        int hoursInMonth = 31 * 24;
        int minutesInMonth = hoursInMonth * 60;
        int month = oneMinutes * minutesInMonth;

        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + day + " штук бутылок.");
        System.out.println("За три дня машина произвела " + threeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + month + " штук бутылок.");

        byte allThePaint = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        int totalClasses = allThePaint / (whitePaintForOneClass + brownPaintForOneClass);
        int totalWhitePaint = totalClasses * whitePaintForOneClass;
        int totalBrownPaint = totalClasses * brownPaintForOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        byte bananas = 5;
        // не знаю, что у меня тут за ошибка, на решение задачи не повлияло и программа работает.
        byte weightOfOneBanana = 80;
        int totalWeightOfBananas = weightOfOneBanana * bananas;
        short milk = 2;
        byte gramsToMilliliters = 105;
        int totalWeightOfMilk = milk * gramsToMilliliters;
        byte iceCream = 2;
        byte iceCreamPackageWeight = 100;
        int totalWeightOfIceCream = iceCreamPackageWeight * iceCream;
        byte eggs = 4;
        byte weightOneEgg = 70;
        int totalWeightOfEggs = eggs * weightOneEgg;
        int totalWeightBreakfast = totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream + totalWeightOfEggs;
        short gramToOneKilogram = 1000;
        float totalWeightBreakfastInKilograms = (float) totalWeightBreakfast / gramToOneKilogram;
        System.out.println("Общий вес завтрака составляет " + totalWeightBreakfast + " грамм.");
        System.out.println("В килограммах общий вес завтрака составляет " + totalWeightBreakfastInKilograms + " кг.");

        byte weightOnKilograms = 7;
        int weightOnGram = weightOnKilograms * gramToOneKilogram;
        short lessWeightLoss = 250;
        short bigWeightLoss = 500;
        int numberOfDaysWithLessLoss = weightOnGram / lessWeightLoss;
        int numberOfDaysWithBigLoss = weightOnGram / bigWeightLoss;
        System.out.println("Если смортсмен будет терять по " + lessWeightLoss + " грамм в день, то для достижения результата ему понадобиться " + numberOfDaysWithLessLoss + " дней.");
        System.out.println("Если смортсмен будет терять по " + bigWeightLoss + " грамм в день, то для достижения результата ему понадобиться " + numberOfDaysWithBigLoss + " дней.");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryPerYearMasha = salaryMasha * 12;
        int salaryPerYearDenis = salaryDenis * 12;
        int salaryPerYearKristina = salaryKristina * 12;
        double newSalaryPerMonthMasha = salaryMasha * 0.1 + salaryMasha;
        double newSalaryPerMonthDenis = salaryDenis * 0.1 + salaryDenis;
        double newSalaryPerMonthKristina = salaryKristina * 0.1 + salaryKristina;
        double newSalaryPerYearMasha = newSalaryPerMonthMasha * 12;
        double newSalaryPerYearDenis = newSalaryPerMonthDenis * 12;
        double newSalaryPerYearKristina = newSalaryPerMonthKristina * 12;
        double salaryDifferenceMasha = newSalaryPerYearMasha - salaryPerYearMasha;
        double salaryDifferenceDenis = newSalaryPerYearDenis - salaryPerYearDenis;
        double salaryDifferenceKristina = newSalaryPerYearKristina - salaryPerYearKristina;
        System.out.println("Маша теперь получает " + newSalaryPerMonthMasha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryPerMonthDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получае " + newSalaryPerMonthKristina + " рубля. Годовой доход вырос на " + salaryDifferenceKristina + " рублей.");






    }
}