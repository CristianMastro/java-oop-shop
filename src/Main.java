/**Nel progetto java-oop-shop, creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
Nella stessa cartella src aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
*/

public class Main {
    public static void main(String[] args) {
        
        Prodotto maglia = new Prodotto("maglia Nike", "Maglia 100% poliestere", 65);

        maglia.setPriceIva(maglia.price);
        System.out.println("Prezzo ivato: " + maglia.getIvaPrice());

        //prove per cambiare variabili//
        maglia.setName("maglione");
        maglia.setDescription("100% lana");
        maglia.setPrice(100);

        maglia.setPriceIva(maglia.price);
        System.out.println("Prezzo ivato: " + maglia.getIvaPrice());



        
        
        System.out.println("Articolo: " + maglia.getNameProduct());
        System.out.println("Nome prodotto: " + maglia.getName());
        System.out.println("Descrizione prodotto: " + maglia.getDescription());
        System.out.println("Codice prodotto: " + maglia.getCode());
        System.out.println("Prezzo maglia senza iva è: " + maglia.getPrice());
        System.out.println("Prezzo ivato: " + maglia.getIvaPrice());


    }
}
