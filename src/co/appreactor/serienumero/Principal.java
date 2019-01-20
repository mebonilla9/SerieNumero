/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.serienumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "Si";
        List<Integer> listaNumeros = new ArrayList<>();
        while (opcion.equalsIgnoreCase("si")) {
            System.out.println("Digite un numero para la serie");
            listaNumeros.add(Integer.parseInt(lector.readLine()));
            System.out.println("Desea agregar mas numeros a la serie? (Si/No");
            opcion = lector.readLine();
        }

        Collections.sort(listaNumeros);

        System.out.println("El numero mas grande ingresado es: " + listaNumeros.get(listaNumeros.size() - 1));

    }

}
