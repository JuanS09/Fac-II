package com.example.rview;

public class Model {
    private String title;
    private String description;
    private int img;
    private String profesor;
    private String dia;
    private String hora;
    private String fechaentrega;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getProfesor() {return profesor;}

    public void setProfesor(String profesor) { this.profesor = profesor;}

    public String getDia() { return dia; }

    public void setDia(String dia) { this.dia = dia; }

    public String getFechaentrega() { return fechaentrega; }

    public void setFechaentrega(String fechaentrega) { this.fechaentrega = fechaentrega; }

    public String getHora() { return hora; }

    public void setHora(String hora) { this.hora = hora;}
}
