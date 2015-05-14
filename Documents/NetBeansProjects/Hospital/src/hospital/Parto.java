/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author MAM
 */
public class Parto {
    
    private Long    duracaoHoras;
    private Boolean complicado;

    private Collection<Bebe> bebes; 
    
    /**
     * @return the duracaoHoras
     */
    public Long getDuracaoHoras() {
        return duracaoHoras;
    }

    /**
     * @param duracaoHoras the duracaoHoras to set
     */
    public void setDuracaoHoras(Long duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    /**
     * @return the complicado
     */
    public Boolean getComplicado() {
        return complicado;
    }

    /**
     * @param complicado the complicado to set
     */
    public void setComplicado(Boolean complicado) {
        this.complicado = complicado;
    }

    /**
     * @return the bebes
     */
    public Collection<Bebe> getBebes() {
        if (this.bebes == null) {
            this.setBebes(new ArrayList<>());
        }        
        return bebes;
    }

    /**
     * @param bebes the bebes to set
     */
    public void setBebes(Collection<Bebe> bebes) {
        this.bebes = bebes;
    }
    
}
