package com.wuhaitao.learning;

import com.wuhaitao.learning.spring.core.chaptertwo.config.CDPlayerConfig;
import com.wuhaitao.learning.spring.core.chaptertwo.entity.CompactDisc;
import com.wuhaitao.learning.spring.core.chaptertwo.two_2.model.MediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class AppTest 
{
    @Autowired
    MediaPlayer mediaPlayer;

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdPlayerTest()
    {
        Assert.assertNotNull(compactDisc);
        compactDisc.paly();
    }

    @Test
    public void playTest() {
        mediaPlayer.play();
    }

}
