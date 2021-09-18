package practica;

public interface ObjetoInerte {
String INERTE= "INERTE";
String INERTEARTIFICIAL = "Es inerte y artificial";
String INERTENATURAL = "Es inerte y natural";
boolean esInerte();
boolean esNatural();
boolean esArtificial();
String informarInerte();
String informarTipoInertee(); 
}
/*
tengo dudas su agregamos un metodo 
mas

un 
String informarInerte(); // camiaria al informar

y un 
String informarTipoInertee(); // en el caso de vehiculo informaria INERTEARTIFICIAL

*/