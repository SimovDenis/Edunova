package edunova.util;

/**
 *
 * @author Denis
 */
public class EdunovaException extends Exception {

    private String poruka;

    public EdunovaException(String poruka) {
        super(poruka);
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

}
