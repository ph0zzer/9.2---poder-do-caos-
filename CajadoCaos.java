class CajadoCaos{

  int poderCaos = 8;

  int poderAguaComCaos(Pedra x){

    x = ((PedraAgua) x);  //Casting de X(PedraBruta) para X(PedraAgua)
    
    x.dano = (((PedraAgua) x).CalcPoder()); //Convertendo o dano de 
                                     //(PedraBruta) para (PedraAgua)
    
    x.dano = (x.dano + poderCaos);
    return x.dano;
    
  };

  int poderFogoComCaos(Pedra x){
    
     x = ((PedraFogo) x);
    
     x.dano = (((PedraFogo) x).CalcPoder());  
     x.dano = (x.dano + poderCaos);
    
    return x.dano;
     
  };

  int poderArComCaos(Pedra x){

     x = ((PedraAr) x);
    
     x.dano = (((PedraAr) x).CalcPoder());  
     x.dano = (x.dano + poderCaos);
    
      return x.dano;  
  };

  int poderTerraComCaos(Pedra x){
    
      x = ((PedraTerra) x);
    
     x.dano = (((PedraTerra) x).CalcPoder());  
     x.dano = (x.dano + poderCaos);
    
    return x.dano;
    
  };

  int poderCaos(){
    return poderCaos;
  }
 
}