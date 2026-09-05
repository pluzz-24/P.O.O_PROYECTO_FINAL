public class Percusion extends Instrumento{

    double precioPercusion;
    String dueñoPercusion;
    char tamanioPercusion;
    boolean sonidoPercusion;

    //CONSTRUCTORES

    public Percusion(String nombreInstrumento, int anioFabricacion, double precioInstrumento, boolean esElectricoInstrumento,
        double precioPercusion, String dueñoPercusion, char tamanioPercusion, boolean sonidoPercusion){

            super(nombreInstrumento, anioFabricacion, precioInstrumento, esElectricoInstrumento)

            this.precioPercusion = precioPercusion;
            this.dueñoPercusion = dueñoPercusion;
            this.tamanioPercusion = tamanioPercusion;
            this.sonidoPercusion = sonidoPercusion;
    }

    public Percusion(double precioPercusion, char tamanioPercusion){
        super("Bateria", 2025, 3000000, false);
        this.precioPercusion = precioPercusion;
        this.dueñoPercusion = "Pepito Pérez";
        this.tamanioPercusion = tamanioPercusion;
        this.sonidoPercusion = true;
    }

    public Percusion(String dueñoPercusion, boolean sonidoPercusion){
        super("Bateria", 2025, 3000000, false);
        this.precioPercusion = 3000000;
        this.dueñoPercusion = dueñoPercusion;
        this.tamanioPercusion = 6;
        this.sonidoPercusion = sonidoPercusion;
    }

    //GETTERS

    public double getPrecioPercusion(){
        return precioPercusion;
    }
    public String getDueñoPercusion(){
        return dueñoPercusion;
    }
    public char getTamanioPercusion(){
        return tamanioPercusion;
    }
    public boolean getSonidoPercusion(){
        return sonidoPercusion;
    }
   
}
