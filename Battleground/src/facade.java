
import ru.ifmo.se.pokemon.*;

class Facade extends SpecialMove {
    protected Facade() {
        super(Type.NORMAL, 20, 70);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status Pokcon = def.getCondition();
        if (Pokcon.equals(Status.BURN) || Pokcon.equals(Status.POISON) ||
                Pokcon.equals(Status.PARALYZE)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }
    @Override
    protected String describe() {
        return "сила удваивается, если исользующий горит, парализован или отравлен";
    }
}
