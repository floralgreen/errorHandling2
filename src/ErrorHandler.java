public class ErrorHandler {

    public void confrontaCarattereENumero(char carattere, int numero) {

        if ((int) carattere == numero) {
            System.out.println("Carattere " + carattere + " e " + numero + " sono uguali");
        } else {
            throw new ArithmeticException("Il carattere ed il numero non sono uguali");
        }

    }


}
