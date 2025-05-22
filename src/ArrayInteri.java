public class ArrayInteri {

    private int index = 0;

    private int[] arrayDiInteri;

    public ArrayInteri (int[] arrayDiInteri){
        this.arrayDiInteri = arrayDiInteri;
    }

    public ArrayInteri (){
        arrayDiInteri = new int[0];
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

        if (this.arrayDiInteri.length == 0) {

            return false;
            
        }else {

            return index < arrayDiInteri.length;

        }        

    }

    public void addElemento (int numeroDaAggiungere){

        int[] nuovoArray = new int[arrayDiInteri.length + 1];

       for (int i = 0; i < arrayDiInteri.length; i++){
        nuovoArray [i] = arrayDiInteri [i];        
       }

       nuovoArray [arrayDiInteri.length] = numeroDaAggiungere;

       arrayDiInteri = nuovoArray;

    }

    public int getIndice(){
        return index;
    }
    
}
