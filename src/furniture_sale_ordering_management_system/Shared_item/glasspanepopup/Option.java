package furniture_sale_ordering_management_system.Shared_item.glasspanepopup;

import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author Wei Hong
 */
public interface Option {

    public String getLayout(Component parent, float animate);

    public boolean useSnapshot();
    
    public boolean closeWhenPressedEsc();

    public boolean closeWhenClickOutside();

    public boolean blockBackground();

    public Color background();

    public float opacity();

    public int duration();

    public float getAnimate();

    void setAnimate(float animate);
}
