/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author dell
 */
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
        
public class FlightControl {
    HashMap<String,Airplane> airplanes;
    HashMap<String,Flight> flights;
    Map<String, Place> places;
    
    public FlightControl(){
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity){
        Airplane airplane = new Airplane(id,capacity);
        this.airplanes.put(id,airplane);
        
    }
    
    public void addFlight(Airplane airplane, String departureID, String destinationID){
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));
        
        Flight flight = new Flight(airplane, places.get(departureID),places.get(destinationID));
        
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplanes(){
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights(){
        return this.flights.values();
    }
    
    public Airplane getAirplane(String ID){
        return this.airplanes.get(ID);
    }
    
}
