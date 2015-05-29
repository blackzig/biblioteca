/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
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
    
    static HospitalGeral h3 = new HospitalGeral();    
    static Unidade u3 = new Unidade();    
    static Especialidade e3 = new Especialidade();    
    static Medico me3 = new Medico();
            
    public static void main(String[] args) {
        try {
	    instanciarObjetos();
            Collection<String> especialidadesC = new HashSet<>();
            //remover especialidades repetidas da lista
            for(Medico me: e.getMedicos()){
                String especialidade = me.getEspecialidade().getNome();
                especialidadesC.add(especialidade);
            }            

                for(String st: especialidadesC){
                    e.setNome(st);
                    Double custo = e.faturamento();
                    System.out.println("Especialidade "+e.getNome()+" R$ "+custo);
                    System.out.println("*************************************************");                       
                }
             
            Double custoGeral = h.faturamento();
            System.out.println("Faturamento geral do hospital R$ "+custoGeral);
            
        } catch (Exception ex) {
            System.out.println("erro "+ex.getMessage());
        }
    }
    
    public static void criarMedicoEmUnidade(){
            //Parto 3        
    
            h3.setNome("Quasar");
            hospitais = new HashMap<>();
            hospitais.put(3L, h3);

            u3.setCodigo(3L);
            u3.setNome("UQ1");    
            unidades = new HashMap<>();
            unidades.put(3L, u3);            
      
            e3.setNome("neonatologia");
            especialidades = new HashMap<>();
            especialidades.put(3L, e3);      
            
            me3.setCRM("87284");
            me3.setNome("Lucas Cunha Carvalho");
            me3.setCelular("(19) 8535-7096");
            me3.setValorHora(70.64);
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
            med.getMedicos().add(me1);
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
            bp1.setNome("Estevan Gomes Ferreira");
            date = transformarStringToDate("04/09/2015");
            bp1.setDataNascimento(date);    
            Double prn = pesoRecemNascido();
            bp1.setPeso(prn);
            Double arn = alturaRecemNascido();
            bp1.setAltura(arn);
            Long pre = verificarSeEPrematuro();
            if(pre<=36){
                bp1.setSemanasGestacao(pre);            
            }
            bp1.setMae(m1);
            bp1.setMedico(me1);
            bp1.setParto(p1);
            bp1.setEspecialidade(e1);
            bp1.setHospitalGeral(h1);
            m.getBebes().add(bp1);
            med.getBebes().add(bp1);
            p.getBebes().add(bp1);
            e.getBebes().add(bp1);
            h.getBebes().add(bp1);
            bebes = new HashMap<>();
            bebes.put(1L, bp1);
            
//******************************************************************************
            //Parto 2         
            HospitalGeral h2 = new HospitalGeral();
            h2.setNome("Quasar");
            hospitais = new HashMap<>();
            hospitais.put(2L, h2);

            Unidade u2 = new Unidade();
            u1.setCodigo(2L);
            u1.setNome("UQ2");    
            unidades = new HashMap<>();
            unidades.put(2L, u2);            
      
            Especialidade e2= new Especialidade();
            e2.setNome("obstetra");
            especialidades = new HashMap<>();
            especialidades.put(2L, e2);              
           
            Medico me2 =  new Medico();
            me2.setCRM("87283");
            me2.setNome("Julian Pereira Ribeiro");
            me2.setCelular("(75) 2452-4919");
            me2.setValorHora(75.80);
            me2.setUnidade(u2);
            me2.setEspecialidade(e2);
            me2.setHospitalGeral(h2);
            h.getMedicos().add(me2);
            u.getMedicos().add(me2);
            e.getMedicos().add(me2);
            med.getMedicos().add(me2);
            medicos = new HashMap<>();
            medicos.put(2L, me2);
            
            Mae m2 = new Mae();
            m2.setNome("Raissa Pereira Azevedo");
            m2.setEndereco("Estrada Miazake, 1727, Cotia-SP, CEP: 06715-630");
            m2.setTelefone("(11) 2154-8196");
            Date date2 = transformarStringToDate("12/08/1984");
            m2.setDataNascimento(date2);
            maes = new HashMap<>();
            maes.put(2L, m2);            
            
            Parto p2 = new Parto();
            int hp2 = duracaoParto();
            if(hp2==0){
                hp2=1;
            }
            Long dp2 = (long) hp2;
            p2.setDuracaoHoras(dp2);
            int n2 = aleatorio();
            if(n2==0){
                p2.setComplicado(Boolean.FALSE);                
            }
            else{
                p2.setComplicado(Boolean.TRUE);                
            }
            partos = new HashMap<>();
            partos.put(2L, p2);           
            
            BebePrematuro bp2 = new BebePrematuro();
            bp2.setNome("Renan Ribeiro Azevedo");
            date2 = transformarStringToDate("12/03/2015");
            bp2.setDataNascimento(date2);    
            Double prn2 = pesoRecemNascido();
            bp2.setPeso(prn2);
            Double arn2 = alturaRecemNascido();
            bp2.setAltura(arn2);
            Long pre2 = verificarSeEPrematuro();
            if(pre2<=36){
                bp2.setSemanasGestacao(pre2);            
            }
            bp2.setMae(m2);
            bp2.setMedico(me2);
            bp2.setParto(p2);
            bp2.setEspecialidade(e2);
            bp2.setHospitalGeral(h2);
            m.getBebes().add(bp2);
            med.getBebes().add(bp2);
            p.getBebes().add(bp2);
            e.getBebes().add(bp2);
            h.getBebes().add(bp2);
            bebes = new HashMap<>();
            bebes.put(2L, bp2);
            
//******************************************************************************
            criarMedicoEmUnidade();
            
            //Parto 3        
//            HospitalGeral h3 = new HospitalGeral();
//            h3.setNome("Quasar");
//            hospitais = new HashMap<>();
//            hospitais.put(3L, h3);
//
//            Unidade u3 = new Unidade();
//            u3.setCodigo(3L);
//            u3.setNome("UQ1");    
//            unidades = new HashMap<>();
//            unidades.put(3L, u3);            
//      
//            Especialidade e3 = new Especialidade();
//            e3.setNome("neonatologia");
//            especialidades = new HashMap<>();
//            especialidades.put(3L, e3);      
//            
//            Medico me3 = new Medico();
//            me3.setCRM("87284");
//            me3.setNome("Lucas Cunha Carvalho");
//            me3.setCelular("(19) 8535-7096");
//            me3.setValorHora(70.64);
//            me3.setUnidade(u3);
//            me3.setEspecialidade(e3);
//            me3.setHospitalGeral(h3);
//            h.getMedicos().add(me3);
//            u.getMedicos().add(me3);
//            e.getMedicos().add(me3);
//            medicos = new HashMap<>();
//            medicos.put(3L, me3);                  
            
            Mae m3 = new Mae();
            m3.setNome("Letícia Almeida Melo");
            m3.setEndereco("Rua Princesa Isabel, 1717, Camaragibe-PE, CEP: 54762-725");
            m3.setTelefone("(81) 5488-7183");
            Date date3 = transformarStringToDate("14/01/1984");
            m3.setDataNascimento(date3);
            maes = new HashMap<>();
            maes.put(3L, m3);            
            
            Parto p3 = new Parto();
            int hp3 = duracaoParto();
            if(hp3==0){
                hp3=1;
            }
            Long dp3 = (long) hp3;
            p3.setDuracaoHoras(dp3);
            int n3 = aleatorio();
            if(n3==0){
                p3.setComplicado(Boolean.FALSE);                
            }
            else{
                p3.setComplicado(Boolean.TRUE);                
            }
            partos = new HashMap<>();
            partos.put(3L, p3);           
            
            BebePrematuro bp3 = new BebePrematuro();
            bp3.setNome("Isabella Cavalcanti Melo");
            date3 = transformarStringToDate("16/08/2015");
            bp3.setDataNascimento(date3);    
            Double prn3 = pesoRecemNascido();
            bp3.setPeso(prn3);
            Double arn3 = alturaRecemNascido();
            bp3.setAltura(arn3);
            Long pre3 = verificarSeEPrematuro();
            if(pre3<=36){
                bp3.setSemanasGestacao(pre3);            
            }
//            Medico          me4 = new Medico();
//            Mae             m4 = new Mae();
//            Especialidade   e4 = new Especialidade();
//            HospitalGeral   h4 = new HospitalGeral();
            bp3.setMae(m3);
            bp3.setMedico(me3);
            bp3.setParto(p3);
            bp3.setEspecialidade(e3);
            bp3.setHospitalGeral(h3);
            m.getBebes().add(bp3);
            med.getBebes().add(bp3);
            p.getBebes().add(bp3);
            e.getBebes().add(bp3);
            h.getBebes().add(bp3);
            bebes = new HashMap<>();
            bebes.put(3L, bp3);
            
            
//******************************************************************************
            
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
