package sn.ucad.esp.dgi.exo3;
import sn.ucad.esp.dgi.exo1.Monde;
import sn.ucad.esp.dgi.exo2.Robot;

public abstract class RobotPollueur extends Robot {
    protected RobotPollueur(int x,int y,Monde m){
        super(x,y,m);
    }
    protected RobotPollueur(Monde m){
        super(m);
    }
    public void polluer(){
        this.getMonde().metPapierGras(this.getPosx(),this.getPosy());
    }
    @Override
    public void parcourir(){}
}
