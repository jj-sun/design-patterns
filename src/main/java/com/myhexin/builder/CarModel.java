package com.myhexin.builder;

import java.util.ArrayList;

public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    public void run() {
      sequence.forEach(se -> {
          if(se.equalsIgnoreCase("start")){
              this.start();
          }else if(se.equalsIgnoreCase("stop")) {
              this.start();
          }else if(se.equalsIgnoreCase("alarm")) {
              this.alarm();
          }else if(se.equalsIgnoreCase("engineBoom")) {
              this.engineBoom();
          }
      });
    }
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
