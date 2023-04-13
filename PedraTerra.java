class PedraTerra extends Pedra{

  
  int danoTerra = 8;

  int CalcPoder(){

    int danoComposto = danoTerra + dano;
    
    return danoComposto;
  }
}