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
public interface Banco {
    
    public void deposito(String nm_conta,double valor);
    public void saque(String nm_conta, double valor);
    
}
