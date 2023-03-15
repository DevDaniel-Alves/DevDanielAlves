/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author danie
 */
public class Lista {

    private int valores[];
    private int pos;

    public int Insere(int valor, int pos) {
        if (pos >= 0 && pos < valores.length) {
            valores[pos] = valor;
            return valor;
        } else {
            return -1;
        }
    }

    public int Remove(int pos) {
        int valor;
        if (pos > 0 && pos < valores.length) {
            valor = valores[pos];
            valores[pos] = 0;
            return valor;
        } else {
            return -1;
        }
    }
}
