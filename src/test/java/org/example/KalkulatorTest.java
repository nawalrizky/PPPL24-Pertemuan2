package org.example;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @org.junit.jupiter.api.Test
    void penjumlahan() {
        Kalkulator kalk = new Kalkulator(3,4);

        int hasil = kalk.penjumlahan();
        assertEquals(7,hasil);

    }

}