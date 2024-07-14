public class TasaCambio {
    private String base_code;
    private String target_code;
    private double conversion_rate;



    public void setCodigoBase(String base_code) {
        this.base_code = base_code;
    }

    public void setCodigoObjetivo(String target_code) {
        this.target_code = target_code;
    }

    public void setTasaConversion(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public String getCodigoBase() {
        return base_code;
    }

    public String getCodigoObjetivo() {
        return target_code;
    }

    public double getTasaConversion() {
        return conversion_rate;
    }

}