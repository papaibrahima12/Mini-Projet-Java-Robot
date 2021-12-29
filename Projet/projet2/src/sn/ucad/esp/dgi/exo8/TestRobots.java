package sn.ucad.esp.dgi.exo8;
import sn.ucad.esp.dgi.exo1.Monde;
import sn.ucad.esp.dgi.exo4.PollueurToutDroit;
import sn.ucad.esp.dgi.exo5.PollueurSauteur;
import sn.ucad.esp.dgi.exo6.RobotNettoyeur;
import sn.ucad.esp.dgi.exo7.NettoyeurDistrait;
public class TestRobots {
    public static void main(String[] args) {
        Monde world = new Monde();
        System.out.println("Notre monde se voit comme ceci: \n\n");
        System.out.println(world.toString());
        PollueurToutDroit ptd = new PollueurToutDroit(4,world);
        ptd.parcourir();
        System.out.println("Apres passage du Robot Pollueur tout droit dans la colonne 5 :\n\n");
        System.out.println(world.toString());
        PollueurSauteur ps = new PollueurSauteur(7,2,world);
        ps.parcourir();
        System.out.println("Apres passage du Robot Pollueur Sauteur dans la colonne 8 avec dx=2 :\n\n");
        System.out.println(world.toString());
        NettoyeurDistrait nd = new NettoyeurDistrait(world);
        nd.parcourir();
        System.out.println("Apres passage du Robot Nettoyeur Distrait \n\n");
        System.out.println(world.toString());
        RobotNettoyeur rn = new RobotNettoyeur(world);
        rn.parcourir();
        System.out.println("Apres passage du Robot Nettoyeur \n\n");
        System.out.println(world.toString());
    }
}
