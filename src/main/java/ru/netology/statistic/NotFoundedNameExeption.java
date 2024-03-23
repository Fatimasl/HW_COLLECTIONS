package ru.netology.statistic;

public class NotFoundedNameExeption extends RuntimeException{
    public NotFoundedNameExeption(String msg){
        super(msg);
    }
}
