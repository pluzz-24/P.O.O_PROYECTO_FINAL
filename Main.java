public class Main {

    public static void main(String[] args) {

        //OBJETOS INSTRUMENTO

        Instrumento instrumentoA = new Instrumento("Piano", 2020, 8000000, false);
        Instrumento instrumentoB = new Instrumento("Organo electrico", 3500000);

         //OBJETOS CUERDA

        Cuerda cuerdaA = new Cuerda("Guitarra acustica", 2019, 900000, false, (byte) 6, 900000, "Guitarra", true);
        Cuerda cuerdaB = new Cuerda((byte) 4, "Bajo electrico");

        //OBJETOS VIENTO

        Viento vientoA = new Viento("Saxofon alto", 2021, 2500000, false, "Saxofon", 2500000, 4, true);
        Viento vientoB = new Viento("Trompeta", 3);

        //OBJETOS PERCUSION

        Percusion percusionA = new Percusion(3000000, 'S');
        Percusion percusionB= new Percusion("Pepito Perez", true);


        //IMPRESIÓN DE TODOS LOS OBJETOS

        System.out.println("=====INSTRUMENTOS=====");
        System.out.println();
        System.out.println(instrumentoA);
        System.out.println();
        System.out.println(instrumentoB);
        System.out.println();
        System.out.println("=====CUERDA=====");
        System.out.println();
        System.out.println(cuerdaA);
        System.out.println();
        System.out.println(cuerdaB);
        System.out.println();
        System.out.println("=====VIENTO=====");
        System.out.println();
        System.out.println(vientoA);
        System.out.println();
        System.out.println(vientoB);
        System.out.println();
        System.out.println("=====PERCUSION=====");
        System.out.println();
        System.out.println(percusionA);
        System.out.println();
        System.out.println(percusionB);
    }
}