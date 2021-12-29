package sn.ucad.esp.dgi.exo2;
import sn.ucad.esp.dgi.exo1.Monde;
public abstract class Robot {
    private int posx;
    private int posy;
    private Monde m;
    protected Robot(int x, int y,Monde m) {
        this.posx = x;
        this.posy = y;
        this.m = m;
    }
    protected Robot(Monde m){
    this((int)(Math.random()*10)+0,(int)(Math.random()*10)+0,m);
    }
    public int getPosx(){
        return this.posx;
    }
    public void setPosx(int posx) {
        this.posx = posx;
    }
    public int getPosy(){
        return this.posy;
    }
    public void setPosy(int posy) {
        this.posy = posy;
    }
    public Monde getMonde(){
        return this.m;
    }
    public void vaEn(int i, int j){
           this.posx=i;
           this.posy=j;
    }
    public void parcourir(){}

}


