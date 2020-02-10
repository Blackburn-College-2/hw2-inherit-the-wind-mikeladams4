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
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Weather-Tron. Here's your report:");
        Rain previousRain = new Rain();
        Wind previousWind = new Wind();
        for (int i = 1; i < 11; i++) {
            System.out.println("Day " + i + ":");
            Temperature temperature = new Temperature(previousRain, previousWind);
            Rain rain = new Rain();
            Wind wind = new Wind();
            Clouds clouds = new Clouds();
            temperature.cloudAffects(clouds);
            rain.tempAffects(temperature);
            System.out.println(temperature.toString());
            System.out.println(clouds.toString());
            System.out.println(rain.toString());
            System.out.println(wind.toString());
            System.out.println();
            previousRain = rain;
            previousWind = wind;
        }
    }

}
