public class Main {
    public static void main(String[] args)
    {
        System.out.println("Siemanko, losowanie liczb.");
        System.out.println("Losowanie (SCAM MACHINE) z zakresu 1-100");

        int zmienna = 10; // typ prosty, tylko zmienna
        Integer zmienna2 = 20; // typ złożony (wielka litera) obiekt klasy Integer = metoda

        int wylosowaneLiczby[] = new int[6];

        for (int i = 0; i < wylosowaneLiczby.length; i++)
        {
            wylosowaneLiczby[i] = (int)(Math.random()*100+1);
        }
    }
}