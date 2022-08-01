package Clases;

/**
 *
 * @author sebastian
 */
public class Computadores {

    // Variable base
    protected final static int PESO_BASE = 5;
    protected final static char CONSUMO_W_BASE = 'F';
    protected final static double PRECIO_BASE = 100.0;

    // Variables
    protected int peso;
    protected char consumoW;
    protected double precioBase;

    public Computadores() {
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase = PRECIO_BASE;
    }
    
    public Computadores(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.consumoW = CONSUMO_W_BASE;
        this.peso = peso;
    }
    

    public Computadores(Double precioBase, Integer peso, char consumoW) {
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
    }
     

    public Double calcularPrecio() {
        Double adicion = 0.0;
        
        switch (consumoW) {
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
                break;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            case 'F':
                adicion += 10.0;
                break;
        }
        
        if (peso >= 0 && peso < 19 ) {
            adicion += 10.0;
        } else if (peso >= 20 && peso < 49){
            adicion += 50.0;
        } else if (peso >= 50 && peso <= 79) {
            adicion += 80.0;
        } else {
            adicion += 100.0;
        }
        
        return adicion + precioBase;
    }

    /**
     * @return the PESO_BASE
     */
    public int getPESO_BASE() {
        return PESO_BASE;
    }

    /**
     * @return the CONSUMO_W_BASE
     */
    public char getCONSUMO_W_BASE() {
        return CONSUMO_W_BASE;
    }

    /**
     * @return the PRECIO_BASE
     */
    public double getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the consumoW
     */
    public char getConsumoW() {
        return consumoW;
    }

    /**
     * @param consumoW the consumoW to set
     */
    public void setConsumoW(char consumoW) {
        this.consumoW = consumoW;
    }

    /**
     * @return the precioBase
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

}

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