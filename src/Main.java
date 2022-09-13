public class Main {
    public static void main(String[] args) {
int performance = 16;
byte time2 = 2;
int productionOne = performance / time2;
        System.out.println("Выработка за 1 минуту " + productionOne + " бутылок");
        byte time20 = 20;
        int productionTwenty = productionOne * time20;
        System.out.println("За " + time20 + " минут машина произвела бутылок " + productionTwenty + " штук");
        byte timeHour = 60;
        byte amountHour = 24;
        byte amounthDay2 = 3;
        byte amounthDay3 = 30;
   int timeDay = amountHour * timeHour;
        System.out.println(timeDay + " минут в сутках");
        int productionDay = productionOne * timeDay;
        System.out.println("За " + timeDay + " минут машина произвела бутылок " + productionDay + " штук");
        int timeThreeDays = amounthDay2 * amountHour * timeHour;
        System.out.println(timeThreeDays + " минут в трех сутках");
        int productionThreeDays = productionOne * timeThreeDays;
        System.out.println("За " + timeThreeDays + " минут машина произвела бутылок " + productionThreeDays + " штук");
        int timeMonth = amounthDay3 * amountHour * timeHour;
        System.out.println(timeMonth + " минут в месяце");
        int productionMonth = productionOne * timeMonth;
        System.out.println("За " + timeMonth + " минут машина произвела бутылок " + productionMonth + " штук");
    }
}