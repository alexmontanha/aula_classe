public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double med1 = calculaMedia(23, 34, 45);

        System.out.println("Média das 3 notas: " + med1);

        med1 = calculaMedia(27, 30, 42);

        System.out.println("Média das 3 notas: " + med1);

    }

    public static double calculaMedia(int x, int y, int z)
    {
        return ((x + y + z) /3 );
    }
}

