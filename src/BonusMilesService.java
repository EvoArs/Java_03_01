public class BonusMilesService {

    public int calculate(int price) {
        int bonusMile = 20;
        int bonus = price / bonusMile;
        return bonus;
    }
}