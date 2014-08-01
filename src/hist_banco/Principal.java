/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hist_banco;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class Principal {
    
    public static void main(String[] args){
      Delegate del=new Delegate();
      
      Conta c = new Conta();
      
      c.deposito("1238675",1000);
      del.addConta(c);
      
      c= new Conta();
      c.saque("1238675",350);
      del.addConta(c);
      
      c= new Conta();
      c.deposito("1238675",800);
      del.addConta(c);
      
      
      
      
      del.movimentacaoConta();
      
    
        
    }
      
      
}
