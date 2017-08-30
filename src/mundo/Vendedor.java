/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Vendedor.java,v 1.1 Exp $
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Ejercicio: Taller 1 - anotaciones
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package mundo;

import anotaciones.Init;
import anotaciones.NoInit;
import anotaciones.PostConstructor;

/**
 * Entidad que representa a un vendedor de MLA
 */
@Init(String="-- Vacio --")
public class Vendedor implements Revisable
{

    /**
     * Id del vendedor. Tiene que ser único.
     */
    @NoInit
    private int id;

    /**
     * Nombres del vendedor.
     */
    private String nombres;

    /**
     * Apellidos del vendedor
     */
    private String apellidos;

    /**
     * Sexo del vendedor
     */
    private String sexo;

    @PostConstructor
    public void postConstruct(){
        System.out.println("Entro a ejecutar el postconstructor del vendedor");
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        if(revisarCadena(nombres))
        this.nombres = nombres;
        else
            System.out.println("El nuevo nombre no puede ser vacío");
    }
    
    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }   

    /*
    Implementaciones de métodos de la interfaz Revisable
    */
    @Override
    public boolean revisarCadena(String s) {
        if(s.equals("")){
            System.out.println("Esta cadena está vacía");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean revisarEntero(int i) {
        if(i<0){
            System.out.println("El entero es menor a cero");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean revisarFlotante(Float f) {
        if(f<0){
            System.out.println("Este flotante es cero");
            return false;
        } else {
            return true;
        }
    }
}
