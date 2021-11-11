
import ru.ifmo.se.pokemon.*;
import java.lang.Math;
class Psychic extends SpecialMove{
 protected Psychic(){
  super(Type.PSYCHIC, 10, 90);
 }
 @Override
 protected void applyOppEffects(Pokemon p){
  if (Math.random()<=0.1)
   p.setMod(Stat.SPECIAL_DEFENSE, -1);
 }
 @Override
 protected String describe(){
  return "uses Psychic";
 }
}


