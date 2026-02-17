/*
 * Ambriz Cordero Diego Said
 * Medeles Bryan Jonathan
 * Rivera Andrade Jorge
 */
package back;

import java.util.Objects;

/**
 *
 * @author jra
 */
public class Moto extends Vehiculo{
    private int cilindrada;
    
    public Moto(){
        super();
    }

    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(int cilindrada, String matricula, String marca, String modelo, String ano, String color, double precio) {
        super(matricula, marca, modelo, ano, color, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", color=" + color + ", precio=" + precio +  ", cilindrada=" + cilindrada + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.marca);
        hash = 71 * hash + Objects.hashCode(this.modelo);
        hash = 71 * hash + Objects.hashCode(this.matricula);
        hash = 71 * hash + Objects.hashCode(this.cilindrada);
        return hash;
    }
    
}
