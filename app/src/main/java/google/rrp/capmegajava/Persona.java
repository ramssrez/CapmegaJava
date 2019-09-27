package google.rrp.capmegajava;


import android.annotation.SuppressLint;
import android.util.Log;

import javax.security.auth.login.LoginException;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
public class Persona {
    private String nombre;
    private String sexo;
    private int edad;
    private float peso;
    private float altura;

    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public void  dormir(){
        Log.i(" Metodo dormir","Deja dormir, aun son las 12 de la mañana");

    }

    public  void comer(){
        Log.i(" Metodo comer", "Vamos por unas kekas");

    }

    @SuppressLint("LongLogTag")
    public  void caminar(){
        Log.i(" Metodo caminar","Esta re-lejos Capmega");
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nombre;
    }



}
