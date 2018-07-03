package sectioned_recyclerview.compassites.com.ItemType;

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
        return TYPE_HEADER;
    }
}
