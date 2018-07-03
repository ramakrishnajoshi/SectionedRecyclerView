package sectioned_recyclerview.compassites.com.TimeLineRecyclerview.ItemType;

public class HeaderViewType extends MyViewType {

    public String headerName;

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getHeaderName() {
        return headerName;
    }

    @Override
    public int getMyViewType() {
        return 11111;
    }
}
