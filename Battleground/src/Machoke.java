
import ru.ifmo.se.pokemon.*;
public class Machoke extends Machop{
    public Machoke(String name, int level){
        super(name, level);
        setStats(80, 100, 70, 50, 60, 45);
        setType(Type.ELECTRIC, Type.NORMAL, Type.DARK);
        setMove(new Thunder(),new Swagger(), new Flatter());
    }
}
