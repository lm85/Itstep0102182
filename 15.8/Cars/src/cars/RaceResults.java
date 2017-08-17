/*
 * vysledek zavodu
 */
package cars;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.timeSpan);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final RaceResults other = (RaceResults) obj;
        
        if (!Objects.equals(this.timeSpan, other.timeSpan)) {
            return false;
        }
        return true;
        
    }

}
