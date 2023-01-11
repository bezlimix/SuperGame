package SuperGameOnline;

 class Weapon extends Stuff{
    private int baseAttack;
    private double bonus;
    public Weapon(String name, int weight, int baseAttack, double bonus) {
        super(name, weight);
        this.baseAttack = baseAttack;
        this.bonus = bonus;
    }

     public int getBaseAttack() {
         return this.baseAttack;
     }

     public void setBaseAttack(int baseAttack) {
         this.baseAttack = baseAttack;
     }

     public double getBonus() {
         return this.bonus;
     }

     public void setBonus(double bonus) {
         this.bonus = bonus;
     }
 }
