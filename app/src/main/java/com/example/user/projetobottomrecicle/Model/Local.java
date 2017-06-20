package com.example.user.projetobottomrecicle.Model;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 12/05/2017.
 */

public class Local {



    private String nome;
    private String address;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public Local() {
    }

    private String teste;
    private double latitude;
    private double longitude;


    public Local(String nome, String address, double latitude, double longitude) {
        this.nome = nome;
        this.address = address;

        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }




        @Exclude
        public Map<String, Object> toMap () {
            HashMap<String, Object> result = new HashMap<>();
            result.put("nome", nome);
            result.put("endereco", address);
            result.put("teste", teste);

            result.put("latitude", latitude);
            result.put("longitude", longitude);


            return result;
        }



}