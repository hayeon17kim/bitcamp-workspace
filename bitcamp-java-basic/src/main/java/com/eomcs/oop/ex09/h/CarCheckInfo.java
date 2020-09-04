package com.eomcs.oop.ex09.h;

public interface CarCheckInfo {
  int getGas();

  int getBrakeOil();

  int getEngineOil();

  static boolean validate(CarCheckInfo carInfo) {
    if (carInfo.getBrakeOil() == 0 || carInfo.getEngineOil() == 0 || carInfo.getGas() == 0) {
      return false;
    }
    return true;
  }
}
