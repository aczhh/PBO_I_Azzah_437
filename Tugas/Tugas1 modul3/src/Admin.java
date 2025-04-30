class Admin extends User{
    String usn;
    String pass;
    public Admin(String nama, String nim){
        super(nama, nim);
        this.usn = usn;
        this.pass = pass;
    }

    @Override
    public boolean login(String usn, String pass) {
        return usn.equals("Admin437") && pass.equals("pass437");
    }
    @Override
    public void displayInfo(){
        System.out.println("Login Admin berhasil");
        // super.displayInfo();
    }
}