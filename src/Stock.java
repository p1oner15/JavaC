public class Stock {

    public Stock(String s, int i, double v) {
    }

    public void acquire(String a, int b, double c) {
        //a)	Функция acquire выполняет обработку первоначального вклада конкретной компании,
        // запоминая информацию о наименовании компании, количестве акций в пакете, цене каждой акции данного пакета
        // и вычисляя общую стоимость пакета акций с помощью функции set_tot();

    }
    public int buy() {
        //Функция  buy() предназначена для приобретения дополнительных акций;

        return 0;
    }

    public double sell() {
        //Функция  sell() предназначена для продажи акций;

        return 0;
    }
    public double update() {
        //Функция  update() корректирует стоимость одной акции и пересчитывает общую стоимость акций;

        return 0;
    }
    private void show(Stock a) {
        System.out.println(a);
    }
    public double set_tot(int b, double c) {
        return (double) (b * c);
    }

    public static void main(String[] args) {
        Stock stock1 = new Stock("IT.ONE", 100, 90.25);
        double sum1 = stock1.set_tot(100,90.25);
        System.out.println(sum1);



    }
}
