class PedraAr extends Pedra{

  int danoAr = 9;
  
  int CalcPoder(){

    int danoComposto = danoAr + dano;
    
    return danoComposto;
  }
}