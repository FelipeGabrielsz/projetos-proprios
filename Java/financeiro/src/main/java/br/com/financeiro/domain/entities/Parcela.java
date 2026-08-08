package br.com.financeiro.domain.entities;

import br.com.financeiro.domain.enums.StatusParcela;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parcela {

    private Long id;
    private Integer numero;
    private BigDecimal valorOriginal;
    private LocalDate dataVencimento;
    private StatusParcela status;

}