package br.com.odilonfontes.desafiosessaovotacaopautaapi.domain;

import br.com.odilonfontes.desafiosessaovotacaopautaapi.domain.enumeration.Voto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecebimentoVotoPautaTest {

    @DisplayName("Ao instanciar objetos da classe RecebimentoVotoPauta")
    @Nested
    class AoInstanciarObjetosDaClasseRecebimentoVotoPauta {
        RecebimentoVotoPauta recebimentoVotoPauta1;
        RecebimentoVotoPauta recebimentoVotoPauta2;

        @BeforeEach
        void inicializarContexto() {
            recebimentoVotoPauta1 = new RecebimentoVotoPauta();
            recebimentoVotoPauta2 = new RecebimentoVotoPauta();
        }

        @DisplayName("Dado que possuam mesmo estado, deveriam ser iguais")
        @Test
        void verificarSeEstaoIguais() {
            RecebimentoVotoPautaId recebimentoVotoPautaId = new RecebimentoVotoPautaId();
            recebimentoVotoPauta1.setRecebimentoVotoPautaId(recebimentoVotoPautaId);
            recebimentoVotoPauta1.setVoto(Voto.SIM);
            recebimentoVotoPauta2.setRecebimentoVotoPautaId(recebimentoVotoPauta1.getRecebimentoVotoPautaId());
            recebimentoVotoPauta2.setVoto(recebimentoVotoPauta1.getVoto());
            assertThat(recebimentoVotoPauta1).isEqualTo(recebimentoVotoPauta2);
        }
    }

}
