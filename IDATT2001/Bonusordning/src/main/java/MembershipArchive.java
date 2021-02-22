
import java.time.LocalDate;
import java.util.HashMap;

public class MembershipArchive {

    HashMap<Integer, BonusMember> memberRegistry;

    public MembershipArchive() {
        this.memberRegistry = new HashMap<Integer, BonusMember>();
    }

    public boolean addMember(int memberNumber, LocalDate enrolledDate, String name, String eMailAddress, String password) {
        if (memberRegistry.containsKey(memberNumber)) {
            return false;
        }
        memberRegistry.put(memberNumber, new BonusMember(memberNumber, enrolledDate, name, eMailAddress, password));
        return true;
    }

    public boolean registerPoint(int memberNumber, int bonusPoints){
        if(memberRegistry.containsKey(memberNumber)){
            memberRegistry.get(memberNumber).registerBonusPoints(bonusPoints);
            return true;
        }
        return false;
    }
    public BonusMember findMember(int memberNumber){
        if(memberRegistry.containsKey(memberNumber)){
            return memberRegistry.get(memberNumber);
        }
        return null;
    }
}

