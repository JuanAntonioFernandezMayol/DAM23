import java.util.Random;
import java.util.Scanner;

public class MonkeyIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] insultos = {
                "Eres un cobarde",
                "No vales nada",
                "Eres patético",
                "Nunca lograrás nada"
        };

        int jugador = 0;
        int maquina = 0;

        System.out.println("¡Bienvenido al Duelo de Insultos en Monkey Island! - Asalto Único\n");

        Random random = new Random();
        boolean turnoJugador = random.nextBoolean();

        for (int turno = 0; turno < 3; turno++) {
            System.out.println("=== Turno " + (turno + 1) + " ===\n");

            if (turnoJugador) {
                System.out.println("Turno del Jugador:");
                int opcionJugador = tomarTurnoJugador(scanner, insultos);
                int opcionMaquina = tomarTurnoMaquina(insultos.length);

                System.out.println("\nLa IA dice:");
                System.out.println("╔══════════════════════╗");
                System.out.println("║ " + insultos[opcionMaquina] + " ║");
                System.out.println("╚══════════════════════╝");

                if ((opcionJugador + 1) % insultos.length == opcionMaquina) {
                    maquina++;
                    System.out.println("\nLa IA ha ganado este turno.");
                } else {
                    jugador++;
                    System.out.println("\n¡Has ganado este turno!");
                }
            } else {
                System.out.println("Turno de la IA:");
                int opcionMaquina = tomarTurnoMaquina(insultos.length);
                System.out.println("La IA elige: " + insultos[opcionMaquina]);

                int opcionJugador = tomarTurnoJugador(scanner, insultos);

                if ((opcionJugador + 1) % insultos.length == opcionMaquina) {
                    maquina++;
                    System.out.println("\nLa IA ha ganado este turno.");
                } else {
                    jugador++;
                    System.out.println("\n¡Has ganado este turno!");
                }
            }

            turnoJugador = !turnoJugador; // Cambio de turno para el próximo ciclo

            System.out.println("\n---------------------\n");
        }

        System.out.println("\n=== Resultado Final ===");
        System.out.println("Puntuación:");
        System.out.println("Jugador: " + jugador);
        System.out.println("IA: " + maquina);
        if (jugador > maquina) {
            System.out.println("¡Felicidades! Has ganado el duelo.");
        } else {
            System.out.println("La IA ha ganado el duelo.");
        }

        scanner.close();
    }

    public static int tomarTurnoJugador(Scanner scanner, String[] opciones) {
        System.out.println("Elige un insulto:");
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
