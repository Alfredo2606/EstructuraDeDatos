package mx.edu.uttt.Matrices;

public class Auto {
    private String model;
    private int milesDriver;
    private double gallosOfGas;

    public Auto() {
        this.model= "UnKnow";
    }

    public Auto(String model, int milesDriver, double gallosOfGas) {
        this.model = model;
        this.setMilesDriver(milesDriver);
        this.setGallosOfGas(gallosOfGas);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilesDriver() {
        return milesDriver;
    }

    public void setMilesDriver(int milesDriver) {
        if (milesDriver >=0)
        this.milesDriver = milesDriver;
        else{
            System.out.println("Miles driver cannot be negative ");
            System.out.println("value not changed");
        }
    }

    public double getGallosOfGas() {
        return gallosOfGas;
    }

    public void setGallosOfGas(double gallosOfGas) {
        if(gallosOfGas >=0.0)
        this.gallosOfGas = gallosOfGas;
        else{
            System.out.println("Gallons of Gas not changed");
        }
    }
    public double calculateMilesPerGallon(){
        if(gallosOfGas!=0.0){
            return milesDriver / gallosOfGas;
        }else
            return 0.0 ;

    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", milesDriver=" + milesDriver +
                ", gallosOfGas=" + gallosOfGas +
                '}';
    }
}
