package SuperGameOnline;

class Arena {
    private avatar hero;
    private Monster demon;

    public Arena(avatar hero, Monster demon) {
        this.hero = hero;
        this.demon = demon;
    }
    public String fight(){
        while (this.hero.isAlive() && this.demon.isAlive()){
            this.demon.hurt(this.hero.attack());
            System.out.println("Your enemy is " + demon.getHealth() + " hp");
            this.hero.hurt(this.demon.attack());
            System.out.println("You are " + hero.getHealth() + "h p");
        }
        if (!this.hero.isAlive()){
            return "monster";
        }
        else{
            return "hero";
        }
    }
}
