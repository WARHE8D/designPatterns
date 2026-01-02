package behavioral.chain;

public class ChainMain {
    public static void main(String[] args) {
//        var resins = new Resins(Resins.ResinsType.CONDENSED);
//        var useCondensed = new UseCondensedResin();
//        useCondensed.spend(resins);
//        var useOriginal = new UseOriginalResin();
//        useOriginal.spend(resins);
//        var useFragile = new UseFragileResin();
//        useFragile.spend(resins);
        //this is usable but we have a big problem we are using condensed type for other 2 types of resins
        //and we have to manually call spend for each use

        //so we create a chain pattern to do it correctly and in order
        var currentResins = new Resins(Resins.ResinsType.FRAGILE);
        UseResins useResins = buildChain();
        useResins.spend(currentResins);

    }

    private static UseResins buildChain() {
        //our last resort will be using original resin so we make it null for the order to reach final chain
        var useOriginalResin = new UseOriginalResin(null);//3 final
        var useFragileResin = new UseFragileResin(useOriginalResin);//2
        var useCondensedResin = new UseCondensedResin(useFragileResin);//1
        return useCondensedResin;
    }
}
