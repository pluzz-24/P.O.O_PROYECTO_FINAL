public class Percusion extends Instrumento{

    double precioPercusion;
    String duenioPercusion;
    char tamanioPercusion;
    boolean sonidoPercusion;

    //CONSTRUCTORES

    public Percusion(String nombreInstrumento, int anioFabricacion, double precioInstrumento, boolean esElectricoInstrumento,
        double precioPercusion, String dueñoPercusion, char tamanioPercusion, boolean sonidoPercusion, String duenioPercusion){

            super(nombreInstrumento, anioFabricacion, precioInstrumento, esElectricoInstrumento);

            this.precioPercusion = precioPercusion;
            this.duenioPercusion = duenioPercusion;
            this.tamanioPercusion = tamanioPercusion;
            this.sonidoPercusion = sonidoPercusion;
    }

    public Percusion(double precioPercusion, char tamanioPercusion){
        super("Bateria", 2025, 3000000, false);
        this.precioPercusion = precioPercusion;
        this.duenioPercusion = "Pepito Pérez";
        this.tamanioPercusion = tamanioPercusion;
        this.sonidoPercusion = true;
    }

    public Percusion(String duenioPercusion, boolean sonidoPercusion){
        super("Bateria", 2025, 3000000, false);
        this.precioPercusion = 3000000;
        this.duenioPercusion = duenioPercusion;
        this.tamanioPercusion = 2;
        this.sonidoPercusion = sonidoPercusion;
    }

    //GETTERS

    public double getPrecioPercusion(){
        return precioPercusion;
    }
    public String getDueñoPercusion(){
        return duenioPercusion;
    }
    public char getTamanioPercusion(){
        return tamanioPercusion;
    }
    public boolean getSonidoPercusion(){
        return sonidoPercusion;
    }

    //SETTERS

    public void setPrecioPercusion (double precioPercusion){
        this.precioPercusion = precioPercusion;
    }
    public void setDueñoPercusion (String dueñoPercusion){
        this.duenioPercusion = dueñoPercusion;
    }
    public void setTamanioPercusion(char tamanioPercusion){
        this.tamanioPercusion = tamanioPercusion;
    }
    public void setSonidoPercusion (boolean sonidoPercusion){
        this.sonidoPercusion = sonidoPercusion;
    }

     @Override
    public String toString(){
        return "Instrumento: " + getNombreInstrumento() + "\n" +
        "Año de fabricación: " + getAnioFabricacion() + "\n" +
        "Precio del instrumento: " + getPrecioInstrumento() + "\n" +
        "El instrumento es electrico: " + getEsElectricoInstrumento() + "\n" +
        "El dueño del instrumento de percusion es: " + duenioPercusion + "\n" +
        "El tamaño del ihnstrumento de percusion es: " + tamanioPercusion + "metros \n" +
        "El sonido de la percusion: " + sonidoPercusion;
}
}
