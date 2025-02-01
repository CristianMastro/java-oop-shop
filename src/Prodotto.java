import java.util.Random;

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

public class Prodotto {
    public int code;
    public String name;
    public String description;
    public double price;
    public double ivaPrice;


//costruttore con elementi//
public Prodotto(String name, String description, double price){
    calcolaCodice();
    this.name = name;
    this.description = description;
    this.price = price;
}

//metodo per avere numero random//
public void calcolaCodice(){
    Random random = new Random();
    this.code = random.nextInt(1000); 
}

//metodo per avere il codice//
public int getCode(){
    return code;
}

//metodo per avere prezzo base//
public double getPrice(){
    return price;
}

//metodo per avere il nome prodotto//
public String getName(){
    return name;
}

//metodo per avere la descrizione del prodotto//
public String getDescription(){
    return description;
}

//metodo per avere il prezzo ivato//
public double getIvaPrice() {
    return ivaPrice;
}

//metodo per avere nome completo//
public String getNameProduct(){
    return code + "-" + name;
}

//metodo per calcolare l'iva//
public double setPriceIva(double price) {
    ivaPrice = price * 1.22;
    return ivaPrice;
}

//metodo per cambiare valore al nome//
public void setName(String name) {
    this.name = name;
}

//metodo per cambiare valore alla descrizione//
public void setDescription(String description) {
    this.description = description;
}

//metodo per cambiare valore al prezzo//
public void setPrice(double price) {
    this.price = price;
}

}
