## Control de flujo del Programa
- Crear un control de flujo de un programa utilizando sentencias if/else switch for and break
## Utilizar Java Orientado a Objetos
- Implementar polimorfismo y diferenciar de orientada a objetos vs tipos de referencias utilizar cashing identificar objetos por instanceof y pattern matching

- Una bloque de codigo en java es un conjunto de una o mas sentencias entre un {}
- Acortamiento de codigo con coincidencia de patrones
En este caso no se refiere al pattern de java ni regex , es una aplicaciion de una conversion de tipos implemetanda en java 16
void compareNumbers(Numbers number){
    if(number instaceOof Integer){
        Integer data = (Integer)number;
        sout(data.compareOf(5));
    }
}

Esta conversion es muy comun en java para comparar tipos en java 16 se acorto la expersion

void compareNumbers(Numbers number){
    if(number instanceof Integer data)
    sout(data.compareTo(5));
}

Temas importates de repaso :
Mirar las expresiones switch 

switch(variabletoTest){
    case constantExperssion:
    branch for case
    break;

    case constantExperssion, constantExperssion:
    branch for case;
    break;

    default:
    branch for default;
}


Despues de JAVA 14 es posible combinar valores

case 1,2
Antes tocaba 
case 1 , case2:

switch(month){}

- Para las expresiones switch no estan permitidos los datos boolean Long float double 

En Java 14 se mejoro  los switch y ahora son expersiones switch 

int result = switch(variabletotest){
    case constantExpresion -> 5;
    case constantExpresion,constantExpresion -> {yield 10;} //Required if switch block return a expersion
    default -> 20;

    Las case branch no son expersiones lambdas en las expersiones switch
}