
import ru.ifmo.se.pokemon.*;
public final class Battleground {
    public static void main(String[] args){
        Battle c = new Battle();
        Pokemon p1 = new Oranguru( "lox" , 1);
        Pokemon p2 = new Darumaka("cop", 1);
        Pokemon p3 = new DarmanitanStandart("big", 2);
        Pokemon p4 = new Machop("dok", 1);
        Pokemon p5 = new Machoke("sir", 2);
        Pokemon p6 = new Machamp("oct", 3);
        c.addAlly(p1);
        c.addAlly(p2);
        c.addAlly(p3);
        c.addFoe(p4);
        c.addFoe(p5);
        c.addFoe(p6);
        c.go();
    }
}