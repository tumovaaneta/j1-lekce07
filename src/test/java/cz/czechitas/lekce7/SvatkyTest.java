package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

  @Test
  void kdyMaSvatek() {
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
    assertNull(svatky.kdyMaSvatek("Eva"));
  }

  @Test
  void jeVSeznamu() {
    //TODO
  }

  @Test
  void getPocetJmen() {
    //TODO
  }

  @Test
  void getSeznamJmen() {
    //TODO Zkontrolovat, že seznam jmen má správný počet položek.
  }

  @Test
  void pridatSvatekDenMesicInt() {
    //TODO
  }

  @Test
  void pridatSvatekDenMesicMonth() {
    //TODO
  }

  @Test
  void prridatSvatekMonthDay() {
    //TODO
  }

  @Test
  void smazatSvatek() {
    //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
  }
}
