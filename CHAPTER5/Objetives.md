## Metodos
- Crear clases y registros , definir y utilizar campos y metodos de instancia y estaticos. contructores e inicializadores de instancia y estaticos.
- Implementar sobreacarga de metodos incluidos el metodo var-args
- Los metodos incluyen modificadores , argumentos , varargs, sobrecarga y autoboxing

## METODOS DE DISEÑO
public final void nap(iont minutes) throws InterruptedException{
    take a nap
}
Modificador de acceso --> public, private , default.
return type --> Void , String...
method name --> nap 
(int minutes) --> is required can be take a parameters
Exception --> Optional
Declaracion del metodo --> take a nap

- La firma del metodo el nombre del metodo y los parametros son la firma del metodo; la firma no incluye el tipo de retorno ni los modificadores de acceso.


## Modificadores de acceso
- Private --> Indica que el metodo se puede llamar solo desde la misma clase.
- Acceso a paquetes --> El metodo solo se puede llamar desde una clase del mismo paquete
- protected --> Protected significa que el metodo solo se puede llamar desde una clase del mismo paquete o una subclase
- public --> Indica que el metodo puede ser llamado desde cualquier lugar

# Especificadores opcionales
- Se puedes utilizar varios especificadores opcionales para el mismo metodo., se pueden utilizar en cualquier orden

- static --> Indica que el metodo es un miembro del objeto de la clase compartida.
- abstract --> Se utiliza en una cñlase o interfaz abstracta.
- final --> Especifica que un metodo es fijo y no puede eliminarse en una subclase
- default -> Se utiliza en una interfaz para proporcionar una implemetacion predeterminada de un metodo para las clases que implementen la interfaz
- syncronized Se utiliza en codigo multiproceso
- native --> Se utiliza para interactura con codigo escrito en otros lenguajes C++
- strictfp --> se utiliza para hacer que los calculos de los puntos flotantes sean portatiles

### Los modificadores de acceso y los especificadores opcionales siempre deben aparecer antes del tipo de retorno




