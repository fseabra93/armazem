/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoarmazem;

import java.util.List;

/**
 *
 * @author flaviorgs
 */
public class ProjetoArmazem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Armazem<String> elementos = new Armazem<>();
        
        elementos.adicionar("Arroz");
        elementos.adicionar("Feijão");
        
        elementos.imprimir();
        
        elementos.remover("Feijão");
        elementos.remover("Milho");
        
        elementos.imprimir();
        
           
    }
    
}
