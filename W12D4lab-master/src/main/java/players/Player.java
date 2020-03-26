package players;

public abstract class Player {

    //instance vars
    public String name;
    public int healthPoints;

    //constructor
    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }




    //getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
