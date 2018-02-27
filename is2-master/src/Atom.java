/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aru
 */
public class Atom {
    String AtomicNumber;    
    String ElementName;
    String Symbol;
    String AtomicWeight;
    String BoilingPoint;
    String IonisationPotential;
    String EletroNegativity;
    String AtomicRadius;
    String MeltingPoint;
    String Density;

    public Atom(String AtomicNumber, String ElementName, String Symbol, String AtomicWeight, String BoilingPoint, String IonisationPotential, String EletroNegativity, String AtomicRadius, String MeltingPoint, String Density) {
        this.AtomicNumber = AtomicNumber;
        this.ElementName = ElementName;
        this.Symbol = Symbol;
        this.AtomicWeight = AtomicWeight;
        this.BoilingPoint = BoilingPoint;
        this.IonisationPotential = IonisationPotential;
        this.EletroNegativity = EletroNegativity;
        this.AtomicRadius = AtomicRadius;
        this.MeltingPoint = MeltingPoint;
        this.Density = Density;
    }

    Atom(String AtomicNumber, String ElementName, String Symbol) {        
        this.AtomicNumber = AtomicNumber;
        this.ElementName = ElementName;
        this.Symbol = Symbol;
    }

    void setIonisationPotential(String characterDataFromElement) {
        this.IonisationPotential=characterDataFromElement;
    }

    void setAtomicWeight(String characterDataFromElement) {
        this.IonisationPotential=characterDataFromElement;
    }

    void setBoilingPoint(String characterDataFromElement) {
        this.BoilingPoint=characterDataFromElement;
    }

    void setEletroNegativity(String characterDataFromElement) {
        this.EletroNegativity=characterDataFromElement;
    }

    void setAtomicRadius(String characterDataFromElement) {
        this.AtomicRadius=characterDataFromElement;
    }

    void setMeltingPoint(String characterDataFromElement) {
        this.MeltingPoint=characterDataFromElement;
    }

    void setDensity(String characterDataFromElement) {
        this.Density=characterDataFromElement;
    }
}
