package com.nanhang.Study07.Pojo;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/9
 * @ClassName user
 */

public class user {
    private String actno;
    private Double balance;

    public user() {
    }

    public user(String actno, Double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "user{" +
                "actno='" + actno + '\'' +
                ", balance=" + balance +
                '}';
    }
}
