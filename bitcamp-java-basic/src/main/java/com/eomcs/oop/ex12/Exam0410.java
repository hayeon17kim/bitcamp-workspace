package com.eomcs.oop.ex12;

public class Exam0410 {
  static interface Interest {
    double compute(int money);
  }

  static Interest getInerest(final double rate) {
    class InterestImpl implements Interest {
      double rate;

      public InterestImpl(double rate) {
        this.rate = rate;
      }

      @Override
      public double compute(int money) {
        return money + (money * rate / 100);
      }
    }
  }
}
