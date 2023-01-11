package SuperGameOnline;

import java.util.ArrayList;

class avatar{
    private String characterName;
    private int health;
    private Stuff hand;
    private int capacity;
    private ArrayList<Stuff> backpack;

    public avatar(String characterName, int health, int capacity) {
        this.characterName = characterName;
        this.health = health;
        this.hand = null;
        this.capacity = capacity;
        this.backpack = new ArrayList<Stuff>();
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getHealth() {
        return health;
    }

    public Stuff getHand() {
        return hand;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHand(Stuff hand) {
        this.hand = hand;
    }
    public void setWeapon(Weapon s){
        this.hand = s;
    }
    public boolean isAlive(){
        if (this.health > 0){
            return true;
        }
        else {
            return false;
        }
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
    @Override
    public String toString() {
        return "Avatar[characterName=" + characterName + ", health=" + health + ", hand=" + hand + "]";
    }

    public int getCapacity() {
        return capacity;
    }

    public void hurt(double a){
        this.health-=a;
    }

    public void heal(int heal) {
        this.health += heal;
    }
    public void getToHand(Stuff item){
        this.hand = item;
    }
    public void addToBackpack(Stuff item){
        int tempCapacity = 0;
        for (int i =0;i < backpack.size();i++){
            tempCapacity += backpack.get(i).getWeight();
        }
        if (capacity < tempCapacity){
            System.out.println("Not enough space");
        }
        else if (capacity < tempCapacity+item.getWeight()){
            System.out.println("Not enough space");
        }
        else{
            backpack.add(item);
        }

    }
    public void showBackpack(){
        System.out.println(this.backpack);
    }
    public Stuff takeFromBackpack(int i){
        return this.backpack.get(i-1);
    }

}
