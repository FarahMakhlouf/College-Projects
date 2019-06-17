public class Payment
{
    
    private int Price;
    private String Movie_Name;
    private String Theater_Name;
    private String Card_Type;
    private String Card_Holder;
    
    public Payment(){};
    
    public Payment( int Price, String Card_Type, String Card_Holder,String Movie,String Theater)
    {
        
        this.Price=Price;
        this.Card_Type=Card_Type;
        this.Card_Holder=Card_Holder;
        this.Movie_Name=Movie;
        this.Theater_Name=Theater;     
    }

    public int getPrice() {
        return Price;
    }

    public String getMovie_Name() {
        return Movie_Name;
    }

    public String getTheater_Name() {
        return Theater_Name;
    }

    public String getCard_Type() {
        return Card_Type;
    }


    public String getCard_Holder() {
        return Card_Holder;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setMovie_Name(String Movie_Name) {
        this.Movie_Name = Movie_Name;
    }

    public void setTheater_Name(String Theater_Name) {
        this.Theater_Name = Theater_Name;
    }

    public void setCard_Type(String Card_Type) {
        this.Card_Type = Card_Type;
    }


    public void setCard_Holder(String Card_Holder) {
        this.Card_Holder = Card_Holder;
    }
    
}
