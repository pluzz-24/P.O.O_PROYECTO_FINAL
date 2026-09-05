public class Cuerda extends Instrumento{
    
    private byte numeroDeCuerdas;
    private double precioCuerda;
    private String instrumentoCuerda;
    private boolean tieneTrasteCuerda;

    //CONSTRUCTORES

    public Cuerda(String nombreInstrumento, int anioFabricacion, double precioInstrumento, boolean esElectricoInstrumento, int numeroDeCuerdas,
        double precioCuerda, String instrumentoCuerda, boolean tieneTrasteCuerda){

          super(nombreInstrumento, anioFabricacion, precioInstrumento, esElectricoInstrumento);

                this.numeroDeCuerdas = (byte) numeroDeCuerdas;
                this.precioCuerda = precioCuerda;
                this.instrumentoCuerda = instrumentoCuerda;
                this.tieneTrasteCuerda = tieneTrasteCuerda; 
        }
        
        public Cuerda(byte numeroDeCuerdas, String instrumentoCuerda){
            super("De cuerda", 2022, 500000, true);
            this.numeroDeCuerdas = numeroDeCuerdas;
            this.precioCuerda = 500000;
            this.instrumentoCuerda = instrumentoCuerda;
            this.tieneTrasteCuerda = true;
        }

        public Cuerda(double precioCuerda, String instrumentoCuerda){
            super("De cuerda", 2022, 500000, true);
            this.numeroDeCuerdas = 6;
            this.precioCuerda = precioCuerda;
            this.instrumentoCuerda = instrumentoCuerda;
            this.tieneTrasteCuerda = false;
        }

        //GETTERS

        public byte getNumeroDeCuerdas(){
            return numeroDeCuerdas;
        }
        public double getPrecioCuerda(){
            return precioCuerda;
        }
        public String getInstrumentoCuerda(){
            return instrumentoCuerda;
        }
        public boolean getTieneTrasteCuerda(){
            return tieneTrasteCuerda;
        }

        //SETTERS

        public void setNumeroDeCuerdas(byte numeroDeCuerdas){
            this.numeroDeCuerdas = numeroDeCuerdas;
        }
        public void setPrecioCuerda(double precioCuerda){
            this.precioCuerda = precioCuerda;
        }
        public void setInstrumentoCuerda(String instrumentoCuerda){
            this.instrumentoCuerda = instrumentoCuerda;
        }
        public void setTieneTrasteCuerda (boolean tieneTrasteCuerda){
            this.tieneTrasteCuerda = tieneTrasteCuerda;
        }

    @Override
    public String toString(){
        return "Instrumento: " + getNombreInstrumento() + "\n" +
        "Anio de fabricacion: " + getAnioFabricacion() + "\n" +
        "El instrumento es electrico: " + getEsElectricoInstrumento() + "\n" +
        "Instrumento de cuerda: " + instrumentoCuerda + "\n" +
        "Precio instrumento de cuerda: " + precioCuerda + " pesos \n" +
        "Numero de cuerdas: " + numeroDeCuerdas + "\n" +
        "Tiene trastes: " + tieneTrasteCuerda;
    }

}
