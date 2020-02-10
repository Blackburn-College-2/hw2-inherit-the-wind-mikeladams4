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
public class Wind {

    public double speed;
    public String unit = "kph";
    public String direction;
    Measurement wind;
    
    public Wind() {
        this.speed = (double) (Math.random() * 20);
        double random = Math.random() * 10;
        if (random < 5) {
            this.direction = "S";
        } else {
            this.direction = "N";
        }
        this.wind = new Measurement(speed, unit);
    }
    
    @Override
    public String toString(){
        String x = "Wind: " + wind.toString();
        wind.kToM();
        String y = "/" + wind.toString();
        String s = x + y + " " + this.direction;
        return s;
    }
}
