
package com.mycompany.aula_online04;

public class PC {
    private String Processador;
    private String memoria;
    private String fonte;
    private String placa_de_video;
    private String placa_mae;
    
    public PC(String p, String m, String f, String pv, String pm ){
        this.Processador = p;
        this.memoria = m;
        this.fonte = f;
        this.placa_de_video = pv;
        this.placa_mae = pm;
    }
    public String getProcessador(){
        return this.Processador;
    }
    public void setProcessador(String p){
        this.Processador = p;
    }
    public String getmemoria(){
        return this.memoria;
    }
    public void setmemoria(String m){
        this.memoria = m;
    }
    public String getfonte(){
        return this.fonte;
    }
    public void setfonte(String f){
        this.fonte = f;
    }
    public String getplaca_de_video(){
        return this.placa_de_video;
    }
    public void setplaca_de_video(String pv){
        this.placa_de_video = pv;
    }
    public String getplaca_mae(){
        return this.placa_mae;
    }
    public void setplaca_mae(String pm){
        this.placa_mae = pm;
    }
    
    public void status1(){
        System.out.println("SEU PROCESSADOR É: " + this.getProcessador());
        System.out.println("SUA MEMORIA É DE: " + this.getmemoria());
        System.out.println("SUA FONTE É: " + this.getfonte());
        System.out.println("SUA PLACA DE VIDEO É: " + this.getplaca_de_video());
        System.out.println("SUA PLACA MAE É: " + this.getplaca_mae());
    }
}
