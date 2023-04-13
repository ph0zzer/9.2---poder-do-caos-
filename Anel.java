class Anel{

  private int defesa = 25;

  private int defTotal;

  public void setDef(PedraAgua pedra){
      this.defTotal = (pedra.CalcPoder()+ this.defesa);
     
  }
  
  public void setDef(PedraFogo pedra){
     this.defTotal = (pedra.CalcPoder()+ this.defesa);
     
  }
  
  public void setDef(PedraAr pedra){
      this.defTotal = (pedra.CalcPoder()+ this.defesa);
     
  }
  
  public void setDef(PedraTerra pedra){
     this.defTotal = (pedra.CalcPoder()+ this.defesa);
     
  }
  
  public int getDef(){
    return defTotal;
  }
}