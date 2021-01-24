public class Test {
    public static void main(String[] args) {

        Object[] players = new Object[5];
        players[0] = new Cat("barsik", 1, 10);
        players[1] = new Cat("cat1", 10, 10);
        players[2] = new Human("human1", 1, 20);
        players[3] = new Robot("robot1", 100, 1);
        players[4] = new Human("humman2", 10, 10);

        Barrier[] barriers = new Barrier[3];
        barriers[0] = new Wall(10);
        barriers[1] = new RunningTrack(10);
        barriers[2] = new Wall(10);

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (players[i] instanceof Cat)
                    if(((Cat) players[i]).doSmthng(barriers[j]));
                    else break;
                else if (players[i] instanceof Human)
                    if(((Human) players[i]).doSmthng(barriers[j]));
                    else break;
                else if ((players[i] instanceof Robot))
                   if( ((Robot) players[i]).doSmthng(barriers[j]));
                   else break;


            }

        }


    }


}
