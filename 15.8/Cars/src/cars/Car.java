/*
 * 
 */
package cars;

/**
 *
 * @author Milan Zlamal
 */
public class Car {

    private String manufacture;
    private String modelName;
    private int year;
    private static int counter = 0; //existence neni zavisla na instanci - nez postavim to auto tak je counter ostatni ne - zapouzdreny
    private int speed;
    private Engine engine;
    private ServiceBook serviceBook;

    public Car(String manufacture, String modelName, int year, int speed, String engine) {

        this.manufacture = manufacture;
        this.modelName = modelName;
        this.year = year;
        counter++;
        this.speed = speed;
        this.engine = new Engine(engine);
        this.serviceBook = new ServiceBook(this);
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getManufacture(String manufacture) {
        return this.manufacture;
    }

    public String getModelName(String modelName) {
        return this.modelName;
    }

    public Integer getYear() {
        return this.year;
    }

    public int getSpeed() {
        return this.speed;
    }

    // @Override      tafy nechce, jinak prepisuje tu predchozi metodu
    protected void finalize() throws Throwable {
        try {
            counter--;
        } finally {
            super.finalize();
        }

    }

    @Override // prepisuji toString
    public String toString() {

        return "Manufacture: " + manufacture + "\n" + modelName + "Year: " + year +"\n"+ "Speed: " + speed +"\n"+ "Engine: " + this.engine.getType() +"\n"+ "Service records: " + this.serviceBook.getServiceRecords();

    }

    public void setServiceBook(ServiceBook serviceBook) {
        this.serviceBook = serviceBook;
    }
    
    
    public ServiceBook getServiceBook() {
        return this.serviceBook;
    }
}
