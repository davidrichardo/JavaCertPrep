public class Modificadores {
    public void skip1(){}

/*     default void skip2(){

    }
    void public skip3(){

    } */ // Modificator default doesnt exist, first is always access modificator
    void skip4(){}

    public void bike1(){}
    public final void bike2(){}
    public final static void bike3(){}
    public static final void bike4(){}
    public modifier void bike5(){} // Este no es permitido porque modifiere no existe como párte de definicion de un metodo
    public void final bike6(){}//No es permitido utilizar el tipo de retorno antes de el especificador opcional
    final public void bike7(){} // Se puede utilizar el modificador de acceso despues del especificador opcional
}