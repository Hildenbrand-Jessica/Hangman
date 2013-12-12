/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;



/**
 *
 * @author hyrumandbrescia
 */
public abstract class Menu implements DisplayInfo, EnterInfo {
   
    public String [][] menuItems = null;
    
    public Menu() {
    }
    
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }

    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
 
      public abstract void display();
      
      public interface DisplayInfo{
          void display();
          
      }
      public interface EnterInfo{
          public void enter();
          
      } 

      
      /*        public boolean occupyLocation(Player player, String[] coordinates) throws MenuException {
        Location location = this.getLocation(coordinates);
        
        if (location.getPlayer() !=null) {
            throw new MenuException("This location is already taken");
        }
        location.setPlayer(player);
        return true;
    }*/
      
}
