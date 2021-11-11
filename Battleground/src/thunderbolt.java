
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

class Thunderbolt extends SpecialMove {
    protected Thunderbolt() {
        super(Type.ELECTRIC, 15, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "наносит урон, есть 10% шанс парализовать противника";
    }
}
