import java.net.PasswordAuthentication;
import java.time.LocalDate;

public class BonusMember {

    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance;
    private String name;
    private String eMailAddress;
    private String password;
    private Membership membership;

    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    public BonusMember(int memberNumber, LocalDate enrolledDate, String name, String eMailAddress, String password){
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = 0;
        this.name = name;
        this.eMailAddress = eMailAddress;
        this.password = password;
        this.membership = new BasicMembership();
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    public int getBonusPointsBalance() {
        return bonusPointsBalance;
    }

    public String getName() {
        return name;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public String getPassword() {
        return password;
    }

    public Membership getMembership() {
        return membership;
    }

    //dobbeltsjekk om denne metoden fungerer         //InstanceOf
    public boolean checkPassword(String password_1){
        return this.password.equals(password_1);
    }

    public void registerBonusPoints(int newPoints){
        this.bonusPointsBalance = this.membership.registerPoints(this.bonusPointsBalance, newPoints);
        checkAndSetMembership();
    }
    //hjelpemetode til registerBonusPoints
    private void checkAndSetMembership(){
        if(this.bonusPointsBalance <= SILVER_LIMIT){
            this.membership = new BasicMembership();
        } else if(this.bonusPointsBalance <= GOLD_LIMIT){
            this.membership = new SilverMembership();
        } else{
            this.membership = new GoldMembership();
        }
    }

    @Override
    public String toString() {
        return "Bonusmember: " + name + "\n" +
                "Membernumber: " + memberNumber + "\n" +
                "Date enrolled: " + enrolledDate + "\n" +
                "Bonuspoints balance: " + bonusPointsBalance + "\n" +
                "Email: " + eMailAddress + "\n" +
                "Membership: " + membership; }
}

