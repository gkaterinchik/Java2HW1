public class Human {
    private String name;
    private int maxDistance;
    private int maxJump;
    Human(String name, int maxDistance, int maxJump){
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    public boolean doSmthng(Barrier barrier){
        if (barrier instanceof RunningTrack){
            if(barrier.getDistance()<=this.maxDistance){
                System.out.println(this.name + " " + ((RunningTrack) barrier).doSmthng());
                return true;
            }else return false;
        }

        else if (barrier instanceof Wall){
            if(barrier.getDistance()<=this.maxJump){
                System.out.println (this.name+" "+((Wall)barrier).doSmthng());
                return true;}
            else return false;
        } else return false;
    }

}

