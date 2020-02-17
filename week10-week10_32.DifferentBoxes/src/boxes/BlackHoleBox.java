package boxes;

public class BlackHoleBox extends Box {
    @Override
    public void add(Thing thing) {
        return;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
