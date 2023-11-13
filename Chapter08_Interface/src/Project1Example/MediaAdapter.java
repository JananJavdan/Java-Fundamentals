package Project1Example;

public class MediaAdapter implements MediaPlayer {


    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equals("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        } else if (audioType.equals("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        }

    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equals("mp4")) {
            advancedMusicPlayer.playMp4(fileName);

        } else if (audioType.equals("vlc")) {
            advancedMusicPlayer.playVlc(fileName);

        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }

    }

}
