package sn.ucad.esp.dgi.exo5;
import sn.ucad.esp.dgi.exo1.Monde;
import sn.ucad.esp.dgi.exo3.RobotPollueur;
public class PollueurSauteur extends RobotPollueur{
    protected int deltax;
    protected int colDepart;
    public PollueurSauteur(int colDepart, int deltax,Monde m){
        super(0,colDepart,m);
        this.deltax = deltax;
        this.colDepart=colDepart;
    }
    public int getDeltax(){
        return deltax;
    }
    public void setDeltax(int deltax){
        this.deltax = deltax;
    }
    public int getcolDepart(){
        return colDepart;
    }
    public void setColDepart(int colDepart){
        this.colDepart = colDepart;
    }
    @Override
    public void parcourir(){
        int i = 0;
        while (i<this.getMonde().getnbL()) {
            int pos=0;
            if (i%2 == 0) {
                pos=this.colDepart
            }else{
                if (this.colDepart+this.deltax<this.get) {
                    
                }
            }
            this.setPosx(i);
            this.setPosy(i%2==0?this.colDepart:
            (this.colDepart+this.deltax<this.getMonde().getnbC()?
            this.colDepart+this.deltax:0));
            this.polluer();
            i++;
        }
    }
}
