/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hist_banco;

import java.util.Date;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class Conta implements Banco {
    private static double valor_aux;
    private String nmConta;
    private char tp_operacao;
    private double saldoAnterior;
    private double saldoAtual;
    private double valor_op;
  

    
    public String getNmConta() {
        return nmConta;
    }

    public void setNmConta(String nmConta) {
        this.nmConta = nmConta;
    }

  
    public char getTp_operacao() {
        return tp_operacao;
    }

    public void setTp_operacao(char tp_operacao) {
        this.tp_operacao = tp_operacao;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    

    public double getSaldoAtual() {
        return saldoAtual;
    }

    

    public double getValor_op() {
        return valor_op;
    }

    public void setValor_op(double valor_op) {
        this.valor_op = valor_op;
    }

    public void deposito(String nm_conta, double valor) {
        setNmConta(nm_conta);
        setTp_operacao('C');
        setValor_op(valor);
        this.saldoAnterior += Conta.valor_aux;
        this.saldoAtual = Conta.valor_aux+valor;
        Conta.valor_aux= this.saldoAtual;       
    }

    public void saque(String nm_conta, double valor) {
        
        setNmConta(nm_conta);
        setTp_operacao('D');
        setValor_op(valor);
        this.saldoAnterior += Conta.valor_aux;
        this.saldoAtual = Conta.valor_aux-valor;
        Conta.valor_aux=this.saldoAtual;
    }

    
    
    
    public void mostra(){
        
        System.out.println("CC:"+this.getNmConta()+" Tipo OP:"+this.getTp_operacao()+" R$:"+this.getValor_op()+" Saldo Ant:"+this.getSaldoAnterior()+" Saldo Atual:"+this.getSaldoAtual());
        
        
    };
    
    
}
