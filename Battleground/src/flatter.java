import ru.ifmo.se.pokemon.*;

class Flatter extends StatusMove {
    protected Flatter() {
        super(Type.DARK, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.SPECIAL_ATTACK, +2);
    }

    @Override
    protected String describe() {
        return "сбивает с толку противника, но специальная атака противника увеличивается на 2 уровня";
    }
}
