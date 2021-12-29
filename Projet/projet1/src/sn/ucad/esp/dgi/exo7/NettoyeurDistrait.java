package sn.ucad.esp.dgi.exo7;
import sn.ucad.esp.dgi.exo1.Monde;
import sn.ucad.esp.dgi.exo6.RobotNettoyeur;
public class NettoyeurDistrait extends RobotNettoyeur {
    public NettoyeurDistrait(int x, int y,Monde m){
        super(x,y,m);
    }
    public NettoyeurDistrait(Monde m){
        super(m);
    }
    public void nettoyer(int i,int j){
        this.getMonde().prendPapierGras(i,j);
    }
    @Override
    public void parcourir(){
        int count=0;
        for (int i=0;i<this.getMonde().getnbL();i++){
            for (int j=0;j<this.getMonde().getnbC();j++){
                if(this.getMonde().estSale(i,j)&& count%2==0){
                    this.nettoyer(i,j);
                    count++;
                }
            }
        }
    }
}
