public class RunningTrack extends Barrier {
    private int distance;

    RunningTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String doSmthng(){

        return "пробежал "+ distance+" метров";
    }
}
