    public class Viento extends Instrumento {

        String instrumentoViento;
        double precioViento;
        int numeroBotonesViento;
        boolean caniaViento;

        //CONSTRUCTORES

        public Viento(String nombreInstrumento, int anioFabricacion, double precioInstrumento, boolean esElectricoInstrumento,
            String instrumentoViento, double precioViento, int numeroBotonesViento, boolean caniaViento){

                super(nombreInstrumento, anioFabricacion, precioInstrumento, esElectricoInstrumento);

                this.instrumentoViento = instrumentoViento;
                this.precioViento = precioViento;
                this.numeroBotonesViento = numeroBotonesViento;
                this.caniaViento = caniaViento;
        }

        public Viento(String instrumentoViento, int numeroBotonesViento){
            super("Trompeta", 2026, 600000, false);
            this.instrumentoViento = instrumentoViento;
            this.precioViento = 600000;
            this.numeroBotonesViento ? numeroBotonesViento;
            this.caniaViento = false;
        }

        public Viento(double precioViento, boolean caniaViento){
            super("Trompeta", 2026, 600000, false);
            this.instrumentoViento = "Trompeta";
            this.precioViento = precioViento;
            this.numeroBotonesViento = 3;
            this.caniaViento = caniaViento;
        }

        //GETTERS

        public String getInstrumentoViento(){
            return instrumentoViento;
        }
        public double getPrecioViento(){
            return precioViento;
        }
        public int getNumeroBotonesViento(){
            return numeroBotonesViento;
        }
        public boolean getCaniaViento(){
            return caniaViento;
        }

        //SETTERS

        public void setInstrumentoViento(String instrumentoViento){
            this.instrumentoViento = instrumentoViento;
        }
        public void setPrecioViento(double precioViento){
            this.precioViento = precioViento;
        }
        public void setNumeroBotonesViento(int numeroBotonesViento){
            this.numeroBotonesViento = numeroBotonesViento;
        }
        public void setCaniaViento(boolean caniaViento){
            this.caniaViento = caniaViento;
        }

        




            

}

