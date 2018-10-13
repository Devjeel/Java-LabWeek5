
package lab5;

/**
 *
 * @author Jeel Patel
 */
public class PopCan {
    
    private String BrandName;
    private double VolumeML;
    
    /**
     * Constructor 
     * @param BrandName
     * @param VolumeML
     */
    public PopCan(String BrandName, double VolumeML) {
        setBrandName(BrandName);
        setVolumeML(VolumeML);
    }

    public String getBrandName() {
        return BrandName;
    }
    
    /**
     * Validate if name is empty 
     * @param BrandName 
     */
    public void setBrandName(String BrandName) {
        if(!BrandName.isEmpty())
            this.BrandName = BrandName;
        else 
            throw new IllegalArgumentException("Brand name can not be empty !!");
    }

    public double getVolumeML(){
        return VolumeML;         
    }
    
    /**
     * Validate VolumeML is > 0 and <1000
     * @param VolumeML
     */
    public void setVolumeML(double VolumeML) {
        if (VolumeML > 0 && VolumeML < 1000.00)
            this.VolumeML = VolumeML;
        else
            throw new IllegalArgumentException("Volume Must be between 0 and 1000 ");
    }
    
    /**
     * toString Method for POPCAN return class
     * @return 
     */
    @Override
    public String toString()
    {
        return String.format("%s in a %d ml can", BrandName, VolumeML);
    }
    
} 
 