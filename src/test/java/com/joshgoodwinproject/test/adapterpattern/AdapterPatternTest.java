package com.joshgoodwinproject.test.adapterpattern;

import org.junit.Assert;
import com.joshgoodwinproject.adapterpattern.AudioPlayer;
import org.junit.Test;

/**
 * Created by Josh on 11/24/2016.
 */
public class AdapterPatternTest {

    @Test
    public void adapterPatternTest(){
        AudioPlayer audioPlayer = new AudioPlayer();

        String typePlayed = "";
        typePlayed = audioPlayer.play("mp3", "beyond the horizon.mp3");
        Assert.assertSame("mp3", typePlayed);
        typePlayed = audioPlayer.play("mp4", "alone.mp4");
        Assert.assertSame("mp4", typePlayed);
        typePlayed = audioPlayer.play("vlc", "far far away.vlc");
        Assert.assertSame("vlc", typePlayed);
        typePlayed = audioPlayer.play("avi", "mind me.avi");
        Assert.assertTrue("Invalid media. avi format not supported".equals(typePlayed));
    }
}
