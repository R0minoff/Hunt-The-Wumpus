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
        CorrectSound();
    }
    ///////////////////////
    // Methods
    //////////////////////

    // This method is the sound for when the player dies
    public void DeathSound(){
        File lol = new File("mixkit-correct-answer-reward-952.wav");
    

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(lol));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // This method is the sound for when the player beats the Wumpus
    public void WinSound(){
        File lol = new File("mixkit-video-game-win-2016.wav");
    

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(lol));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // This method is the sound for when the player gets a trvia question wrong.
    public void WrongSound(){

    }

    // This method is the sound for when the player gets a trivia question right.
    public void CorrectSound(){
        File lol = new File("mixkit-correct-answer-reward-952.wav");

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(lol));
            clip.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}