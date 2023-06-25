package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class CarTest {
    @Mock
    Engine engine;
    @Test
    public void startup_withGoodOilPressure_shouldStart(){
        //Given
        Car car = new Car("Volvo",engine);
        // Engine engineStub = new EngineStub(60); instead of using the stub class
        when(engine.checkOilPressure()).thenReturn(60);




        //When
        car.startUp();

        //Then
           assertDoesNotThrow(car ::startUp);
        assertTrue(car.isRunning());
       // verify(engine).checkOilPressure();
      verify(engine,times(2)).checkOilPressure();

    }
    @Test
    public void startup_withLawOilPressure_shouldAbort(){
        //Given
        when(engine.checkOilPressure()).thenReturn(5);
        //  Engine engineStub = new EngineStub(5);

        Car car = new Car("Volvo",engine);


        //When

        //Then
        assertThrows(RuntimeException.class,()-> car.startUp());
        assertFalse(car.isRunning());
    }
}
