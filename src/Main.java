public class Main {
    public static void main(String[] args) {

        Racional f1 = new Racional(1, 2);
        Racional f2 = new Racional(2, 3);

        Racional f3 = f1.suma(f2);
        Racional f4 = f1.resta(f2);
        Racional f5 = f1.multiplicacion(f2);
        Racional f6 = f1.division(f2);

        System.out.println(f3.toString());
        System.out.println(f4.toString());
        System.out.println(f5.toString());
        System.out.println(f6.toString());

    }
}