package SuperGameOnline;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
//        avatar player = new avatar(scan.nextLine(), scan.nextInt());
//        player.setHand(new weapon(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextDouble()));
//        monster demon = new monster(scan.nextInt(),scan.nextInt(),scan.nextInt());
//        arena bossFight = new arena(player,demon);
//        System.out.println(player.getHealth());
//        potion potion = new potion("healing", 50, 12);
//        player.heal(potion.getHealAmount());
//        System.out.println(player.getHand());
        //weapon sword = new weapon("sword", 12, 12,12);
        System.out.println("Enter players name:");
        String playerName = scan.nextLine();
        avatar player = new avatar(playerName, 100, 20);
        Weapon rock = new Weapon("rock", 5, 10, 10);
        player.setHand(rock);
        //System.out.println(player.toString());
        boolean a = true;
        //System.out.println(player.attack());
        while (a) {
            avatar fakePlayer = new avatar(playerName, player.getHealth(), player.getCapacity());
            fakePlayer.setHand(player.getHand());
            System.out.println(player.toString());
            System.out.println();
            System.out.println("Your enemy is: ");
            //System.out.println("//" + fakePlayer.getHealth() + " " + fakePlayer.getHand() + "\\");
            Monster monster = new Monster(100, 10, ToolBox.getIntRandomNumber(1, 100));
            System.out.println(monster.toString());
            Arena arena = new Arena(fakePlayer, monster);
            System.out.println("Fight!!");
            System.out.println("Winner:");
            System.out.println(arena.fight());
            if (arena.fight() == "hero"){
                System.out.println("choose your reward: ");
                int rand = ToolBox.getIntRandomNumber(1,20);
                System.out.println("1 - sword(base attack: " + rand + " 2 - Healing potion(heals 10hp)");
                int choose = scan.nextInt();
                if (choose == 1){
                    Weapon sword = new Weapon("sword", 10, rand, 10);
                    player.setHand(sword);
                    player.addToBackpack(sword);
                }
                else{
                    Potion healingPotion = new Potion("healing Potion", 5, 10);
                    player.heal(healingPotion.getHealAmount());
                }
                System.out.println(player.toString());
                System.out.println("To look at your backpack press 'b' else press smth else");
                char c = scan.next().charAt(0);
                if (c == 'b'){
                    player.showBackpack();
                    System.out.println("Do you want to take out smth?(Y || N)");
                    char l = scan.next().charAt(0);
                    if (l == 'Y'){
                        System.out.println("Press what you want: ");
                        int num = scan.nextInt();
                        player.setHand(player.takeFromBackpack(num));
                    }
                }
            }
            else{
                player.hurt(monster.getAttackPower());
                System.out.println(player.toString());
                if (player.getHealth() <=0){
                    System.out.println("Game over!");
                    break;
                }
                System.out.println("To look at your backpack press 'b' else press smth else");
                char c = scan.next().charAt(0);
                if (c == 'b'){
                    player.showBackpack();
                    System.out.println("Do you want to take out smth?(Y || N)");
                    char l = scan.next().charAt(0);
                    if (l == 'Y'){
                        System.out.println("Press what you want: ");
                        int num = scan.nextInt();
                        player.setHand(player.takeFromBackpack(num));
                    }
                }
                System.out.println("Do you want to fight more? Y||N");
                char b = scan.next().charAt(0);
                if (b == 'N'){
                    System.out.println("Game Over");
                    break;
                }
            }
        }
    }
}
