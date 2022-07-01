package inter;

public class ABankasi implements IBanka{

    private String bankaAdi;
    private String terminalID;
    private String password;

    public ABankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress){

        System.out.println("Kullanici IP :"+ipAddress);
        System.out.println("Makine IP :"+this.hostIpAddress);
        System.out.println(this.bankaAdi+" baglanildi.");
        return true;
    }

    @Override
    public boolean payment(double price,String cardNumber,String date,String cvc){

        System.out.println("Bankadan Cevap Bekleniyor !");
        System.out.println("Islem Basarili Oldu.");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
