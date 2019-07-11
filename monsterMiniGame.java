public class monsterMiniGame {

    private int health = 1000;                  // I keep creating private because we can only access these value or change it
    private int movement = 10;                  // in this class only
    private int attack = 5;
    private boolean alive = true;
    private String name = "The Great Giant";

    public monsterMiniGame()
    {
        System.out.println("I am " + name);
        System.out.println("Monster stat: Attack: " + attack + ", Health: " + health + ", Movement: " +
                movement);
    }

    public monsterMiniGame(int newHealth, int newMovement, int newAttack, String newName)
    {
        this.attack = newAttack;
        this.movement = newMovement;
        this.health = newHealth;
        this.name = newName;
        System.out.println("I am " + newName);
        System.out.println("Monster stat: Attack: " + newAttack + ", Health: " + newHealth + ", Movement: " +
                newMovement);
    }

    public static void main(String[] args) {
        monsterMiniGame player1 = new monsterMiniGame(10,10,10,"Jin"); //it will print out
        System.out.println();
        monsterMiniGame player2 = new monsterMiniGame();    // this will also print out
    }

}
