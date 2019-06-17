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

public class Customer extends Person
{
    private String Password;
    private String Contact_Num;
    private String Card_Number;
    private List<Payment> Payments= new ArrayList<>();
    
    public Customer( String Username, String Password, String E_mail, String Contact_Num,String Card_Number,List<Payment> Payments)
    {
        super(Username,E_mail);
        this.Password=Password;
        this.Contact_Num=Contact_Num;
        this.Card_Number=Card_Number;
        this.Payments=Payments;
    }
    
    public static List<Customer> LoadCustomers()
    {
        List<Customer> Customers = new ArrayList<>();
        List<Payment> Payments=new ArrayList();
        Customer Customer;
        Payment Payment;
        try {

            File fXmlFile = new File("Customers.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
	
            doc.getDocumentElement().normalize();

			
            NodeList nList = doc.getElementsByTagName("Customer");
			
            
            
            for (int i = 0; i < nList.getLength(); i++) 
            {
                Node nNode = nList.item(i);
				
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    
                    Element eElement = (Element) nNode;
                    String UserName = eElement.getElementsByTagName("UserName").item(0).getTextContent();
                    String Password = eElement.getElementsByTagName("Password").item(0).getTextContent();
                    String E_Mail = eElement.getElementsByTagName("E_Mail").item(0).getTextContent();
                    String Contact_Num = eElement.getElementsByTagName("Contact_Num").item(0).getTextContent();
                    String Card_Number = eElement.getElementsByTagName("Card_Number").item(0).getTextContent();
                    NodeList TList=eElement.getElementsByTagName("Payment");
                    Payments = new ArrayList();
                    for(int j=0;j<TList.getLength();j++)
                    {
                        Node N = TList.item(j);
                        Element TElement = (Element) N;
                        int Price = Integer.valueOf(TElement.getElementsByTagName("Price").item(0).getTextContent());
                        String Movie_Name = TElement.getElementsByTagName("Movie_Name").item(0).getTextContent();
                        String Theater_Name = TElement.getElementsByTagName("Theater_Name").item(0).getTextContent();
                        String Card_Type = TElement.getElementsByTagName("Card_Type").item(0).getTextContent();
                        String Card_Holder = TElement.getElementsByTagName("Card_Holder").item(0).getTextContent();
    
                        Payment = new Payment(Price, Card_Type, Card_Holder, Movie_Name, Theater_Name);
                        Payments.add(Payment);
                    }
                    Customer = new Customer(UserName, Password, E_Mail, Contact_Num, Card_Number, Payments);
                    Customers.add(Customer);
		}
	}
    } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
    }
//        XMLDecoder decoder=null;
//        try 
//        {
//            decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("Customers.xml")));
//	} 
//        catch (FileNotFoundException e) 
//        {
//            System.out.println("ERROR: File not found");
//        }
//        customers=(List<Customer>)decoder.readObject();
        
	return Customers;
    }
    public static void SaveCustomers(List<Customer> Customers) throws ParserConfigurationException, TransformerConfigurationException, TransformerException
    {
        File fXmlFile = new File("Customers.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document =dBuilder.newDocument();
        Element Customers1 = document.createElement("Customers");
        document.appendChild(Customers1);
            
        for(int i =0;i<Customers.size();i++)
        {
            Customer C = Customers.get(i);
            
            Element newCustomer = document.createElement("Customer");
            Customers1.appendChild(newCustomer);
            
            Element UserName = document.createElement("UserName");
            UserName.appendChild(document.createTextNode(C.getUsername()));
            newCustomer.appendChild(UserName);
            
            Element Password = document.createElement("Password");
            Password.appendChild(document.createTextNode(C.getPassword()));
            newCustomer.appendChild(Password);
            
            Element E_Mail = document.createElement("E_Mail");
            E_Mail.appendChild(document.createTextNode(C.getE_mail()));
            newCustomer.appendChild(E_Mail);
            
            Element Contact_Num = document.createElement("Contact_Num");
            Contact_Num.appendChild(document.createTextNode(C.getContact_Num()));
            newCustomer.appendChild(Contact_Num);
            
            Element Card_Number = document.createElement("Card_Number");
            Card_Number.appendChild(document.createTextNode(C.getCard_Number()));
            newCustomer.appendChild(Card_Number);
            
            
            Element PaymentsList=document.createElement("Payments");
            List<Payment> Payments1 = C.getPayments();
            for(int k=0;k<Payments1.size();k++)
            {
                Element Payment = document.createElement("Payment");
                
                Element Price = document.createElement("Price");
                Price.appendChild(document.createTextNode(String.valueOf(Payments1.get(k).getPrice())));
                Payment.appendChild(Price);
                
                Element Movie_Name = document.createElement("Movie_Name");
                Movie_Name.appendChild(document.createTextNode(Payments1.get(k).getMovie_Name()));
                Payment.appendChild(Movie_Name);
                
                Element Theater_Name = document.createElement("Theater_Name");
                Theater_Name.appendChild(document.createTextNode(Payments1.get(k).getTheater_Name()));
                Payment.appendChild(Theater_Name);
                
                Element Card_Type = document.createElement("Card_Type");
                Card_Type.appendChild(document.createTextNode(Payments1.get(k).getCard_Type()));
                Payment.appendChild(Card_Type);
                
                Element Card_Holder = document.createElement("Card_Holder");
                Card_Holder.appendChild(document.createTextNode(Payments1.get(k).getCard_Holder()));
                Payment.appendChild(Card_Holder);
                
                PaymentsList.appendChild(Payment);
            }
            
            newCustomer.appendChild(PaymentsList);
        }
            
        TransformerFactory ts = TransformerFactory.newInstance();
        Transformer t = ts.newTransformer();
        DOMSource source= new DOMSource(document);
        StreamResult s = new StreamResult(new File("Customers.xml"));
        t.transform(source, s);
//        XMLEncoder encoder=null;
//        try
//        {
//            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Customers.xml")));
//	}catch(FileNotFoundException fileNotFound)
//        {
//            System.out.println("ERROR: While Creating or Opening the File");
//	}
//        encoder.writeObject(customers);
//        encoder.close();
              
        
    }
    
            

    public String getUsername() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getE_mail() {
        return E_mail;
    }

    public String getContact_Num() {
        return Contact_Num;
    }

    public String getCard_Number() {
        return Card_Number;
    }

    public List<Payment> getPayments() {
        return Payments;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }


    public void setContact_Num(String Contact_Num) {
        this.Contact_Num = Contact_Num;
    }

    public void setCard_Number(String Card_Number) {
        this.Card_Number = Card_Number;
    }

    public void setPayments(List<Payment> Payments) {
        this.Payments = Payments;
    }
    
    
}
