package ba.unsa.etf.rpr;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface LaptopDao{
    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException;
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    void  vratiPodatkeIzDatoteke();
}
