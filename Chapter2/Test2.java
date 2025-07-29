public class Test2 {

    public static void main(String[] args) {
        // No compila porque tienen tipos de datos diferentes. pero se soluciona haciendo el casteo de los datos a datos mas pequeños
 //       int fish = 1.0;
 //       short bird = 65888;
 //       int mammal = 9f;
 //       long reptile = 192_201_302_101_123_233;

 //Solucion
        int fish = (int)1.0;
        short bird = (short)65888;
        int mammal = (int)9f;
        long reptile =  192_201_302_101_123L;

        short mouse = 10;
        short hamster = 3;
        short capybara = (short)(mouse*hamster);

        //Los literales no requieren casting de tipo de variable
        byte hat = 1;
        byte gloves = 7*10;
        short scarf = 5;
        short boots = 2 + 1;

        //short botts2 = 2 + hat;
        //byte gloves2 = 7*100;


        long goat = 10;
        int sheep = 5;
        sheep = (int) (goat*sheep);
        sheep *= goat;//El operador compuesto convierte sheep a long aplica la multiplicacion de dos long y despues convierte el resultado a int;

        //Retorno de los valores de asignacion
        long wolf = 5;
        long coyote = (wolf=3);
        System.out.println(wolf);
        System.out.println(coyote);

        //Operadores de Igualdad
        //ERRORES DE COMPILACION
        //boolean monkey = true == 3;
        //boolean ape = false != "Grape";
        //boolean gorilla = 10.2 == "Koko";
        openZoo(3.2);

    }

    public static void openZoo(Number time){
        if(time instanceof Double)
            System.out.println((Double) time + " O'Clock");
        else
            System.out.println(time);
    }
    
}
