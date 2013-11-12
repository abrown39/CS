public class CargoShip extends Ship
{
 private int cargo;// the integer for the cargo capacity   //constructor
   public CargoShip(String shipName, String shipYear, int cargo)
   {
    super (shipName, shipYear);
    cargo = cargo;
   } 
   //getter for cargo capacity
   public int getCargo()
   {
   return cargo;
   }
   //setter for the cargo capacity
   public void setCargo(int cargo)
   {
   cargo = cargo;
   }
   //toString method 
   public String toString( )
    {
        return ("Name of the ship is " + shipName + ". "
                + "The cargo capacity is " +  cargo + ".");
    }    


}