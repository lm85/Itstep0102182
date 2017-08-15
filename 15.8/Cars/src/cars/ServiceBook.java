/*
 * vytvorime si classu servisni knizka
 */
package cars;

/**
 *
 * @author Milan Zlamal
 */
public class ServiceBook {

    private final int maxLen = 10;
    private String[] serviceRecords;
    private int count;
    private Car car;

    public ServiceBook(Car car) {
        this.car = car;
        count = 0;
        serviceRecords = new String[maxLen];  // nelze kulate zavorky - nevolam nic

        car.setServiceBook(this);
    }

    public Car getCar() {
        return this.car;
    }

    public String getServiceRecords() {
        String res = "";
        for (int i = 0; i < count; i++) {
            res += serviceRecords[i] + "\n";
        }
        return res;
    }

    public void addRecord(String record) {
        if (count < maxLen) {
            serviceRecords[count] = record;
            count++;

        }
    }

    @Override // prepisuje metodu from java.lang.Object
    public String toString() {

        return this.getServiceRecords();
    }
}
