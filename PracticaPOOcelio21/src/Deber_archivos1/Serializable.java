/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_archivos1;

/**
 *
 * @author ITSLOJA
 */
public class Serializable {
    private String  nombre;
    private  int numerCiclos;
   private int numeroCreditos  ;

    // constructor

     public void Carrera  () {
    }

    public void  Carrera ( String  nombre , int  numerCiclos , int  numeroCreditos ) {
        this . nombre = nombre;
        this . numerCiclos = numerCiclos;
        this . numeroCreditos = numeroCreditos;
    }
    // geter



    public  String  getNombre () {
        return nombre;
    }

    public  void  setNombre ( String  nombre ) {
        this . nombre = nombre;
    }

    public  int  getNumerCiclos () {
        return numerCiclos;
    }

    public  void  setNumerCiclos ( int  numerCiclos ) {
        this . numerCiclos = numerCiclos;
    }

    public  int  getNumeroCreditos () {
        return numeroCreditos;
    }

    public  void  setNumeroCreditos ( int  numeroCreditos ) {
       this . numeroCreditos = numeroCreditos;
    }



}

