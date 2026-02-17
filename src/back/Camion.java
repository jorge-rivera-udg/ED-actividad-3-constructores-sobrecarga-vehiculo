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
public class Camion extends Vehiculo{
    private String tonelaje;
    
    public Camion(){
        super();
    }

    public Camion(String tonelaje) {
        this.tonelaje = tonelaje;
    }

    public Camion(String tonelaje, String matricula, String marca, String modelo, String ano, String color, double precio) {
        super(matricula, marca, modelo, ano, color, precio);
        this.tonelaje = tonelaje;
    }

    public String getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(String tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "Camion{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", color=" + color + ", precio=" + precio +  ", tonelaje=" + tonelaje + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.marca);
        hash = 71 * hash + Objects.hashCode(this.modelo);
        hash = 71 * hash + Objects.hashCode(this.matricula);
        hash = 71 * hash + Objects.hashCode(this.tonelaje);
        return hash;
    }
    
}
