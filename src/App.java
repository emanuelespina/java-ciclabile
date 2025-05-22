public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        int[] array = {12, 14, 3};

        ArrayInteri varibileProva = new ArrayInteri(array);

        System.out.println(varibileProva.hasAncoraElementi());

        System.out.println(varibileProva.getElementoSuccessivo());

        System.out.println(varibileProva.hasAncoraElementi());

        System.out.println(varibileProva.getElementoSuccessivo());

        System.out.println(varibileProva.hasAncoraElementi());
        
        System.out.println(varibileProva.getElementoSuccessivo());

        varibileProva.addElemento(25);

        System.out.println(varibileProva.hasAncoraElementi());

        System.out.println(varibileProva.getElementoSuccessivo());

        System.out.println(varibileProva.hasAncoraElementi());
        

        

    }
}
