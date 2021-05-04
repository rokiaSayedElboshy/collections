public class country {
    String county_code;
    String name;
    double population;
    public country(String county_code,String name,double population){
        this.county_code=county_code;
        this.name=name;
        this.population=population;

    }
    public String getCounty_code() {
        return county_code;
    }

    public void setCounty_code(String county_code) {
        this.county_code = county_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

}
