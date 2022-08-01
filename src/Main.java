public class Main {
    public static void main(String[] args) {
         System.out.println("Hello world");
         // Задание 1
         byte mouse = 1;
         short cat = 4;
         int dog = 8;
         long elephant = 120L;
         float sugarWeight = 3.6f;
         double saltWeight = 2.1;
         char bar = 40;
         boolean elephantIsAdult = elephant > 26;
         System.out.println(elephantIsAdult);

         // Задание 2
         double boxer1 = 78.2;
         double boxer2 = 82.7;
         double weightOfAllBoxer = boxer1 + boxer2;
         double weightDefference = boxer2 - boxer1;
         System.out.println(" общий вес боксеров " + weightOfAllBoxer);
         System.out.println(" разница в весе " + weightDefference);

        // Задание 3
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int weightGram = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        System.out.println(" Вес в граммах - " + weightGram);
        System.out.println(" вес в килограммах - " + (double)weightGram/1000);

        // Задание 4
        int weightRules = 7000;
        int firstDiet = 250;
        int secondDiet = 500;
        double firstResult =  weightRules / firstDiet;
        System.out.println(" Спортсмен сбросит 7 кг на первой диете через - " + firstResult + " дней ");
        double secondResult = weightRules / secondDiet;
        System.out.println(" Спортсмен сбросит 7 кг на второй диете через - " + secondResult + " дней ");
        System.out.println(" в среднем дней на диету уйдет - " + (firstResult + secondResult) / 2 + " дней ");

        // Задание 5
        int mashaCooperator = 67760;
        int denisCooperator = 83690;
        int kristinaCooperator = 76230;
        double salaryIncreaseMasha = (double)mashaCooperator / 100 * 10 + mashaCooperator;
        System.out.println(" Маша теперь получает - " + salaryIncreaseMasha);
        double salaryIncreaseDenis = (double)denisCooperator / 100 * 10 + denisCooperator;
        System.out.println(" Денис теперь получает - " + salaryIncreaseDenis);
        double salaryIncreaseKristina = (double)kristinaCooperator / 100 * 10 + kristinaCooperator;
        System.out.println(" Кристина теперь получает - " + salaryIncreaseKristina);
        System.out.println(" годовой доход Маши вырос на - " +  ( mashaCooperator + salaryIncreaseMasha ) * 12);
        System.out.println(" годовой доход Дениса вырос на - " + ( denisCooperator + salaryIncreaseDenis ) * 12);
        System.out.println(" годовой доход Кроистины вырос на - " + (kristinaCooperator + salaryIncreaseKristina) * 12);



    }
}