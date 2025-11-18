package theater;

/**
 * Represents a theatrical play with a name and type.
 * Used to store basic metadata about a performance.
 */

public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }
    /**
     * Returns the name of this play.
     *
     * @return the play name (may be null)
     */

    public String getName() {
        return name;
    }
    /**
     * Returns the type of this play.
     *
     * @return the type of the play (maybe null)
     */

    public String getType() {
        return type;
    }
}
