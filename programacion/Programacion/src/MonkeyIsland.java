import java.util.Random;
import java.util.Scanner;

public class MonkeyIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] insultos = {
                "¿Has dejado ya de usar pañales?",
                "¡No hay palabras para describir lo asqueroso que eres!",
                "¡He hablado con simios más educados que tu!",
                "¡No pienso aguantar tu insolencia aquí sentado!"
        };
        String[] respuestasMaquina = {
                "¿Por qué? ¿Acaso querías pedir uno prestado?",
                "Sí que las hay, sólo que nunca las has aprendido.",
                "Me alegra que asistieras a tu reunión familiar diaria.",
                "Ya te están fastidiando otra vez las almorranas, ¿Eh?"
        };

        int jugador = 0;
        int maquina = 0;

        System.out.println("¡Bienvenido a Monkey Island!\n");

        Random random = new Random();

        for (int turno = 0; turno < 3; turno++) {
            System.out.println("=== Turno " + (turno + 1) + " ===\n");

            if (turno % 2 == 0) {
                int opcionJugadorInsulto = tomarTurnoJugador(scanner, insultos);
                int opcionMaquinaRespuesta = tomarTurnoMaquina(respuestasMaquina.length);

                System.out.println("La máquina dice:");
                System.out.println("║ " + respuestasMaquina[opcionMaquinaRespuesta] + "  ║");

                if ((opcionJugadorInsulto + 1) % insultos.length == opcionMaquinaRespuesta) {
                    jugador++;
                    System.out.println("\n¡Has ganado este turno!");
                } else {
                    maquina++;
                    System.out.println("\nLa máquina ha ganado este turno.");
                }
            } else {
                int opcionMaquinaInsulto = tomarTurnoMaquina(insultos.length);
                int opcionJugadorRespuesta = tomarTurnoJugador(scanner, respuestasMaquina);

                System.out.println("La máquina insulta con: " + insultos[opcionMaquinaInsulto]);

                if ((opcionJugadorRespuesta + 1) % respuestasMaquina.length == opcionMaquinaInsulto) {
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

    public static int tomarTurnoJugador(Scanner scanner, String[] opciones) {
        System.out.println("Elige una opción:");
        mostrarOpciones(opciones);
        return obtenerEntradaValida(scanner, opciones.length);
    }

    public static int tomarTurnoMaquina(int limite) {
        Random random = new Random();
        return random.nextInt(limite);
    }

    public static void mostrarOpciones(String[] opciones) {
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
    }

    public static int obtenerEntradaValida(Scanner scanner, int limite) {
        int entrada;
        while (true) {
            if (scanner.hasNextInt()) {
                entrada = scanner.nextInt() - 1;
                scanner.nextLine();
                if (entrada >= 0 && entrada < limite) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Por favor, ingresa un número válido.");
        }
        return entrada;
    }
}
