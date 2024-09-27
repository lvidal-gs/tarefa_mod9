public class Main {
    public static void main(String[] args) {


        String numero = "2024";
        int inteiro = Integer.parseInt(numero);

        System.out.println(inteiro);

        String numero2 = "true";
        Boolean isTrue = Boolean.valueOf(numero2);
        System.out.println(isTrue);

        Character c = 'C';
        System.out.println(c);

        int viraLong = 1281928989;
        long virouLong = viraLong;

        short vaiPerderNumeros = (short) virouLong;

        System.out.println(viraLong + " - " + virouLong + " - " + vaiPerderNumeros);
    }
}