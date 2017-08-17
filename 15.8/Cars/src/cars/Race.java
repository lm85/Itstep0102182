/*
 * RAce - proste zavod aut
 */
package cars;

import java.util.ArrayList;

/**
 *
 * @author Milan Zlamal
 */
public class Race {

    private int lenght = 0;
    private ArrayList<RaceResults> results = new ArrayList<RaceResults>();
    private ArrayList<Car> cars = new ArrayList<Car>();
    private boolean ready = false;
    
    private int vyslednePrvni = 0;
    
    // vytvorim si zavod
    public Race(int len) {
        this.lenght = len;
    }

    // prihlasim do nej auta
    public void add(Car car) {
        this.cars.add(car);
    }

    // vytvorim start
    public void start() {
        this.ready = true;
    }

    // ziskani vysledku
    private void getResult() {
        if (!ready) {
            return;
        }
    // Cas ujeti zavodu pro kazde auto
    // vysledek seradi
        
    // pro celou kolekci cars - dle poctu v array listu
        for (Car  tmpcar : cars) {  
            results.add(
                    new RaceResults(
                            tmpcar, new Timespan(
                                    this.lenght / tmpcar.getSpeed()
                            )
                    )
            );
        }
        //dodelat
        //results.sort(timeSpan);
        
        
        
    }
}
