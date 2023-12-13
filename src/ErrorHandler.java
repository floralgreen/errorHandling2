public class ErrorHandler {

    public void controllaCarattere(char carattere) {

        if (Character.isDigit(carattere)) {
            System.out.println("Carattere '" + carattere + "' è un numero");
        } else {
            throw new ArithmeticException("Il carattere non è un numero");
        }

    }


}
