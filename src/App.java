public class App {
    public static void main(String[] args) throws Exception {
        Player1 player=new Player1("Sam", "sword", 500);
        // System.out.println(player.getName());
        // System.out.println(player.getHealth());
        // System.out.println(player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        
        player.damageByGun2();
        player.heal();

        // Player2 betterplayer= new Player2("Suzi", "Machine Gun", 80, false);
        // betterplayer.damageByGun1();

    }
}
