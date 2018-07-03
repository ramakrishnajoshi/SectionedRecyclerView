package sectioned_recyclerview.compassites.com.ItemType;

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
        return TYPE_INDIVIDUAL_CONTENT;
    }
}
