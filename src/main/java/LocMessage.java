import java.time.ZonedDateTime;

public class LocMessage {

    private ZonedDateTime dateTime;

    /**
     * Долгота, градусы
     */
    private Double longitude;

    /**
     * Широта, градусы
     */
    private Double latitude;

    /**
     * Высота, м
     */
    private Integer altitude;

    private Integer angle;

    private Integer satellites;

    /**
     * Скорость, км/ч
     */
    private Integer speed;

    private Boolean digitalInputStatus1;
    private Boolean digitalInputStatus2;
    /**
     * Напряжение на аналоговом входе 1, В
     */
    private Double analogInput1;
    /**
     * Уровень сигнала GSM, 1-5
     */
    private Integer gsmLevel;

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Integer getSatellites() {
        return satellites;
    }

    public void setSatellites(Integer satellites) {
        this.satellites = satellites;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Boolean getDigitalInputStatus1() {
        return digitalInputStatus1;
    }

    public void setDigitalInputStatus1(Boolean digitalInputStatus1) {
        this.digitalInputStatus1 = digitalInputStatus1;
    }

    public Boolean getDigitalInputStatus2() {
        return digitalInputStatus2;
    }

    public void setDigitalInputStatus2(Boolean digitalInputStatus2) {
        this.digitalInputStatus2 = digitalInputStatus2;
    }

    public Double getAnalogInput1() {
        return analogInput1;
    }

    public void setAnalogInput1(Double analogInput1) {
        this.analogInput1 = analogInput1;
    }

    public Integer getGsmLevel() {
        return gsmLevel;
    }

    public void setGsmLevel(Integer gsmLevel) {
        this.gsmLevel = gsmLevel;
    }
}

