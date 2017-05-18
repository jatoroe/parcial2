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
public  class Obra {
    private String name;
    private String description;
    private String estilo;
    private double value;
    private Artista artist;

    public Obra(String name, String description, String estilo, double value) {
        this.name = name;
        this.description = description;
        this.estilo = estilo;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEstilo() {
        return estilo;
    }

    public double getValue() {
        return value;
    }
        
}
