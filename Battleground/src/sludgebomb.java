
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
class SludgeBomb extends SpecialMove {
    protected SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.poison(p);

    }

    @Override
    protected String describe() {
        return "наносит урон и есть 30% шанс отравить противника";
    }
}
