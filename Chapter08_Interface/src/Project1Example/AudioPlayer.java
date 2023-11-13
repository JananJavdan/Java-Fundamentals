package Project1Example;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equals("mp3")) {
            System.out.println("Playing " + audioType + " file. Name: " + fileName);
        } else {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

    }

}
