package org.example;

public class EngineStub implements Engine{
    private int oilPressure;
    public EngineStub(int OilPressure){
        this.oilPressure = OilPressure;

    }

    @Override
    public int checkOilPressure() {  //Instead of getter
        return oilPressure;
    }
}
