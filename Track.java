import java.util.ArrayList;
/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    // Atributo que almacena el numero de veces que se reproduce una cancion.
    private int playCount;
    // Atributo que almacena el numero de veces que ha sido parada una cancion.
    private int stopCount;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename);
        playCount = 0;
        stopCount = 0;
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ")"+ "Reproducida: " + playCount;
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }
    
    /**
     * M�todo que resetea el el contador de la cancion.
     */
    public void resetPlayCount()
    {
        playCount = 0;
    }
    
    /**
     * M�todo que aumenta en contador de la cancion en 1.
     */
    public void playCountUpgrade()
    {
        playCount++;
    }
    
    /**
     * M�todo que incrementa el contador del numero de veces que ha sido parada una cancion
     */
    public void stopCountUpgrade()
    {
        stopCount++;
    }
    
    /**
     * M�todo que resetea el valor del contador de paradas de una cancion.
     */
    public void ResetStopCount()
    {
        stopCount = 0;
    }
}