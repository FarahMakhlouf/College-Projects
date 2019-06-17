import java.util.List;

public class Theater
{
    
    private String Theater_Name;
    private int Regular_Price;
    private int ThreeDim_Price;
    private int FourDim_Price;
    private List<Show> Shows;
    public Theater(){}
    public Theater(String Theater_Name, int Regular_Price, int ThreeDim_Price, int FourDim_Price, List<Show> Shows)
    {
        this.Theater_Name=Theater_Name;
        this.Regular_Price=Regular_Price;
        this.ThreeDim_Price=ThreeDim_Price;
        this.FourDim_Price=FourDim_Price;
        this.Shows=Shows;
    }

    public String getTheater_Name() {
        return Theater_Name;
    }

    public int getRegular_Price() {
        return Regular_Price;
    }

    public int getThreeDim_Price() {
        return ThreeDim_Price;
    }

    public int getFourDim_Price() {
        return FourDim_Price;
    }

    public List<Show> getShows() {
        return Shows;
    }

    public void setTheater_Name(String Theater_Name) {
        this.Theater_Name = Theater_Name;
    }

    public void setRegular_Price(int Regular_Price) {
        this.Regular_Price = Regular_Price;
    }

    public void setThreeDim_Price(int ThreeDim_Price) {
        this.ThreeDim_Price = ThreeDim_Price;
    }

    public void setFourDim_Price(int FourDim_Price) {
        this.FourDim_Price = FourDim_Price;
    }

    public void setShows(List<Show> Shows) {
        this.Shows = Shows;
    }
    
}
