package de.sanqsuaspringframework.didemo.examplebeans;


public class FakeDataSource {

    private String user;
    private String password;
    private String dburl;

    public FakeDataSource() {
    }


    public FakeDataSource(String user, String password, String dburl) {
        this.user = user;
        this.password = password;
        this.dburl = dburl;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String dburl) {
        this.dburl = dburl;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDburl() {
        return dburl;
    }
}
