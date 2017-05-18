/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebGallery;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Galery {
    private ArrayList <Obra> obras;

   
    public Galery(Obra obras) {
        this.obras =new ArrayList();
    }
    
    public void agregarObras(Obra o){
      this.obras.add(o);
    }
     public ArrayList<Obra> getObras() {
        return obras;
    }
    
}
