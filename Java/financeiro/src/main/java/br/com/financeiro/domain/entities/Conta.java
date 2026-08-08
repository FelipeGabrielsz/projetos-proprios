package br.com.financeiro.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

    private Long id;
    private String descricao;
    private LocalDateTime dataCadastro;
    private List<Parcela> parcelas;

    public void adicionarParcela(Parcela parcela) {
        this.parcelas.add(parcela);
    }

}