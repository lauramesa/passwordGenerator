package com.lrm.zander;
/**
 * Clase, generador de contraseñas
 * @author laura rendon mesa
 * @version 1.0
 * @see <a href="">portafolio</a>
 * @see <a href="https://www.linkedin.com/in/laura-rendon-mesa-43941120a/">perfil_linkenId</a>
 */
public class PasswordGenerator {
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    private static final String VOWELS = "aeiou";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!|°#$%&/\\[]{}_:;.()=?¡*¿";
    private static final int NUM_PARS =3;
    private static final int NUM_NUMS =2;
    private static final int NUM_SIMB =1;
    private static  final String other="n";
    /***
     * Metodo que devuelve una posicion aleatorea
     * @param option recibe una cadena de texto
     * @return devuelve una posicion aleatorea de un caracter
     */
    public char getRandom(String option){
        int pos = (int)(Math.random() *option.length());
       return option.charAt(pos) ;
    }
    /**
     * Metodo que concatena una  1 consonante y 1 vocal
     * @return una cadena de texto con una consonante y vocal aleatorea
     * */
    public String generatorPar(){
        String par="";
        par += getRandom(CONSONANTS);
        par += getRandom(VOWELS);
        return par;
    }
    /**
     * metodo que construira una contraseña con: tres silabas, dos numero y un simbolo aleatoreo.
     * @return devuelve cadena
     * */
    public String builderPassword(){
        String password="";
        for (int z=0; z<NUM_PARS; z++){
            password += generatorPar();
        }
        for (int z=0; z<NUM_NUMS; z++){
            password += getRandom(NUMBERS);
        }
        for(int z=0; z<NUM_SIMB; z++){
            password += getRandom(SYMBOLS);
        }
        return password;
    }
}
