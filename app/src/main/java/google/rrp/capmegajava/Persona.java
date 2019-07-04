package google.rrp.capmegajava;


import android.annotation.SuppressLint;
import android.util.Log;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
public class Persona {
    private String nombre;
    private String sexo;
    private Integer edad;
    private Integer peso;
    private float altura;

    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public void  dormir(){
        Log.i("Estoy durmiendo","Deja dormir");

    }

    public  void comer(){
        Log.i("Tengo hambre", "Vamos por unas kekas");

    }

    @SuppressLint("LongLogTag")
    public  void caminar(){
        Log.i("Mendigos trasportistas, realizaron paro","ni modo nos toca caminar");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
