package sn.ucad.esp.dgi.exo4;
import sn.ucad.esp.dgi.exo1.Monde;
import sn.ucad.esp.dgi.exo3.RobotPollueur;
public class PollueurToutDroit extends RobotPollueur {
    private int colDepart;
    public PollueurToutDroit(int colDepart,Monde m){
        super(0,colDepart,m);
    }
    public int getColDepart(){
        return this.colDepart;
    }
    public void setColDepart(int colDepart){
        this.colDepart = colDepart;
    }
    @Override
    public void parcourir(){
        int i=0;
        while (i<this.getMonde().getnbL()) {
            this.setPosx(i);
            this.setPosy(colDepart);
            this.polluer();
            i++;
        }
    }
}
