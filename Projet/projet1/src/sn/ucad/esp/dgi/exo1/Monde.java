package sn.ucad.esp.dgi.exo1;
public class Monde{
    private int nbL;
    private int nbC;
    public boolean [][]Mat;
    public Monde() {
            this.nbL=10;
            this.nbC=10;
            this.Mat=new boolean[10][10];
     }
     public Monde(int nbL,int nbC){
         this.nbL=nbL;
         this.nbC=nbC;
         this.Mat=new boolean[nbL][nbC];
     }
     public int getnbL(){
         return this.nbL;
    }
    public void setnbL(int nbL){
        this.nbL=nbL;
    }
    public int getnbC(){
        return this.nbC;
    }
    public void setnbC(int nbC){
        this.nbC=nbC;
    }
    public boolean [][] getMat(){
        return this.Mat;
    }
    public void setMat(boolean[][] mat){
        this.Mat=mat;
    }
    public void metPapierGras(int i,int j){
            this.Mat[i][j]=true;
    }
    public void prendPapierGras(int i,int j){
            this.Mat[i][j]=false;
    }
    public  boolean estSale(int i,int j){
            return this.Mat[i][j];
    }
    public int nbPapiersGras(){
        int nb=0;
        for(int i=0;i<this.nbL;i++){
            for(int j=0;j<this.nbC;j++){
                nb+=this.Mat[i][j]?1:0;
            }
        }
        return nb; 
    }
    public String toString(){
        StringBuilder monde =new StringBuilder();
        for(int i=0;i<this.nbL;i++){
            for(int j=0;j<this.nbC;j++){
                monde.append(this.Mat[i][j]?"o":".");
            }
            monde.append("\n");
        }
        monde.append("\n");
        return monde.toString();
    }


}