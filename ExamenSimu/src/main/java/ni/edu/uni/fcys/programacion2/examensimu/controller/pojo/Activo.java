/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.examensimu.controller.pojo;

/**
 *
 * @author Sistemas-09
 */
public class Activo {

    public Activo(int vActivo, String tActivo, float vSalvamento, String Nombre) {
        this.vActivo = vActivo;
        this.tActivo = tActivo;
        this.vSalvamento = vSalvamento;
        this.Nombre = Nombre;
    }
   
    public Activo(){
        
    }

    public int getvActivo() {
        return vActivo;
    }

    public void setvActivo(int vActivo) {
        this.vActivo = vActivo;
    }

    public String gettActivo() {
        return tActivo;
    }

    public void settActivo(String tActivo) {
        this.tActivo = tActivo;
    }

    public float getvSalvamento() {
        return vSalvamento;
    }

    public void setvSalvamento(float vSalvamento) {
        this.vSalvamento = vSalvamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    private int vActivo;
    private String tActivo;
    private float vSalvamento;
    private String Nombre;
}
