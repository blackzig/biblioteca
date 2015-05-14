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
public class BebePrematuro extends Bebe{
    
    private Long semanasGestacao;
    
    private Collection<Bebe> bebes;      

    /**
     * @return the semanasGestacao
     */
    public Long getSemanasGestacao() {
        return semanasGestacao;
    }

    /**
     * @param semanasGestacao the semanasGestacao to set
     */
    public void setSemanasGestacao(Long semanasGestacao) {
        this.semanasGestacao = semanasGestacao;
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
