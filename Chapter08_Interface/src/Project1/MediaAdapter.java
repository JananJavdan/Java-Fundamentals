package Project1;

public class MediaAdapter implements MediaPlayer{  //de klasse mediaadapter imlpementert de interface mediaplayer
                                                    //decelareren de eigenschap van het type Advancemediaplayer en gebruik een zinvolle naam
private AdvancedMediaPlayer advancedMediaPlayer;

//constructur/
    private String audioType;                             //string audio type als parameter
    public MediaAdapter(String audioType){                  //zal gebruikt worden om te zien of je de eigenschap als een
       //this.audioType = audioType;                          //instantie van VlcPlayer of Mp4Player moet aanmaken
        if (audioType.equalsIgnoreCase("vlc")){   //ook if en els in constructor van mediaadapter moet gebruiken
            advancedMediaPlayer = new VlcPlayer();             //als audiotype is vlc , instance of Vlcplayer class is created die is implemented van AdvanceMediaPlayer interface
        } else if (audioType.equalsIgnoreCase("mp4")) { //als audiotype is mp4,instance of Mp4Player class is created die is implemented van AdvanceMediaPlayer interface
            advancedMediaPlayer = new Mp4Player();
        }
    }


    @Override                                                 //implementer de methode play
    public void play(String audioType, String fileName) {      //maak een keuze op basis van argumenten
        if (audioType.equalsIgnoreCase("vlc")){       //om te zien of de methode playVlc of playMp4 moet aangeroepen worden
          advancedMediaPlayer.playVlc(fileName);                  //als audiotype is vlc, playVlc method is aangeroepen van advancedMediaPlayer class die is implemented by VlcPlayer class bevattend playVlc() method
           // MediaAdapter mediaAdapter = new MediaAdapter("vlc");
        } else if (audioType.equalsIgnoreCase("mp4")) { //als audio type is mp4, playMp4 method is aangeroepen van advancedMediaPlayer class die is implemented by Mp4Player class bevattend playMp4() mrthod
          advancedMediaPlayer.playMp4(fileName);
           // MediaAdapter mediaAdapter = new MediaAdapter("mp4");



            
        }

    }
}
