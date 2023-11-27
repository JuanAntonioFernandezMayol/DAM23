import java.util.Random;
import java.util.Scanner;

public class MonkeyIsland2 {
    public static void main(String[] args) {
        String[] insultos = {
                "¿Has dejado ya de usar pañales?",
                "¡No hay palabras para describir lo asqueroso que eres!",
                "¡He hablado con simios más educados que tú!",
                "¡No pienso aguantar tu insolencia aquí sentado!"
        };
        String[] respuestasMaquina = {
                "¿Por qué? ¿Acaso querías pedir uno prestado?",
                "Sí que las hay, solo que nunca las has aprendido.",
                "Me alegra que asistieras a tu reunión familiar diaria.",
                "Ya te están fastidiando otra vez las almorranas, ¿eh?"
        };

        int jugador = 0;
        int maquina = 0;

        System.out.println("¡Bienvenido a Monkey Island!\n");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int primerTurno = random.nextInt(2);

        for (int turno = 0; turno < 3; turno++) {
            System.out.println("=== Turno " + (turno + 1) + " ===\n");

            if ((turno + primerTurno) % 2 == 0) {
                int opcionJugadorInsulto = random.nextInt(insultos.length);

                System.out.println("La máquina dice:");
                System.out.println("║ " + respuestasMaquina[random.nextInt(respuestasMaquina.length)] + "  ║");

                System.out.println("Elige una opción:");

                for (int i = 0; i < insultos.length; i++) {
                    System.out.println((i + 1) + ". " + insultos[i]);
                }

                int opcionJugadorRespuesta = scanner.nextInt() - 1;
                scanner.nextLine();

                if ((opcionJugadorInsulto + 1) % insultos.length == opcionJugadorRespuesta) {
                    jugador++;
                    System.out.println("\n¡Has ganado este turno!");
                } else {
                    maquina++;
                    System.out.println("\nLa máquina ha ganado este turno.");
                }
            } else {
                int opcionMaquinaInsulto = random.nextInt(insultos.length);

                System.out.println("La máquina insulta con: " + insultos[opcionMaquinaInsulto]);

                System.out.println("Elige una opción:");

                for (int i = 0; i < respuestasMaquina.length; i++) {
                    System.out.println((i + 1) + ". " + respuestasMaquina[i]);
                }

                int opcionMaquinaRespuesta = scanner.nextInt() - 1;
                scanner.nextLine();

                if ((opcionMaquinaInsulto + 1) % respuestasMaquina.length == opcionMaquinaRespuesta) {
                    maquina++;
                    System.out.println("\nLa máquina ha ganado este turno.");
                } else {
                    jugador++;
                    System.out.println("\n¡Has ganado este turno!");
                }
            }

            System.out.println("\n---------------------\n");
        }

        System.out.println("\n=== Resultado Final ===");
        System.out.println("Puntuación:");
        System.out.println("Jugador: " + jugador);
        System.out.println("Máquina: " + maquina);
        if (jugador > maquina) {
            System.out.println("¡Felicidades! Has ganado el duelo.");
        } else {
            System.out.println("La máquina ha ganado el duelo.");
        }

        scanner.close();
    }
}
