//lær deg package på et tidspunkt (hvis du skal ha protected)

public class BasicMembership extends Membership{

    @Override
    public int registerPoints(int bonusPointsBalance, int newPoints){
        return bonusPointsBalance+newPoints;
    }

    @Override
    public String getMembershipName() {
        return "Basic Membership";
    }

}
