package teacher.lesson_13_junit.lessoncode;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TVTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private TV tv;

    @Test
    public void shouldTurnOn() {
        tv = new TV(false, 0, 0);
        tv.turnOn();

        assertTrue(tv.isTurnedOn());
    }

    @Test
    public void shouldTurnOff() {
        tv = new TV(true, 0, 0);
        tv.turnOff();

        assertFalse(tv.isTurnedOn());
    }

    @Test
    public void shouldChangeChannel() {
        tv = new TV(true, 0, 0);
        tv.changeChannel(5);

        assertEquals(5, tv.getChannel());
    }

    @Test
    public void shouldIncreaseVolume() {
        tv = new TV(true, 0, 0);
        tv.increaseVolume();

        assertEquals(1, tv.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        tv = new TV(true, 1, 0);
        tv.decreaseVolume();

        assertEquals(0, tv.getVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeIfZero() {
        tv = new TV(true, 0, 0);
        tv.decreaseVolume();

        assertEquals(0, tv.getVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeIfMax() {
        tv = new TV(true, 99, 0);
        tv.increaseVolume();

        assertEquals(99, tv.getVolume());
    }

    @Test
    @Ignore
    public void shouldChangeChannelOnFirstIfMax() {
        tv = new TV(true, 0, 5);
        tv.changeChannel(5);

        assertEquals(99, tv.getVolume());
    }

    //Thrown to indicate that a method has been passed
    // an illegal or inappropriate argument.
    @Test
    public void shouldThrowInvalidChannelExceptionIfGreaterThanMax() {
        exception.expect(InvalidChannelException.class);
        exception.expectMessage("Incorrect channel: 100. Channel min value: 0, max value: 5");

        tv = new TV(true, 0, 5);
        tv.changeChannel(100);
    }

    @Test
    public void shouldThrowInvalidChannelExceptionIfLessThanZero() {
        tv = new TV(true, 0, 5);

        assertThatThrownBy(() -> tv.changeChannel(-1))
                .hasMessage("Incorrect channel: -1. Channel min value: 0, max value: 5")
                .isInstanceOf(InvalidChannelException.class);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenIncVolumeTVTurnedOff() {
        tv = new TV(false, 0, 0);
        tv.increaseVolume();
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenDecVolumeTVTurnedOff() {
        tv = new TV(false, 0, 0);
        tv.decreaseVolume();
    }

    @Test
    public void shouldChangeChannelAndTurnOnTV() {
        tv = new TV(false, 0, 0);
        tv.changeChannel(5);

        assertEquals(5, tv.getChannel());
        assertTrue(tv.isTurnedOn());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenTVAlreadyTurnedOn() {
        tv = new TV(true, 0, 0);
        tv.turnOn();
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenTVAlreadyTurnedOff() {
        tv = new TV(false, 0, 0);
        tv.turnOff();
    }

}