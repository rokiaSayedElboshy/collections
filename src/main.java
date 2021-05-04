import java.util.*;

public class main {
    public static void main(String[] args)
    {
        ToList toList = new ToList();
        List<city> cities=toList.ReadCity("D:\\iti\\java\\proj\\collections\\src\\Cities.csv");
        List<country> countries=toList.ReadCountry("D:\\iti\\java\\proj\\collections\\src\\Countries.txt");

       // for(int i=0;i<cities.size();i++)
      // {
           //System.out.println(cities.get(i).getCode() + " " + cities.get(i).getName() + " " +cities.get(i).getPopulation() +" "+ cities.get(i).getCounty_code());
        //}
       // for(int i=0;i<countries.size();i++)
         //{
          //System.out.println(countries.get(i).getCounty_code() + " " + countries.get(i).getName() + " " +countries.get(i).getPopulation());
       // }
        Hashtable<String, List<city>> my_dict = new Hashtable<String, List<city>>();
        for(int i=0;i<countries.size();i++){
            String countr=countries.get(i).getCounty_code();
            List<city> citiesList= new ArrayList<>();
            List<Double> pop= new ArrayList<>();

            for(int j=0;j<cities.size();j++) {
                String Cit=cities.get(j).getCounty_code().replaceAll(" ","");
               // System.out.println(countr + " size = "+ countr.length() + " "+ Cit + " size= "+ Cit.length());
                if(countr.equals(Cit)){
                    citiesList.add(cities.get(j));
                   /// pop.add(cities.get(j).getPopulation());
                }

            }
            sortList(citiesList,"asc");
            //for(int k=0;k<name.size();i++)
              //  {


              //  }
            my_dict.put(countr,citiesList);



        }
      //System.out.println(my_dict);
        my_dict.forEach((countr,citiesList) -> {
            System.out.print("the country code : " +countr +"->");
            citiesList.forEach(city -> {
                System.out.print(city.getName() + "," + city.getPopulation() + " ,");

            });
            System.out.print("\b\n");


        });

    }
    public static void sortList(List<city> citiesList, String rule){
        citiesList.sort(Comparator.comparing(city::getPopulation));
        if(rule=="desc"){
            Collections.reverse(citiesList);
        }

    }

}
