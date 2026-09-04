public class Instrumento {

    private String nombreInstrumento;
    private int anioFabricacion;
    private double precioInstrumento;
    private boolean esElectricoInstrumento;

    //CONSTRUCTORES

    public Instrumento(String nombreInstrumento, int anioFabricacion, double precioInstrumento, boolean esElectricoInstrumento){

        this.nombreInstrumento = nombreInstrumento;
        this.anioFabricacion = anioFabricacion;
        this.precioInstrumento = precioInstrumento;
        this.esElectricoInstrumento = esElectricoInstrumento;
    }

    public Instrumento (String nombreInstrumento, double precioInstrumento){
        this(nombreInstrumento, 2024, precioInstrumento,false );
    }
    public Instrumento (int anioFabricacion, boolean esElectricoInstrumento){
        this("Saxofon tenor", anioFabricacion, 5000000, esElectricoInstrumento);
    }

    //GETTERS

    public String getNombreInstrumento(){
        return nombreInstrumento;
    }
    public int getAnioFabricacion(){
        return anioFabricacion;
    }
    public double getPrecioInstrumento(){
        return precioInstrumento;
    }
    public boolean getEsElectricoInstrumento(){
        return esElectricoInstrumento;
    }


    //SETTERS

    public void setNombreInstrumento(String nombreInstrumento){
        this.nombreInstrumento = nombreInstrumento;
    }
    public void setAnioFabricacion (int anioFabricacion){
        this.anioFabricacion = anioFabricacion;
    }
    public void setPrecioInstrumento(double precioInstrumento){
        this.precioInstrumento = precioInstrumento;
    }
    public void setEsElectricoInstrumento(boolean esElectricoInstrumento){
        this.esElectricoInstrumento = esElectricoInstrumento;
    }

    @Override
    public String toString(){
        return "Instrumento: " + nombreInstrumento + "\n" +
        "Año de fabricación: " + anioFabricacion + "\n" +
        "Precio del instrumento: " + precioInstrumento + "\n" +
        "El instrumento es electrico: " + esElectricoInstrumento+ "\n"; 
    }
}   