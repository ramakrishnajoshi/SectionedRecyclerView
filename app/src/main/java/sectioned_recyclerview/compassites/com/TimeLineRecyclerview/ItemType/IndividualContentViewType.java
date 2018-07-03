package sectioned_recyclerview.compassites.com.TimeLineRecyclerview.ItemType;

public class IndividualContentViewType extends MyViewType {

    public String individualContentString;

    public String getIndividualContentString() {
        return individualContentString;
    }

    public void setIndividualContentString(String individualContentString) {
        this.individualContentString = individualContentString;
    }

    @Override
    public int getMyViewType() {
        return 111111;
    }
}
