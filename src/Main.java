import com.adpc.tapas.features.tapas.domain.Tapa;
import com.adpc.tapas.features.tapas.presentation.MainTapa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tapa newTapa = new Tapa(
                "3",
                "Calamares a la Romana",
                "Las Cumbres",
                "Macho",
                26,
                333,
                "3",
                "Calamares");
        MainTapa.createTapa(newTapa);

        Tapa tapaToUpdated = new Tapa(
                "3",
                "Calamares a la Romana",
                "Las Cumbres",
                "Macho",
                26,
                333,
                "3",
                "Calamares");

        MainTapa.updateTapa(tapaToUpdated);

        Scanner scanner = new Scanner(System.in);

        System.out.println("ESCOGE UNA OPCION:");
        System.out.println("1. Introducir tapa");
        System.out.println("2. Borrar tapa");
        System.out.println("3. Actualizar tapa");
        System.out.println("4. Mostrar tapas");
        System.out.println("5. Salir");

        int option = scanner.nextInt();

        while (option != 5) {

            if (option == 1) {

                System.out.println("Introduce el id de la Tapa: ");
                String idTapa = scanner.nextLine();
                System.out.println("Introduce el nombre de la Tapa: ");
                String nameTapa = scanner.nextLine();
                System.out.println("Introduce el establecimiento de la Tapa: ");
                String establishmentTapa = scanner.nextLine();
                System.out.println("Introduce la puntuacion de la Tapa: ");
                String scoreTapa = scanner.nextLine();
                System.out.println("Introduce el numero de votos de la Tapa: ");
                int voteTapa = scanner.nextInt();
                System.out.println("Introduce la media de los votos de la Tapa: ");
                int mediaVotesTapa = scanner.nextInt();
                System.out.println("Introduce el numero de participante de la Tapa: ");
                String participantIdTapa = scanner.nextLine();
                System.out.println("Introduce los ingredientes de la Tapa: ");
                String ingredientsTapa = scanner.nextLine();

                Tapa addTapa = new Tapa(idTapa, nameTapa, establishmentTapa,scoreTapa,voteTapa,mediaVotesTapa, participantIdTapa, ingredientsTapa);

                MainTapa.createTapa(addTapa);


            } else if (option == 2) {

                System.out.println("Escoge el id de la tapa que quieres borrar: ");
                String id = scanner.nextLine();
                MainTapa.deleteTapa(id);

            } else if (option == 3) {

                MainTapa.updateTapa(newTapa);

            } else if (option == 4) {

                MainTapa.printTapas();
            }

            System.out.println("ESCOGE UNA OPCION:");
            System.out.println("1. Introducir tapa");
            System.out.println("2. Borrar tapa");
            System.out.println("3. Actualizar tapa");
            System.out.println("4. Mostrar tapas");
            System.out.println("5. Salir");

            option = scanner.nextInt();
        }


    }
}