public class App {
    public static void main(String[] args) throws Exception {       


        int[] array = {12, 14, 3};

        ArrayInteri varibileProva = new ArrayInteri(array);

        // System.out.println(varibileProva.hasAncoraElementi());

        // System.out.println(varibileProva.getElementoSuccessivo());

        // System.out.println(varibileProva.hasAncoraElementi());

        // System.out.println(varibileProva.getElementoSuccessivo());

        // System.out.println(varibileProva.hasAncoraElementi());
        
        // System.out.println(varibileProva.getElementoSuccessivo());

        varibileProva.addElemento(25);

        // System.out.println(varibileProva.hasAncoraElementi());

        // System.out.println(varibileProva.getElementoSuccessivo());

        // System.out.println(varibileProva.hasAncoraElementi());
        
        while (varibileProva.hasAncoraElementi()) {
            System.out.println("In posizione " + varibileProva.getIndice() + " c'è il valore " + varibileProva.getElementoSuccessivo());
        }
        

    }
}
