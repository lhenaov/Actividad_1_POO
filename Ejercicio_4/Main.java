/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1;

/**
 *
 * @author 57316
 */
public class Actividad1 {

    public static void main(String[] args) {
        double edalber, edana, edmama;
        double edjuan = 9;
        edalber= Edades.calcular_edalber(edjuan);
        edana=Edades.calcular_edana(edjuan);
        edmama=Edades.calcular_edmama(edjuan, edalber, edana);
        System.out.println ("Las edades son:");
        System.out.println ("Alberto = " + edalber);
        System.out.println ("Juan = " + edjuan);
        System.out.println ("Ana = " + edana);
        System.out.println ("Mama = "+ edmama);
    }
}
