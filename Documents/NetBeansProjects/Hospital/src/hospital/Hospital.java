/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author MAM
 */
public class Hospital {

    private static Map<Long, Mae>               maes;
    private static Map<Long, Bebe>              bebes;
    private static Map<Long, Medico>            medicos;
    private static Map<Long, Parto>             partos;
    private static Map<Long, Especialidade>     especialidades;
    private static Map<Long, Unidade>           unidades;
    private static Map<Long, HospitalGeral>     hospitais;
    
    private static final Mae            m   = new Mae();
    private static final Medico         med = new Medico();
    private static final Parto          p   = new Parto();
    private static final Especialidade  e   = new Especialidade();
    private static final Unidade        u   = new Unidade();
    private static final HospitalGeral  h   = new HospitalGeral();
    
    public static void main(String[] args) {
        try {
	    instanciarObjetos();
            e.setNome("neonatologia");
            Double custo = e.faturamento();
            System.out.println("Especialidade "+e.getNome()+" R$ "+custo);

        } catch (Exception ex) {
            System.out.println("erro "+ex.getMessage());
        }
    }
    
    public static void criarMedicoEmUnidade(){
            //Parto 3            
            HospitalGeral h3 = new HospitalGeral();
            h3.setNome("Quasar");
            hospitais = new HashMap<>();
            hospitais.put(3L, h3);

            Unidade u3 = new Unidade();
            u3.setCodigo(3L);
            u3.setNome("UQ1");    
            unidades = new HashMap<>();
            unidades.put(3L, u3);            
      
            Especialidade e3 = new Especialidade();
            e3.setNome("neonatologia");
            especialidades = new HashMap<>();
            especialidades.put(3L, e3);      
            
            Medico me3 =  new Medico();
            me3.setCRM("87282");
            me3.setNome("JULIA MARTINS BONILHA SPIRANDELI");
            me3.setCelular("(96) 4914-9718");
            me3.setValorHora(87.28);
            me3.setUnidade(u3);
            me3.setEspecialidade(e3);
            me3.setHospitalGeral(h3);
            h.getMedicos().add(me3);
            u.getMedicos().add(me3);
            e.getMedicos().add(me3);
            medicos = new HashMap<>();
            medicos.put(3L, me3);        
    }
    
    public static void instanciarObjetos() throws ParseException {
        try {            
            //Parto 1            
            HospitalGeral h1 = new HospitalGeral();
            h1.setNome("Quasar");
            hospitais = new HashMap<>();
            hospitais.put(1L, h1);

            Unidade u1 = new Unidade();
            u1.setCodigo(1L);
            u1.setNome("UQ1");    
            unidades = new HashMap<>();
            unidades.put(1L, u1);            
      
            Especialidade e1 = new Especialidade();
            e1.setNome("neonatologia");
            especialidades = new HashMap<>();
            especialidades.put(1L, e1);              
           
            Medico me1 =  new Medico();
            me1.setCRM("87282");
            me1.setNome("JULIA MARTINS BONILHA SPIRANDELI");
            me1.setCelular("(96) 4914-9718");
            me1.setValorHora(87.28);
            me1.setUnidade(u1);
            me1.setEspecialidade(e1);
            me1.setHospitalGeral(h1);
            h.getMedicos().add(me1);
            u.getMedicos().add(me1);
            e.getMedicos().add(me1);
            medicos = new HashMap<>();
            medicos.put(1L, me1);
            
            Mae m1 = new Mae();
            m1.setNome("Emily Azevedo Ferreira");
            m1.setEndereco("Rua Cândido Portinari, 116, Campinas-SP, 13088-007");
            m1.setTelefone("(19) 4980-6014");
            Date date = transformarStringToDate("17/07/1995");
            m1.setDataNascimento(date);
            maes = new HashMap<>();
            maes.put(1L, m1);            
            
            Parto p1 = new Parto();
            int hp = duracaoParto();
            if(hp==0){
                hp=1;
            }
            Long dp = (long) hp;
            p1.setDuracaoHoras(dp);
            int n = aleatorio();
            if(n==0){
                p1.setComplicado(Boolean.FALSE);                
            }
            else{
                p1.setComplicado(Boolean.TRUE);                
            }
            partos = new HashMap<>();
            partos.put(1L, p1);           
            
            BebePrematuro bp1 = new BebePrematuro();
            bp1.setNome("Estevan Gomes Cardoso");
            date = transformarStringToDate("04/09/2015");
            bp1.setDataNascimento(date);    
            Double prn = pesoRecemNascido();
            bp1.setPeso(prn);
            Double arn = alturaRecemNascido();
            bp1.setAltura(arn);
            Long pre = verificarSeEPrematuro();
            bp1.setSemanasGestacao(pre);
            bp1.setMae(m1);
            bp1.setMedico(me1);
            bp1.setParto(p1);
            m.getBebes().add(bp1);
            med.getBebes().add(bp1);
            p.getBebes().add(bp1);
            bebes = new HashMap<>();
            bebes.put(1L, bp1);
            
//******************************************************************************

//            copiarLivro();
            
        } catch (Exception ex) {
            System.out.println("erro main "+ex.getMessage());
        }        
    }  //objetos

    private static Date transformarStringToDate(String dataNascimento) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(dataNascimento);
        String dateInString = sdf.format(new Date());   
        Date date = sdf.parse(dateInString);      
        return date;
    }
    
    public static int aleatorio(){
        Random gerador = new Random();
 
        int numero = gerador.nextInt(2);    
        
        return numero;
    }

    public static int duracaoParto(){
        Random gerador = new Random();
 
        int numero = gerador.nextInt(16);    
        
        return numero;
    }

    public static Double pesoRecemNascido(){
        
        Random r = new Random();
        double randomValue = 2.50 + (4.00 - 2.50) * r.nextDouble();  
        
        return randomValue;
    }

    public static Double alturaRecemNascido(){
        
        Random r = new Random();
        double randomValue = 48.00 + (50.00 - 48.00) * r.nextDouble();  
        
        return randomValue;
    }

    public static Long verificarSeEPrematuro(){
        Random gerador = new Random();
 
        long numero = 36L + (40L - 36L) * gerador.nextLong();   
        
        return numero;
    }
    
}//fim
