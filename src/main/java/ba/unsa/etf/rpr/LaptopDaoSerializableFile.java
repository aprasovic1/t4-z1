package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile implements LaptopDao {
    File file;
    ArrayList<Laptop> laptopi;

    @Override
    public void dodajLaptopUListu(Laptop laptop) {

    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream("listaLaptopa.txt");
        DataOutputStream izlaz = new DataOutputStream(file);

    }

    @Override
    public Laptop getLaptop(String procesor) {
        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public void vratiPodatkeIzDatoteke() {

    }


}
