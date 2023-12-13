public class Main {

    public static void main(String[] args) {

        int numero = 101;
        char carattere = 'e'; //e corrisponde a 99 in codice ASCII


        try{
            if((int)carattere == numero) {
                System.out.println("Carattere " + carattere + " e " + numero + " sono uguali");

            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Catturata Exception " + e);
        } finally {
            System.out.println("Carattere convertito in numero: " + (int)carattere);
            System.out.println("Numero utilizzato per il confronto: " + numero);
        }


    }

}
