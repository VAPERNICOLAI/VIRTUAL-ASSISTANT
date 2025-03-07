public class Service {
    private int serviceId;
    private String name;
    private double hourlyRate;

    public Service(int serviceId, String name, double hourlyRate) {
        this.serviceId = serviceId;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    // Getters and setters
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
