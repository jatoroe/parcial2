/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebGallery;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario{
    private String curriculum;
    private String distinciones;
    private Obra[] obras;
    
    public Artista(String n, String p, String curriculum, String distinciones)
    {
        super(n, p);
        this.curriculum = curriculum;
        this.distinciones = distinciones;
    }

 
    
    
}
