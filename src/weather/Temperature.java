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
public class Temperature {

    public double morningTemp;
    public double middayTemp;
    public String unit = "C";
    Measurement mornTemp;
    Measurement midTemp;
    
    public Temperature(Rain rain, Wind wind) {
        this.morningTemp = (double) (Math.random() * 18);
        if (wind.direction.equals("N")) {
            this.morningTemp = this.morningTemp - (0.65 * wind.speed);
        } else {
            this.morningTemp = this.morningTemp + (0.5 * wind.speed);
        }
        this.middayTemp = this.morningTemp + (double) (Math.random() * 15);
    }

    public void cloudAffects(Clouds clouds) {
        if ("None".equals(clouds.level)) {
            this.middayTemp = this.middayTemp + 6;
        } else if ("Light".equals(clouds.level)) {
            this.middayTemp = this.middayTemp + 3;
        } else if ("Medium".equals(clouds.level)) {
            this.middayTemp = this.middayTemp - 3;
        } else {
            this.middayTemp = this.middayTemp - 14;
        }
        mornTemp = new Measurement(morningTemp, unit);
        midTemp = new Measurement(middayTemp, unit);
    }

    @Override
    public String toString() {
        String s = "Morning Temperature: " + mornTemp.toString() + "/";
        mornTemp.cToF();
        String x = mornTemp.toString();
        String d = "Midday Temperature: " + midTemp.toString() + "/";
        midTemp.cToF();
        String c = midTemp.toString();
        String m = s + x + '\n' + d + c;
        return m;
    }
}
