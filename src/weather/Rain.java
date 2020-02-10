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
public class Rain {

    double amount;
    public String unit = "cm";
    String type = "Rain";
    Measurement rain;
    
    public Rain() {
        this.amount = (double) (Math.random() * 10);
        rain = new Measurement(this.amount, this.unit);
    }

    public void tempAffects(Temperature temp) {
        if (temp.middayTemp < 0) {
            this.amount = this.amount * 10;
            this.type = "Snow";
        }
    }

    @Override
    public String toString() {
        String s = "Precipitation: " + rain.toString() + "/";
        rain.cToI();
        String c = rain.toString();
        String sc = s + c + " " + this.type; 
        return sc;
    }
}
