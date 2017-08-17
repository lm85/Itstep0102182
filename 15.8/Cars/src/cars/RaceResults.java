/*
 * vysledek zavodu
 */
package cars;

/**
 *
 * @author Milan ZLamal
 */
public class RaceResults {

    private Car car;
    private Timespan timeSpan;

    public RaceResults(Car car, Timespan timespan) {
        this.car = car;
        this.timeSpan = timespan;

    }

    public Car getCar() {
        return this.car;
    }

    public Timespan getTimespan() {
        return this.timeSpan;
    }

}
