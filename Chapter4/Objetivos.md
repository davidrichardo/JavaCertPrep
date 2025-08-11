# Manejo de Valores de fecha hora texto numericos y booleanos
- Utilizar clases y primitivos que incluyan API Matematicas promocion de tipos 
- Manipular textos bloques de texto utilizando clases String y StringBuilder
- Manipular Objetos de fechas horas por la api de fecha y hora.
- Trabajar con matrices , lidtas conjuntos mapas  y colecciones agregar ,, actualizar eliminar y recuperar elementos
## Una interfaz es un conjunto  de clases o definiciones de interfaz que brindan acceso a una funcionalidad

## Creacion y manipulacion de cadenas 
String es una secuencia de caracteres y es un tipo  de referencia, y  se crean utilizando la palabra clave new

La clase String es especial y no necesita instanciarse con New

String name ="""Fluffy""";
Firma del metodo Substring
public String substring(int beginIndex)
public String substring(int beginIndex, int endIndex)

Comprobando igualdad en Objetos
El equals comnprueba si dos  objetos String contienen exactamente los mismos caracteres en el mismo orden
o el equalsIgnoreCase evalua si los dos string tiene lols mismos caracteres sin distinguir mayusculas y minusculas
public boolean equals (Object o)
public boolean equalsIgnoreCase(String str);

Entender bien el toString()
El metodo toString() se utiliza al intentar imprimir un objeto concatenado con un nombre de instancia String
equals() Compara  los objetos para comparar elementos para determinar la igualdad
hashcode

firmas para buscar subcadenas

public boolean startsWith(string prefix)
public boolean endWith(String suffix)
public boolean contains(ChasSequence charSeq)

- Reemplazo de valores
El metodo replace() realiza una busqueda y reemplazo de una cadena hay una que acepta char y otra que acepta charSequence

las firmas de los metodos son las siguientes
public String replace(char oldChar,char newChar);
public String replace(Charsequence target, Charsequence replace);

- Eliminando espacios en blanco
Los metodos strip() y trim()  eliminan espacios en blanco al principio y al final de un String 
el metodo stripLeading elimina los espacios en blanco del principio del String y los deja al final
El metodo stripTrailing elimina los espacios en blanco del final y los deja al principio

public String strip()
public String stripLeading()
public String stripTrailing()
public String trim()

 - Comprobacion de cadenas vacias o en blanco
 public boolean isEmpty()
 public boolean isBlank()

- Formato de valores
Se utiliza para en lugar de hacer multiples concatenaciones devuelve una referencia a la instancia en la que se invoca

public static String format(String format,Object args...)
public static String format(Locale loc, String format,Object args...)
public String formatted(Object args...)

%s Se aplica a cualquier tipo cumunmente a los valores String
%d Se aplica a valores enteros como long e integer
%f se aplica a valores float y double
%n inserta un salto de linea utilizando el separador de linea

- Encadenamiento de metodos

## StringBuilder
Este metodo es mutable lo que quiere decir que no crea un objeto cada ves que se hace referencia a si mismo.
String si es inmutable lo que quiere decir que crea un objeto cada vez que se llama a si mismo.

- Metodos que utliza el StringBuilder 
Append lo que quiere decir que agrega o añade parametros y devuelve una referencia al metodo actual

Insert lo que hace es añade caracteres al StringBuilder en el indice solicitado y devuelve una referencia al actual StringBuilder la firma del metodos es
public StringBuilder insert(int offset, String str)

Delete 
elimina caracteres de la secuancia y devuelve la referencia al valor actual

Reverse
Invierte la cadena 

## Entendiendo la igualdad
Sabemos que == es para comparar numeros primitivos y que las referencias a objetos es al mismo objeto.
Cual es la diferencia entre que los objetos sean equivalentes o iguales

## Entendiendo una array 
- Un array es un espacio en memoria designado por numeros o eleentos, un array es una lista ordenada puede contener duplicados 
int[] numbers = new int[3] --> Tipo del array []--> array simbol --> tamaño del array
El valor predeterminado para un int es 0; 
number index 0 1 2
             0  0 0 

Otra forma de inicializar una matriz es especificar todos los elemetos con los que debe inicializar

int [] moreNumbers = new int []{12,15,35};


Puede crearse matrices anonimas

int[] moreNumbers = {12,15,23};

int[] numbers;
int [] numbers;
int []numbers;
int numbers[]

Las matrices utilizan el equals porque hacen referencia al mismo objeto , el metodo no examina los elementos del array
el tipo int es un primitivo el tipo int[] es un objeto

## Creando una matriz multidimencional
- int [][] vars1;
int vars[][];
int[] vars[];
int[] vars[], space[][]

String[][] rectanggle = new String[3][2];

## Trabajar con fechas y horas 

- Java tiene una API para trabajar con fechas que es java.util.Date pero es muy antigua se reemplazo por 
java.util.Time
LocalDate-->Fecha
LocalTime-->Hora
LocalDateTime---> Fecha y Hora
ZonedDateTime---> Fecha Hora y zona horaria

public static LocalDate of(int year,int month,int day);
pubic static LocalDate of(int year,Month moth,int day);

- NO SE PUEDE CREAR UN OBJETO DE FECHA

var date1 = new LocalDate();


