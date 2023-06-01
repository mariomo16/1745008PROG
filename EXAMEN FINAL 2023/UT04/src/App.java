/*
 *  Mario Morales Ortega (1745008)
 *  EXAMEN FINAL 2023 - UT04: PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 *  Hay algunos valores que estaran mal, o seran nulos porque no sabia que son o he puesto datos aleatorios.
 * 
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int opcion;

        Planetas tierra = new Planetas(6357.0, "Si", 3718237.2, 15.0, "Si", 12742.0,
                24.0, 365.0, 328382.6, "Tierra",
                42348723.2, "Si", "Si");

        Planetas marte = new Planetas(3390.0, "Si", 432874.0, 12.0, "Si", 227936640.0,
                36.0, 364.0, 123123.2, "Marte",
                123123.8, "Si", "Si");

        Planetas mercurio = new Planetas(2440.0, "Si", 238213.5, 37.0, "Si",  57894376.0,
                382.0, 123.0, 3723.9, "Mercurio",
                143284.0, "Si", "Si");

        Planetas jupiter = new Planetas(71492.0, "Si", 32834.2, 32.0, "Si", 778412026.0,
                38.0, 432.0, 38281.0, "Jupiter",
                56875685.0, "Si", "Si");

        Planetas saturno = new Planetas(120000.0, "Si", 32832.5, 21.0, "Si", 23712837.0,
                12.0, 938.0, 12382.0, "Saturno",
                5687568.0, "Si", "Si");

        Satelites satelite1 = new Satelites(37282.0, "Si", 234234.0, 30.0, "Si", 4234.0,
                87.0, 123.0, 1238.2, "Satelite 1",
                3123.0, null, "Tierra");

        Satelites satelite2 = new Satelites(6856.0, "Si", 8678.0, 12.0, "Si", 34534.5,
                25.0, 425.0, 12333.0, "Satelite 2",
                381238.9, null, "Marte");

        Satelites satelite3 = new Satelites(23241.2, "Si", 123123.0, 17.0, "Si", 12312.2,
                32.0, 473.0, 6456456.0, "Satelite 3",
                4234.0, null, "Mercurio");

        Satelites satelite4 = new Satelites(4234.8, "Si", 34523.0, 16.0, "Si", 979789.1,
                32.0, 123.0, 456456.0, "Satelite 4",
                123123.9, null, "Jupiter");

        Satelites satelite5 = new Satelites(3824.0, "Si", 5767.0, 15.0, "Si", 9789.0,
                12.0, 345.0, 345345.0, "Satelite 5",
                213123.4, null, "Saturno");

        do {
            System.out.println("ELIGE OPCION");
            System.out.println("1 -> MOSTRAR DATOS PLANETA");
            System.out.println("2 -> MOSTRAR DATOS SATELITE");
            System.out.println("0 -> SALIR");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del planeta (Tierra, Marte, Mercurio, Jupiter, Saturno): ");
                    // este in.NextLine() lo uso porque sin el, se salta el siguiente in. y no deja
                    // escribir nombre
                    in.nextLine();
                    String nombrePlaneta = in.nextLine();

                    if (nombrePlaneta.equalsIgnoreCase("Tierra")) {
                        System.out.println("Nombre del planeta: " + tierra.getNombreAstro());
                        tierra.muestraDatos("Tierra");
                    }
                    if (nombrePlaneta.equalsIgnoreCase("Marte")) {
                        System.out.println("Nombre del planeta: " + marte.getNombreAstro());
                        marte.muestraDatos("Marte");
                    }
                    if (nombrePlaneta.equalsIgnoreCase("Saturno")) {
                        System.out.println("Nombre del planeta: " + saturno.getNombreAstro());
                        saturno.muestraDatos("Saturno");
                    }
                    if (nombrePlaneta.equalsIgnoreCase("Jupiter")) {
                        System.out.println("Nombre del planeta: " + jupiter.getNombreAstro());
                        jupiter.muestraDatos("Jupiter");
                    }
                    if (nombrePlaneta.equalsIgnoreCase("Mercurio")) {
                        System.out.println("Nombre del planeta: " + mercurio.getNombreAstro());
                        mercurio.muestraDatos("Mercurio");
                    }
                    break;

                case 2:
                    System.out.println(
                            "Introduce el nombre del satelite (Satelite1, Satelite2, Satelite3, Salite4, Satelite5):");
                    // este in.NextLine() lo uso porque sin el, se salta el siguiente in. y no deja
                    // escribir nombre
                    in.nextLine();
                    String nombreSatelite = in.nextLine();

                    if (nombreSatelite.equalsIgnoreCase("Satelite1")) {
                        System.out.println("Nombre del satelite: " + satelite1.getNombreAstro());
                        satelite1.muestraDatos("Satelite 1");
                    }
                    if (nombreSatelite.equalsIgnoreCase("Satelite2")) {
                        System.out.println("Nombre del satelite: " + satelite2.getNombreAstro());
                        satelite2.muestraDatos("Satelite 2");
                    }
                    if (nombreSatelite.equalsIgnoreCase("Satelite3")) {
                        System.out.println("Nombre del satelite: " + satelite3.getNombreAstro());
                        satelite3.muestraDatos("Satelite 3");
                    }
                    if (nombreSatelite.equalsIgnoreCase("Satelite4")) {
                        System.out.println("Nombre del satelite: " + satelite4.getNombreAstro());
                        satelite4.muestraDatos("Satelite 3");
                    }
                    if (nombreSatelite.equalsIgnoreCase("Satelite5")) {
                        System.out.println("Nombre del satelite: " + satelite5.getNombreAstro());
                        satelite5.muestraDatos("Satelite 3");
                    }
                    break;

                default:
                    break;
            }
        } while (opcion != 0);
        in.close();
    }
}
