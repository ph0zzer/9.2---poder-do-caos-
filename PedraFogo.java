class PedraFogo extends Pedra{

  int danoFogo = 10;

  int CalcPoder(){

    int danoComposto = danoFogo + dano;
    
    return danoComposto;
  }
  
}