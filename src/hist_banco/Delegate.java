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
public class Delegate {
    
    private Banco[] movimentos= new Banco[20];
    private int posicao;
    
    public void addConta(Banco b){
        movimentos[posicao]=b;
        posicao++;
    }
    
    public void movimentacaoConta(){
        for(Banco b:movimentos){
            if(b != null){
            Conta c=(Conta)b;
            c.mostra();
            }
        }
    }
    
}
