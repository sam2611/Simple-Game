public class Player2 extends Player1 {

    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        
        // super.damageByGun1();
        if(armour)
        {
            this.health-=20;
        
        if(this.health<=0)
        {
            this.health=0;
        }
        System.out.println("Armour is on. Got hit  by Gun 1. Health reduced bu 20"+ " New health is "+ this.health);
    }
    if(!armour)
    {
        this.health-=30;
        
        if(this.health<=0)
        {
            this.health=0;
        }
        System.out.println("Armour is off. Got hit  by Gun 1. Health reduced bu 30"+ " New health is "+ this.health);
    }
    if(this.health==0)
    {
        System.out.println(getName()+" is dead.");
    }

}

    @Override
    public void damageByGun2() {
        // TODO Auto-generated method stub
        if(armour)
        {
            this.health-=40;
        
        if(this.health<=0)
        {
            this.health=0;
        }
        System.out.println("Armour is on. Got hit  by Gun 1. Health reduced bu 40"+ " New health is "+ this.health);
    }
    if(!armour)
    {
        this.health-=50;
        
        if(this.health<=0)
        {
            this.health=0;
        }
        System.out.println("Armour is off. Got hit  by Gun 1. Health reduced bu 50"+ " New health is "+ this.health);
    }
    if(this.health==0)
    {
        System.out.println(getName()+" is dead.");
    }
    }



    
    
}
