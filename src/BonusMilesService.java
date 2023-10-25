public class BonusMilesService {

    public int calculate(int price) {
        int milesCoef = 20;
        int miles = (price / milesCoef);
        return miles;
    }
}
