package SuperGameOnline;

class Monster {
    private double health;
    private int attackPower;
    private int attackChance;

    public Monster(double health, int attackPower, int attackChance) {
        this.health = health;
        this.attackPower = attackPower;
        this.attackChance = attackChance;
    }
    public int attack(){
        int a = ToolBox.getIntRandomNumber(1,100);
        if (a < attackChance){
            return this.attackPower;

        }
        return 0;
    }
    public boolean isAlive(){
        return this.health > 0;
    }
    public void hurt(double a){
        this.health-=a;
    }

    @Override
    public String toString() {
        return "monster{" +
                "health=" + health +
                ", attackPower=" + attackPower +
                ", attackChance=" + attackChance +
                '}';
    }

    public double getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getAttackChance() {
        return attackChance;
    }
}
