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
public class Measurement {

    public double value;
    public String unit;

    public Measurement(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public void cToF() {
        this.value = (this.value * 1.8) + 32;
        this.unit = "F";
    }
    
    public void cToI() {
        this.value = this.value/2.54;
        this.unit = "in";
    }
    
    public void kToM() {
        this.value = (this.value/1.609);
        this.unit = "mph";
    }

    @Override
    public String toString() {
        return (int)Math.ceil(value) + " " + unit;
    }
}
