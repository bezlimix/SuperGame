package SuperGameOnline;

class Warrior extends avatar{
    private Stuff hand;

    public Warrior(String characterName, int health, int capacity) {
        super(characterName, health, capacity);
        this.hand = null;
    }

    public double attack(){
        if (this.hand instanceof Weapon){
            Weapon a = (Weapon) hand;
            return a.getBaseAttack();
        }
        if (hand instanceof Potion){
            heal(((Potion) hand).getHealAmount());
        }

        return 0;
    }

}
