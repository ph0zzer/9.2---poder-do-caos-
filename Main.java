class Main {
  public static void main(String[] args) {

    Player P1 = new Player();
    Player P2 = new Player();

    
    PedraAgua PA = new PedraAgua();
    PedraFogo PF = new PedraFogo();
    PedraAr PAr = new PedraAr();
    PedraTerra PT = new PedraTerra();

    Cajado C1 =  new Cajado();
    Anel A1 = new Anel();

    Duelo D1 = new Duelo();

   

    C1.setAtq(PA, PT);

    A1.setDef(PT);
    
    P1.setCajado(C1);
    P2.setAnel(A1);

   
    D1.Duelar(P1, P2);

    CajadoCaos CC1 = new CajadoCaos();

   

    int X = CC1.poderAguaComCaos(PA);
      System.out.println("\nPoder do Caos com Agua! Dano: "+X);

    
     X = CC1.poderFogoComCaos(PF);
      System.out.println("\nPoder do Caos com Fogo! Dano: "+X);
    
     X = CC1.poderArComCaos(PAr);
      System.out.println("\nPoder do Caos com Ar! Dano: "+X);  
    
     X = CC1.poderTerraComCaos(PT);
      System.out.println("\nPoder do Caos com Terra! Dano: "+X);

     X = CC1.poderCaos();
      System.out.println("\nPoder puro do Caos! Dano: "+X);


    
  }
}