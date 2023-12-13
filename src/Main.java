public class Main {

    public static void main(String[] args) {

        ErrorHandler errorHandler = new ErrorHandler();

        int numero = 101;
        char carattere = 'e'; //e corrisponde a 99 in codice ASCII

        errorHandler.confrontaCarattereENumero(carattere, numero);


    }

}
