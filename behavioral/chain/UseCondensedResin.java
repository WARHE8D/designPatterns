package behavioral.chain;

public class UseCondensedResin extends UseResins {

    public UseCondensedResin(UseResins useNextResins) {
        super(useNextResins);
    }

    @Override
    public void spend(Resins resins) {
        //see if the resin type is condensed if not goto next order
        if (resins.getResinsType() == Resins.ResinsType.CONDENSED) {
            System.out.println("Using " + resins.getResinsType());
        } else if (useNextResins != null) {
            useNextResins.spend(resins);//goes to next chain order
        }
    }
}
