//Superclass Monster defines the expected behaviors
class Monster {
    String name;

    //Constructor
    Monster(String name)
    {
        this.name =name;
    }


    //Method of attack()
    String attack()
    {
        return "!^_&^$@+%$* I don't know how to attack!";
    }

}

class FireMonster extends Monster
{
    FireMonster(String name)
    {
        super(name);
    }

    String attack()
    {
        return "Attack with fire!";
    }
}

class WaterMonster extends Monster
{
    WaterMonster(String name)
    {
        super(name);
    }

    String attack()
    {
        return "Attack with water!";
    }
}

class StoneMonster extends Monster
{
    StoneMonster(String name)
    {
        super(name);
    }

    String attack()
    {
        return "Attack with stones!";
    }
}