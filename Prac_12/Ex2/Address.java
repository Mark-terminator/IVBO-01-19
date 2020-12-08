package Prac_12.Ex2;

public class Address {
    private String state;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String apartment;
    public Address(String str){
        String[] st = new String[10];
        st = str.split(",");
        state = st[0];
        region = st[1];
        city = st[2];
        street = st[3];
        house = st[4];
        housing = st[5];
        apartment = st[6];
    }
    public String toString(){
        return state + " " + region + " " + city + " " + street + " " + house + " " + housing + " " + apartment;
    }
}
