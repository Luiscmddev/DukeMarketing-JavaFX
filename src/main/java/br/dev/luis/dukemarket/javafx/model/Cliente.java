package br.dev.luis.dukemarket.javafx.model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sesi2dib
 */
public class Cliente {
    
    private int id;
    
    private String nome;
    
    private String CPF;
    
    private String cidade;
    
    private String endereco;
    
    private String uf;
    
    private Calendar dataCadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDataCadastro() {
        if (this.dataCadastro != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return sdf.format(this.dataCadastro.getTime());
        } else {
            return "";
        }
    }

    public void setDataCadastro(String strDataCadastro) {
        try {
            this.dataCadastro = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("aaaa/MM/dd HH:mm:ss");
            this.dataCadastro.setTime(sdf.parse(strDataCadastro));
        } catch (ParseException ex){
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String toString() {
        return String.format("%3d | %15s | %-30s | %10.2s | %10.2s | %10.2s | %10s", this.id,
                this.nome, this.endereco, this.CPF, this.cidade,
                this.uf, this.getDataCadastro());
    }
}
