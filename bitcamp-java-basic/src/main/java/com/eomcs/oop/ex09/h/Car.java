package com.eomcs.oop.ex09.h;

public abstract class Car implements CarCheckInfo {
  int gas;
  int brakeOil;
  int engineOil;

  String maker;
  String model;
  int cc;

  @Override
  public int getGas() {
    // TODO Auto-generated method stub
    return gas;
  }

  @Override
  public int getBrakeOil() {
    // TODO Auto-generated method stub
    return brakeOil;
  }

  @Override
  public int getEngineOil() {
    // TODO Auto-generated method stub
    return engineOil;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public void start() {
    System.out.println("시동 건다!");
  }

  public void shutDown() {
    System.out.println("시동 끈다!");
  }

  public abstract void run();
}
