/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ergo.insyst;

/**
 *
 * @author Adem
 */
public class Main1 {

    public static void main(String[] args) {

        /*String[] strDizi = new String[3];
         strDizi[0] = "Arda Uslu";
         strDizi[1] = "Sinan Aleksander Özüak";
         strDizi[2] = "Murat Özüak";*/
        /*int i= 10;
        
         if( i == 100){
         System.out.println("Eşit");
         } else {
         System.out.println("Eşit değil");
         }*/
        /*for (int i = 0; i < strDizi.length; i++) {
         if (strDizi[i].equals("Arda Uslu")) {
         System.out.println(strDizi[i]);
         }
         }*/
        /*while (i < 100) {
         System.out.println(i);
         i++;
         }-*/
        /*int i = 1000;
         do {
         System.out.println(i);
         i++;
         } while (i < 100);*/
        int ay = 1;
        switch (ay) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Yanlış Ay Değeri");
                break;
        }

    }

}
