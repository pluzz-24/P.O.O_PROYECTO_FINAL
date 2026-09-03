public class Instrumento {

    private String nombreInstrumento;
    private int anioFabricacion;
    private double precioInstrumento;
    private boolean esElectricoInstrumento;

    public Instrumento(String nombreInstrumento, int anioFabricacion, double precioInstrumento, boolean esElectricoInstrumento){

        this.nombreInstrumento = nombreInstrumento;
        this.anioFabricacion = anioFabricacion;
        this.precioInstrumento = precioInstrumento;
        this.esElectricoInstrumento = esElectricoInstrumento;
    }

    String getNombreInstrumento(){
        return nombreInstrumento;
    }
    int getAnioFabricacion(){
        return anioFabricacion;
    }
    double getPrecioInstrumento(){
        return precioInstrumento;
    }
    boolean getEsElectricoInstrumento(){
        return esElectricoInstrumento;
    }

}   