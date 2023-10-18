package org.lecture;

import java.sql.SQLData;

public class Contract {
    float saldo;
    float premier;
    float interest;
    int startYear;
    int endYear;

    public Contract(float saldo, float premier, float interest, int startYear, int endYear) {
        this.saldo = saldo;
        this.premier = premier;
        this.interest = interest;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public Contract(float premier, int endYear) {
        this.premier = premier;
        this.endYear = endYear;
        setSaldo(0f);
        setInterest(3f);
        setStartYear(2023);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;

    }

    public void deposit(float deposit){
        setSaldo(getSaldo()+deposit);
    }

    public float getPremier() {
        return premier;
    }

    public void setPremier(float premier) {
        this.premier = premier;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;

    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        checkRunntime(startYear, getEndYear());
        this.startYear = startYear;
    }

    public int getRuntime(){
        return getEndYear()-getStartYear();
    }

    public void setRunntime(int years){
        setEndYear(getStartYear()+years);
    }

    public int getEndYear() {

        return endYear;
    }

    public void setEndYear(int endYear) {
        checkRunntime(getStartYear(),endYear);
        this.endYear = endYear;
    }


    public void checkRunntime(int start, int end)throws RuntimeException{
        if ((end-start)<3)
            throw new RuntimeException("ERR: Runtime for Contract under 3 Years!");
    }

    public boolean withdrawMoney(float amount){
        if(this.getSaldo()<amount)
            return false;
        this.setSaldo(this.getSaldo()-amount);
        return true;
    }


    public float calculateForEntireRuntime(){
        float zinsen = (float) (getSaldo() *  Math.pow(1 + getInterest(), getRuntime()));
        return zinsen;
    }

    public float calculateOneMonthInterest(){

        for(int loops=0; loops<(getRuntime()*12);loops++){

            setSaldo((float) (getSaldo() * Math.pow(1+getInterest(), (double) 1 /12)));
            //System.out.println(getSaldo() + " " + loops);
        }
        return getSaldo();
    }


}
