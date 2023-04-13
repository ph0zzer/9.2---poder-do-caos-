class PedraAgua extends Pedra{

 int danoAgua = 11;

 int CalcPoder(){

    int danoComposto = danoAgua + dano;
    
    return danoComposto;
  }
}