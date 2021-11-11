

import ru.ifmo.se.pokemon.*;
public class Oranguru extends Pokemon {
    public Oranguru(String name, int level) {
        super(name, level);
        setStats(90, 60, 80, 90, 110, 60);
        setType(Type.ELECTRIC, Type.PSYCHIC, Type.NORMAL);
        setMove(new Psychic(), new Thunderbolt(), new Thunder(), new Facade());
    }
}
