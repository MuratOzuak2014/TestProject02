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
public class Insan {
    
    private String isim;

    
    
    public Insan(){
        
    }
    
    public Insan(String isim){
        this.isim = isim;
    }
    
    public String ismininIkiVeUcuncuHarfiniSoyle(){
        return isim.substring(1,3);
    }
    
}
