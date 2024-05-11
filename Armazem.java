/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoarmazem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flaviorgs
 * @param <T>
 */
public class Armazem<T> {
    
   // private int capacidade, topo;
    private final List<T> elementos;

    public Armazem() {
       // this.capacidade = capacidade;
       // this.topo = -1;
        this.elementos = new ArrayList<>();
    }
/*
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }*/
    
    public void adicionar(T elemento) {
        elementos.add(elemento);
    }
    
    public void remover(T elemento) {
        
        if (elementos.contains(elemento)) {
            System.out.println("O item " + elemento + " foi removido.");
            elementos.remove(elemento);
          } else {
            System.out.println("O item " + elemento + " não existe no Armazém.");
          }
           
    }
    
    public void imprimir() {
        System.out.println("Todos os elementos: " + elementos);
    }
    
    

    
    
    
    
}
