package Prac_12.Ex2;

import java.util.StringTokenizer;

public class AddressFull {
    private String state;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String apartment;
    public AddressFull(String str){
        StringTokenizer st = new StringTokenizer(str, ",.;-");
        state = st.nextToken();
        region = st.nextToken();
        city = st.nextToken();
        street = st.nextToken();
        house = st.nextToken();
        housing = st.nextToken();
        apartment = st.nextToken();
    }
    public String toString(){
        return state + " " + region + " " + city + " " + street + " " + house + " " + housing + " " + apartment;
    }
}
