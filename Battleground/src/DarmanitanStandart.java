
import ru.ifmo.se.pokemon.*;
public class DarmanitanStandart extends Darumaka {
    public DarmanitanStandart(String name, int level){
        super(name, level);
        setStats(105, 140, 55, 30, 55, 95);
        setType(Type.GROUND, Type.PSYCHIC, Type.ROCK, Type.POISON);
        setMove(new RockTomb(),new Rest(),new SludgeBomb(),new Mudslap());
    }
}
