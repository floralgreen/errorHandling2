public class ErrorHandler {

    public void confrontaCarattereENumero(char carattere, int numero) {

        try {
            if ((int) carattere == numero) {
                System.out.println("Carattere " + carattere + " e " + numero + " sono uguali");

            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Catturata Exception " + e);
        } finally {
            System.out.println("Carattere convertito in numero: " + (int) carattere);
            System.out.println("Numero utilizzato per il confronto: " + numero);
        }

    }


}
