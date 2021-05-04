import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToList {
    public ToList(){}

    public List<city> ReadCity(String fileName){
        List<city> lst = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // read the first line from the text file which will be head column
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {
                // System.out.println("the line " + line);
                String[] data = line.split(",");

                //adding Pyramid into ArrayList
                city City =createCity(data);
                lst.add(City);

                // read next line before looping
                line = br.readLine();
                // if end of file reached, line would be null
                if (line==null)
                {
                 br.close();
                 }

            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lst;
    }
    public List<country> ReadCountry(String fileName){
        List<country> lst2 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // read the first line from the text file which will be head column
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {
                // System.out.println("the line " + line);
                String[] data = line.split(",");

                //adding Pyramid into ArrayList
                country Country =createCountry(data);
                lst2.add(Country);

                // read next line before looping
                line = br.readLine();
                // if end of file reached, line would be null
                if (line==null)
                {
                    br.close();
                }

            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lst2;
    }
    public city createCity(String[] metadata) {

        double code = Double.parseDouble(metadata[0]);
        String name = metadata[1];
        double population = Double.parseDouble(metadata[2]);
        String country_code=metadata[3];



        // create and return Pyramid of this metadata
        return new city(code, name, population, country_code);
    }
    public country createCountry(String[] metadata) {

        String country_code = metadata[0];
        String name = metadata[1];
        double population = Double.parseDouble(metadata[2]);




        // create and return Pyramid of this metadata
        return new country(country_code,name,population) ;
    }

}
