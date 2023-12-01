public class Main {
    public static void main(String[] args) {
        Futbolista fut=new Futbolista(10,"Delantero",10,"Lionel Andrés","Messi Cuccittinni",36);

        SeleccionFutbol ent=new Entrenador("B",5,"Pep","Guardiola",52);


        fut.setEdad(22);
        System.out.println(fut);
        System.out.println(ent);
    }

}