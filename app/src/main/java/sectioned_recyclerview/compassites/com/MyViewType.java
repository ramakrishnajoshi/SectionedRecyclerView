package sectioned_recyclerview.compassites.com;

public abstract class MyViewType {

    static int TYPE_HEADER = 1;
    static int TYPE_INDIVIDUAL_CONTENT = 2;

    abstract int getMyViewType();
}
