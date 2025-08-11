public class Main{
    public static void main(String[] args) {
        var name = "animals";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(6));
       // System.out.println(name.charAt(7));

        System.out.println(name.indexOf("a"));
     System.out.println(name.indexOf("al"));
     System.out.println(name.indexOf("al",4));
     System.out.println(name.indexOf("al",5));

     System.out.println(name.substring(3));
     System.out.println(name.indexOf('m'));
     System.out.println(name.substring(3,4));

     System.out.println(name.substring(3,7));
     //System.out.println(name.substring(3,8));
     System.out.println(name.toUpperCase());

     System.out.println("abcabc".replace('a', 'A'));
     System.out.println("abcabc".replace("a", "A"));

     System.out.println("abc".strip());

     System.out.println("\t     a b c\n".strip());

     String text = " abc\t ";
     System.out.println(text.strip().length());
     System.out.println(text.trim().length());
     System.out.println(text.stripLeading().length());//Remueve espacios en blanco al principio y deja los del final
     System.out.println(text.stripTrailing().length());//Remueve espacios en blanco al final y deja los del principio

     System.out.println(" ".isBlank());
     System.out.println("".isBlank());
     System.out.println("".isEmpty());
     System.out.println(" ".isEmpty());

     var nam = "David";
     var orderId = 5;

     //All print: Hello David, order 5 is ready Format and formatted

     System.out.println("Hello "+nam+" order "+orderId+" is ready");

     System.out.println(String.format("Hello %s, order %d is ready", nam,orderId));

     System.out.println("Hello %s, order %d is ready".formatted(nam,orderId));

     var name1 = "James";
     var score = 90.25;
     var total = 100;
     System.out.println("%s:%n  Score: %.2f out of %d".formatted(name1,score,total));

     var pi = 3.14159265359;

     System.out.println(String.format("[%f]", pi));
     System.out.println(String.format("[%12.8f]", pi));
     System.out.println(String.format("[%012.8f]", pi));
     System.out.println(String.format("[%012.2f]",pi));

     //Encadenamiento de metodos
     var start = "AniMaL";
     var trimmed = start.trim();
     var lowercase = trimmed.toLowerCase();

     String result = "AniMaL".trim().toLowerCase().replace('a', 'A');
     System.out.println(result);

     // Uso de la clase StringBuilder
     String alpha ="";
     for(char current='a';current<='z';current++)
        alpha += current;
    System.out.println(alpha);
    //En esta se crean 27 Objetos ya que String es inmutable cada ves que crea un objeto en la siguiente iteracion
    /// Crea un nuevo obeto y el objeto anterior es elegible para el recolector de basura.

    StringBuilder beta = new StringBuilder();
    for(char current='a';current<='z';current++)
        beta.append(current);
    System.out.println(beta);
    //El string builder es mutable lo que quiere decir que crea un solo objeto

    StringBuilder sb = new StringBuilder("start");
    sb.append("+middle");
    StringBuilder same = sb.append("+end");

    StringBuilder a = new StringBuilder("abc");
    StringBuilder b = a.append("de");
    b = b.append("f").append("g");
    System.out.println("a= " + a);
    System.out.println("b= "+b);

    //Formas de construir un StringBuilder
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder("animal");
    StringBuilder sb3 = new StringBuilder(10);

    var sb4 = new StringBuilder("animals");
    String sub = sb4.substring(sb4.indexOf("a"),sb4.indexOf("al"));
    int lenght = sb4.length();
    char ch = sb4.charAt(6);
    System.out.println(sub+" "+ lenght+" "+ ch);

    //Añadir valores
    var sb5 = new StringBuilder().append(1).append('c');
    sb5.append("-").append(true);
    System.out.println(sb5);

    //Insercion de datos
    StringBuilder sb6 = new StringBuilder("animals");

    sb6.insert(7, "-");
    sb6.insert(0, "-");
    sb6.insert(4, "-");
    System.out.println(sb6);


    //Delete de datos
    var sb7 = new StringBuilder("abcdef");
    sb.delete(1,3); //adef
    sb.deleteCharAt(3);
    sb.delete(1, 190);

    //Reverse
    var sb8 = new StringBuilder("ABC");
    System.out.println(sb8.reverse());

    var sb9 = new StringBuilder("ABC");
    String s = sb9.toString();

    // equals vs ==
    var one = new StringBuilder();
    var two = new StringBuilder();
    var three = one.append("a");
    System.out.println(one == two);
    System.out.println(one == three); 

    
 





    }
}