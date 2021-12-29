package sn.ucad.esp.dgi.exo6;
import sn.ucad.esp.dgi.exo1.Monde;
import sn.ucad.esp.dgi.exo2.Robot;

public class RobotNettoyeur extends Robot {

    public RobotNettoyeur(int x, int y,Monde m){
        super(x,y,m);
    }
    public RobotNettoyeur(Monde m){
        super(m);
    }
    public void nettoyer(){
        this.getMonde().prendPapierGras(this.getPosx(),this.getPosy());
    }
    @Override
    public void parcourir(){
        for (int i=0;i<this.getMonde().getnbL();i++){
            for (int j=0;j<this.getMonde().getnbC();j++){
                this.setPosx(i);
                this.setPosy(j);
                if (this.getMonde().estSale(i, j))
                    this.nettoyer();
            }
        }
    }
}
