package com.google.gwt.sample.stockwatcher.client;

import java.io.Serializable;

public class StockPrice implements Serializable {

  private String symbol;
  private double price;
  private double changes;

  public StockPrice() {
  }

  public StockPrice(String symbol, double price, double change) {
    this.symbol = symbol;
    this.price = price;
    this.changes = change;
  }

  public String getSymbol() {
    return this.symbol;
  }

  public double getPrice() {
    return this.price;
  }

  public double getChange() {
    return this.changes;
  }

  public double getChangePercent() {
    return 100.0 * this.changes / this.price;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setChange(double change) {
    this.changes = change;
  }
}