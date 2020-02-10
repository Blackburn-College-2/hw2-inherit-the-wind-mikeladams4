/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

/**
 *
 * @author adams
 */
public class Clouds {

    public String level;

    public Clouds() {
        int level = (int) (Math.random() * 20);
        if (level < 5) {
            this.level = "None";
        } else if (5 < level && level < 10) {
            this.level = "Light";
        } else if (10 < level && level < 15) {
            this.level = "Medium";
        } else {
            this.level = "Heavy";
        }
    }

    @Override
    public String toString() {
        String s = "Clouds: " + this.level;
        return s;
    }
}
