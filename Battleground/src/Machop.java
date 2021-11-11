
import ru.ifmo.se.pokemon.*;
public class Machop extends Pokemon{
    public Machop(String name, int level){
        super(name, level);
        setStats(70, 80, 50, 35, 35, 35);
        setType(Type.ELECTRIC, Type.NORMAL);
        setMove(new Thunder(),new Swagger());
    }
}
