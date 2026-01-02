package behavioral.chain;

public abstract class UseResins {

    //handles the next order in chain
    //if the resintype !=current resin type then go to next order
    //until reaching the last one last order should always be null
    public UseResins useNextResins;

    public UseResins(UseResins useNextResins) {
        this.useNextResins = useNextResins;
    }


    public abstract void spend(Resins resins);
}
