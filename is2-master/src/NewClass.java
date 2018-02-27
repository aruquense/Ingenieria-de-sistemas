
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.io.StringReader;
import java.util.List;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author entrar
 */
public class NewClass {

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
        
	List<Atom> out = new Vector<Atom>();
        String xmlRecords ;
        xmlRecords = getAtomicNumber("Gold");
        System.out.println(xmlRecords );
        System.out.println();
        
        xmlRecords = getElementSymbol("Gold");
        System.out.println(xmlRecords );
        System.out.println();
        
        xmlRecords = getAtomicNumber("Iron");
        System.out.println(xmlRecords );
        System.out.println();
        
        
        xmlRecords = getAtoms();
        System.out.println(xmlRecords );
        System.out.println();
        
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(xmlRecords));

        Document doc = db.parse(is);
        NodeList nodes = doc.getElementsByTagName("Table");
            System.out.println("nodes: " +  nodes.getLength());
        

        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);
            NodeList DATA = element.getElementsByTagName("ElementName");
            Element line = (Element) DATA.item(0);
            System.out.println("DATA: " + getCharacterDataFromElement(line));
            //System.out.println(getAtomicNumber(getCharacterDataFromElement(line)));
            
            String xmlRecords2=getAtomicNumber(getCharacterDataFromElement(line)) ;
            DocumentBuilder db2 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource is2 = new InputSource();
            is2.setCharacterStream(new StringReader(xmlRecords2));

            Document doc2 = db2.parse(is2);
            
            //System.out.println();
            Atom atomo= new Atom(getCharacterDataFromElement((Element) doc2.getElementsByTagName("AtomicNumber").item(0)),
                    getCharacterDataFromElement(line),
                    getCharacterDataFromElement((Element) doc2.getElementsByTagName("Symbol").item(0)));
            if (((Element) doc2.getElementsByTagName("AtomicWeight").item(0))!=null){
                atomo.setAtomicWeight(getCharacterDataFromElement((Element) doc2.getElementsByTagName("AtomicWeight").item(0)));
            }
            if (((Element) doc2.getElementsByTagName("BoilingPoint").item(0))!=null){
                atomo.setBoilingPoint(getCharacterDataFromElement((Element) doc2.getElementsByTagName("BoilingPoint").item(0)));
            }
            if (((Element) doc2.getElementsByTagName("IonisationPotential").item(0))!=null){
                atomo.setIonisationPotential(getCharacterDataFromElement((Element) doc2.getElementsByTagName("IonisationPotential").item(0)));
            }
            if (((Element) doc2.getElementsByTagName("EletroNegativity").item(0))!=null){
                atomo.setEletroNegativity(getCharacterDataFromElement((Element) doc2.getElementsByTagName("EletroNegativity").item(0)));
            }
            if (((Element) doc2.getElementsByTagName("AtomicRadius").item(0))!=null){
                atomo.setAtomicRadius(getCharacterDataFromElement((Element) doc2.getElementsByTagName("AtomicRadius").item(0)));
            }
            if (((Element) doc2.getElementsByTagName("MeltingPoint").item(0))!=null){
                atomo.setMeltingPoint(getCharacterDataFromElement((Element) doc2.getElementsByTagName("MeltingPoint").item(0)));
            }
            if (((Element) doc2.getElementsByTagName("Density").item(0))!=null){
                atomo.setDensity(getCharacterDataFromElement((Element) doc2.getElementsByTagName("Density").item(0)));
            }
            out.add(atomo);

    }
            System.out.println();
    }
  public static String getCharacterDataFromElement(Element e) {
    Node child = e.getFirstChild();
    if (child instanceof CharacterData) {
      CharacterData cd = (CharacterData) child;
      return cd.getData();
    }
    return "";
  }    
    
  }
        
     

        
        

        
    

