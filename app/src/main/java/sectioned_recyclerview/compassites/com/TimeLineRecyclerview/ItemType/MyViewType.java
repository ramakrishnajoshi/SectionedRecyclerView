package sectioned_recyclerview.compassites.com.TimeLineRecyclerview.ItemType;

public abstract class MyViewType {

    public static int ITEM_TYPE_GOALS_RIGHT = 1;
    public static int ITEM_TYPE_GOALS_LEFT = 2;

    public static int ITEM_TYPE_CARDS_RIGHT = 3;
    public static int ITEM_TYPE_CARDS_LEFT = 4;

    public static int ITEM_TYPE_HEADER = 1;



    public abstract int getMyViewType();
}
