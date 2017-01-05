package ahqmrf.recyclerview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahqmrf on 1/5/2017.
 */

public class Data {
    private static final String[] titles = {"Nothingness cannot be defined.", "The softest thing cannot be snapped.",
            "Be like water, my friend."};
    private static final int[] icons = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_menu_add,
            android.R.drawable.ic_menu_delete};

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();
        for (int count = 0; count < 4; count++) {
            for (int i = 0; i < titles.length && i < icons.length; i++) {
                ListItem item = new ListItem();
                item.setTitle(titles[i]);
                item.setImageResId(icons[i]);
                data.add(item);
            }
        }

        return  data;
    }
}
