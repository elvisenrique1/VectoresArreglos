
package ejerciciosvectoresarreglos;

    /*
    Pedirle al usuario que ingrese el tamaño del vector (longitud), luego pedirle al usuario que cargue los números            de cada posición.
    Al finalizar, por pantalla mostrar:
    * Listado de números ingresados, uno al lado del otro separados por una barra.
    * Sumatoria de todos los números
    * Mayor número ingresado
    * Menor número ingresado
    * Promedio de números ingresados (entero, sin decimales)
    * Cantidad de números pares
    * Cantidad de números impares
    */
import java.util.Scanner;

/**
 *
 * @author Elvis Enrique Guaiquire
 */
public class EjercicioArregloVector {
    
    public static void main(String[] args) {
        
        solucionEjercicioTres();    
              
    } // *.- Cierre del main -.*
    
    public static void solucionEjercicioTres(){        
        Scanner teclado = new Scanner(System.in);
        imprimirEncabezadoEjercicio();
        int longitudVector = solicitarLongitudVector(teclado);        
        int[] numerosEnteros = crearVector(longitudVector);        
        ingresarValoresVector(numerosEnteros, teclado);
        imprimirValoresVector(numerosEnteros, longitudVector);
        sumar(numerosEnteros, longitudVector);
        identificarNumeroMayor(numerosEnteros);
        promedioSuma(numerosEnteros, longitudVector);
        contarNumerosPares(numerosEnteros);        
    }
    
    // *** Esta función simplemente imprime un encabezado para el ejercicio 3. ***
    public static void imprimirEncabezadoEjercicio(){
        System.out.println("*.- Ejercicio 3 -.*");
        System.out.println("\n*** Introducir valores (números enteros) a un vector - JAVA ***");        
    }
    
    // *** Solicita al usuario que ingrese la longitud del vector y devuelve ese valor como int. ***
    public static int solicitarLongitudVector(Scanner teclado){        
        System.out.print("\n*.- Ingrese el tamaño (longitud) del vector: ");
        return teclado.nextInt();    
    }  
    
    // *** Crea un nuevo vector de enteros con la longitud especificada por el usuario. ***
    public static int[] crearVector(int longitudVector){
        return new int[longitudVector];
    } 
    
    // *** Lee valores del usuario y los asigna al vector creado. ***
    public static void ingresarValoresVector(int[] numerosEnteros, Scanner teclado){
        for (int i = 0; i < numerosEnteros.length; i++){
            System.out.print("Ingrese un numero entero[" + i + "] = ");
            numerosEnteros[i] = teclado.nextInt();            
        }    
    }
    
    // *** Imprime los valores (números) ingresados al vector. ***
    public static void imprimirValoresVector(int[] enteros, int longitudVector){        
        System.out.println("\n*.- Listado de números enteros ingresados -.*");
        for (int i = 0; i < longitudVector; i++){
            System.out.print(enteros[i] +  " / " );
        }
        System.out.println("");
    }
    
    // *** Suma los valores (números) ingresados ***
    public static int sumar(int[] numerosEnteros, int longitudVector){
        int sumarNumeros = 0; 
        for (int i = 0; i < longitudVector; i++){            
            sumarNumeros += numerosEnteros[i];
        } 
        System.out.println("\nLa Sumatoria de todos los números ingresados en el vector es: " + sumarNumeros );
        return sumarNumeros;        
    }    
    
    // *** Identifica el número mayor ingresado y el número menor ingresado al vector ***
    public static void identificarNumeroMayor(int[] numerosEnteros){
        int mayorNumero;
        int menorNumero;
        // *** Cálculo del mayor ***
        mayorNumero = numerosEnteros[0];
        for(int e:numerosEnteros) if(e>mayorNumero) mayorNumero=e;        
        // *** Cálculo del menor ***
        menorNumero = numerosEnteros[0];
        for(int e:numerosEnteros) if(e<menorNumero) menorNumero=e;
        System.out.println("\nMayor número ingresado: " + mayorNumero);
        System.out.println("Menor número ingresado: " + menorNumero);
    }
    
    // *** Realiza el cálculo del promedio de los números ingresados al vector ***
    public static int promedioSuma(int[] numerosEnteros, int longitudVector){
        // *** Cálculo del promedio ***
        int promedioSumatoria = 0;
        int sumarNumeros = 0;
        for (int i = 0; i < longitudVector; i++){            
            sumarNumeros += numerosEnteros[i];
        }
        promedioSumatoria = sumarNumeros / numerosEnteros.length;
        System.out.println("\nEl promedio de los números ingresados es: " + promedioSumatoria);
        return promedioSumatoria;
    }
    
    // *** Este procedimeinto realiza el conteo de los números Pares e Impares ingresados al vector *** 
    public static void contarNumerosPares(int[] arreglo){
        int cantidadDeNumerosPares = 0;
        int cantidadDeNumerosImpares = 0;
        for(int a:arreglo) {
            if(a%2==0){
                cantidadDeNumerosPares++;
            }else{
                cantidadDeNumerosImpares++;
            }
        }
        System.out.println("\nLa cantidad de números pares es: " + cantidadDeNumerosPares);
        System.out.println("La cantidad de números impares es: " + cantidadDeNumerosImpares);
        System.out.println("");
    }    

} // *.- Cierre de la clase -.*
