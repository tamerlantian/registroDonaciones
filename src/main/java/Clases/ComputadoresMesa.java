/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sebastian
 */
public class ComputadoresMesa extends Computadores {
    private final static Integer ALMACENAMIENTO_BASE = 50;
    private Integer almacenamiento;

    public ComputadoresMesa() {
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase = PRECIO_BASE;
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }    
    
    public ComputadoresMesa(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }    

    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }
    
    @Override
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        
        if(almacenamiento > 100) {
            adicion += 50.0;
        }
        
        return adicion;
        
    }
    
    public Integer getCarga(){
        return almacenamiento;
    }
    
    
}
