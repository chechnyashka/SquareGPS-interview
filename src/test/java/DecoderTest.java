import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.time.ZonedDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoderTest {

    @Test
    void decode() {
        ByteBuffer data = hexToByteBuffer("08040000015C1A473FC0000E3BD4A520B53DC300570167070000000403020101001504010" +
                "9158500000000015C1A475348000E3BD4AE20B53DC0005701670800000004030201010015" +
                "040109158500000000015C1A4766D0000E3BD4AE20B53DBF0057016708000000040302010" +
                "10015040109158500000000015C1A477A58000E3BD4B120B53DBD00570167080000000403" +
                "02010100150401091585000004");

        List<LocMessage> messages = Decoder.decode(data);

        assertEquals(4, messages.size());
        LocMessage first = messages.get(0);
        assertEquals(ZonedDateTime.parse("2017-05-18T06:38:16Z"), first.getDateTime());
        assertEquals(23.8802085, first.getLongitude(), 1e-7);
        assertEquals(54.8748739, first.getLatitude(), 1e-7);
        assertEquals(87, first.getAltitude());
        assertEquals(359, first.getAngle());
        assertEquals(7, first.getSatellites());
        assertEquals(0, first.getSpeed());
    }

    private static ByteBuffer hexToByteBuffer(String hex) {
        if (hex.length() % 2 == 1) {
            throw new IllegalArgumentException("Invalid hex-string");
        }

        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < hex.length(); i += 2) {
            bytes[i / 2] = (byte) Short.parseShort(hex.substring(i, i + 2), 16);
        }
        return ByteBuffer.wrap(bytes);
    }
}
