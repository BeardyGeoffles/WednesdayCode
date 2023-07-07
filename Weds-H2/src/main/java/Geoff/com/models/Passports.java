package Geoff.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passports {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int pid;
    public String passportnumber;
}
