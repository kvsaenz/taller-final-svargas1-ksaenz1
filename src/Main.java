import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "_____________________________________";
        boolean menu = true;

        while (menu) {
            System.out.println(line);
            System.out.println("".concat(" ".repeat(5)).concat("MENÚ CAPITULO DE PROGRAMACIÓN \nSVARGAS1 Y KSAENZ1"));
            System.out.println(line);
            System.out.println("1. Datos primitivos");
            System.out.println("2. String");
            System.out.println("3. Constantes");
            System.out.println("4. Tipo de operadores");
            System.out.println("5. Condicional IF y ELSE");
            System.out.println("6. Condicional Switch");
            System.out.println("7. Condicional Ternaria");
            System.out.println("8. Bucle do while");
            System.out.println("9. Bucle while");
            System.out.println("10. Bucle For");
            System.out.println("0. Salir");
            System.out.println(line);
            System.out.print("Seleccione una opción: ");


            int opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    boolean ejecucionUno = true;
                    while (ejecucionUno) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("DATOS PRIMITIVOS"));
                        System.out.println(line);
                        System.out.println("a. ¿Qué es un BYTE?");
                        System.out.println("b. ¿Qué es un SHORT?");
                        System.out.println("c. ¿Qué es un INT?");
                        System.out.println("d. ¿Qué es un LONG?");
                        System.out.println("e. ¿Qué es un FLOAT?");
                        System.out.println("f. ¿Qué es un DOUBLE?");
                        System.out.println("g. ¿Qué es un CHAR?");
                        System.out.println("h. ¿Qué es un BOOLEAN?");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuUno = scanner.next();
                        switch (subMenuUno) {

                            case "a":
                                System.out.println(line);
                                System.out.println("BYTE \n\nRepresenta un tipo de dato de 8 bits. Puede almacenar valores numéricos en el rango de -128 a 127. \nEs útil para ahorrar memoria cuando se necesita almacenar valores pequeños.\n\nEjemplo: una edad (25)");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "b":
                                System.out.println(line);
                                System.out.println("SHORT\n\nEste tipo de dato utiliza 16 bits. Puede almacenar valores numéricos en el rango de -32,768 a 32,767. \nSe utiliza cuando se necesita un rango más amplio que el proporcionado por los bytes,\npero aún se desea ahorrar memoria en comparación con los tipos de dato más grandes.\n\nEjemplo: un año (1990)");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "c":
                                System.out.println(line);
                                System.out.println("INT\n\nEs un tipo de dato de 32 bits, tilizado para almacenar valores numéricos. \nSu rango va desde -2,147,483,648 (-2^31) hasta 2,147,483,647 (2^31 - 1). \nEs el tipo de dato más comúnmente utilizado para representar números enteros. \n\nEjemplo: un salario (1300000)");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "d":
                                System.out.println(line);
                                System.out.println("LONG\n\nEste tipo de dato utiliza 64 bits. Puede almacenar valores numéricos en el rango de -9,223,372,036,854,775,808 (-2^63) a 9,223,372,036,854,775,807 (2^63 - 1). \nSe utiliza cuando se necesitan números enteros muy grandes.\n\nEjemplo: una masa (178823411) \n\nNOTA: Anteriormente se pedia poner una 'L' al final, pero desde java 21 ya no es necesario.");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "e":
                                System.out.println(line);
                                System.out.println("FLOAT\n\nEs un tipo de dato diseñado para almacenar números, con precisión simple de 32 bits. \nSe utiliza cuando se requieren números decimales con un grado de precisión adecuado para muchas aplicaciones. \n\nEjemplo: un diametro (34.25f)\n\nNOTA: En cualquier versiòn de java se debe poner una 'f' al final del numero");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "f":
                                System.out.println(line);
                                System.out.println("DOUBLE\n\nEste tipo de dato almacena números, con doble precisión de 64 bits, lo que proporciona una mayor precisión que float. \nSe usa en aplicaciones que requieren una alta precisión en cálculos numéricos. \n\nEjemplo: el peso (88.77)");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "g":
                                System.out.println(line);
                                System.out.println("CHAR\n\nEs un tipo de dato que representa un carácter Unicode sencillo de 16 bits. \nSe utiliza para almacenar caracteres individuales, como letras o símbolos en diferentes lenguajes y conjuntos de caracteres. \n\nEjemplo: una nota (S)\n\nNOTA: una letra, un numero, un caracter. Se escribe entre comillas simples 'h'");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "h":
                                System.out.println(line);
                                System.out.println("BOOLEAN\n\nSirve para definir tipos de datos booleanos que pueden tener solo dos valores: true o false. \nAunque ocupa solo 1 bit de información, generalmente se almacena en un byte completo por razones de eficiencia. \n\nEjemplo: funciona = true");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "0":
                                ejecucionUno = false;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Subopción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }

                    }
                    break;
                case 2:
                    boolean ejecucionDos = true;
                    while (ejecucionDos) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("STRING"));
                        System.out.println(line);
                        System.out.println("a. ¿Qué es un STRING?");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuDos = scanner.next();
                        switch (subMenuDos) {

                            case "a":
                                System.out.println(line);
                                System.out.println("STRING \n\nEs una secuencia de caracteres usado para representar texto. \n\nEjemplo: String mensaje = \"hola\"");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "0":
                                ejecucionDos = false;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }

                    }
                    break;
                case 3:
                    boolean ejecucionTres = true;
                    while (ejecucionTres) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("CONSTANTE"));
                        System.out.println(line);
                        System.out.println("a. ¿Qué es una CONSTANTE?");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuTres = scanner.next();
                        switch (subMenuTres) {

                            case "a":
                                System.out.println(line);
                                System.out.println("CONSTANTE \n\nEs un lugar en memoria en el cual se almacena un dato con el fin único de leerlo y sin posibilidad de modificación. \n\nNOTA:\n* La constante debe ser precedida por la palabra reservada final.\n* Por convenio el nombre de las constantes se escribe en mayúsculas y se separa con guión al piso.\n\nEjemplo: final String MI_URL = www.mipagina.com.co ");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "0":
                                ejecucionTres = false;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }

                    }
                    break;
                case 4:
                    boolean ejecucionCuatro = true;
                    while (ejecucionCuatro) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("TIPO DE OPERADORES"));
                        System.out.println(line);
                        System.out.println("a. ARITMÉTICOS");
                        System.out.println("b. RELACIONALES");
                        System.out.println("c. LÓGICOS");
                        System.out.println("d. INCREMENTO-DECREMENTO");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuCuatro = scanner.next();
                        switch (subMenuCuatro) {

                            case "a":
                                boolean ejecucionCuatroA = true;
                                while (ejecucionCuatroA) {
                                    System.out.println(line);
                                    System.out.println("a. SUMA");
                                    System.out.println("b. RESTA");
                                    System.out.println("c. MULTIPLICACIÓN");
                                    System.out.println("d. DIVISIÓN");
                                    System.out.println("e. MODULO");
                                    System.out.println("0. Volver al menú principal");
                                    System.out.println("1. Volver al menú anterior");
                                    System.out.println(line);
                                    String subMenuCuatroA = scanner.next();
                                    switch (subMenuCuatroA) {
                                        case "a":
                                            System.out.println(line);
                                            System.out.println("SUMA \n\nSuma dos números.\n\nEjemplo: [Subtotal]+[ImpuestoSobreVentas]");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "b":
                                            System.out.println(line);
                                            System.out.println("RESTA \n\nBusca la diferencia entre dos números o indica el valor negativo de un número.\n\nEjemplo: [Precio]-[Descuento]");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "c":
                                            System.out.println(line);
                                            System.out.println("MULTIPLICACIÓN \n\nMultiplica dos números.\n\nEjemplo: [Cantidad]*[Precio]");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "d":
                                            System.out.println(line);
                                            System.out.println("DIVISIÓN \n\nDivide el primer número entre el segundo.\n\nEjemplo: [Total]/[RecuentoDeElementos]");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "e":
                                            System.out.println(line);
                                            System.out.println("MODULO \n\nDivide el primer número entre el segundo y después devuelve únicamente el resto.\n\nEjemplo: [Registradas] Resto [Salas]");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "0":
                                            ejecucionCuatroA = false;
                                            ejecucionCuatro = false;
                                            System.out.println("Volviendo al menú principal...");
                                            break;
                                        case "1":
                                            ejecucionCuatroA = false;
                                            System.out.println("Volviendo al menú anterior...");
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;

                                    }

                                }

                                break;
                            case "b":
                                boolean ejecucionCuatroB = true;
                                while (ejecucionCuatroB) {
                                    System.out.println(line);
                                    System.out.println("a. Igual a");
                                    System.out.println("b. Diferente de");
                                    System.out.println("c. Mayor que");
                                    System.out.println("d. Menor que");
                                    System.out.println("e. Mayor o igual que");
                                    System.out.println("e. Menor o igual que");
                                    System.out.println("0. Volver al menú principal");
                                    System.out.println("1. Volver al menú anterior");
                                    System.out.println(line);
                                    String subMenuCuatroB = scanner.next();
                                    switch (subMenuCuatroB) {
                                        case "a":
                                            System.out.println(line);
                                            System.out.println("Igual a \n\nDevuelve True si el primer valor es igual al segundo valor.\n\nEjemplo: Valor1 = Valor2");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "b":
                                            System.out.println(line);
                                            System.out.println("Diferente de \n\nDevuelve True si el primer valor no es igual al segundo valor.\n\nEjemplo: Valor1 <> Valor2");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "c":
                                            System.out.println(line);
                                            System.out.println("Mayor que \n\nDevuelve True si el primer valor es mayor que el segundo valor.\n\nEjemplo: Valor1 > Valor2");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "d":
                                            System.out.println(line);
                                            System.out.println("Menor que \n\nDevuelve True si el primer valor es menor que el segundo valor.\n\nEjemplo: Valor1 < Valor2");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "e":
                                            System.out.println(line);
                                            System.out.println("Mayor o igual que \n\nDevuelve True si el primer valor es mayor o igual que el segundo valor.\n\nEjemplo: Valor1 >= Valor2");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "f":
                                            System.out.println(line);
                                            System.out.println("Menor o igual que \n\nDevuelve True si el primer valor es menor o igual que el segundo valor.\n\nEjemplo: Valor1 <= Valor2");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "0":
                                            ejecucionCuatroB = false;
                                            ejecucionCuatro = false;
                                            System.out.println("Volviendo al menú principal...");
                                            break;
                                        case "1":
                                            ejecucionCuatroB = false;
                                            System.out.println("Volviendo al menú anterior...");
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                    }

                                }
                                break;

                            case "c":
                                boolean ejecucionCuatroC = true;
                                while (ejecucionCuatroC) {
                                    System.out.println(line);
                                    System.out.println("a. &&");
                                    System.out.println("b. ||");
                                    System.out.println("c. !");
                                    System.out.println("0. Volver al menú principal");
                                    System.out.println("1. Volver al menú anterior");
                                    System.out.println(line);
                                    String subMenuCuatroC = scanner.next();
                                    switch (subMenuCuatroC) {
                                        case "a":
                                            System.out.println(line);
                                            System.out.println("&& \n\nDevuelve True cuando Expresión1 y Expresión2 son verdaderas.\n\nEjemplo: boolean resultado = (5>3 && 3<4)");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "b":
                                            System.out.println(line);
                                            System.out.println("|| \n\nDevuelve True cuando Expresión1 o Expresión2 es verdadera.\n\nEjemplo: boolean resultado = (5>3 || 3<4)");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "c":
                                            System.out.println(line);
                                            System.out.println("! \n\nDiferente o negaciòn.\n\nEjemplo: boolean resultado = !(5>3)\n\nNOTA: Inverte el resultado asi sea verdadero");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "0":
                                            ejecucionCuatroC = false;
                                            ejecucionCuatro = false;
                                            System.out.println("Volviendo al menú principal...");
                                            break;
                                        case "1":
                                            ejecucionCuatroC = false;
                                            System.out.println("Volviendo al menú anterior...");
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                    }

                                }
                                break;
                            case "d":
                                boolean ejecucionCuatroD = true;
                                while (ejecucionCuatroD) {
                                    System.out.println(line);
                                    System.out.println("a. INCREMENTO ++");
                                    System.out.println("b. DECREMENTO --");
                                    System.out.println("0. Volver al menú principal");
                                    System.out.println("1. Volver al menú anterior");
                                    System.out.println(line);
                                    String subMenuCuatroC = scanner.next();
                                    switch (subMenuCuatroC) {
                                        case "a":
                                            System.out.println(line);
                                            System.out.println("++ \n\nEl operador de incremento aumenta el valor de su operando en 1.\n\nEjemplo: \nint  x;\n" +
                                                    "int  y;\n" +
                                                    "x = 1;\n" +
                                                    "y = ++x;    // x es ahora 2, y es también 2\n" +
                                                    "y = x++;    // x es ahora 3, y es 2");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "b":
                                            System.out.println(line);
                                            System.out.println("-- \n\nEl operador de devremento dismunuye el valor de su operando en 1.\n\nEjemplo: \nint  x;\n" +
                                                    "int  y;\n" +
                                                    "x = 2;\n" +
                                                    "y = x--;    // x es ahora 1, y es 2\n" +
                                                    "y = --x;    // x es ahora 0, y es también 0");
                                            System.out.println(line);
                                            System.out.println("Presione Enter para continuar...");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                        case "0":
                                            ejecucionCuatroD = false;
                                            ejecucionCuatro = false;
                                            System.out.println("Volviendo al menú principal...");
                                            break;
                                        case "1":
                                            ejecucionCuatroD = false;
                                            System.out.println("Volviendo al menú anterior...");
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                            scanner.nextLine();
                                            scanner.nextLine();
                                            break;
                                    }
                                }
                            case "0":
                                ejecucionCuatro = false;
                                System.out.println("Volviendo al menú principal...");
                            default:
                                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;


                        }

                    }
                case 5:
                    boolean ejecucionCinco = true;
                    while (ejecucionCinco) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("IF y ELSE"));
                        System.out.println(line);
                        System.out.println("a. QUE ES IF");
                        System.out.println("b. QUE ES ELSE IF");
                        System.out.println("c. QUE ES ELSE");
                        System.out.println("d. PROGRAMA");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuCinco = scanner.next();
                        switch (subMenuCinco) {

                            case "a":
                                System.out.println(line);
                                System.out.println("IF \n\nEs un condicional, es si se cumpliera la  condición. \n\nEjemplo: «saldría a pasear si no lloviera». Es decir, si se cumpliera la condición «no llover»");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "b":
                                System.out.println(line);
                                System.out.println("ELSE IF \n\nComo su nombre lo sugiere, es una combinación de if y else. Del mismo modo que else, \nextiende una sentencia if para ejecutar una sentencia diferente en caso que la expresión if original se evalúe como false. \nSin embargo, a diferencia de else, esa expresión alternativa sólo se ejecutará si la expresión condicional del elseif se evalúa como true. \n\nNOTA:\n* La constante debe ser precedida por la palabra reservada final.\n* Por convenio el nombre de las constantes se escribe en mayúsculas y se separa con guión al piso.\n\nEjemplo: if ($a > $b) {\n" +
                                        "    echo \"a es mayor que b\";\n" +
                                        "} elseif ($a == $b) {\n" +
                                        "    echo \"a es igual que b\";\n" +
                                        "} else {\n" +
                                        "    echo \"a es menor que b\";\n" +
                                        "}");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "c":
                                System.out.println(line);
                                System.out.println("ELSE \n\ncuando una condicion determinada no se cumple.\n\nEjemplo: if ($a > $b) {\n" +
                                        "  echo \"a es mayor que b\";\n" +
                                        "} else {\n" +
                                        "  echo \"a NO es mayor que b\";\n" +
                                        "}");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "d":
                                System.out.println(line);
                                System.out.println("PROGRAMA");
                                System.out.println("Ingrese su edad:");

                                int edad = scanner.nextInt();
                                if (edad >= 1 && edad <= 5) {
                                    System.out.println("Es un niño");
                                } else if (edad >= 6 && edad <= 12) {
                                    System.out.println("Es un joven");
                                } else if (edad >= 13 && edad <= 18) {
                                    System.out.println("Es un adolecente");
                                } else {
                                    System.out.println("Es un adulto");
                                }
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "0":
                                ejecucionCinco = false;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }

                    }

                    break;
                case 6:
                    boolean ejecucionSeis = true;
                    while (ejecucionSeis) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("SWITCH"));
                        System.out.println(line);
                        System.out.println("a. QUE ES SWITCH");
                        System.out.println("b. PROGRAMA");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuSeis = scanner.next();
                        switch (subMenuSeis) {

                            case "a":
                                System.out.println(line);
                                System.out.println("SWITCH \n\nEstructura de control que permite ejecutar diferentes bloques de código en función del valor de una variable.");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "b":
                                System.out.println(line);
                                System.out.println("PROGRAMA");
                                System.out.println("ingrese la nota en un rango de 1 a 10");
                                int nota = scanner.nextInt();
                                if (nota > 10 || nota < 1) {
                                    System.out.println("la nota no esta en el rango requerido");
                                    System.out.println("Presione Enter para continuar...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                    break;
                                }

                                switch (nota) {
                                    case 1:
                                    case 2:
                                        System.out.println("Su calificacion es F");
                                        break;
                                    case 3:
                                    case 4:
                                        System.out.println("Su calificacion es D");
                                        break;
                                    case 5:
                                    case 6:
                                        System.out.println("Su calificacion es C");
                                        break;
                                    case 7:
                                    case 8:
                                        System.out.println("Su calificacion es B");
                                        break;
                                    case 9:
                                    case 10:
                                        System.out.println("Su calificacion es A");
                                        break;
                                }
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "0":
                                ejecucionSeis = false;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }
                    }
                    break;
                case 7:
                    boolean ejecucionSiete = true;
                    while (ejecucionSiete) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("TERNARIAS"));
                        System.out.println(line);
                        System.out.println("a. QUE ES TERNARIA");
                        System.out.println("b. PROGRAMA");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuSiete = scanner.next();
                        switch (subMenuSiete) {

                            case "a":
                                System.out.println(line);
                                System.out.println("TERNARIA \n\nPermite tomar decisiones basadas en una condición booleana de manera concisa en una sola línea de código. \n\nEJEMPLO: \nint edad = 20;\n" +
                                        "\n" +
                                        "String mensaje = (edad >= 18) ? \"Eres mayor de edad\" : \"Eres menor de edad\";");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "b":
                                System.out.println(line);
                                System.out.println("PROGRAMA");
                                System.out.println("ingrese un numero");
                                int numero = scanner.nextInt();
                                String s = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";
                                System.out.println(s);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                            case "0":
                                ejecucionSiete = false;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }
                    }

                    break;
                case 8:
                    boolean ejecucionOcho = true;
                    while (ejecucionOcho) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("DO WHILE"));
                        System.out.println(line);
                        System.out.println("a. QUE ES DO WHILE");
                        System.out.println("b. PROGRAMA");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuOcho = scanner.next();
                        switch (subMenuOcho) {
                            case "a":
                                System.out.println(line);
                                System.out.println("DO WHILE \n\nLa sentencia (hacer mientras) crea un bucle que ejecuta una sentencia especificada, hasta que la condición de comprobación se evalúa como falsa. \nLa condición se evalúa después de ejecutar la sentencia, dando como resultado que la sentencia especificada se ejecute al menos una vez.");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "b":
                                System.out.println(line);
                                System.out.println("PROGRAMA");
                                System.out.println("Debes adivinar un numero de 1 a 10");
                                int numeroAdivinar = (int) (Math.random() * 10 + 1);
                                boolean ejecucionAdivinar = true;
                                while (ejecucionAdivinar) {
                                    System.out.println("Ingresa un numero");
                                    int numeroIngresado = scanner.nextInt();
                                    if (numeroIngresado == numeroAdivinar) {
                                        System.out.println("ADIVINASTE!!");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                        ejecucionAdivinar = false;

                                    } else if (numeroIngresado > numeroAdivinar) {
                                        System.out.println("numero muy alto, te pasaste");
                                    } else {
                                        System.out.println("numero muy bajo");
                                    }
                                }

                            case "0":
                                ejecucionOcho = false;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }
                    }


                    break;
                case 9:
                    boolean ejecucionNueve = true;
                    while (ejecucionNueve) {
                        System.out.println(line);
                        System.out.println("".concat(" ".repeat(5)).concat("WHILE"));
                        System.out.println(line);
                        System.out.println("a. QUE ES WHILE");
                        System.out.println("b. PROGRAMA");
                        System.out.println("0. Volver al menú principal");
                        System.out.println(line);
                        System.out.print("Seleccione una opción: ");

                        String subMenuSiete = scanner.next();
                        switch (subMenuSiete) {

                            case "a":
                                System.out.println(line);
                                System.out.println("WHILE \n\nCrea un bucle que ejecuta una sentencia especificada mientras cierta condición se evalúe como verdadera. \nDicha condición es evaluada antes de ejecutar la sentencia.\n\nEJEMPLO: \nn = 0;\n" +
                                        "x = 0;\n" +
                                        "while (n < 3) {\n" +
                                        "  n++;\n" +
                                        "  x += n;\n" +
                                        "}");
                                System.out.println(line);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "b":
                                System.out.println(line);
                                System.out.println("PROGRAMA");
                                System.out.println("Digite un numero de 1 a 10, para realizar la sumatoria");
                                int numero = scanner.nextInt();
                                if (numero>20 || numero<1){
                                    System.out.println("numero ingresado no es valido");
                                    System.out.println("Presione Enter para continuar...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                    break;
                                }
                                int numeroSuma = 1;
                                int sumaTotal = 0;
                                while (numeroSuma<=numero){
                                    sumaTotal = sumaTotal + numeroSuma;
                                    numeroSuma++;
                                }
                                System.out.println("La suma total es: "+sumaTotal);
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case "0":
                                ejecucionNueve = false;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;

                        }
                    }


                case 10:
                    System.out.println("Has seleccionado la opción 10");
                    break;
                case 0:
                    menu = false;
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
            }
        }

        scanner.close();
    }

}

