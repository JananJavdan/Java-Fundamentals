package Project1;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;                  //declareer in deze klasse een eigenschap van het type mediaAdapter
    public void play(String audioType, String fileName){ //implementeer de methode play hier op basis van het argument
if (audioType.equalsIgnoreCase("mp3")){      //als de audio type is mp3 dus het is direct speelde.
    System.out.println("Playing mp3 file. Name:" + fileName);
} else if (audioType.equalsIgnoreCase("vlc") || //als de audio type is mp4 of vlc due mediaAdapter object is created die gebruik AdvancedMediaPlayer interface
audioType.equalsIgnoreCase("mp4")) {
    mediaAdapter = new MediaAdapter(audioType);
    mediaAdapter.play(audioType, fileName);//play method of mediaAdapter object die heeft aangeroepen worden
}else {                                      //als de audio type is niet van de boven , het is not supported
    System.out.println("Invalid media. " + audioType + " format not supported");

}
    }
}

