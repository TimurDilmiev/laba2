
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

class Thunder extends SpecialMove {
    protected Thunder() {
        super(Type.ELECTRIC, 10, 110);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "наносит урон, есть 30% шанс парализовать противника";
    }
}

