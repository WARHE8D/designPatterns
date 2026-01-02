package behavioral.chain;

public class UseFragileResin extends UseResins {
    //do same here
    public UseFragileResin(UseResins useNextResins) {
        super(useNextResins);
    }

    @Override
    public void spend(Resins resins) {
        if (resins.getResinsType() == Resins.ResinsType.FRAGILE) {
            System.out.println("Using " + resins.getResinsType());
        } else if (useNextResins != null) {
            useNextResins.spend(resins);
        }
    }
}
