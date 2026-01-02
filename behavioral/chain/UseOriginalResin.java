package behavioral.chain;

public class UseOriginalResin extends UseResins {
    public UseOriginalResin(UseResins useNextResins) {
        super(useNextResins);
    }

    @Override
    public void spend(Resins resins) {
        if (resins.getResinsType() == Resins.ResinsType.ORIGINAL) {
            System.out.println("Using " + resins.getResinsType());
        } else if (useNextResins != null) {
            useNextResins.spend(resins);
        }

    }
}
