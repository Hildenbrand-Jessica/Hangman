/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author hyrumandbrescia
 */
public abstract class Menu {
   
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
          
      }
      public interface EnterInfo{
          
      }
      
}
