import java.io.BufferedWriter;
import java.nio.file.FileSystem;

public class BottleObject {
//variables
    private Integer barcode;
    private String Distributor;
    private int distributorProductID;
    private String name;
    private int volume;
    private Float specificGravity;
    private int tareWeight;
    private Boolean hasCap = false;
    private boolean pourSpout = true;

//Constructors for BottleObject
    //assumption is that unless hasCap is called, then it has a pour spout
    public BottleObject(){}
    public BottleObject(int barcode){
        setBarcode(barcode);
        getMockProductName(barcode);
         }
    public BottleObject(int barcode, String name){
        setBarcode(barcode);
        setName(name);
    }
//Properties
    public int getBarcode () {return barcode;}
    public void setBarcode(int Barcode) {barcode = Barcode;}
    public String getName () {return name;}
    public void setName ( String Name){ name = Name;}
    public int getVolume () {return volume;}
    public void setVolume(int Volume) {volume = Volume;}
    public float getSpecificGravity () {return specificGravity;}
    public void setSpecificGravity(Float SpecificGravity) {specificGravity = SpecificGravity;}
    public int getTareWeight () {return tareWeight;}
    public void setTareWeight(int TareWeight) {tareWeight = TareWeight;}
    public boolean getHasCap () {return hasCap;}
    public void setHasCap(Boolean HasCap) {hasCap = HasCap;}
    public boolean getPourSpout () {return pourSpout;}
    public void setPourSpout (boolean PourSpout) {pourSpout = PourSpout;}

//Action Methods
    @Override
    public String toString(){
        return getInfo();
    }
    public String getInfo(){
        //getMockProductName(barcode);
        //
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append("\t\t\t").append(getBarcode()).append("\t\t").append(getVolume()).append("\t\t\t").append(getSpecificGravity()).append("\t\t\t").append(getTareWeight()).append("\t\t\t\t");
        if (getHasCap())
        {
            sb.append("Capped bottle");
        } else {
            sb.append("Pour Spout");
        }
        return sb.toString();
    }

//Get this writing to the fileSystem
    public void WriteDataToStorage(){

    }

//Mock Testing Data
    private void getMockProductName(int barcode) {
        switch (barcode) {
            case 12345:
                return;
            case 123456:
                setName("TestBottle3");
                setVolume(750);
                setSpecificGravity(1.45F);
                setTareWeight(200);
                return ;
            case 23456:
                return;
            default:
                setName("TestBottle");
                setVolume(750);
                setSpecificGravity(1.45F);
                setTareWeight(200);
                return;
        }
    }
}
