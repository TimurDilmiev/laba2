
import ru.ifmo.se.pokemon.*;
public class Machamp extends Machoke{
    public Machamp(String name, int level){
        super(name, level);
        setStats(90, 130, 80, 65, 85, 55);
        setType(Type.ELECTRIC, Type.NORMAL, Type.DARK);
        setMove(new Thunder(),new Swagger(), new Flatter(),new DoubleTeam());
    }
}
