public class Main {

    public static void main(String[] args) {
        int[] numbers = {0, 4, 8, 16};
        int contador;
        contador = 0;

        for (int i = 0; i <= numbers.length - 1; i++){
            contador = numbers[i] + contador;
        }
        System.out.println("La suma del vecor es: " + contador );
    }
}
