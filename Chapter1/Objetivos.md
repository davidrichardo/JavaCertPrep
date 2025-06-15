# OBJETIVOS PRINCIPALES
### Manejo de fechas,timpo,texto,numeros y valores booleanos
### Uso de clases y variables primitivas y wrapper; promocion de clases and casting
### Declarar clases y objetos y explicar el ciclo de vida de los objetos y las referencias y el garbage collector.
### Entender el alcance de las variables.

Javac: Convert .java source to .class bytecode
java: Execute program
jar Package files together
javadoc: Generate documentation

### Entendiendo la estructura de una clase: 
Una clase es un template o una estructura de definición de bloques ; que se usa para crear objetos
Un objeto es una instancia de una clase en ejecución
Una referencia es una variable que apunta a un objeto.

## Metodos y campos:

- Las clases tienen dos elementos principales , metodos o funciones, y campos(fields) conocidos con variables.
Juntos se conocen como miembros de u
a clase

- Los campos o variables contienen el estado del programa y los metodos operan sobre esos estados(comportamiento)

- EG
public class Animal{
  String name;
	
	public String getName(){
	return name;
	}
	public void setName(String newName){
		name = newName;
	}
}

- java tiene palabras claves; public quiere decir que cualquier otra clase la utilice;
- class indica que esta definiendo una clase;
- Animal es el nombre de la clase
- Name es una variable y el tipo de la variable es String

### Comerntarios 
- Existen varios tipos de comentarios 
Comentarios de una sola linea , comrentarios multilinea, y JavaDoc o comentarios de Java para documentar.
// Comentario de una sola linea

/* Comentarios multilinea */
/** Comentario de JavaDoc */

public class Zoo{
	public static void main(String [] args){
		
	}
}

- Public es un identificador de acceso; static vincula a un metodo con su clase Zoo.main(); void define el tipo de retorno
main(String args[]); Puede ser definido de varias formas 
String[] args
String options[]
String... friends

java Main.java firstParam seconParam y abrevation for javac and java

- Cada archivo puede contener solo una public clase.
- El nombre de el archivo debe ser el mismo de la clase publica y tener la extension .java
- Si la clase java es un punto de entrada debe tener un .main valido


javac packagea/classA.java packageb/classB.java compila en el mismo directorio las clases generadas
javac packagea/*.java packageb/*.java para compilar todos los archivos dentro de esos paquetes
java -d classes packagea/ClassA.java packageb/ClassB.java para definir la ubicacion de las clases compiladas
java -cp classes packageb.ClassB // Ejecutara la clase b 

- Un constructor no tiene tipo de retorno y el nombre es el mismo de la clase ; 
El objetivo de un constructor es inicializar variables 
Si no hay un constructor el compilador crea uno por defecto que es vacio
El constructor se ejecuta despues de que se hayan ejecutado todos los campos y los bloques inicializadores de instancia
Un inicializador de instancia no debe ir dentro de un metodo

## Tipos de Datos
- Existen dos tipos de datos en java (PRIMITIVOS Y DE REFERENCIA)
Un primitivo no es un objeto en Java ni representa un objeto ; Un primitivo es un valor en memoria como un numero o un caracter
- boolean, byte 8 bits,short 16 bits, int 32 bits, long 64 bits, float 32 bits, double 64 bits, char 16 bits
- Un float requiere la letra f o F despues del numero para que sea un float, sino lo interpreta como un double
- Un long requiere la lentra l o L por defento lo interpreta como un int

Literales
se puede agregar guiones bajos en cualquier lugar excepto al principio y al final y antes y despues de un punto decimal
double notArStart = _100000; //No compila
double notAtEnd = 100000_; //No compila
double notByDecimal = 1000_.0000; // No compila


# TIPOS DE REFERENCIA
Un tipo de referencia se refiere a un objeto; Una referencia apunta a un objeto almacenado en memoria. la direccion donde se encuentre el objeto, no se conoce la ubicacion fisica solo la referencia para referirse al objeto.


