public class city {
    double code;
    String name;
    double population;
    String county_code;
    public city(double code,String name,double population,String county_code ){
        this.code=code;
        this.name=name;
        this.population=population;
        this.county_code=county_code;
    }
    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
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

    public String getCounty_code() {
        return county_code;
    }

    public void setCounty_code(String county_code) {
        this.county_code = county_code;
    }


}
