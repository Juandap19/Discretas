package model;

import generics.Conjunto;

public class Controladora {
    private Conjunto<Integer> conjun1;
    private Conjunto<Integer> conjun2;

    public Controladora(){
        conjun1 = new Conjunto<>();
        conjun2 = new Conjunto<>();
    }

    public void agregarElemento(int conj,Integer value){
        switch (conj){
            case 1:
                conjun1.agregarElemento(value);
                break;
            case 2:
                conjun2.agregarElemento(value);
                break;
        }
    }
    public String cardinalidad(int conj){
        String s = "";
        switch (conj){
            case 1:
                s = "" +conjun1.cardinalidad();
                break;
            case 2:
                s = "" +conjun2.cardinalidad();
                break;
        }
        return s;
    }

    public String interseccion(){
        String s = "";
        Conjunto<Integer> result = new Conjunto<>();
        result = conjun1.interseccion(conjun2);
        s = result.toString();
        return s;
    }
    public String diferencia(int conj1){
        String s = "";
        Conjunto<Integer> result = new Conjunto<>();
        switch (conj1){
            case 1:
                result = conjun1.diferencia(conjun2);
                break;
            case 2:
                result = conjun2.diferencia(conjun1);
                break;
        }
        s = result.toString();
        return s;
    }
    public String diferenciaSimetrica(){
        String s = "";
        Conjunto<Integer> result = new Conjunto<>();
        result = conjun1.diferenciaSimentrica(conjun2);
        s = result.toString();
        return s;
    }
    public String union(){
        String s = "";
        Conjunto<Integer> result = new Conjunto<>();
        result = conjun1.union(conjun2,conjun1);
        s = result.toString();
        return s;
    }

    public String printConjunto(int conj){
        String s = "";
        switch (conj){
            case 1:
                s = conjun1.toString();
                break;
            case 2:
                s = conjun2.toString();
                break;
        }
        return s;
    }
}
