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
public class Main2 {
    
    public static void main(String[] args){
        /*Pamuk hammadde = new Pamuk();
        IplikMakinesi makine = new IplikMakinesi();
        Iplik urun = makine.pamuguIplikYap(hammadde);*/
        
        Insan ahmet = new Insan("Ahmet");
        String ilkHarf = ahmet.ismininIkiVeUcuncuHarfiniSoyle();
        System.out.println(ilkHarf);
    }
}
