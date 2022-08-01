/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sebastian
 */
public class ComputadoresPortatiles extends Computadores {
    private final static Integer PULGADAS_BASE = 20;
    
    private Integer pulgadas;
    private boolean camaraITG;

    public ComputadoresPortatiles() {
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase = PRECIO_BASE;
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }
    
    

    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }
    
    @Override
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if (pulgadas > 40){
            adicion += super.precioBase * 0.3;
        }
        
        if (camaraITG) {
            adicion += 50;
        }
        
        return adicion;
    }
    
    
}
