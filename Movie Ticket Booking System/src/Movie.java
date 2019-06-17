import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Movie
{
    private String Movie_Name;
    private String Release_Date;
    private String City;
    private String Category;
    private String Description;
    private List<Theater>Theaters;

    public Movie() {}
    
    public Movie(String Movie_Name, String Release_Date,String City, String Category, String Description, List<Theater> Theaters)
    {
        this.Movie_Name=Movie_Name;
        this.Release_Date=Release_Date;
        this.City=City;
        this.Category=Category;
        this.Description=Description;
        this.Theaters=Theaters;
    }
    public static void SaveMovies(List<Movie> Movies) throws ParserConfigurationException, TransformerConfigurationException, TransformerException
    {
        File fXmlFile = new File("Movies.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document =dBuilder.newDocument();
        Element Movies1 = document.createElement("Movies");
        document.appendChild(Movies1);
            
        for(int i =0;i<Movies.size();i++)
        {
            Movie M = Movies.get(i);
            
            Element newMovie = document.createElement("Movie");
            Movies1.appendChild(newMovie);
            
            Element Movie_Name = document.createElement("Movie_Name");
            Movie_Name.appendChild(document.createTextNode(M.getMovie_Name()));
            newMovie.appendChild(Movie_Name);
            
            Element Release_Date = document.createElement("Release_Date");
            Release_Date.appendChild(document.createTextNode(M.getRelease_Date()));
            newMovie.appendChild(Release_Date);
            
            Element City = document.createElement("City");
            City.appendChild(document.createTextNode(M.getCity()));
            newMovie.appendChild(City);
            
            Element Category = document.createElement("Category");
            Category.appendChild(document.createTextNode(M.getCategory()));
            newMovie.appendChild(Category);
            
            Element Description = document.createElement("Description");
            Description.appendChild(document.createTextNode(M.getDescription()));
            newMovie.appendChild(Description);
            
            
            Element TheaterList=document.createElement("Theaters");
            List<Theater> Theaters1 = M.getTheaters();
            for(int k=0;k<Theaters1.size();k++)
            {
                Element Theater=document.createElement("Theater");
                
                Element TheaterName = document.createElement("TheaterName");
                TheaterName.appendChild(document.createTextNode(Theaters1.get(k).getTheater_Name()));
                Theater.appendChild(TheaterName);
                
                Element Regular_Price = document.createElement("Regular_Price");
                Regular_Price.appendChild(document.createTextNode(String.valueOf(Theaters1.get(k).getRegular_Price())));
                Theater.appendChild(Regular_Price);
                
                Element ThreeDim_Price = document.createElement("ThreeDim_Price");
                ThreeDim_Price.appendChild(document.createTextNode(String.valueOf(Theaters1.get(k).getThreeDim_Price())));
                Theater.appendChild(ThreeDim_Price);
                
                Element FourDim_Price = document.createElement("FourDim_Price");
                FourDim_Price.appendChild(document.createTextNode(String.valueOf(Theaters1.get(k).getFourDim_Price())));
                Theater.appendChild(FourDim_Price);
                
                Element ShowList=document.createElement("Shows");
                List<Show> Shows1 = Theaters1.get(k).getShows();
                for(int j=0;j<Shows1.size();j++)
                {
                    Element Show = document.createElement("Show");
                    
                    Element ShowType=document.createElement("Type");
                    ShowType.appendChild(document.createTextNode(Shows1.get(j).getType()));
                    Show.appendChild(ShowType);
                    
                    Element ShowTime=document.createElement("Time");
                    ShowTime.appendChild(document.createTextNode(Shows1.get(j).getTime()));
                    Show.appendChild(ShowTime);
                    
                    Element Seats=document.createElement("Num_of_Seats");
                    Seats.appendChild(document.createTextNode(String.valueOf(Shows1.get(j).Num_Of_Seats)));
                    Show.appendChild(Seats);
                
                    ShowList.appendChild(Show);
                }
                Theater.appendChild(ShowList);
                TheaterList.appendChild(Theater);
            }
            
            newMovie.appendChild(TheaterList);
        }
        TransformerFactory ts = TransformerFactory.newInstance();
        Transformer t = ts.newTransformer();
        DOMSource source= new DOMSource(document);
        StreamResult s = new StreamResult(new File("Movies.xml"));
        t.transform(source, s);
    }  
    public static List<Movie> ReadMovies(String City,String Category)
    {
        List<Movie> Temp=new ArrayList();
        List<Movie> Movies=new ArrayList();
        Temp = ReadMovies();
        for(int i=0;i<Temp.size();i++)
        {
            if(Temp.get(i).City.equals(City) && Temp.get(i).Category.equals(Category))
            {
                Movies.add(Temp.get(i));
            }
        }
        return Movies;
    }
    public static List<Movie> ReadMovies()
    {
        List<Movie> Movies=new ArrayList();
        List<Theater> Theaters=new ArrayList();
        List<Show> Shows=new ArrayList();
        Movie Movie;
        Theater Theater;
        Show Show;
        try {

            File fXmlFile = new File("Movies.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

			
            NodeList nList = doc.getElementsByTagName("Movie");
			
            for (int i = 0; i < nList.getLength(); i++) 
            {
                Node nNode = nList.item(i);		
		if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Theaters = new ArrayList();
                    Element eElement = (Element) nNode;
                    String Movie_Name = eElement.getElementsByTagName("Movie_Name").item(0).getTextContent();
                    String Release_Date = eElement.getElementsByTagName("Release_Date").item(0).getTextContent();
                    String City = eElement.getElementsByTagName("City").item(0).getTextContent();
                    String Category = eElement.getElementsByTagName("Category").item(0).getTextContent();
                    String Description = eElement.getElementsByTagName("Description").item(0).getTextContent();
                    NodeList TList=eElement.getElementsByTagName("Theater");
                    for(int j=0;j<TList.getLength();j++)
                    {
                        Shows = new ArrayList();
                        Node N = TList.item(j);
                        Element TElement = (Element) N;
                        String Theater_Name = TElement.getElementsByTagName("TheaterName").item(0).getTextContent();
                        String Regular_Price = TElement.getElementsByTagName("Regular_Price").item(0).getTextContent();
                        String ThreeDim_Price = TElement.getElementsByTagName("ThreeDim_Price").item(0).getTextContent();
                        String FourDim_Price = TElement.getElementsByTagName("FourDim_Price").item(0).getTextContent();
                        NodeList SList = TElement.getElementsByTagName("Show");
                        for(int k=0;k<SList.getLength();k++)
                        {
                            Node S = SList.item(k);
                            Element SElement = (Element) S;
                            String Type = SElement.getElementsByTagName("Type").item(0).getTextContent();
                            String Time = SElement.getElementsByTagName("Time").item(0).getTextContent();
                            String Num_of_Seats = SElement.getElementsByTagName("Num_of_Seats").item(0).getTextContent();
                            Show = new Show(Time, Type, Integer.valueOf(Num_of_Seats));
                            Shows.add(Show);
                        }
                        Theater = new Theater(Theater_Name,Integer.valueOf(Regular_Price),Integer.valueOf(ThreeDim_Price),Integer.valueOf(FourDim_Price), Shows);
                        Theaters.add(Theater);
                    }
                    Movie = new Movie(Movie_Name, Release_Date, City, Category, Description, Theaters);
                    Movies.add(Movie);
                    }
            }
        } 
        catch (ParserConfigurationException | SAXException | IOException | DOMException e) {}
        return Movies;
    }

    public String getMovie_Name() {
        return Movie_Name;
    }

    public String getRelease_Date() {
        return Release_Date;
    }

    public String getCity() {
        return City;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public List<Theater> getTheaters() {
        return Theaters;
    }

    public void setMovie_Name(String Movie_Name) {
        this.Movie_Name = Movie_Name;
    }

    public void setRelease_Date(String Release_Date) {
        this.Release_Date = Release_Date;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setTheaters(List<Theater> Theaters) {
        this.Theaters = Theaters;
    }
    
}



