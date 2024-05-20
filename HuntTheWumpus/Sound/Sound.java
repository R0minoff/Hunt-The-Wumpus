// Amrit Gill
// February 16, 2024
// Period 5
// Hunt the Wumpus - Sound Class

package HuntTheWumpus.Sound;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import HuntTheWumpus.Cave.*;
import HuntTheWumpus.gameControl.*;
import HuntTheWumpus.gameLocations.*;
import HuntTheWumpus.Player.*;
import HuntTheWumpus.Sound.*;
import HuntTheWumpus.Trivia.*;
import HuntTheWumpus.UI.*;
import HuntTheWumpus.Wumpus.*;

public class Sound {
    ///////////////////////
    // Properties & Fields
    //////////////////////

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public Sound(){
        
    }
    ///////////////////////
    // Methods
    //////////////////////

    public void BackgroundSound(){
        File background = new File("HuntTheWumpus/Sound/mixkit-arcade-retro-background-219.wav");

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(background));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // This method is the sound for when the player dies
    public void DeathSound(){
        File death = new File("HuntTheWumpus/Sound/NSKF2KH-chime-lose.mp3");
    

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(death));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // This method is the sound for when the player beats the Wumpus
    public void WinSound(){
        File win = new File("HuntTheWumpus/Sound/mixkit-video-game-win-2016.wav");
    

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(win));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // This method is the sound for when the player gets a trvia question wrong.
    public void WrongSound(){
        File wrong = new File("HuntTheWumpus/Sound/BQY5HXR-wrong.mp3");

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(wrong));
            clip.start();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    // This method is the sound for when the player gets a trivia question right.
    public void CorrectSound(){
        File correct = new File("HuntTheWumpus/Sound/mixkit-correct-answer-reward-952.wav");

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(correct));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}