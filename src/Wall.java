public class Wall extends Barrier {
    private int distance;

    Wall(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String doSmthng() {

        return "перепрыгнул препятствие " + distance + " метров";
    }
}
