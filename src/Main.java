public class Main {

    public static void main(String[] args) {

        int numero = 101;
        char carattere = 'f'; //e corrisponde a 99 in codice ASCII


        try{
            if((int)carattere == numero) {
                System.out.println("Successful");

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
