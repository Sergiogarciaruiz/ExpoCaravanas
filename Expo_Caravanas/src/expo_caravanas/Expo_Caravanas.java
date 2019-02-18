/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo_caravanas;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Expo_Caravanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        Zona Principal = new Zona(1000);
        Zona Compra_venta = new Zona(200);
        Zona VIP = new Zona(25);
        while (n != 3) {
            System.out.println("\n1.	Mostrar número de entradas libres\n2.	Vender entradas\n3.	Salir");
            n = sc.nextInt();
            switch (n) {

                case 1:
                    int t = Principal.getEntradas() + Compra_venta.getEntradas() + VIP.getEntradas();
                    System.out.println("Hay " + t + " entradas disponibles\n"+ Principal.getEntradas() +" de la zona principal\n"+ Compra_venta.getEntradas() +" de la zona Compra/Venta\n"+ VIP.getEntradas() +" de la zona VIP");
                    break;

                case 2:
                    System.out.println("¿Cuántas entradas quiere comprar?");
                    int v = sc.nextInt();
                    System.out.println("¿En que zona?\n1.Principal\n2.Compra/Venta\n3.VIP");
                    int z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Principal.setEntradas(Principal.getEntradas() - v);
                            Principal.verificar();
                            break;
                        case 2:
                            Compra_venta.setEntradas(Compra_venta.getEntradas() - v);
                            Compra_venta.verificar();
                            break;
                        case 3:
                            VIP.setEntradas(VIP.getEntradas() - v);
                            VIP.verificar();
                            break;
                        default:
                            System.out.println("Eliga una zona valida");
                    }
                case 3:
                    break;
                default:
                    System.out.println("Eliga un valor válido");

            }
        }
    }
}
