import java.util.ArrayList;
import java.util.List;

public class Show
{
    
    private String Time;
    private String Type;
    public int Num_Of_Seats;

    public Show(){}    
    public Show (String Time, String Type,int num)
    {
        this.Time=Time;
        this.Type=Type;
        this.Num_Of_Seats=num;
    }

    public String getTime() {
        return Time;
    }

    public String getType() {
        return Type;
    }

    public int getNum_Of_Seats() {
        return Num_Of_Seats;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setNum_Of_Seats(int Num_Of_Seats) {
        this.Num_Of_Seats = Num_Of_Seats;
    }
    
}
