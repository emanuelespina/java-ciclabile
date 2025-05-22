public class ArrayInteri {

    private int index = 0;

    private int[] arrayDiInteri;

    public ArrayInteri (int[] arrayDiInteri){
        this.arrayDiInteri = arrayDiInteri;
    }


    public int getElementoSuccessivo () {

        int numeroDaRestituire;

        if (index < arrayDiInteri.length) {

            numeroDaRestituire = arrayDiInteri[index];
            index ++;
            
        }else {
            numeroDaRestituire = 0;
        }

        return numeroDaRestituire;        
        
    }

    public boolean hasAncoraElementi(){

        return index < arrayDiInteri.length - 1;

    }

    public void addElemento (int numeroDaAggiungere){

        int[] nuovoArray = new int[arrayDiInteri.length + 1];

       for (int i = 0; i < arrayDiInteri.length; i++){
        nuovoArray [i] = arrayDiInteri [i];        
       }

       nuovoArray [arrayDiInteri.length] = numeroDaAggiungere;

       arrayDiInteri = nuovoArray;

    }
    
}
