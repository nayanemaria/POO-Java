/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author csouza
 */
public class Livro {
private int id;
    private String titulo;
    private float valor;
    private int paginas;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public float getValor(){
        return this.valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public int getPaginas(){
        return this.paginas;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
   }    
}
