
public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int year, boolean isBorrowed,LibraryItemType itemType, int issueNumber) {
        super(title, author, year, isBorrowed, itemType);
        this.issueNumber = issueNumber;
    }

    public Magazine(String title, String author, int year, int i) {
        super(title, author, year, i);
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}


