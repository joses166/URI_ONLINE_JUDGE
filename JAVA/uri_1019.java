import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int segundos = in.nextInt();
        int minutos = 0;
        int horas = 0;
        if (segundos >= 60) {
            minutos = segundos / 60;
            segundos = segundos - (minutos * 60);
        }
        if (minutos >= 60) {
            horas = minutos / 60;
            minutos = minutos - (horas * 60);
        }
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
