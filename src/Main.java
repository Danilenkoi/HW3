public class Main {
    public static void main(String[] args){

        //Задание 1
        byte a = 120;
        short b = 220;
        int usedFrequently = 355000;
        long hzUsed = 390L;
        float f = 346f;
        double g = 45.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(usedFrequently);
        System.out.println(hzUsed);
        System.out.println(f);
        System.out.println(g);

        //Задание 2
        double aA = 27.12;
        long aB = 987678965549L;
        float aC = 2.786f;
        boolean aI = false;
        char aD = 569;
        short aE = -159;
        int aF = 27897;
        byte aG = 67;
        System.out.println(aA);
        System.out.println(aB);
        System.out.println(aC);
        System.out.println(aD);
        System.out.println(aE);
        System.out.println(aF);
        System.out.println(aG);
        System.out.println(aI);

        //Задание 3
        byte studentLyPa = 23;
        byte studentAnSe = 27;
        byte studentEkAn = 30;
        short sheetsOfPaper = 480;
        int allStudents = studentLyPa + studentAnSe + studentEkAn;
        int sheetOfPaperToTheStudent = sheetsOfPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + sheetOfPaperToTheStudent + " листов бумаги");

        //Задание 4
        byte bottleInTwoMin = 16;
        byte firstTime = 2;
        int bottleInOneMin = bottleInTwoMin / firstTime;

        byte secondTim = 20;
        int bottleInTwentyMin = bottleInOneMin * secondTim;
        System.out.println("За " + secondTim + " машины произвели бутылок " + bottleInTwentyMin +  " штук");

        byte dayOne = 1;
        int d = dayOne * 24;
        int thirdTim = d * 60;
        int bottleInOneDay = bottleInOneMin * thirdTim;
        System.out.println("За " + dayOne + " день машины произвели бутылок " + bottleInOneDay +  " штук");

        byte dayThree = 3;
        int w = dayThree * 24;
        int fourthTime = w * 60;
        int bottleInThreeDay = bottleInOneMin * fourthTime;
        System.out.println("За " + dayThree + " дня машины произвели бутылок " + bottleInThreeDay +  " штук");

        byte oneMonth = 1;
        int e = oneMonth * 30;
        int r = e * 24;
        int fifthTime = r * 60;
        int bottleInMonth = bottleInOneMin * fifthTime;
        System.out.println("За " + oneMonth + " месяц машины произвели бутылок " + bottleInMonth +  " штук");

        //Задание 5
        byte allPaint = 120;
        byte oneClassWhitPaint = 2;
        byte oneClassBraunPaint = 4;
        int allPaintOneClass = oneClassWhitPaint + oneClassBraunPaint;
        int allClass = allPaint / allPaintOneClass;
        int allWhitPaint = allClass * oneClassWhitPaint;
        int allBraunPaint = allClass * oneClassBraunPaint;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhitPaint + " банок белой краски и " + allBraunPaint + " банок коричневой краски");

        //Задание 6
        float bananas = 80f;
        float milk = 105f;
        float iceCreamSundae = 100f;
        float agg = 70f;

        float allBananas = bananas * 5;
        float allMilk = milk * 2;
        float allIceCream = iceCreamSundae * 2;
        float allAgg = agg * 4;

        float allProduct = allBananas + allMilk + allIceCream + allAgg;

        float kilo = allProduct / 1000;
        System.out.println("Спортивный завтрак весит " + kilo + " кг.");

        //Задание 7
        int theWeight = 7000;
        short firstOptions = 250;
        short secondOption = 500;

        int dayFirst = theWeight / firstOptions;
        int daySecond = theWeight / secondOption;

        {System.out.println("Если спортсмен будет сбрасывать " + firstOptions + " грамм в день, то ему понадобится " +
                dayFirst + " дней. А если он будет тратить " + secondOption + " грамм, то ему понадобится " +
                daySecond + " дней.");
        }

        //Задание 8
        int maria = 67760;
        int den = 83690;
        int kris = 76230;

        int mariaAllowance = maria * 110 / 100;
        int denAllowance = den * 110 / 100;
        int krisAllowance = kris * 110 / 100;

        int mRemainder = mariaAllowance % maria;
        int dRemainder = denAllowance % den;
        int kRemainder = krisAllowance % kris;

        int mAllRem = mRemainder * 12;
        int dAllRem = dRemainder * 12;
        int kAllRem = kRemainder * 12;
        System.out.println("Маша теперь получает " + mariaAllowance + " рублей. Годовой доход вырос на " + mAllRem + " рублей"
                         + " Денис теперь получает " + denAllowance + " рублей. Годовой доход вырос на " + dAllRem + " рублей"
                         + " Кристина теперь получает " + krisAllowance + " рублей. Годовой доход вырос на " + kAllRem + " рублей");

    }
}